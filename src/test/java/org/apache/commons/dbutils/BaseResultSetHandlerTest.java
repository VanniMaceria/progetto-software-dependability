/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.dbutils;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public final class BaseResultSetHandlerTest extends BaseTestCase {

    private static final class ToMapCollectionHandler extends BaseResultSetHandler<Collection<Map<String, Object>>> {

        @Override
        protected Collection<Map<String, Object>> handle() throws SQLException {
            final Collection<Map<String, Object>> result = new LinkedList<>();

            while (next()) {
                final Map<String, Object> current = new HashMap<>();

                for (int i = 1; i <= getMetaData().getColumnCount(); i++) {
                    current.put(getMetaData().getColumnName(i), getObject(i));
                }

                result.add(current);
            }

            return result;
        }
    }

    @Test
    public void testHandleWithoutExplicitResultSetInvocation() throws Exception {
        try (ResultSet resultSet = createMockResultSet()) {
            doNothing().when(resultSet).close(); // Mocking close method
            final Collection<Map<String, Object>> result = new ToMapCollectionHandler().handle(resultSet);

            assertFalse(result.isEmpty());

            for (final Map<String, Object> current : result) {
                assertTrue(current.containsKey("column"));
            }
        }
    }

    @Test
    public void testHandleWithEmptyResultSet() throws Exception {
        try (ResultSet resultSet = createEmptyMockResultSet()) {
            final Collection<Map<String, Object>> result = new ToMapCollectionHandler().handle(resultSet);

            assertTrue(result.isEmpty());
        }
    }

    @Test
    public void testHandleWithNullValues() throws Exception {
        try (ResultSet resultSet = createMockResultSetWithNullValues()) {
            final Collection<Map<String, Object>> result = new ToMapCollectionHandler().handle(resultSet);

            assertFalse(result.isEmpty());

            for (final Map<String, Object> current : result) {
                assertTrue(current.containsKey("one"));
                assertNull(current.get("one"));
                assertTrue(current.containsKey("two"));
                assertNull(current.get("two"));
            }
        }
    }

    protected ResultSet createMockResultSet() {
        try {
            ResultSet resultSet = mock(ResultSet.class);
            ResultSetMetaData metaData = mock(ResultSetMetaData.class);

            when(resultSet.next()).thenReturn(true).thenReturn(false);
            when(resultSet.getMetaData()).thenReturn(metaData);
            when(metaData.getColumnCount()).thenReturn(10);
            when(metaData.getColumnName(anyInt())).thenReturn("column");

            return resultSet;
        } catch (SQLException e) {
            throw new RuntimeException("Error creating mock ResultSet", e);
        }
    }

    private ResultSet createEmptyMockResultSet() throws SQLException {
        ResultSet resultSet = mock(ResultSet.class);
        ResultSetMetaData metaData = mock(ResultSetMetaData.class);

        when(resultSet.next()).thenReturn(false);
        when(resultSet.getMetaData()).thenReturn(metaData);
        when(metaData.getColumnCount()).thenReturn(0);

        return resultSet;
    }

    private ResultSet createMockResultSetWithNullValues() throws SQLException {
        ResultSet resultSet = mock(ResultSet.class);
        ResultSetMetaData metaData = mock(ResultSetMetaData.class);

        when(resultSet.next()).thenReturn(true).thenReturn(false);
        when(resultSet.getMetaData()).thenReturn(metaData);
        when(metaData.getColumnCount()).thenReturn(2);
        when(metaData.getColumnName(1)).thenReturn("one");
        when(metaData.getColumnName(2)).thenReturn("two");
        when(resultSet.getObject(1)).thenReturn(null);
        when(resultSet.getObject(2)).thenReturn(null);

        return resultSet;
    }
}
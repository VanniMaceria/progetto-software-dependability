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

import static org.junit.Assert.fail;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DbUtilsTest {

    public static class DriverProxyTest {
        private static final Driver mockedDriver = mock(Driver.class);
        private DbUtils.DriverProxy proxy;

        @Before
        public void setUp() {
            proxy = new DbUtils.DriverProxy(mockedDriver);
        }

        @After
        public void tearDown() {
            reset(mockedDriver);
        }

        @Test
        public void testProxiedMethods() throws Exception {
            proxy.getMajorVersion();
            verify(mockedDriver).getMajorVersion();
            proxy.getMinorVersion();
            verify(mockedDriver).getMinorVersion();
            proxy.jdbcCompliant();
            verify(mockedDriver).jdbcCompliant();

            final String url = "testUrl";
            proxy.acceptsURL(url);
            verify(mockedDriver).acceptsURL(url);

            final Properties props = new Properties();
            props.setProperty("test", "true");
            proxy.connect(url, props);
            verify(mockedDriver).connect(url, props);
            proxy.getPropertyInfo(url, props);
            verify(mockedDriver).getPropertyInfo(url, props);
        }
    }

    @Test
    public void testCloseConnection() throws Exception {
        final Connection mockCon = mock(Connection.class);
        DbUtils.close(mockCon);
        verify(mockCon).close();
    }

    //issue #7
    @Test
    public void testCloseNullConnection() throws Exception {
        boolean throwsException = false;

        try {
            DbUtils.close((Connection) null);
        } catch (Exception e) {
            throwsException = true;
        }
        //mi aspetto che il valore di throwsException sia false, se così non è printa il messaggio
        assertFalse("The value of SQL Connection can also be null", throwsException);
    }

    //issue #8
    @Test
    public void testCloseNullResultSet() throws Exception {
        boolean throwsException = false;

        try {
            DbUtils.close((ResultSet) null);
        } catch (Exception e) {
            throwsException = true;
        }
        assertFalse("The ResultSet can also be null", throwsException);
    }

    //issue #9
    @Test
    public void testCloseNullStatement() throws Exception {
        boolean throwsException = false;

        try {
            DbUtils.close((Statement) null);
        } catch (Exception e) {
            throwsException = true;
        }
        assertFalse("The Statement can also be null", throwsException);
    }

    @Test
    public void testCloseQuietlyConnection() throws Exception {
        final Connection mockConnection = mock(Connection.class);
        DbUtils.closeQuietly(mockConnection);
        verify(mockConnection).close();
    }

    @Test
    public void testCloseQuietlyConnectionResultSetStatement() throws Exception {
        final Connection mockConnection = mock(Connection.class);
        final ResultSet mockResultSet = mock(ResultSet.class);
        final Statement mockStatement = mock(Statement.class);
        DbUtils.closeQuietly(mockConnection, mockStatement, mockResultSet);
        verify(mockConnection).close();
        verify(mockResultSet).close();
        verify(mockStatement).close();
    }

    @Test
    public void testCloseQuietlyConnectionResultSetStatementThrowingException() throws Exception {
        final Connection mockConnection = mock(Connection.class);
        final ResultSet mockResultSet = mock(ResultSet.class);
        final Statement mockStatement = mock(Statement.class);
        doThrow(SQLException.class).when(mockStatement).close();
        DbUtils.closeQuietly(mockConnection, mockStatement, mockResultSet);
        verify(mockConnection).close();
        verify(mockResultSet).close();
        verify(mockStatement).close();
    }

    @Test
    public void testCloseQuietlyConnectionResultSetThrowingExceptionStatement() throws Exception {
        final Connection mockConnection = mock(Connection.class);
        final ResultSet mockResultSet = mock(ResultSet.class);
        doThrow(SQLException.class).when(mockResultSet).close();
        final Statement mockStatement = mock(Statement.class);
        DbUtils.closeQuietly(mockConnection, mockStatement, mockResultSet);
        verify(mockConnection).close();
        verify(mockResultSet).close();
        verify(mockStatement).close();
    }

    //issue #10
    @Test
    public void testCloseQuietlyConnectionThrowingException() throws Exception {
        final Connection mockConnection = mock(Connection.class);
        doThrow(SQLException.class).when(mockConnection).close();
        DbUtils.closeQuietly(mockConnection);
        //la connessione viene chiusa senza che l'eccezione si propaghi, mi sembra corretto così com'è
    }

    @Test
    public void testCloseQuietlyConnectionThrowingExceptionResultSetStatement() throws Exception {
        final Connection mockConnection = mock(Connection.class);
        doThrow(SQLException.class).when(mockConnection).close();
        final ResultSet mockResultSet = mock(ResultSet.class);
        final Statement mockStatement = mock(Statement.class);
        DbUtils.closeQuietly(mockConnection, mockStatement, mockResultSet);
        verify(mockConnection).close();
        verify(mockResultSet).close();
        verify(mockStatement).close();
    }

    //issue #11
    @Test
    public void testCloseQuietlyNullConnection() throws Exception {
        assertDoesNotThrow(() -> {
            DbUtils.closeQuietly((Connection) null);
        });
    }

    @Test
    public void testCloseQuietlyNullResultSet() throws Exception {
        DbUtils.closeQuietly((ResultSet) null);
    }

    @Test
    public void testCloseQuietlyNullStatement() throws Exception {
        DbUtils.closeQuietly((Statement) null);
    }

    @Test
    public void testCloseQuietlyResultSet() throws Exception {
        final ResultSet mockResultSet = mock(ResultSet.class);
        DbUtils.closeQuietly(mockResultSet);
        verify(mockResultSet).close();
    }

    @Test
    public void testCloseQuietlyResultSetThrowingException() throws Exception {
        final ResultSet mockResultSet = mock(ResultSet.class);
        doThrow(SQLException.class).when(mockResultSet).close();
        DbUtils.closeQuietly(mockResultSet);
    }

    @Test
    public void testCloseQuietlyStatement() throws Exception {
        final Statement mockStatement = mock(Statement.class);
        DbUtils.closeQuietly(mockStatement);
        verify(mockStatement).close();
    }

    @Test
    public void testCloseQuietlyStatementThrowingException() throws Exception {
        final Statement mockStatement = mock(Statement.class);
        doThrow(SQLException.class).when(mockStatement).close();
        DbUtils.closeQuietly(mockStatement);
    }

    @Test
    public void testCloseResultSet() throws Exception {
        final ResultSet mockResultSet = mock(ResultSet.class);
        DbUtils.close(mockResultSet);
        verify(mockResultSet).close();
    }

    @Test
    public void testCloseStatement() throws Exception {
        final Statement mockStatement = mock(Statement.class);
        DbUtils.close(mockStatement);
        verify(mockStatement).close();
    }

    @Test
    public void testCommitAndClose() throws Exception {
        final Connection mockConnection = mock(Connection.class);
        DbUtils.commitAndClose(mockConnection);
        verify(mockConnection).commit();
        verify(mockConnection).close();
    }

    @Test
    public void testCommitAndCloseQuietly() throws Exception {
        final Connection mockConnection = mock(Connection.class);
        DbUtils.commitAndClose(mockConnection);
        verify(mockConnection).commit();
        verify(mockConnection).close();
    }

    @Test
    public void testCommitAndCloseQuietlyWithException() throws Exception {
        final Connection mockConnection = mock(Connection.class);
        doThrow(SQLException.class).when(mockConnection).close();
        DbUtils.commitAndCloseQuietly(mockConnection);
        verify(mockConnection).commit();
        verify(mockConnection).close();
    }

    @Test
    public void testCommitAndCloseQuietlyWithNullDoesNotThrowAnSQLException() {

        DbUtils.commitAndCloseQuietly(null);

    }

    @Test
    public void testCommitAndCloseWithException() throws Exception {
        final Connection mockConnection = mock(Connection.class);
        doThrow(SQLException.class).when(mockConnection).commit();
        try {
            DbUtils.commitAndClose(mockConnection);
            fail("DbUtils.commitAndClose() swallowed SQLEception!");
        } catch (final SQLException e) {
            // we expect this exception
        }
        verify(mockConnection).close();
    }

    @Test
    public void testLoadDriverReturnsFalse() {

        assertFalse(DbUtils.loadDriver(""));

    }

    @Test
    public void testRollback() throws Exception {
        final Connection mockConnection = mock(Connection.class);
        DbUtils.rollback(mockConnection);
        verify(mockConnection).rollback();
    }

    @Test
    public void testRollbackAndClose() throws Exception {
        final Connection mockConnection = mock(Connection.class);
        DbUtils.rollbackAndClose(mockConnection);
        verify(mockConnection).rollback();
        verify(mockConnection).close();
    }

    @Test
    public void testRollbackAndCloseNull() throws Exception {
        DbUtils.rollbackAndClose(null);
    }

    @Test
    public void testRollbackAndCloseQuietly() throws Exception {
        final Connection mockConnection = mock(Connection.class);
        DbUtils.rollbackAndCloseQuietly(mockConnection);
        verify(mockConnection).rollback();
        verify(mockConnection).close();
    }

    @Test
    public void testRollbackAndCloseQuietlyNull() throws Exception {
        DbUtils.rollbackAndCloseQuietly(null);
    }

    @Test
    public void testRollbackAndCloseQuietlyWithException() throws Exception {
        final Connection mockConnection = mock(Connection.class);
        doThrow(SQLException.class).when(mockConnection).rollback();
        DbUtils.rollbackAndCloseQuietly(mockConnection);
        verify(mockConnection).rollback();
        verify(mockConnection).close();
    }

    @Test
    public void testRollbackAndCloseWithException() throws Exception {
        final Connection mockConnection = mock(Connection.class);
        doThrow(SQLException.class).when(mockConnection).rollback();
        try {
            DbUtils.rollbackAndClose(mockConnection);
            fail("DbUtils.rollbackAndClose() swallowed SQLException!");
        } catch (final SQLException e) {
            // we expect this exception
        }
        verify(mockConnection).rollback();
        verify(mockConnection).close();
    }

    @Test
    public void testRollbackNull() throws Exception {
        DbUtils.rollback(null);
    }

    @Test
    public void testRollbackQuietly() throws Exception {
        final Connection mockConnection = mock(Connection.class);
        DbUtils.rollbackQuietly(mockConnection);
        verify(mockConnection).rollback();
    }

    @Test
    public void testRollbackQuietlyNull() throws Exception {
        DbUtils.rollbackQuietly(null);
    }

    @Test
    public void testRollbackQuietlyWithException() throws Exception {
        final Connection mockConnection = mock(Connection.class);
        doThrow(SQLException.class).when(mockConnection).rollback();
        DbUtils.rollbackQuietly(mockConnection);
        verify(mockConnection).rollback();
    }
}

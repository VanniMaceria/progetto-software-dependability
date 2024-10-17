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


package org.apache.commons.dbutils.costants;

import static org.junit.Assert.assertEquals; //gli import statici vengono prima gli altri import
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.dbutils.constants.SQLExceptionCostants;
import org.junit.Test;


public class SQLExceptionCostantsTest {

    @Test
    public void testErrorMessages() {
        assertEquals("Null connection error", SQLExceptionCostants.NULL_CONNECTION_ERROR);
        assertEquals("Null parameters error", SQLExceptionCostants.NULL_PARAMS_ERROR);
        assertEquals("Null SQL statement", SQLExceptionCostants.NULL_STATEMENT_ERROR);
        assertEquals("Null result set error", SQLExceptionCostants.NULL_RESULT_SET_ERROR);
    }

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<SQLExceptionCostants> constructor = SQLExceptionCostants.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        InvocationTargetException exception = assertThrows(InvocationTargetException.class, constructor::newInstance);
        assertTrue(exception.getCause() instanceof UnsupportedOperationException);
    }
}

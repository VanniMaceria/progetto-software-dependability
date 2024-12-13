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
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder10.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration15 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder14.queryTimeout(duration15);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.fetchSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder16.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder16.maxRows((java.lang.Integer) (-1));
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, false, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement28 = null;
        java.sql.ParameterMetaData parameterMetaData29 = null;
        javax.sql.DataSource dataSource30 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner33 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource30, true, executorService32);
        boolean boolean34 = asyncQueryRunner33.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement35 = null;
        java.sql.ParameterMetaData parameterMetaData36 = null;
        javax.sql.DataSource dataSource37 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource37, true, executorService39);
        boolean boolean41 = asyncQueryRunner40.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement42 = null;
        java.lang.Object obj43 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner40.fillStatementWithBean(preparedStatement42, obj43, propertyDescriptorArray44);
        asyncQueryRunner33.fillStatement(preparedStatement35, parameterMetaData36, (java.lang.Object[]) propertyDescriptorArray44);
        asyncQueryRunner26.fillStatement(preparedStatement28, parameterMetaData29, (java.lang.Object[]) propertyDescriptorArray44);
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) (-1), propertyDescriptorArray44);
        java.sql.PreparedStatement preparedStatement49 = null;
        java.sql.ParameterMetaData parameterMetaData50 = asyncQueryRunner2.getParameterMetaData(preparedStatement49);
        java.sql.Connection connection51 = null;
        java.time.Duration duration57 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration58 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 0, duration57);
        boolean boolean59 = statementConfiguration58.isQueryTimeoutSet();
        java.lang.Integer int60 = statementConfiguration58.getFetchSize();
        boolean boolean61 = statementConfiguration58.isMaxFieldSizeSet();
        java.lang.Integer int62 = statementConfiguration58.getMaxRows();
        java.lang.Integer int63 = statementConfiguration58.getFetchSize();
        java.time.Duration duration64 = statementConfiguration58.getQueryTimeoutDuration();
        boolean boolean65 = statementConfiguration58.isQueryTimeoutSet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture66 = asyncQueryRunner2.update(connection51, "hi!", (java.lang.Object) statementConfiguration58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray44);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray44, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData50);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNull(duration64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource10 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration17 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 100);
        javax.sql.DataSource dataSource18 = null;
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource18, true, executorService20);
        boolean boolean22 = asyncQueryRunner21.isPmdKnownBroken();
        javax.sql.DataSource dataSource23 = asyncQueryRunner21.getDataSource();
        javax.sql.DataSource dataSource24 = asyncQueryRunner21.getDataSource();
        javax.sql.DataSource dataSource25 = asyncQueryRunner21.getDataSource();
        java.sql.PreparedStatement preparedStatement26 = null;
        java.time.Duration duration31 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration32 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration31);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        asyncQueryRunner21.fillStatementWithBean(preparedStatement26, (java.lang.Object) 10, strArray33);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement11, (java.lang.Object) statementConfiguration17, strArray33);
        java.sql.Connection connection36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture38 = asyncQueryRunner3.update(connection36, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, true, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.lang.Object obj14 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner11.fillStatementWithBean(preparedStatement13, obj14, propertyDescriptorArray15);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement6, (java.lang.Object) 0, propertyDescriptorArray15);
        boolean boolean18 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource19 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement20 = null;
        java.sql.ParameterMetaData parameterMetaData21 = null;
        java.lang.Object[] objArray22 = null;
        asyncQueryRunner3.fillStatement(preparedStatement20, parameterMetaData21, objArray22);
        java.sql.PreparedStatement preparedStatement24 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService26);
        java.sql.PreparedStatement preparedStatement28 = null;
        javax.sql.DataSource dataSource29 = null;
        java.util.concurrent.ExecutorService executorService31 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner32 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource29, true, executorService31);
        boolean boolean33 = asyncQueryRunner32.isPmdKnownBroken();
        javax.sql.DataSource dataSource34 = asyncQueryRunner32.getDataSource();
        java.sql.PreparedStatement preparedStatement35 = null;
        javax.sql.DataSource dataSource37 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource37, true, executorService39);
        boolean boolean41 = asyncQueryRunner40.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement42 = null;
        java.lang.Object obj43 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner40.fillStatementWithBean(preparedStatement42, obj43, propertyDescriptorArray44);
        asyncQueryRunner32.fillStatementWithBean(preparedStatement35, (java.lang.Object) 0, propertyDescriptorArray44);
        asyncQueryRunner27.fillStatement(preparedStatement28, (java.lang.Object[]) propertyDescriptorArray44);
        asyncQueryRunner3.fillStatement(preparedStatement24, (java.lang.Object[]) propertyDescriptorArray44);
        java.sql.Connection connection49 = null;
        javax.sql.DataSource dataSource51 = null;
        java.util.concurrent.ExecutorService executorService53 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner54 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource51, true, executorService53);
        boolean boolean55 = asyncQueryRunner54.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement56 = null;
        java.sql.ParameterMetaData parameterMetaData57 = null;
        javax.sql.DataSource dataSource58 = null;
        java.util.concurrent.ExecutorService executorService60 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner61 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource58, true, executorService60);
        boolean boolean62 = asyncQueryRunner61.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement63 = null;
        java.lang.Object obj64 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray65 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner61.fillStatementWithBean(preparedStatement63, obj64, propertyDescriptorArray65);
        asyncQueryRunner54.fillStatement(preparedStatement56, parameterMetaData57, (java.lang.Object[]) propertyDescriptorArray65);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture68 = asyncQueryRunner3.update(connection49, "hi!", (java.lang.Object[]) propertyDescriptorArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray44);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray44, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray65);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray65, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 0);
        java.lang.Integer int6 = statementConfiguration5.getMaxFieldSize();
        java.lang.Integer int7 = statementConfiguration5.getQueryTimeout();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration1 = builder0.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder2.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder2.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) 10);
        java.time.Duration duration9 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.queryTimeout(duration9);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration13 = builder12.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder12.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder16.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder20.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder24 = builder22.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder26 = builder24.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder28 = builder26.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration34 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
        java.time.Duration duration35 = statementConfiguration34.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = builder28.queryTimeout(duration35);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder15.queryTimeout(duration35);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder38 = builder0.queryTimeout(duration35);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder40 = builder38.maxRows((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(statementConfiguration1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(statementConfiguration13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = builder4.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder7 = builder4.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder12.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.maxRows((java.lang.Integer) 10);
        java.time.Duration duration19 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder16.queryTimeout(duration19);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = builder21.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = builder21.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = builder25.maxRows((java.lang.Integer) 10);
        java.time.Duration duration28 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder29 = builder27.queryTimeout(duration28);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration35 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration36 = statementConfiguration35.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder29.queryTimeout(duration36);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder38 = builder20.queryTimeout(duration36);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration39 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) (-1), duration36);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder40 = builder4.queryTimeout(duration36);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration41 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 1, duration36);
        org.junit.Assert.assertNotNull(statementConfiguration5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        boolean boolean6 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.Connection connection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture9 = asyncQueryRunner3.update(connection7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource6 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement7 = null;
        java.time.Duration duration12 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration13 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration12);
        boolean boolean14 = statementConfiguration13.isMaxFieldSizeSet();
        java.time.Duration duration15 = statementConfiguration13.getQueryTimeoutDuration();
        boolean boolean16 = statementConfiguration13.isFetchSizeSet();
        boolean boolean17 = statementConfiguration13.isMaxFieldSizeSet();
        boolean boolean18 = statementConfiguration13.isFetchDirectionSet();
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService20);
        java.sql.PreparedStatement preparedStatement22 = null;
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, true, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        javax.sql.DataSource dataSource28 = asyncQueryRunner26.getDataSource();
        java.sql.PreparedStatement preparedStatement29 = null;
        javax.sql.DataSource dataSource31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource31, true, executorService33);
        boolean boolean35 = asyncQueryRunner34.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement36 = null;
        java.lang.Object obj37 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner34.fillStatementWithBean(preparedStatement36, obj37, propertyDescriptorArray38);
        asyncQueryRunner26.fillStatementWithBean(preparedStatement29, (java.lang.Object) 0, propertyDescriptorArray38);
        asyncQueryRunner21.fillStatement(preparedStatement22, (java.lang.Object[]) propertyDescriptorArray38);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement7, (java.lang.Object) statementConfiguration13, propertyDescriptorArray38);
        boolean boolean43 = statementConfiguration13.isFetchDirectionSet();
        boolean boolean44 = statementConfiguration13.isMaxFieldSizeSet();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray38);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray38, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, true, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.lang.Object obj14 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner11.fillStatementWithBean(preparedStatement13, obj14, propertyDescriptorArray15);
        asyncQueryRunner3.fillStatement(preparedStatement6, parameterMetaData7, (java.lang.Object[]) propertyDescriptorArray15);
        boolean boolean18 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement19 = null;
        java.sql.ParameterMetaData parameterMetaData20 = asyncQueryRunner3.getParameterMetaData(preparedStatement19);
        java.sql.Connection connection21 = null;
        java.lang.Object[][] objArray23 = new java.lang.Object[][] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture24 = asyncQueryRunner3.batch(connection21, "", objArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(parameterMetaData20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[][] {});
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        java.lang.Integer int6 = statementConfiguration5.getFetchDirection();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.queryTimeout(duration11);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.fetchSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder12.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder12.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration19 = builder18.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(statementConfiguration19);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration18 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
        java.time.Duration duration19 = statementConfiguration18.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder12.queryTimeout(duration19);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder20.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration23 = builder20.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(statementConfiguration23);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) (-1), duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        boolean boolean7 = statementConfiguration5.isFetchDirectionSet();
        java.lang.Integer int8 = statementConfiguration5.getFetchSize();
        java.time.Duration duration9 = statementConfiguration5.getQueryTimeoutDuration();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(duration9);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        boolean boolean8 = statementConfiguration5.isFetchSizeSet();
        java.time.Duration duration9 = statementConfiguration5.getQueryTimeoutDuration();
        java.lang.Integer int10 = statementConfiguration5.getFetchSize();
        java.time.Duration duration11 = statementConfiguration5.getQueryTimeoutDuration();
        java.lang.Integer int12 = statementConfiguration5.getFetchDirection();
        boolean boolean13 = statementConfiguration5.isFetchDirectionSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(duration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(duration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder0.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder0.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder0.maxRows((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = builder0.build();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration12 = builder0.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder0.fetchDirection((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder14.fetchDirection((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(statementConfiguration11);
        org.junit.Assert.assertNotNull(statementConfiguration12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = builder4.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder7 = builder4.maxFieldSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration8 = builder4.build();
        boolean boolean9 = statementConfiguration8.isMaxFieldSizeSet();
        java.lang.Class<?> wildcardClass10 = statementConfiguration8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(statementConfiguration5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(statementConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 10);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.queryTimeout(duration11);
        java.time.Duration duration13 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.queryTimeout(duration13);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = builder19.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = builder19.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = builder23.maxRows((java.lang.Integer) 10);
        java.time.Duration duration26 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = builder23.queryTimeout(duration26);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder29 = builder23.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder31 = builder29.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder33 = builder29.fetchDirection((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder34 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = builder34.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder38 = builder34.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder40 = builder38.maxRows((java.lang.Integer) 10);
        java.time.Duration duration41 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder42 = builder38.queryTimeout(duration41);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder43 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder45 = builder43.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder47 = builder43.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder49 = builder47.maxRows((java.lang.Integer) 10);
        java.time.Duration duration50 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder51 = builder49.queryTimeout(duration50);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration57 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration58 = statementConfiguration57.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder59 = builder51.queryTimeout(duration58);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder60 = builder42.queryTimeout(duration58);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder61 = builder29.queryTimeout(duration58);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration62 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) (-1), duration58);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder63 = builder12.queryTimeout(duration58);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration64 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 0, duration58);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService7);
        java.sql.PreparedStatement preparedStatement9 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, true, executorService12);
        boolean boolean14 = asyncQueryRunner13.isPmdKnownBroken();
        javax.sql.DataSource dataSource15 = asyncQueryRunner13.getDataSource();
        java.sql.PreparedStatement preparedStatement16 = null;
        javax.sql.DataSource dataSource18 = null;
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource18, true, executorService20);
        boolean boolean22 = asyncQueryRunner21.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement23 = null;
        java.lang.Object obj24 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner21.fillStatementWithBean(preparedStatement23, obj24, propertyDescriptorArray25);
        asyncQueryRunner13.fillStatementWithBean(preparedStatement16, (java.lang.Object) 0, propertyDescriptorArray25);
        asyncQueryRunner8.fillStatement(preparedStatement9, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray25);
        java.sql.PreparedStatement preparedStatement30 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder31 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder33 = builder31.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder35 = builder31.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder35.maxRows((java.lang.Integer) 10);
        java.time.Duration duration38 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder39 = builder37.queryTimeout(duration38);
        java.time.Duration duration40 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder41 = builder39.queryTimeout(duration40);
        java.time.Duration duration42 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder43 = builder39.queryTimeout(duration42);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder45 = builder39.queryTimeout((java.lang.Integer) 0);
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement30, (java.lang.Object) builder39, strArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Couldn't find bean property: class org.apache.commons.dbutils.StatementConfiguration$Builder ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray25, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "" });
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, true, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.lang.Object obj14 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner11.fillStatementWithBean(preparedStatement13, obj14, propertyDescriptorArray15);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement6, (java.lang.Object) 0, propertyDescriptorArray15);
        boolean boolean18 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean19 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean20 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource21 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement22 = null;
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, true, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement28 = null;
        java.lang.Object obj29 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner26.fillStatementWithBean(preparedStatement28, obj29, propertyDescriptorArray30);
        java.sql.PreparedStatement preparedStatement32 = null;
        javax.sql.DataSource dataSource33 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource33, executorService34);
        boolean boolean36 = asyncQueryRunner35.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement37 = null;
        java.sql.ParameterMetaData parameterMetaData38 = null;
        java.util.concurrent.ExecutorService executorService40 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner41 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService40);
        java.sql.PreparedStatement preparedStatement42 = null;
        javax.sql.DataSource dataSource43 = null;
        java.util.concurrent.ExecutorService executorService45 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner46 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource43, true, executorService45);
        boolean boolean47 = asyncQueryRunner46.isPmdKnownBroken();
        javax.sql.DataSource dataSource48 = asyncQueryRunner46.getDataSource();
        java.sql.PreparedStatement preparedStatement49 = null;
        javax.sql.DataSource dataSource51 = null;
        java.util.concurrent.ExecutorService executorService53 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner54 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource51, true, executorService53);
        boolean boolean55 = asyncQueryRunner54.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement56 = null;
        java.lang.Object obj57 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner54.fillStatementWithBean(preparedStatement56, obj57, propertyDescriptorArray58);
        asyncQueryRunner46.fillStatementWithBean(preparedStatement49, (java.lang.Object) 0, propertyDescriptorArray58);
        asyncQueryRunner41.fillStatement(preparedStatement42, (java.lang.Object[]) propertyDescriptorArray58);
        asyncQueryRunner35.fillStatement(preparedStatement37, parameterMetaData38, (java.lang.Object[]) propertyDescriptorArray58);
        asyncQueryRunner26.fillStatement(preparedStatement32, (java.lang.Object[]) propertyDescriptorArray58);
        asyncQueryRunner3.fillStatement(preparedStatement22, (java.lang.Object[]) propertyDescriptorArray58);
        javax.sql.DataSource dataSource65 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource66 = asyncQueryRunner3.getDataSource();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder68 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder70 = builder68.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder72 = builder68.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder74 = builder72.fetchDirection((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture75 = asyncQueryRunner3.update("", (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray30);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray30, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(dataSource48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray58);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray58, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource65);
        org.junit.Assert.assertNull(dataSource66);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.queryTimeout(duration11);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration13 = builder12.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder12.fetchSize((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder15.queryTimeout((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(statementConfiguration13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder2.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = builder4.build();
        java.lang.Integer int6 = statementConfiguration5.getMaxFieldSize();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        java.lang.Integer int8 = statementConfiguration5.getQueryTimeout();
        boolean boolean9 = statementConfiguration5.isQueryTimeoutSet();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(statementConfiguration5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, true, executorService8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        javax.sql.DataSource dataSource11 = asyncQueryRunner9.getDataSource();
        javax.sql.DataSource dataSource12 = asyncQueryRunner9.getDataSource();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.time.Duration duration18 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration19 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration18);
        boolean boolean20 = statementConfiguration19.isMaxFieldSizeSet();
        java.time.Duration duration21 = statementConfiguration19.getQueryTimeoutDuration();
        boolean boolean22 = statementConfiguration19.isFetchSizeSet();
        boolean boolean23 = statementConfiguration19.isMaxFieldSizeSet();
        boolean boolean24 = statementConfiguration19.isFetchDirectionSet();
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService26);
        java.sql.PreparedStatement preparedStatement28 = null;
        javax.sql.DataSource dataSource29 = null;
        java.util.concurrent.ExecutorService executorService31 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner32 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource29, true, executorService31);
        boolean boolean33 = asyncQueryRunner32.isPmdKnownBroken();
        javax.sql.DataSource dataSource34 = asyncQueryRunner32.getDataSource();
        java.sql.PreparedStatement preparedStatement35 = null;
        javax.sql.DataSource dataSource37 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource37, true, executorService39);
        boolean boolean41 = asyncQueryRunner40.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement42 = null;
        java.lang.Object obj43 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner40.fillStatementWithBean(preparedStatement42, obj43, propertyDescriptorArray44);
        asyncQueryRunner32.fillStatementWithBean(preparedStatement35, (java.lang.Object) 0, propertyDescriptorArray44);
        asyncQueryRunner27.fillStatement(preparedStatement28, (java.lang.Object[]) propertyDescriptorArray44);
        asyncQueryRunner9.fillStatementWithBean(preparedStatement13, (java.lang.Object) statementConfiguration19, propertyDescriptorArray44);
        asyncQueryRunner3.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray44);
        javax.sql.DataSource dataSource50 = asyncQueryRunner3.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture52 = asyncQueryRunner3.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray44);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray44, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource50);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        javax.sql.DataSource dataSource7 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource7, true, executorService9);
        boolean boolean11 = asyncQueryRunner10.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = null;
        javax.sql.DataSource dataSource14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource14, true, executorService16);
        boolean boolean18 = asyncQueryRunner17.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement19 = null;
        java.lang.Object obj20 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner17.fillStatementWithBean(preparedStatement19, obj20, propertyDescriptorArray21);
        asyncQueryRunner10.fillStatement(preparedStatement12, parameterMetaData13, (java.lang.Object[]) propertyDescriptorArray21);
        asyncQueryRunner3.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture26 = asyncQueryRunner3.update("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray21, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder4.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder4.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.fetchSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder15.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = builder15.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = builder19.maxRows((java.lang.Integer) 10);
        java.time.Duration duration22 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = builder21.queryTimeout(duration22);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration29 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration30 = statementConfiguration29.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder31 = builder23.queryTimeout(duration30);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder32 = builder14.queryTimeout(duration30);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration33 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 10, duration30);
        boolean boolean34 = statementConfiguration33.isFetchDirectionSet();
        boolean boolean35 = statementConfiguration33.isFetchSizeSet();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource6 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource7 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement8 = null;
        java.time.Duration duration13 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration14 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration13);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement8, (java.lang.Object) 10, strArray15);
        java.sql.Connection connection17 = null;
        javax.sql.DataSource dataSource19 = null;
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource19, executorService20);
        javax.sql.DataSource dataSource22 = asyncQueryRunner21.getDataSource();
        java.sql.PreparedStatement preparedStatement23 = null;
        java.sql.ParameterMetaData parameterMetaData24 = null;
        javax.sql.DataSource dataSource25 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource25, true, executorService27);
        java.sql.PreparedStatement preparedStatement29 = null;
        java.sql.ParameterMetaData parameterMetaData30 = null;
        javax.sql.DataSource dataSource31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource31, true, executorService33);
        boolean boolean35 = asyncQueryRunner34.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement36 = null;
        java.lang.Object obj37 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner34.fillStatementWithBean(preparedStatement36, obj37, propertyDescriptorArray38);
        javax.sql.DataSource dataSource40 = asyncQueryRunner34.getDataSource();
        javax.sql.DataSource dataSource41 = asyncQueryRunner34.getDataSource();
        java.sql.PreparedStatement preparedStatement42 = null;
        java.sql.ParameterMetaData parameterMetaData43 = null;
        javax.sql.DataSource dataSource44 = null;
        java.util.concurrent.ExecutorService executorService46 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner47 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource44, true, executorService46);
        boolean boolean48 = asyncQueryRunner47.isPmdKnownBroken();
        javax.sql.DataSource dataSource49 = asyncQueryRunner47.getDataSource();
        java.sql.PreparedStatement preparedStatement50 = null;
        javax.sql.DataSource dataSource52 = null;
        java.util.concurrent.ExecutorService executorService54 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner55 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource52, true, executorService54);
        boolean boolean56 = asyncQueryRunner55.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement57 = null;
        java.lang.Object obj58 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner55.fillStatementWithBean(preparedStatement57, obj58, propertyDescriptorArray59);
        asyncQueryRunner47.fillStatementWithBean(preparedStatement50, (java.lang.Object) 0, propertyDescriptorArray59);
        asyncQueryRunner34.fillStatement(preparedStatement42, parameterMetaData43, (java.lang.Object[]) propertyDescriptorArray59);
        java.sql.PreparedStatement preparedStatement63 = null;
        javax.sql.DataSource dataSource64 = null;
        java.util.concurrent.ExecutorService executorService66 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner67 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource64, true, executorService66);
        boolean boolean68 = asyncQueryRunner67.isPmdKnownBroken();
        javax.sql.DataSource dataSource69 = asyncQueryRunner67.getDataSource();
        java.sql.PreparedStatement preparedStatement70 = null;
        javax.sql.DataSource dataSource72 = null;
        java.util.concurrent.ExecutorService executorService74 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner75 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource72, true, executorService74);
        boolean boolean76 = asyncQueryRunner75.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement77 = null;
        java.lang.Object obj78 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray79 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner75.fillStatementWithBean(preparedStatement77, obj78, propertyDescriptorArray79);
        asyncQueryRunner67.fillStatementWithBean(preparedStatement70, (java.lang.Object) 0, propertyDescriptorArray79);
        asyncQueryRunner34.fillStatement(preparedStatement63, (java.lang.Object[]) propertyDescriptorArray79);
        asyncQueryRunner28.fillStatement(preparedStatement29, parameterMetaData30, (java.lang.Object[]) propertyDescriptorArray79);
        asyncQueryRunner21.fillStatement(preparedStatement23, parameterMetaData24, (java.lang.Object[]) propertyDescriptorArray79);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture85 = asyncQueryRunner3.update(connection17, "", (java.lang.Object[]) propertyDescriptorArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray38);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray38, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource40);
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(dataSource49);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray59);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray59, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(dataSource69);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray79);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray79, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = builder10.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder10.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder10.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder15.queryTimeout((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(statementConfiguration11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder2.maxFieldSize((java.lang.Integer) 100);
        java.time.Duration duration5 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder2.queryTimeout(duration5);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder9 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder11 = builder9.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder9.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder13.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder13.queryTimeout((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = builder17.fetchDirection((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration20 = builder19.build();
        java.time.Duration duration21 = statementConfiguration20.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder8.queryTimeout(duration21);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = builder23.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = builder25.maxFieldSize((java.lang.Integer) 100);
        java.time.Duration duration28 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder29 = builder25.queryTimeout(duration28);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder31 = builder29.maxFieldSize((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder33 = builder29.fetchDirection((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder34 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = builder34.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder38 = builder34.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder40 = builder38.maxRows((java.lang.Integer) 10);
        java.time.Duration duration41 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder42 = builder38.queryTimeout(duration41);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder44 = builder38.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder46 = builder38.queryTimeout((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder47 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder49 = builder47.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder51 = builder47.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder53 = builder51.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder55 = builder51.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration56 = builder55.build();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration57 = builder55.build();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration63 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration64 = statementConfiguration63.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder65 = builder55.queryTimeout(duration64);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder66 = builder38.queryTimeout(duration64);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder67 = builder33.queryTimeout(duration64);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder68 = builder8.queryTimeout(duration64);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(statementConfiguration20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(statementConfiguration56);
        org.junit.Assert.assertNotNull(statementConfiguration57);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder68);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 100, duration4);
        java.lang.Integer int6 = statementConfiguration5.getFetchDirection();
        java.lang.Integer int7 = statementConfiguration5.getMaxRows();
        boolean boolean8 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int9 = statementConfiguration5.getFetchSize();
        boolean boolean10 = statementConfiguration5.isFetchSizeSet();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, true, executorService8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        javax.sql.DataSource dataSource11 = asyncQueryRunner9.getDataSource();
        java.sql.PreparedStatement preparedStatement12 = null;
        javax.sql.DataSource dataSource14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource14, true, executorService16);
        boolean boolean18 = asyncQueryRunner17.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement19 = null;
        java.lang.Object obj20 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner17.fillStatementWithBean(preparedStatement19, obj20, propertyDescriptorArray21);
        asyncQueryRunner9.fillStatementWithBean(preparedStatement12, (java.lang.Object) 0, propertyDescriptorArray21);
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray21);
        java.sql.Connection connection25 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder29 = builder27.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder31 = builder27.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder33 = builder31.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder35 = builder33.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder33.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration38 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder39 = builder37.queryTimeout(duration38);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder41 = builder37.maxRows((java.lang.Integer) 10);
        java.time.Duration duration42 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder43 = builder41.queryTimeout(duration42);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture44 = asyncQueryRunner2.update(connection25, "", (java.lang.Object) builder43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray21, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, true, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.lang.Object obj14 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner11.fillStatementWithBean(preparedStatement13, obj14, propertyDescriptorArray15);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement6, (java.lang.Object) 0, propertyDescriptorArray15);
        boolean boolean18 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean19 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean20 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement21 = null;
        java.sql.ParameterMetaData parameterMetaData22 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner24 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner25 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService23, queryRunner24);
        java.sql.PreparedStatement preparedStatement26 = null;
        java.sql.ParameterMetaData parameterMetaData27 = null;
        javax.sql.DataSource dataSource28 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource28, executorService29);
        boolean boolean31 = asyncQueryRunner30.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement32 = null;
        java.sql.ParameterMetaData parameterMetaData33 = null;
        java.util.concurrent.ExecutorService executorService35 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner36 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService35);
        java.sql.PreparedStatement preparedStatement37 = null;
        javax.sql.DataSource dataSource38 = null;
        java.util.concurrent.ExecutorService executorService40 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner41 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource38, true, executorService40);
        boolean boolean42 = asyncQueryRunner41.isPmdKnownBroken();
        javax.sql.DataSource dataSource43 = asyncQueryRunner41.getDataSource();
        java.sql.PreparedStatement preparedStatement44 = null;
        javax.sql.DataSource dataSource46 = null;
        java.util.concurrent.ExecutorService executorService48 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner49 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource46, true, executorService48);
        boolean boolean50 = asyncQueryRunner49.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement51 = null;
        java.lang.Object obj52 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner49.fillStatementWithBean(preparedStatement51, obj52, propertyDescriptorArray53);
        asyncQueryRunner41.fillStatementWithBean(preparedStatement44, (java.lang.Object) 0, propertyDescriptorArray53);
        asyncQueryRunner36.fillStatement(preparedStatement37, (java.lang.Object[]) propertyDescriptorArray53);
        asyncQueryRunner30.fillStatement(preparedStatement32, parameterMetaData33, (java.lang.Object[]) propertyDescriptorArray53);
        asyncQueryRunner25.fillStatement(preparedStatement26, parameterMetaData27, (java.lang.Object[]) propertyDescriptorArray53);
        asyncQueryRunner3.fillStatement(preparedStatement21, parameterMetaData22, (java.lang.Object[]) propertyDescriptorArray53);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture61 = asyncQueryRunner3.update("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(dataSource43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray53);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray53, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.queryTimeout(duration11);
        java.time.Duration duration13 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder10.queryTimeout(duration13);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder10.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.queryTimeout((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder16.fetchSize((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 0, duration4);
        boolean boolean6 = statementConfiguration5.isQueryTimeoutSet();
        java.lang.Integer int7 = statementConfiguration5.getQueryTimeout();
        java.lang.Class<?> wildcardClass8 = statementConfiguration5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchDirection((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.maxFieldSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration13 = builder10.build();
        boolean boolean14 = statementConfiguration13.isMaxRowsSet();
        java.lang.Integer int15 = statementConfiguration13.getQueryTimeout();
        java.time.Duration duration16 = statementConfiguration13.getQueryTimeoutDuration();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(statementConfiguration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(duration16);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        boolean boolean8 = statementConfiguration5.isFetchSizeSet();
        java.time.Duration duration9 = statementConfiguration5.getQueryTimeoutDuration();
        java.lang.Integer int10 = statementConfiguration5.getFetchSize();
        boolean boolean11 = statementConfiguration5.isMaxFieldSizeSet();
        boolean boolean12 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int13 = statementConfiguration5.getQueryTimeout();
        java.time.Duration duration14 = statementConfiguration5.getQueryTimeoutDuration();
        boolean boolean15 = statementConfiguration5.isFetchSizeSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(duration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        javax.sql.DataSource dataSource7 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource7, true, executorService9);
        boolean boolean11 = asyncQueryRunner10.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = null;
        javax.sql.DataSource dataSource14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource14, true, executorService16);
        boolean boolean18 = asyncQueryRunner17.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement19 = null;
        java.lang.Object obj20 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner17.fillStatementWithBean(preparedStatement19, obj20, propertyDescriptorArray21);
        asyncQueryRunner10.fillStatement(preparedStatement12, parameterMetaData13, (java.lang.Object[]) propertyDescriptorArray21);
        asyncQueryRunner3.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray21);
        boolean boolean25 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement26 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder29 = builder27.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder31 = builder27.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder33 = builder27.fetchSize((java.lang.Integer) 0);
        java.time.Duration duration34 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder35 = builder33.queryTimeout(duration34);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder35.queryTimeout((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass38 = builder35.getClass();
        javax.sql.DataSource dataSource39 = null;
        java.util.concurrent.ExecutorService executorService41 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource39, true, executorService41);
        boolean boolean43 = asyncQueryRunner42.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement44 = null;
        java.lang.Object obj45 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner42.fillStatementWithBean(preparedStatement44, obj45, propertyDescriptorArray46);
        javax.sql.DataSource dataSource48 = asyncQueryRunner42.getDataSource();
        java.sql.PreparedStatement preparedStatement49 = null;
        java.sql.ParameterMetaData parameterMetaData50 = asyncQueryRunner42.getParameterMetaData(preparedStatement49);
        java.sql.PreparedStatement preparedStatement51 = null;
        javax.sql.DataSource dataSource52 = null;
        java.util.concurrent.ExecutorService executorService54 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner55 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource52, false, executorService54);
        boolean boolean56 = asyncQueryRunner55.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement57 = null;
        java.sql.ParameterMetaData parameterMetaData58 = null;
        javax.sql.DataSource dataSource59 = null;
        java.util.concurrent.ExecutorService executorService61 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner62 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource59, true, executorService61);
        boolean boolean63 = asyncQueryRunner62.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement64 = null;
        java.sql.ParameterMetaData parameterMetaData65 = null;
        javax.sql.DataSource dataSource66 = null;
        java.util.concurrent.ExecutorService executorService68 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner69 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource66, true, executorService68);
        boolean boolean70 = asyncQueryRunner69.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement71 = null;
        java.lang.Object obj72 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner69.fillStatementWithBean(preparedStatement71, obj72, propertyDescriptorArray73);
        asyncQueryRunner62.fillStatement(preparedStatement64, parameterMetaData65, (java.lang.Object[]) propertyDescriptorArray73);
        asyncQueryRunner55.fillStatement(preparedStatement57, parameterMetaData58, (java.lang.Object[]) propertyDescriptorArray73);
        asyncQueryRunner42.fillStatement(preparedStatement51, (java.lang.Object[]) propertyDescriptorArray73);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner3.fillStatementWithBean(preparedStatement26, (java.lang.Object) builder35, propertyDescriptorArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray21, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray46);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray46, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource48);
        org.junit.Assert.assertNull(parameterMetaData50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray73);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray73, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.fetchSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder9 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder11 = builder9.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder9.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder13.maxRows((java.lang.Integer) 10);
        java.time.Duration duration16 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder13.queryTimeout(duration16);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = builder13.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = builder13.queryTimeout((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder24 = builder22.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder26 = builder22.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder28 = builder26.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder30 = builder26.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration31 = builder30.build();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration32 = builder30.build();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration38 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration39 = statementConfiguration38.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder40 = builder30.queryTimeout(duration39);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder41 = builder13.queryTimeout(duration39);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder42 = builder4.queryTimeout(duration39);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(statementConfiguration31);
        org.junit.Assert.assertNotNull(statementConfiguration32);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.queryTimeout(duration11);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder10.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder14.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder14.fetchSize((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource6 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement7 = null;
        java.time.Duration duration12 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration13 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration12);
        boolean boolean14 = statementConfiguration13.isMaxFieldSizeSet();
        java.time.Duration duration15 = statementConfiguration13.getQueryTimeoutDuration();
        boolean boolean16 = statementConfiguration13.isFetchSizeSet();
        boolean boolean17 = statementConfiguration13.isMaxFieldSizeSet();
        boolean boolean18 = statementConfiguration13.isFetchDirectionSet();
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService20);
        java.sql.PreparedStatement preparedStatement22 = null;
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, true, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        javax.sql.DataSource dataSource28 = asyncQueryRunner26.getDataSource();
        java.sql.PreparedStatement preparedStatement29 = null;
        javax.sql.DataSource dataSource31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource31, true, executorService33);
        boolean boolean35 = asyncQueryRunner34.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement36 = null;
        java.lang.Object obj37 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner34.fillStatementWithBean(preparedStatement36, obj37, propertyDescriptorArray38);
        asyncQueryRunner26.fillStatementWithBean(preparedStatement29, (java.lang.Object) 0, propertyDescriptorArray38);
        asyncQueryRunner21.fillStatement(preparedStatement22, (java.lang.Object[]) propertyDescriptorArray38);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement7, (java.lang.Object) statementConfiguration13, propertyDescriptorArray38);
        java.sql.PreparedStatement preparedStatement43 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder44 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration45 = builder44.build();
        java.util.concurrent.ExecutorService executorService47 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner48 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService47);
        java.sql.PreparedStatement preparedStatement49 = null;
        javax.sql.DataSource dataSource50 = null;
        java.util.concurrent.ExecutorService executorService52 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner53 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource50, true, executorService52);
        boolean boolean54 = asyncQueryRunner53.isPmdKnownBroken();
        javax.sql.DataSource dataSource55 = asyncQueryRunner53.getDataSource();
        java.sql.PreparedStatement preparedStatement56 = null;
        javax.sql.DataSource dataSource58 = null;
        java.util.concurrent.ExecutorService executorService60 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner61 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource58, true, executorService60);
        boolean boolean62 = asyncQueryRunner61.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement63 = null;
        java.lang.Object obj64 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray65 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner61.fillStatementWithBean(preparedStatement63, obj64, propertyDescriptorArray65);
        asyncQueryRunner53.fillStatementWithBean(preparedStatement56, (java.lang.Object) 0, propertyDescriptorArray65);
        asyncQueryRunner48.fillStatement(preparedStatement49, (java.lang.Object[]) propertyDescriptorArray65);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement43, (java.lang.Object) builder44, propertyDescriptorArray65);
        boolean boolean70 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement71 = null;
        java.sql.ParameterMetaData parameterMetaData72 = asyncQueryRunner3.getParameterMetaData(preparedStatement71);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray38);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray38, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(statementConfiguration45);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(dataSource55);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray65);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray65, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(parameterMetaData72);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, true, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.lang.Object obj14 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner11.fillStatementWithBean(preparedStatement13, obj14, propertyDescriptorArray15);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement6, (java.lang.Object) 0, propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = asyncQueryRunner3.getParameterMetaData(preparedStatement18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.sql.ParameterMetaData parameterMetaData21 = asyncQueryRunner3.getParameterMetaData(preparedStatement20);
        java.sql.PreparedStatement preparedStatement22 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = builder23.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = builder23.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder29 = builder27.maxRows((java.lang.Integer) 10);
        java.time.Duration duration30 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder31 = builder29.queryTimeout(duration30);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder33 = builder31.fetchDirection((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder35 = builder31.fetchSize((java.lang.Integer) 100);
        javax.sql.DataSource dataSource36 = null;
        java.util.concurrent.ExecutorService executorService38 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner39 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource36, true, executorService38);
        boolean boolean40 = asyncQueryRunner39.isPmdKnownBroken();
        javax.sql.DataSource dataSource41 = asyncQueryRunner39.getDataSource();
        java.sql.PreparedStatement preparedStatement42 = null;
        javax.sql.DataSource dataSource44 = null;
        java.util.concurrent.ExecutorService executorService46 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner47 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource44, true, executorService46);
        boolean boolean48 = asyncQueryRunner47.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement49 = null;
        java.lang.Object obj50 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray51 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner47.fillStatementWithBean(preparedStatement49, obj50, propertyDescriptorArray51);
        asyncQueryRunner39.fillStatementWithBean(preparedStatement42, (java.lang.Object) 0, propertyDescriptorArray51);
        boolean boolean54 = asyncQueryRunner39.isPmdKnownBroken();
        javax.sql.DataSource dataSource55 = asyncQueryRunner39.getDataSource();
        java.sql.PreparedStatement preparedStatement56 = null;
        java.sql.ParameterMetaData parameterMetaData57 = null;
        java.lang.Object[] objArray58 = null;
        asyncQueryRunner39.fillStatement(preparedStatement56, parameterMetaData57, objArray58);
        java.sql.PreparedStatement preparedStatement60 = null;
        javax.sql.DataSource dataSource61 = null;
        java.util.concurrent.ExecutorService executorService63 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner64 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource61, true, executorService63);
        boolean boolean65 = asyncQueryRunner64.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement66 = null;
        java.lang.Object obj67 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray68 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner64.fillStatementWithBean(preparedStatement66, obj67, propertyDescriptorArray68);
        javax.sql.DataSource dataSource70 = asyncQueryRunner64.getDataSource();
        javax.sql.DataSource dataSource71 = asyncQueryRunner64.getDataSource();
        java.sql.PreparedStatement preparedStatement72 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration78 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 100);
        javax.sql.DataSource dataSource79 = null;
        java.util.concurrent.ExecutorService executorService81 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner82 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource79, true, executorService81);
        boolean boolean83 = asyncQueryRunner82.isPmdKnownBroken();
        javax.sql.DataSource dataSource84 = asyncQueryRunner82.getDataSource();
        javax.sql.DataSource dataSource85 = asyncQueryRunner82.getDataSource();
        javax.sql.DataSource dataSource86 = asyncQueryRunner82.getDataSource();
        java.sql.PreparedStatement preparedStatement87 = null;
        java.time.Duration duration92 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration93 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration92);
        java.lang.String[] strArray94 = new java.lang.String[] {};
        asyncQueryRunner82.fillStatementWithBean(preparedStatement87, (java.lang.Object) 10, strArray94);
        asyncQueryRunner64.fillStatementWithBean(preparedStatement72, (java.lang.Object) statementConfiguration78, strArray94);
        asyncQueryRunner39.fillStatement(preparedStatement60, (java.lang.Object[]) strArray94);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement22, (java.lang.Object) 100, strArray94);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData19);
        org.junit.Assert.assertNull(parameterMetaData21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray51);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray51, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(dataSource55);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray68);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray68, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource70);
        org.junit.Assert.assertNull(dataSource71);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNull(dataSource84);
        org.junit.Assert.assertNull(dataSource85);
        org.junit.Assert.assertNull(dataSource86);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertArrayEquals(strArray94, new java.lang.String[] {});
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, true, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.lang.Object obj14 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner11.fillStatementWithBean(preparedStatement13, obj14, propertyDescriptorArray15);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement6, (java.lang.Object) 0, propertyDescriptorArray15);
        boolean boolean18 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean19 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean20 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean21 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement22 = null;
        java.sql.ParameterMetaData parameterMetaData23 = asyncQueryRunner3.getParameterMetaData(preparedStatement22);
        java.sql.Connection connection24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture27 = asyncQueryRunner3.update(connection24, "", (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(parameterMetaData23);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchDirection((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.fetchDirection((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration9 = builder6.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder11 = builder6.queryTimeout((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder6.maxRows((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(statementConfiguration9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        boolean boolean6 = statementConfiguration5.isQueryTimeoutSet();
        boolean boolean7 = statementConfiguration5.isMaxRowsSet();
        boolean boolean8 = statementConfiguration5.isMaxRowsSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner3.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = asyncQueryRunner3.getParameterMetaData(preparedStatement12);
        javax.sql.DataSource dataSource14 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService17);
        java.sql.PreparedStatement preparedStatement19 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder20.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder24 = builder20.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder26 = builder24.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder28 = builder26.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder30 = builder26.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration31 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder32 = builder30.queryTimeout(duration31);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder34 = builder32.fetchSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = builder32.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder38 = builder32.maxRows((java.lang.Integer) (-1));
        javax.sql.DataSource dataSource39 = null;
        java.util.concurrent.ExecutorService executorService41 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource39, false, executorService41);
        boolean boolean43 = asyncQueryRunner42.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement44 = null;
        java.sql.ParameterMetaData parameterMetaData45 = null;
        javax.sql.DataSource dataSource46 = null;
        java.util.concurrent.ExecutorService executorService48 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner49 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource46, true, executorService48);
        boolean boolean50 = asyncQueryRunner49.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement51 = null;
        java.sql.ParameterMetaData parameterMetaData52 = null;
        javax.sql.DataSource dataSource53 = null;
        java.util.concurrent.ExecutorService executorService55 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner56 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource53, true, executorService55);
        boolean boolean57 = asyncQueryRunner56.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement58 = null;
        java.lang.Object obj59 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray60 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner56.fillStatementWithBean(preparedStatement58, obj59, propertyDescriptorArray60);
        asyncQueryRunner49.fillStatement(preparedStatement51, parameterMetaData52, (java.lang.Object[]) propertyDescriptorArray60);
        asyncQueryRunner42.fillStatement(preparedStatement44, parameterMetaData45, (java.lang.Object[]) propertyDescriptorArray60);
        asyncQueryRunner18.fillStatementWithBean(preparedStatement19, (java.lang.Object) (-1), propertyDescriptorArray60);
        asyncQueryRunner3.fillStatement(preparedStatement15, (java.lang.Object[]) propertyDescriptorArray60);
        javax.sql.DataSource dataSource66 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement67 = null;
        java.sql.ParameterMetaData parameterMetaData68 = asyncQueryRunner3.getParameterMetaData(preparedStatement67);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNull(parameterMetaData13);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray60);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray60, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource66);
        org.junit.Assert.assertNull(parameterMetaData68);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        javax.sql.DataSource dataSource5 = asyncQueryRunner2.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(dataSource5);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 100, duration4);
        boolean boolean6 = statementConfiguration5.isFetchSizeSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner3.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, false, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        javax.sql.DataSource dataSource20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource20, true, executorService22);
        boolean boolean24 = asyncQueryRunner23.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement25 = null;
        java.sql.ParameterMetaData parameterMetaData26 = null;
        javax.sql.DataSource dataSource27 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource27, true, executorService29);
        boolean boolean31 = asyncQueryRunner30.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement32 = null;
        java.lang.Object obj33 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner30.fillStatementWithBean(preparedStatement32, obj33, propertyDescriptorArray34);
        asyncQueryRunner23.fillStatement(preparedStatement25, parameterMetaData26, (java.lang.Object[]) propertyDescriptorArray34);
        asyncQueryRunner16.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray34);
        asyncQueryRunner3.fillStatement(preparedStatement12, (java.lang.Object[]) propertyDescriptorArray34);
        javax.sql.DataSource dataSource39 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement40 = null;
        java.lang.Object[] objArray41 = null;
        asyncQueryRunner3.fillStatement(preparedStatement40, objArray41);
        java.sql.PreparedStatement preparedStatement43 = null;
        java.sql.ParameterMetaData parameterMetaData44 = null;
        javax.sql.DataSource dataSource45 = null;
        java.util.concurrent.ExecutorService executorService47 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner48 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource45, true, executorService47);
        boolean boolean49 = asyncQueryRunner48.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement50 = null;
        java.sql.ParameterMetaData parameterMetaData51 = null;
        javax.sql.DataSource dataSource52 = null;
        java.util.concurrent.ExecutorService executorService54 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner55 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource52, true, executorService54);
        boolean boolean56 = asyncQueryRunner55.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement57 = null;
        java.lang.Object obj58 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner55.fillStatementWithBean(preparedStatement57, obj58, propertyDescriptorArray59);
        asyncQueryRunner48.fillStatement(preparedStatement50, parameterMetaData51, (java.lang.Object[]) propertyDescriptorArray59);
        java.sql.PreparedStatement preparedStatement62 = null;
        javax.sql.DataSource dataSource63 = null;
        java.util.concurrent.ExecutorService executorService65 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner66 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource63, true, executorService65);
        boolean boolean67 = asyncQueryRunner66.isPmdKnownBroken();
        javax.sql.DataSource dataSource68 = asyncQueryRunner66.getDataSource();
        java.sql.PreparedStatement preparedStatement69 = null;
        javax.sql.DataSource dataSource71 = null;
        java.util.concurrent.ExecutorService executorService73 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner74 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource71, true, executorService73);
        boolean boolean75 = asyncQueryRunner74.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement76 = null;
        java.lang.Object obj77 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray78 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner74.fillStatementWithBean(preparedStatement76, obj77, propertyDescriptorArray78);
        asyncQueryRunner66.fillStatementWithBean(preparedStatement69, (java.lang.Object) 0, propertyDescriptorArray78);
        asyncQueryRunner48.fillStatement(preparedStatement62, (java.lang.Object[]) propertyDescriptorArray78);
        asyncQueryRunner3.fillStatement(preparedStatement43, parameterMetaData44, (java.lang.Object[]) propertyDescriptorArray78);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray34);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray34, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource39);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray59);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray59, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(dataSource68);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray78);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray78, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = builder10.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder10.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder10.queryTimeout((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder16.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder20.maxRows((java.lang.Integer) 10);
        java.time.Duration duration23 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder24 = builder22.queryTimeout(duration23);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration30 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration31 = statementConfiguration30.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder32 = builder24.queryTimeout(duration31);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder33 = builder15.queryTimeout(duration31);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder35 = builder15.maxFieldSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder35.maxFieldSize((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(statementConfiguration11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        java.lang.Integer int8 = statementConfiguration5.getQueryTimeout();
        java.time.Duration duration9 = statementConfiguration5.getQueryTimeoutDuration();
        boolean boolean10 = statementConfiguration5.isQueryTimeoutSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(duration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        boolean boolean8 = statementConfiguration5.isFetchSizeSet();
        java.time.Duration duration9 = statementConfiguration5.getQueryTimeoutDuration();
        java.lang.Integer int10 = statementConfiguration5.getFetchSize();
        java.lang.Integer int11 = statementConfiguration5.getFetchDirection();
        boolean boolean12 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int13 = statementConfiguration5.getFetchSize();
        boolean boolean14 = statementConfiguration5.isQueryTimeoutSet();
        java.lang.Integer int15 = statementConfiguration5.getMaxRows();
        java.lang.Integer int16 = statementConfiguration5.getFetchDirection();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(duration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 0, duration4);
        boolean boolean6 = statementConfiguration5.isMaxRowsSet();
        java.lang.Integer int7 = statementConfiguration5.getQueryTimeout();
        java.lang.Integer int8 = statementConfiguration5.getMaxFieldSize();
        boolean boolean9 = statementConfiguration5.isMaxRowsSet();
        java.lang.Integer int10 = statementConfiguration5.getFetchSize();
        boolean boolean11 = statementConfiguration5.isMaxRowsSet();
        boolean boolean12 = statementConfiguration5.isMaxRowsSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        boolean boolean8 = statementConfiguration5.isFetchSizeSet();
        boolean boolean9 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int10 = statementConfiguration5.getMaxFieldSize();
        java.lang.Integer int11 = statementConfiguration5.getFetchSize();
        boolean boolean12 = statementConfiguration5.isMaxFieldSizeSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder0.fetchSize((java.lang.Integer) 0);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration9 = builder6.build();
        boolean boolean10 = statementConfiguration9.isQueryTimeoutSet();
        java.lang.Integer int11 = statementConfiguration9.getFetchDirection();
        boolean boolean12 = statementConfiguration9.isMaxRowsSet();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(statementConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        boolean boolean8 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean9 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource10 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = asyncQueryRunner3.getParameterMetaData(preparedStatement11);
        java.sql.PreparedStatement preparedStatement13 = null;
        java.lang.Object[] objArray14 = null;
        asyncQueryRunner3.fillStatement(preparedStatement13, objArray14);
        boolean boolean16 = asyncQueryRunner3.isPmdKnownBroken();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(parameterMetaData12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource10 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        javax.sql.DataSource dataSource18 = asyncQueryRunner16.getDataSource();
        java.sql.PreparedStatement preparedStatement19 = null;
        javax.sql.DataSource dataSource21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource21, true, executorService23);
        boolean boolean25 = asyncQueryRunner24.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement26 = null;
        java.lang.Object obj27 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner24.fillStatementWithBean(preparedStatement26, obj27, propertyDescriptorArray28);
        asyncQueryRunner16.fillStatementWithBean(preparedStatement19, (java.lang.Object) 0, propertyDescriptorArray28);
        asyncQueryRunner3.fillStatement(preparedStatement11, parameterMetaData12, (java.lang.Object[]) propertyDescriptorArray28);
        java.sql.PreparedStatement preparedStatement32 = null;
        java.sql.ParameterMetaData parameterMetaData33 = asyncQueryRunner3.getParameterMetaData(preparedStatement32);
        java.sql.PreparedStatement preparedStatement34 = null;
        java.sql.ParameterMetaData parameterMetaData35 = asyncQueryRunner3.getParameterMetaData(preparedStatement34);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData33);
        org.junit.Assert.assertNull(parameterMetaData35);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        boolean boolean8 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = dataSource9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder8.queryTimeout((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource6 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement7 = null;
        java.sql.ParameterMetaData parameterMetaData8 = asyncQueryRunner3.getParameterMetaData(preparedStatement7);
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        javax.sql.DataSource dataSource11 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource11, true, executorService13);
        boolean boolean15 = asyncQueryRunner14.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement16 = null;
        java.lang.Object obj17 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner14.fillStatementWithBean(preparedStatement16, obj17, propertyDescriptorArray18);
        javax.sql.DataSource dataSource20 = asyncQueryRunner14.getDataSource();
        java.sql.PreparedStatement preparedStatement21 = null;
        java.sql.ParameterMetaData parameterMetaData22 = asyncQueryRunner14.getParameterMetaData(preparedStatement21);
        java.sql.PreparedStatement preparedStatement23 = null;
        javax.sql.DataSource dataSource24 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource24, false, executorService26);
        boolean boolean28 = asyncQueryRunner27.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement29 = null;
        java.sql.ParameterMetaData parameterMetaData30 = null;
        javax.sql.DataSource dataSource31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource31, true, executorService33);
        boolean boolean35 = asyncQueryRunner34.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement36 = null;
        java.sql.ParameterMetaData parameterMetaData37 = null;
        javax.sql.DataSource dataSource38 = null;
        java.util.concurrent.ExecutorService executorService40 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner41 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource38, true, executorService40);
        boolean boolean42 = asyncQueryRunner41.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement43 = null;
        java.lang.Object obj44 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner41.fillStatementWithBean(preparedStatement43, obj44, propertyDescriptorArray45);
        asyncQueryRunner34.fillStatement(preparedStatement36, parameterMetaData37, (java.lang.Object[]) propertyDescriptorArray45);
        asyncQueryRunner27.fillStatement(preparedStatement29, parameterMetaData30, (java.lang.Object[]) propertyDescriptorArray45);
        asyncQueryRunner14.fillStatement(preparedStatement23, (java.lang.Object[]) propertyDescriptorArray45);
        asyncQueryRunner3.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray45);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(parameterMetaData8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray18, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNull(parameterMetaData22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray45);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray45, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        javax.sql.DataSource dataSource4 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource4, true, executorService6);
        boolean boolean8 = asyncQueryRunner7.isPmdKnownBroken();
        javax.sql.DataSource dataSource9 = asyncQueryRunner7.getDataSource();
        java.sql.PreparedStatement preparedStatement10 = null;
        javax.sql.DataSource dataSource12 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource12, true, executorService14);
        boolean boolean16 = asyncQueryRunner15.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement17 = null;
        java.lang.Object obj18 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner15.fillStatementWithBean(preparedStatement17, obj18, propertyDescriptorArray19);
        asyncQueryRunner7.fillStatementWithBean(preparedStatement10, (java.lang.Object) 0, propertyDescriptorArray19);
        asyncQueryRunner2.fillStatement(preparedStatement3, (java.lang.Object[]) propertyDescriptorArray19);
        javax.sql.DataSource dataSource23 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement24 = null;
        java.time.Duration duration29 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration30 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 0, duration29);
        boolean boolean31 = statementConfiguration30.isMaxRowsSet();
        java.lang.Integer int32 = statementConfiguration30.getQueryTimeout();
        java.lang.Integer int33 = statementConfiguration30.getMaxFieldSize();
        boolean boolean34 = statementConfiguration30.isMaxRowsSet();
        java.lang.Integer int35 = statementConfiguration30.getMaxRows();
        boolean boolean36 = statementConfiguration30.isFetchSizeSet();
        boolean boolean37 = statementConfiguration30.isFetchSizeSet();
        javax.sql.DataSource dataSource38 = null;
        java.util.concurrent.ExecutorService executorService40 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner41 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource38, true, executorService40);
        boolean boolean42 = asyncQueryRunner41.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement43 = null;
        java.lang.Object obj44 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner41.fillStatementWithBean(preparedStatement43, obj44, propertyDescriptorArray45);
        java.sql.PreparedStatement preparedStatement47 = null;
        javax.sql.DataSource dataSource48 = null;
        java.util.concurrent.ExecutorService executorService49 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner50 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource48, executorService49);
        boolean boolean51 = asyncQueryRunner50.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement52 = null;
        java.sql.ParameterMetaData parameterMetaData53 = null;
        java.util.concurrent.ExecutorService executorService55 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner56 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService55);
        java.sql.PreparedStatement preparedStatement57 = null;
        javax.sql.DataSource dataSource58 = null;
        java.util.concurrent.ExecutorService executorService60 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner61 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource58, true, executorService60);
        boolean boolean62 = asyncQueryRunner61.isPmdKnownBroken();
        javax.sql.DataSource dataSource63 = asyncQueryRunner61.getDataSource();
        java.sql.PreparedStatement preparedStatement64 = null;
        javax.sql.DataSource dataSource66 = null;
        java.util.concurrent.ExecutorService executorService68 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner69 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource66, true, executorService68);
        boolean boolean70 = asyncQueryRunner69.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement71 = null;
        java.lang.Object obj72 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner69.fillStatementWithBean(preparedStatement71, obj72, propertyDescriptorArray73);
        asyncQueryRunner61.fillStatementWithBean(preparedStatement64, (java.lang.Object) 0, propertyDescriptorArray73);
        asyncQueryRunner56.fillStatement(preparedStatement57, (java.lang.Object[]) propertyDescriptorArray73);
        asyncQueryRunner50.fillStatement(preparedStatement52, parameterMetaData53, (java.lang.Object[]) propertyDescriptorArray73);
        asyncQueryRunner41.fillStatement(preparedStatement47, (java.lang.Object[]) propertyDescriptorArray73);
        asyncQueryRunner2.fillStatementWithBean(preparedStatement24, (java.lang.Object) statementConfiguration30, propertyDescriptorArray73);
        boolean boolean80 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection81 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture83 = asyncQueryRunner2.update(connection81, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray19, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray45);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray45, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(dataSource63);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray73);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray73, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        boolean boolean7 = statementConfiguration5.isMaxFieldSizeSet();
        java.time.Duration duration8 = statementConfiguration5.getQueryTimeoutDuration();
        boolean boolean9 = statementConfiguration5.isFetchDirectionSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(duration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, true, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.lang.Object obj14 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner11.fillStatementWithBean(preparedStatement13, obj14, propertyDescriptorArray15);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement6, (java.lang.Object) 0, propertyDescriptorArray15);
        boolean boolean18 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement19 = null;
        java.sql.ParameterMetaData parameterMetaData20 = asyncQueryRunner3.getParameterMetaData(preparedStatement19);
        java.sql.PreparedStatement preparedStatement21 = null;
        java.sql.ParameterMetaData parameterMetaData22 = asyncQueryRunner3.getParameterMetaData(preparedStatement21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture24 = asyncQueryRunner3.update("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(parameterMetaData20);
        org.junit.Assert.assertNull(parameterMetaData22);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration14 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
        java.time.Duration duration15 = statementConfiguration14.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder4.queryTimeout(duration15);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration20 = builder19.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = builder21.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = builder21.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = builder25.maxRows((java.lang.Integer) 10);
        java.time.Duration duration28 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder29 = builder27.queryTimeout(duration28);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder31 = builder29.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration32 = builder31.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder34 = builder31.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder35 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder35.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder39 = builder35.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder41 = builder39.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder43 = builder41.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder45 = builder43.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder47 = builder45.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration53 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
        java.time.Duration duration54 = statementConfiguration53.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder55 = builder47.queryTimeout(duration54);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder56 = builder34.queryTimeout(duration54);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder57 = builder19.queryTimeout(duration54);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder58 = builder18.queryTimeout(duration54);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(statementConfiguration20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(statementConfiguration32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        javax.sql.DataSource dataSource7 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource7, true, executorService9);
        boolean boolean11 = asyncQueryRunner10.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = null;
        javax.sql.DataSource dataSource14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource14, true, executorService16);
        boolean boolean18 = asyncQueryRunner17.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement19 = null;
        java.lang.Object obj20 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner17.fillStatementWithBean(preparedStatement19, obj20, propertyDescriptorArray21);
        asyncQueryRunner10.fillStatement(preparedStatement12, parameterMetaData13, (java.lang.Object[]) propertyDescriptorArray21);
        asyncQueryRunner3.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray21);
        javax.sql.DataSource dataSource25 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource26 = asyncQueryRunner3.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray21, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertNull(dataSource26);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder0.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder0.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder0.maxRows((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = builder0.build();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration12 = builder0.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder0.fetchDirection((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder0.queryTimeout((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.queryTimeout((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(statementConfiguration11);
        org.junit.Assert.assertNotNull(statementConfiguration12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) (-1), duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        boolean boolean7 = statementConfiguration5.isFetchDirectionSet();
        boolean boolean8 = statementConfiguration5.isFetchDirectionSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 0, duration4);
        boolean boolean6 = statementConfiguration5.isMaxRowsSet();
        java.lang.Integer int7 = statementConfiguration5.getQueryTimeout();
        java.lang.Integer int8 = statementConfiguration5.getMaxFieldSize();
        boolean boolean9 = statementConfiguration5.isMaxRowsSet();
        boolean boolean10 = statementConfiguration5.isFetchSizeSet();
        boolean boolean11 = statementConfiguration5.isFetchSizeSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder13.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder13.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = builder17.maxRows((java.lang.Integer) 10);
        java.time.Duration duration20 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = builder17.queryTimeout(duration20);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = builder17.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder28 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder30 = builder28.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder32 = builder28.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder34 = builder32.maxRows((java.lang.Integer) 10);
        java.time.Duration duration35 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = builder34.queryTimeout(duration35);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder38 = builder36.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration39 = builder38.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder41 = builder38.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder43 = builder38.queryTimeout((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder44 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder46 = builder44.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder48 = builder44.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder50 = builder48.maxRows((java.lang.Integer) 10);
        java.time.Duration duration51 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder52 = builder50.queryTimeout(duration51);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration58 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration59 = statementConfiguration58.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder60 = builder52.queryTimeout(duration59);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder61 = builder43.queryTimeout(duration59);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration62 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, duration59);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder63 = builder17.queryTimeout(duration59);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration69 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 0);
        java.time.Duration duration70 = statementConfiguration69.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder71 = builder17.queryTimeout(duration70);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration72 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) (-1), duration70);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder73 = builder8.queryTimeout(duration70);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(statementConfiguration39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, true, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.lang.Object obj14 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner11.fillStatementWithBean(preparedStatement13, obj14, propertyDescriptorArray15);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement6, (java.lang.Object) 0, propertyDescriptorArray15);
        boolean boolean18 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource19 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource20 = asyncQueryRunner3.getDataSource();
        boolean boolean21 = asyncQueryRunner3.isPmdKnownBroken();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        boolean boolean6 = statementConfiguration5.isFetchSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getFetchSize();
        java.lang.Integer int8 = statementConfiguration5.getQueryTimeout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = builder10.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder10.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder10.queryTimeout((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder16.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder20.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder24 = builder22.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder26 = builder24.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder28 = builder26.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration34 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
        java.time.Duration duration35 = statementConfiguration34.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = builder28.queryTimeout(duration35);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder10.queryTimeout(duration35);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder39 = builder10.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder41 = builder10.fetchDirection((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder43 = builder10.maxRows((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(statementConfiguration11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = builder10.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder10.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder10.queryTimeout((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder16.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder20.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder24 = builder22.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder26 = builder24.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder28 = builder26.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration34 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
        java.time.Duration duration35 = statementConfiguration34.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = builder28.queryTimeout(duration35);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder10.queryTimeout(duration35);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder39 = builder10.fetchSize((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(statementConfiguration11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner3.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = asyncQueryRunner3.getParameterMetaData(preparedStatement12);
        java.sql.Connection connection14 = null;
        javax.sql.DataSource dataSource16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource16, true, executorService18);
        boolean boolean20 = asyncQueryRunner19.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement21 = null;
        java.lang.Object obj22 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner19.fillStatementWithBean(preparedStatement21, obj22, propertyDescriptorArray23);
        javax.sql.DataSource dataSource25 = asyncQueryRunner19.getDataSource();
        javax.sql.DataSource dataSource26 = asyncQueryRunner19.getDataSource();
        java.sql.PreparedStatement preparedStatement27 = null;
        java.sql.ParameterMetaData parameterMetaData28 = null;
        javax.sql.DataSource dataSource29 = null;
        java.util.concurrent.ExecutorService executorService31 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner32 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource29, true, executorService31);
        boolean boolean33 = asyncQueryRunner32.isPmdKnownBroken();
        javax.sql.DataSource dataSource34 = asyncQueryRunner32.getDataSource();
        java.sql.PreparedStatement preparedStatement35 = null;
        javax.sql.DataSource dataSource37 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource37, true, executorService39);
        boolean boolean41 = asyncQueryRunner40.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement42 = null;
        java.lang.Object obj43 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner40.fillStatementWithBean(preparedStatement42, obj43, propertyDescriptorArray44);
        asyncQueryRunner32.fillStatementWithBean(preparedStatement35, (java.lang.Object) 0, propertyDescriptorArray44);
        asyncQueryRunner19.fillStatement(preparedStatement27, parameterMetaData28, (java.lang.Object[]) propertyDescriptorArray44);
        java.sql.PreparedStatement preparedStatement48 = null;
        javax.sql.DataSource dataSource49 = null;
        java.util.concurrent.ExecutorService executorService51 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner52 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource49, true, executorService51);
        boolean boolean53 = asyncQueryRunner52.isPmdKnownBroken();
        javax.sql.DataSource dataSource54 = asyncQueryRunner52.getDataSource();
        java.sql.PreparedStatement preparedStatement55 = null;
        javax.sql.DataSource dataSource57 = null;
        java.util.concurrent.ExecutorService executorService59 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner60 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource57, true, executorService59);
        boolean boolean61 = asyncQueryRunner60.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement62 = null;
        java.lang.Object obj63 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray64 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner60.fillStatementWithBean(preparedStatement62, obj63, propertyDescriptorArray64);
        asyncQueryRunner52.fillStatementWithBean(preparedStatement55, (java.lang.Object) 0, propertyDescriptorArray64);
        asyncQueryRunner19.fillStatement(preparedStatement48, (java.lang.Object[]) propertyDescriptorArray64);
        boolean boolean68 = asyncQueryRunner19.isPmdKnownBroken();
        boolean boolean69 = asyncQueryRunner19.isPmdKnownBroken();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture70 = asyncQueryRunner3.update(connection14, "", (java.lang.Object) asyncQueryRunner19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNull(parameterMetaData13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray23);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray23, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray44);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray44, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(dataSource54);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray64);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray64, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder10.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration15 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder14.queryTimeout(duration15);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.fetchSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder16.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder16.maxRows((java.lang.Integer) (-1));
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, false, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement28 = null;
        java.sql.ParameterMetaData parameterMetaData29 = null;
        javax.sql.DataSource dataSource30 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner33 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource30, true, executorService32);
        boolean boolean34 = asyncQueryRunner33.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement35 = null;
        java.sql.ParameterMetaData parameterMetaData36 = null;
        javax.sql.DataSource dataSource37 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource37, true, executorService39);
        boolean boolean41 = asyncQueryRunner40.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement42 = null;
        java.lang.Object obj43 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner40.fillStatementWithBean(preparedStatement42, obj43, propertyDescriptorArray44);
        asyncQueryRunner33.fillStatement(preparedStatement35, parameterMetaData36, (java.lang.Object[]) propertyDescriptorArray44);
        asyncQueryRunner26.fillStatement(preparedStatement28, parameterMetaData29, (java.lang.Object[]) propertyDescriptorArray44);
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) (-1), propertyDescriptorArray44);
        java.sql.PreparedStatement preparedStatement49 = null;
        javax.sql.DataSource dataSource50 = null;
        java.util.concurrent.ExecutorService executorService52 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner53 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource50, true, executorService52);
        boolean boolean54 = asyncQueryRunner53.isPmdKnownBroken();
        javax.sql.DataSource dataSource55 = asyncQueryRunner53.getDataSource();
        javax.sql.DataSource dataSource56 = asyncQueryRunner53.getDataSource();
        javax.sql.DataSource dataSource57 = asyncQueryRunner53.getDataSource();
        java.sql.PreparedStatement preparedStatement58 = null;
        java.time.Duration duration63 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration64 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration63);
        java.lang.String[] strArray65 = new java.lang.String[] {};
        asyncQueryRunner53.fillStatementWithBean(preparedStatement58, (java.lang.Object) 10, strArray65);
        asyncQueryRunner2.fillStatement(preparedStatement49, (java.lang.Object[]) strArray65);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture69 = asyncQueryRunner2.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray44);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray44, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(dataSource55);
        org.junit.Assert.assertNull(dataSource56);
        org.junit.Assert.assertNull(dataSource57);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] {});
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.maxRows((java.lang.Integer) 10);
        java.time.Duration duration13 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder10.queryTimeout(duration13);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder10.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.queryTimeout((java.lang.Integer) (-1));
        javax.sql.DataSource dataSource19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource19, true, executorService21);
        boolean boolean23 = asyncQueryRunner22.isPmdKnownBroken();
        javax.sql.DataSource dataSource24 = asyncQueryRunner22.getDataSource();
        javax.sql.DataSource dataSource25 = asyncQueryRunner22.getDataSource();
        javax.sql.DataSource dataSource26 = asyncQueryRunner22.getDataSource();
        java.sql.PreparedStatement preparedStatement27 = null;
        java.time.Duration duration32 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration33 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration32);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement27, (java.lang.Object) 10, strArray34);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement5, (java.lang.Object) (-1), strArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] {});
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource6 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement7 = null;
        java.sql.ParameterMetaData parameterMetaData8 = asyncQueryRunner3.getParameterMetaData(preparedStatement7);
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = asyncQueryRunner3.getParameterMetaData(preparedStatement9);
        java.sql.PreparedStatement preparedStatement11 = null;
        java.time.Duration duration16 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration17 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 100, duration16);
        java.lang.Integer int18 = statementConfiguration17.getFetchDirection();
        java.lang.Integer int19 = statementConfiguration17.getMaxRows();
        boolean boolean20 = statementConfiguration17.isMaxFieldSizeSet();
        boolean boolean21 = statementConfiguration17.isMaxFieldSizeSet();
        javax.sql.DataSource dataSource22 = null;
        java.util.concurrent.ExecutorService executorService24 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner25 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource22, true, executorService24);
        boolean boolean26 = asyncQueryRunner25.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement27 = null;
        java.lang.Object obj28 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner25.fillStatementWithBean(preparedStatement27, obj28, propertyDescriptorArray29);
        javax.sql.DataSource dataSource31 = asyncQueryRunner25.getDataSource();
        java.sql.PreparedStatement preparedStatement32 = null;
        java.sql.ParameterMetaData parameterMetaData33 = asyncQueryRunner25.getParameterMetaData(preparedStatement32);
        java.sql.PreparedStatement preparedStatement34 = null;
        java.sql.ParameterMetaData parameterMetaData35 = asyncQueryRunner25.getParameterMetaData(preparedStatement34);
        boolean boolean36 = asyncQueryRunner25.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement37 = null;
        java.time.Duration duration42 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration43 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 0, duration42);
        boolean boolean44 = statementConfiguration43.isMaxRowsSet();
        java.lang.Integer int45 = statementConfiguration43.getQueryTimeout();
        boolean boolean46 = statementConfiguration43.isFetchDirectionSet();
        java.util.concurrent.ExecutorService executorService47 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner48 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner49 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService47, queryRunner48);
        java.sql.PreparedStatement preparedStatement50 = null;
        java.sql.ParameterMetaData parameterMetaData51 = null;
        javax.sql.DataSource dataSource52 = null;
        java.util.concurrent.ExecutorService executorService53 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner54 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource52, executorService53);
        boolean boolean55 = asyncQueryRunner54.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement56 = null;
        java.sql.ParameterMetaData parameterMetaData57 = null;
        java.util.concurrent.ExecutorService executorService59 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner60 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService59);
        java.sql.PreparedStatement preparedStatement61 = null;
        javax.sql.DataSource dataSource62 = null;
        java.util.concurrent.ExecutorService executorService64 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner65 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource62, true, executorService64);
        boolean boolean66 = asyncQueryRunner65.isPmdKnownBroken();
        javax.sql.DataSource dataSource67 = asyncQueryRunner65.getDataSource();
        java.sql.PreparedStatement preparedStatement68 = null;
        javax.sql.DataSource dataSource70 = null;
        java.util.concurrent.ExecutorService executorService72 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner73 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource70, true, executorService72);
        boolean boolean74 = asyncQueryRunner73.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement75 = null;
        java.lang.Object obj76 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray77 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner73.fillStatementWithBean(preparedStatement75, obj76, propertyDescriptorArray77);
        asyncQueryRunner65.fillStatementWithBean(preparedStatement68, (java.lang.Object) 0, propertyDescriptorArray77);
        asyncQueryRunner60.fillStatement(preparedStatement61, (java.lang.Object[]) propertyDescriptorArray77);
        asyncQueryRunner54.fillStatement(preparedStatement56, parameterMetaData57, (java.lang.Object[]) propertyDescriptorArray77);
        asyncQueryRunner49.fillStatement(preparedStatement50, parameterMetaData51, (java.lang.Object[]) propertyDescriptorArray77);
        asyncQueryRunner25.fillStatementWithBean(preparedStatement37, (java.lang.Object) boolean46, propertyDescriptorArray77);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement11, (java.lang.Object) boolean21, propertyDescriptorArray77);
        javax.sql.DataSource dataSource85 = asyncQueryRunner3.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture87 = asyncQueryRunner3.update("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(parameterMetaData8);
        org.junit.Assert.assertNull(parameterMetaData10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray29);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray29, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertNull(parameterMetaData33);
        org.junit.Assert.assertNull(parameterMetaData35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(int45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(dataSource67);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray77);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray77, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource85);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 10);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.queryTimeout(duration11);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration15 = builder14.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder14.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = builder14.queryTimeout((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder20.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder24 = builder20.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder26 = builder24.maxRows((java.lang.Integer) 10);
        java.time.Duration duration27 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder28 = builder26.queryTimeout(duration27);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration34 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration35 = statementConfiguration34.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = builder28.queryTimeout(duration35);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder19.queryTimeout(duration35);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration38 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1, duration35);
        boolean boolean39 = statementConfiguration38.isMaxRowsSet();
        java.lang.Integer int40 = statementConfiguration38.getFetchSize();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(statementConfiguration15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder4.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder10.fetchDirection((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration15 = builder10.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(statementConfiguration15);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        javax.sql.DataSource dataSource4 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource4, true, executorService6);
        boolean boolean8 = asyncQueryRunner7.isPmdKnownBroken();
        javax.sql.DataSource dataSource9 = asyncQueryRunner7.getDataSource();
        java.sql.PreparedStatement preparedStatement10 = null;
        javax.sql.DataSource dataSource12 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource12, true, executorService14);
        boolean boolean16 = asyncQueryRunner15.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement17 = null;
        java.lang.Object obj18 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner15.fillStatementWithBean(preparedStatement17, obj18, propertyDescriptorArray19);
        asyncQueryRunner7.fillStatementWithBean(preparedStatement10, (java.lang.Object) 0, propertyDescriptorArray19);
        asyncQueryRunner2.fillStatement(preparedStatement3, (java.lang.Object[]) propertyDescriptorArray19);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.sql.ParameterMetaData parameterMetaData24 = asyncQueryRunner2.getParameterMetaData(preparedStatement23);
        java.sql.Connection connection25 = null;
        javax.sql.DataSource dataSource27 = null;
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource27, executorService28);
        javax.sql.DataSource dataSource30 = asyncQueryRunner29.getDataSource();
        boolean boolean31 = asyncQueryRunner29.isPmdKnownBroken();
        javax.sql.DataSource dataSource32 = asyncQueryRunner29.getDataSource();
        java.sql.PreparedStatement preparedStatement33 = null;
        java.sql.ParameterMetaData parameterMetaData34 = null;
        javax.sql.DataSource dataSource35 = null;
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource35, true, executorService37);
        java.sql.PreparedStatement preparedStatement39 = null;
        java.sql.ParameterMetaData parameterMetaData40 = null;
        javax.sql.DataSource dataSource41 = null;
        java.util.concurrent.ExecutorService executorService43 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner44 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource41, true, executorService43);
        boolean boolean45 = asyncQueryRunner44.isPmdKnownBroken();
        javax.sql.DataSource dataSource46 = asyncQueryRunner44.getDataSource();
        javax.sql.DataSource dataSource47 = asyncQueryRunner44.getDataSource();
        java.sql.PreparedStatement preparedStatement48 = null;
        java.time.Duration duration53 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration54 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration53);
        boolean boolean55 = statementConfiguration54.isMaxFieldSizeSet();
        java.time.Duration duration56 = statementConfiguration54.getQueryTimeoutDuration();
        boolean boolean57 = statementConfiguration54.isFetchSizeSet();
        boolean boolean58 = statementConfiguration54.isMaxFieldSizeSet();
        boolean boolean59 = statementConfiguration54.isFetchDirectionSet();
        java.util.concurrent.ExecutorService executorService61 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner62 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService61);
        java.sql.PreparedStatement preparedStatement63 = null;
        javax.sql.DataSource dataSource64 = null;
        java.util.concurrent.ExecutorService executorService66 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner67 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource64, true, executorService66);
        boolean boolean68 = asyncQueryRunner67.isPmdKnownBroken();
        javax.sql.DataSource dataSource69 = asyncQueryRunner67.getDataSource();
        java.sql.PreparedStatement preparedStatement70 = null;
        javax.sql.DataSource dataSource72 = null;
        java.util.concurrent.ExecutorService executorService74 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner75 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource72, true, executorService74);
        boolean boolean76 = asyncQueryRunner75.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement77 = null;
        java.lang.Object obj78 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray79 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner75.fillStatementWithBean(preparedStatement77, obj78, propertyDescriptorArray79);
        asyncQueryRunner67.fillStatementWithBean(preparedStatement70, (java.lang.Object) 0, propertyDescriptorArray79);
        asyncQueryRunner62.fillStatement(preparedStatement63, (java.lang.Object[]) propertyDescriptorArray79);
        asyncQueryRunner44.fillStatementWithBean(preparedStatement48, (java.lang.Object) statementConfiguration54, propertyDescriptorArray79);
        asyncQueryRunner38.fillStatement(preparedStatement39, parameterMetaData40, (java.lang.Object[]) propertyDescriptorArray79);
        asyncQueryRunner29.fillStatement(preparedStatement33, parameterMetaData34, (java.lang.Object[]) propertyDescriptorArray79);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture86 = asyncQueryRunner2.update(connection25, "hi!", (java.lang.Object[]) propertyDescriptorArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray19, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData24);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertNull(dataSource47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(duration56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(dataSource69);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray79);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray79, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        javax.sql.DataSource dataSource4 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource4, true, executorService6);
        boolean boolean8 = asyncQueryRunner7.isPmdKnownBroken();
        javax.sql.DataSource dataSource9 = asyncQueryRunner7.getDataSource();
        java.sql.PreparedStatement preparedStatement10 = null;
        javax.sql.DataSource dataSource12 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource12, true, executorService14);
        boolean boolean16 = asyncQueryRunner15.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement17 = null;
        java.lang.Object obj18 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner15.fillStatementWithBean(preparedStatement17, obj18, propertyDescriptorArray19);
        asyncQueryRunner7.fillStatementWithBean(preparedStatement10, (java.lang.Object) 0, propertyDescriptorArray19);
        asyncQueryRunner2.fillStatement(preparedStatement3, (java.lang.Object[]) propertyDescriptorArray19);
        javax.sql.DataSource dataSource23 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement24 = null;
        java.time.Duration duration29 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration30 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 0, duration29);
        boolean boolean31 = statementConfiguration30.isMaxRowsSet();
        java.lang.Integer int32 = statementConfiguration30.getQueryTimeout();
        java.lang.Integer int33 = statementConfiguration30.getMaxFieldSize();
        boolean boolean34 = statementConfiguration30.isMaxRowsSet();
        java.lang.Integer int35 = statementConfiguration30.getMaxRows();
        boolean boolean36 = statementConfiguration30.isFetchSizeSet();
        boolean boolean37 = statementConfiguration30.isFetchSizeSet();
        javax.sql.DataSource dataSource38 = null;
        java.util.concurrent.ExecutorService executorService40 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner41 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource38, true, executorService40);
        boolean boolean42 = asyncQueryRunner41.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement43 = null;
        java.lang.Object obj44 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner41.fillStatementWithBean(preparedStatement43, obj44, propertyDescriptorArray45);
        java.sql.PreparedStatement preparedStatement47 = null;
        javax.sql.DataSource dataSource48 = null;
        java.util.concurrent.ExecutorService executorService49 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner50 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource48, executorService49);
        boolean boolean51 = asyncQueryRunner50.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement52 = null;
        java.sql.ParameterMetaData parameterMetaData53 = null;
        java.util.concurrent.ExecutorService executorService55 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner56 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService55);
        java.sql.PreparedStatement preparedStatement57 = null;
        javax.sql.DataSource dataSource58 = null;
        java.util.concurrent.ExecutorService executorService60 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner61 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource58, true, executorService60);
        boolean boolean62 = asyncQueryRunner61.isPmdKnownBroken();
        javax.sql.DataSource dataSource63 = asyncQueryRunner61.getDataSource();
        java.sql.PreparedStatement preparedStatement64 = null;
        javax.sql.DataSource dataSource66 = null;
        java.util.concurrent.ExecutorService executorService68 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner69 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource66, true, executorService68);
        boolean boolean70 = asyncQueryRunner69.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement71 = null;
        java.lang.Object obj72 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner69.fillStatementWithBean(preparedStatement71, obj72, propertyDescriptorArray73);
        asyncQueryRunner61.fillStatementWithBean(preparedStatement64, (java.lang.Object) 0, propertyDescriptorArray73);
        asyncQueryRunner56.fillStatement(preparedStatement57, (java.lang.Object[]) propertyDescriptorArray73);
        asyncQueryRunner50.fillStatement(preparedStatement52, parameterMetaData53, (java.lang.Object[]) propertyDescriptorArray73);
        asyncQueryRunner41.fillStatement(preparedStatement47, (java.lang.Object[]) propertyDescriptorArray73);
        asyncQueryRunner2.fillStatementWithBean(preparedStatement24, (java.lang.Object) statementConfiguration30, propertyDescriptorArray73);
        java.sql.PreparedStatement preparedStatement80 = null;
        java.sql.ParameterMetaData parameterMetaData81 = asyncQueryRunner2.getParameterMetaData(preparedStatement80);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray19, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray45);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray45, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(dataSource63);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray73);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray73, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData81);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        boolean boolean8 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean9 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource10 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = asyncQueryRunner3.getParameterMetaData(preparedStatement11);
        java.sql.PreparedStatement preparedStatement13 = null;
        java.lang.Object[] objArray14 = null;
        asyncQueryRunner3.fillStatement(preparedStatement13, objArray14);
        javax.sql.DataSource dataSource17 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource17, executorService18);
        boolean boolean20 = asyncQueryRunner19.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement21 = null;
        java.sql.ParameterMetaData parameterMetaData22 = null;
        java.util.concurrent.ExecutorService executorService24 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner25 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService24);
        java.sql.PreparedStatement preparedStatement26 = null;
        javax.sql.DataSource dataSource27 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource27, true, executorService29);
        boolean boolean31 = asyncQueryRunner30.isPmdKnownBroken();
        javax.sql.DataSource dataSource32 = asyncQueryRunner30.getDataSource();
        java.sql.PreparedStatement preparedStatement33 = null;
        javax.sql.DataSource dataSource35 = null;
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource35, true, executorService37);
        boolean boolean39 = asyncQueryRunner38.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement40 = null;
        java.lang.Object obj41 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner38.fillStatementWithBean(preparedStatement40, obj41, propertyDescriptorArray42);
        asyncQueryRunner30.fillStatementWithBean(preparedStatement33, (java.lang.Object) 0, propertyDescriptorArray42);
        asyncQueryRunner25.fillStatement(preparedStatement26, (java.lang.Object[]) propertyDescriptorArray42);
        asyncQueryRunner19.fillStatement(preparedStatement21, parameterMetaData22, (java.lang.Object[]) propertyDescriptorArray42);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture47 = asyncQueryRunner3.update("hi!", (java.lang.Object[]) propertyDescriptorArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(parameterMetaData12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray42);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray42, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        boolean boolean8 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean9 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource10 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = asyncQueryRunner3.getParameterMetaData(preparedStatement11);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder14.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder14.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder18.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder20.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder24 = builder20.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration25 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder26 = builder24.queryTimeout(duration25);
        java.time.Duration duration27 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder28 = builder24.queryTimeout(duration27);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder30 = builder24.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder32 = builder24.fetchDirection((java.lang.Integer) 0);
        java.lang.Object[] objArray33 = new java.lang.Object[] { 0 };
        org.apache.commons.dbutils.StatementConfiguration.Builder builder34 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = builder34.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder38 = builder34.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder40 = builder38.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder42 = builder40.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder44 = builder40.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration45 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder46 = builder44.queryTimeout(duration45);
        java.time.Duration duration47 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder48 = builder44.queryTimeout(duration47);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder50 = builder44.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder52 = builder44.fetchDirection((java.lang.Integer) 0);
        java.lang.Object[] objArray53 = new java.lang.Object[] { 0 };
        org.apache.commons.dbutils.StatementConfiguration.Builder builder54 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder56 = builder54.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder58 = builder54.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder60 = builder58.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder62 = builder60.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder64 = builder60.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration65 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder66 = builder64.queryTimeout(duration65);
        java.time.Duration duration67 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder68 = builder64.queryTimeout(duration67);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder70 = builder64.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder72 = builder64.fetchDirection((java.lang.Integer) 0);
        java.lang.Object[] objArray73 = new java.lang.Object[] { 0 };
        org.apache.commons.dbutils.StatementConfiguration.Builder builder74 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder76 = builder74.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder78 = builder74.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder80 = builder78.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder82 = builder80.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder84 = builder80.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration85 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder86 = builder84.queryTimeout(duration85);
        java.time.Duration duration87 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder88 = builder84.queryTimeout(duration87);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder90 = builder84.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder92 = builder84.fetchDirection((java.lang.Integer) 0);
        java.lang.Object[] objArray93 = new java.lang.Object[] { 0 };
        java.lang.Object[][] objArray94 = new java.lang.Object[][] { objArray33, objArray53, objArray73, objArray93 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture95 = asyncQueryRunner3.batch("hi!", objArray94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(parameterMetaData12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0]");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[0]");
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[0]");
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray93), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray93), "[0]");
        org.junit.Assert.assertNotNull(objArray94);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 10);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.queryTimeout(duration11);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration15 = builder14.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder14.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = builder14.queryTimeout((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder20.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder24 = builder20.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder26 = builder24.maxRows((java.lang.Integer) 10);
        java.time.Duration duration27 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder28 = builder26.queryTimeout(duration27);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration34 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration35 = statementConfiguration34.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = builder28.queryTimeout(duration35);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder19.queryTimeout(duration35);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration38 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 100, duration35);
        boolean boolean39 = statementConfiguration38.isFetchDirectionSet();
        java.lang.Integer int40 = statementConfiguration38.getFetchSize();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(statementConfiguration15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxRows();
        boolean boolean8 = statementConfiguration5.isFetchDirectionSet();
        boolean boolean9 = statementConfiguration5.isQueryTimeoutSet();
        java.time.Duration duration10 = statementConfiguration5.getQueryTimeoutDuration();
        java.lang.Integer int11 = statementConfiguration5.getMaxRows();
        java.lang.Integer int12 = statementConfiguration5.getFetchDirection();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(duration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 0, duration4);
        boolean boolean6 = statementConfiguration5.isMaxRowsSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        java.lang.Integer int8 = statementConfiguration5.getFetchSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 100, duration4);
        java.lang.Integer int6 = statementConfiguration5.getFetchDirection();
        java.lang.Integer int7 = statementConfiguration5.getMaxRows();
        java.lang.Integer int8 = statementConfiguration5.getMaxRows();
        java.lang.Integer int9 = statementConfiguration5.getMaxFieldSize();
        boolean boolean10 = statementConfiguration5.isFetchDirectionSet();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isQueryTimeoutSet();
        boolean boolean7 = statementConfiguration5.isFetchDirectionSet();
        java.lang.Integer int8 = statementConfiguration5.getMaxRows();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.fetchDirection((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = builder10.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(statementConfiguration11);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder0.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder0.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder0.maxRows((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.fetchSize((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 0);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder0.fetchSize((java.lang.Integer) (-1));
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration9 = builder6.build();
        java.lang.Integer int10 = statementConfiguration9.getMaxFieldSize();
        boolean boolean11 = statementConfiguration9.isQueryTimeoutSet();
        java.lang.Integer int12 = statementConfiguration9.getMaxFieldSize();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(statementConfiguration9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner3.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = asyncQueryRunner3.getParameterMetaData(preparedStatement12);
        javax.sql.DataSource dataSource14 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService17);
        java.sql.PreparedStatement preparedStatement19 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder20.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder24 = builder20.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder26 = builder24.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder28 = builder26.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder30 = builder26.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration31 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder32 = builder30.queryTimeout(duration31);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder34 = builder32.fetchSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = builder32.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder38 = builder32.maxRows((java.lang.Integer) (-1));
        javax.sql.DataSource dataSource39 = null;
        java.util.concurrent.ExecutorService executorService41 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource39, false, executorService41);
        boolean boolean43 = asyncQueryRunner42.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement44 = null;
        java.sql.ParameterMetaData parameterMetaData45 = null;
        javax.sql.DataSource dataSource46 = null;
        java.util.concurrent.ExecutorService executorService48 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner49 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource46, true, executorService48);
        boolean boolean50 = asyncQueryRunner49.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement51 = null;
        java.sql.ParameterMetaData parameterMetaData52 = null;
        javax.sql.DataSource dataSource53 = null;
        java.util.concurrent.ExecutorService executorService55 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner56 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource53, true, executorService55);
        boolean boolean57 = asyncQueryRunner56.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement58 = null;
        java.lang.Object obj59 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray60 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner56.fillStatementWithBean(preparedStatement58, obj59, propertyDescriptorArray60);
        asyncQueryRunner49.fillStatement(preparedStatement51, parameterMetaData52, (java.lang.Object[]) propertyDescriptorArray60);
        asyncQueryRunner42.fillStatement(preparedStatement44, parameterMetaData45, (java.lang.Object[]) propertyDescriptorArray60);
        asyncQueryRunner18.fillStatementWithBean(preparedStatement19, (java.lang.Object) (-1), propertyDescriptorArray60);
        asyncQueryRunner3.fillStatement(preparedStatement15, (java.lang.Object[]) propertyDescriptorArray60);
        java.sql.PreparedStatement preparedStatement66 = null;
        java.sql.ParameterMetaData parameterMetaData67 = null;
        java.lang.Object[] objArray68 = null;
        asyncQueryRunner3.fillStatement(preparedStatement66, parameterMetaData67, objArray68);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNull(parameterMetaData13);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray60);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray60, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 100, duration4);
        java.lang.Integer int6 = statementConfiguration5.getFetchDirection();
        java.lang.Integer int7 = statementConfiguration5.getMaxRows();
        java.lang.Integer int8 = statementConfiguration5.getMaxRows();
        java.lang.Integer int9 = statementConfiguration5.getQueryTimeout();
        java.time.Duration duration10 = statementConfiguration5.getQueryTimeoutDuration();
        java.lang.Integer int11 = statementConfiguration5.getMaxRows();
        java.lang.Integer int12 = statementConfiguration5.getFetchSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(duration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        boolean boolean8 = statementConfiguration5.isFetchSizeSet();
        java.time.Duration duration9 = statementConfiguration5.getQueryTimeoutDuration();
        java.lang.Integer int10 = statementConfiguration5.getFetchSize();
        boolean boolean11 = statementConfiguration5.isMaxFieldSizeSet();
        boolean boolean12 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int13 = statementConfiguration5.getQueryTimeout();
        java.time.Duration duration14 = statementConfiguration5.getQueryTimeoutDuration();
        java.lang.Integer int15 = statementConfiguration5.getQueryTimeout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(duration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(duration14);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource6 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement7 = null;
        java.time.Duration duration12 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration13 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration12);
        boolean boolean14 = statementConfiguration13.isMaxFieldSizeSet();
        java.time.Duration duration15 = statementConfiguration13.getQueryTimeoutDuration();
        boolean boolean16 = statementConfiguration13.isFetchSizeSet();
        boolean boolean17 = statementConfiguration13.isMaxFieldSizeSet();
        boolean boolean18 = statementConfiguration13.isFetchDirectionSet();
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService20);
        java.sql.PreparedStatement preparedStatement22 = null;
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, true, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        javax.sql.DataSource dataSource28 = asyncQueryRunner26.getDataSource();
        java.sql.PreparedStatement preparedStatement29 = null;
        javax.sql.DataSource dataSource31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource31, true, executorService33);
        boolean boolean35 = asyncQueryRunner34.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement36 = null;
        java.lang.Object obj37 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner34.fillStatementWithBean(preparedStatement36, obj37, propertyDescriptorArray38);
        asyncQueryRunner26.fillStatementWithBean(preparedStatement29, (java.lang.Object) 0, propertyDescriptorArray38);
        asyncQueryRunner21.fillStatement(preparedStatement22, (java.lang.Object[]) propertyDescriptorArray38);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement7, (java.lang.Object) statementConfiguration13, propertyDescriptorArray38);
        java.lang.Integer int43 = statementConfiguration13.getMaxFieldSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray38);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray38, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        javax.sql.DataSource dataSource11 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource11, true, executorService13);
        boolean boolean15 = asyncQueryRunner14.isPmdKnownBroken();
        javax.sql.DataSource dataSource16 = asyncQueryRunner14.getDataSource();
        java.sql.PreparedStatement preparedStatement17 = null;
        javax.sql.DataSource dataSource19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource19, true, executorService21);
        boolean boolean23 = asyncQueryRunner22.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement24 = null;
        java.lang.Object obj25 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement24, obj25, propertyDescriptorArray26);
        asyncQueryRunner14.fillStatementWithBean(preparedStatement17, (java.lang.Object) 0, propertyDescriptorArray26);
        asyncQueryRunner9.fillStatement(preparedStatement10, (java.lang.Object[]) propertyDescriptorArray26);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray26, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 1);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource10 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        javax.sql.DataSource dataSource18 = asyncQueryRunner16.getDataSource();
        java.sql.PreparedStatement preparedStatement19 = null;
        javax.sql.DataSource dataSource21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource21, true, executorService23);
        boolean boolean25 = asyncQueryRunner24.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement26 = null;
        java.lang.Object obj27 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner24.fillStatementWithBean(preparedStatement26, obj27, propertyDescriptorArray28);
        asyncQueryRunner16.fillStatementWithBean(preparedStatement19, (java.lang.Object) 0, propertyDescriptorArray28);
        asyncQueryRunner3.fillStatement(preparedStatement11, parameterMetaData12, (java.lang.Object[]) propertyDescriptorArray28);
        java.sql.PreparedStatement preparedStatement32 = null;
        javax.sql.DataSource dataSource33 = null;
        java.util.concurrent.ExecutorService executorService35 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner36 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource33, true, executorService35);
        boolean boolean37 = asyncQueryRunner36.isPmdKnownBroken();
        javax.sql.DataSource dataSource38 = asyncQueryRunner36.getDataSource();
        java.sql.PreparedStatement preparedStatement39 = null;
        javax.sql.DataSource dataSource41 = null;
        java.util.concurrent.ExecutorService executorService43 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner44 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource41, true, executorService43);
        boolean boolean45 = asyncQueryRunner44.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement46 = null;
        java.lang.Object obj47 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner44.fillStatementWithBean(preparedStatement46, obj47, propertyDescriptorArray48);
        asyncQueryRunner36.fillStatementWithBean(preparedStatement39, (java.lang.Object) 0, propertyDescriptorArray48);
        asyncQueryRunner3.fillStatement(preparedStatement32, (java.lang.Object[]) propertyDescriptorArray48);
        boolean boolean52 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean53 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource54 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource56 = null;
        java.util.concurrent.ExecutorService executorService58 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner59 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource56, true, executorService58);
        boolean boolean60 = asyncQueryRunner59.isPmdKnownBroken();
        javax.sql.DataSource dataSource61 = asyncQueryRunner59.getDataSource();
        java.sql.PreparedStatement preparedStatement62 = null;
        java.sql.ParameterMetaData parameterMetaData63 = null;
        javax.sql.DataSource dataSource64 = null;
        java.util.concurrent.ExecutorService executorService66 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner67 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource64, true, executorService66);
        boolean boolean68 = asyncQueryRunner67.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement69 = null;
        java.lang.Object obj70 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray71 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner67.fillStatementWithBean(preparedStatement69, obj70, propertyDescriptorArray71);
        asyncQueryRunner59.fillStatement(preparedStatement62, parameterMetaData63, (java.lang.Object[]) propertyDescriptorArray71);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture74 = asyncQueryRunner3.update("", (java.lang.Object[]) propertyDescriptorArray71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray48);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray48, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(dataSource54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(dataSource61);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray71);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray71, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        boolean boolean8 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement10 = null;
        javax.sql.DataSource dataSource11 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource11, true, executorService13);
        boolean boolean15 = asyncQueryRunner14.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement16 = null;
        java.lang.Object obj17 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner14.fillStatementWithBean(preparedStatement16, obj17, propertyDescriptorArray18);
        javax.sql.DataSource dataSource20 = asyncQueryRunner14.getDataSource();
        javax.sql.DataSource dataSource21 = asyncQueryRunner14.getDataSource();
        java.sql.PreparedStatement preparedStatement22 = null;
        java.sql.ParameterMetaData parameterMetaData23 = null;
        javax.sql.DataSource dataSource24 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource24, true, executorService26);
        boolean boolean28 = asyncQueryRunner27.isPmdKnownBroken();
        javax.sql.DataSource dataSource29 = asyncQueryRunner27.getDataSource();
        java.sql.PreparedStatement preparedStatement30 = null;
        javax.sql.DataSource dataSource32 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource32, true, executorService34);
        boolean boolean36 = asyncQueryRunner35.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement37 = null;
        java.lang.Object obj38 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner35.fillStatementWithBean(preparedStatement37, obj38, propertyDescriptorArray39);
        asyncQueryRunner27.fillStatementWithBean(preparedStatement30, (java.lang.Object) 0, propertyDescriptorArray39);
        asyncQueryRunner14.fillStatement(preparedStatement22, parameterMetaData23, (java.lang.Object[]) propertyDescriptorArray39);
        javax.sql.DataSource dataSource43 = asyncQueryRunner14.getDataSource();
        java.sql.PreparedStatement preparedStatement44 = null;
        java.time.Duration duration49 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration50 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 100, duration49);
        java.lang.Integer int51 = statementConfiguration50.getFetchDirection();
        java.lang.Integer int52 = statementConfiguration50.getMaxRows();
        javax.sql.DataSource dataSource53 = null;
        java.util.concurrent.ExecutorService executorService55 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner56 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource53, true, executorService55);
        boolean boolean57 = asyncQueryRunner56.isPmdKnownBroken();
        javax.sql.DataSource dataSource58 = asyncQueryRunner56.getDataSource();
        javax.sql.DataSource dataSource59 = asyncQueryRunner56.getDataSource();
        javax.sql.DataSource dataSource60 = asyncQueryRunner56.getDataSource();
        java.sql.PreparedStatement preparedStatement61 = null;
        java.time.Duration duration66 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration67 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration66);
        java.lang.String[] strArray68 = new java.lang.String[] {};
        asyncQueryRunner56.fillStatementWithBean(preparedStatement61, (java.lang.Object) 10, strArray68);
        asyncQueryRunner14.fillStatementWithBean(preparedStatement44, (java.lang.Object) statementConfiguration50, strArray68);
        asyncQueryRunner3.fillStatement(preparedStatement10, (java.lang.Object[]) strArray68);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray18, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray39);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray39, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource43);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(dataSource58);
        org.junit.Assert.assertNull(dataSource59);
        org.junit.Assert.assertNull(dataSource60);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] {});
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        javax.sql.DataSource dataSource7 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource7, true, executorService9);
        boolean boolean11 = asyncQueryRunner10.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement12 = null;
        java.lang.Object obj13 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner10.fillStatementWithBean(preparedStatement12, obj13, propertyDescriptorArray14);
        asyncQueryRunner3.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray14);
        java.sql.PreparedStatement preparedStatement17 = null;
        javax.sql.DataSource dataSource19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource19, true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.sql.ParameterMetaData parameterMetaData24 = null;
        javax.sql.DataSource dataSource25 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource25, true, executorService27);
        boolean boolean29 = asyncQueryRunner28.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement30 = null;
        java.lang.Object obj31 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner28.fillStatementWithBean(preparedStatement30, obj31, propertyDescriptorArray32);
        javax.sql.DataSource dataSource34 = asyncQueryRunner28.getDataSource();
        javax.sql.DataSource dataSource35 = asyncQueryRunner28.getDataSource();
        java.sql.PreparedStatement preparedStatement36 = null;
        java.sql.ParameterMetaData parameterMetaData37 = null;
        javax.sql.DataSource dataSource38 = null;
        java.util.concurrent.ExecutorService executorService40 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner41 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource38, true, executorService40);
        boolean boolean42 = asyncQueryRunner41.isPmdKnownBroken();
        javax.sql.DataSource dataSource43 = asyncQueryRunner41.getDataSource();
        java.sql.PreparedStatement preparedStatement44 = null;
        javax.sql.DataSource dataSource46 = null;
        java.util.concurrent.ExecutorService executorService48 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner49 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource46, true, executorService48);
        boolean boolean50 = asyncQueryRunner49.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement51 = null;
        java.lang.Object obj52 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner49.fillStatementWithBean(preparedStatement51, obj52, propertyDescriptorArray53);
        asyncQueryRunner41.fillStatementWithBean(preparedStatement44, (java.lang.Object) 0, propertyDescriptorArray53);
        asyncQueryRunner28.fillStatement(preparedStatement36, parameterMetaData37, (java.lang.Object[]) propertyDescriptorArray53);
        asyncQueryRunner22.fillStatement(preparedStatement23, parameterMetaData24, (java.lang.Object[]) propertyDescriptorArray53);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement17, (java.lang.Object) (byte) 1, propertyDescriptorArray53);
        javax.sql.DataSource dataSource59 = asyncQueryRunner3.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray14, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray32);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray32, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertNull(dataSource35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(dataSource43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray53);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray53, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource59);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder0.fetchSize((java.lang.Integer) (-1));
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration9 = builder6.build();
        java.lang.Integer int10 = statementConfiguration9.getMaxFieldSize();
        java.lang.Integer int11 = statementConfiguration9.getFetchDirection();
        java.time.Duration duration12 = statementConfiguration9.getQueryTimeoutDuration();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(statementConfiguration9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(duration12);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 100, duration4);
        java.lang.Integer int6 = statementConfiguration5.getFetchDirection();
        java.lang.Integer int7 = statementConfiguration5.getMaxRows();
        java.lang.Integer int8 = statementConfiguration5.getFetchDirection();
        java.lang.Integer int9 = statementConfiguration5.getFetchSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 100, duration4);
        java.lang.Integer int6 = statementConfiguration5.getFetchDirection();
        java.lang.Integer int7 = statementConfiguration5.getMaxRows();
        java.lang.Integer int8 = statementConfiguration5.getMaxRows();
        boolean boolean9 = statementConfiguration5.isFetchSizeSet();
        boolean boolean10 = statementConfiguration5.isFetchSizeSet();
        java.time.Duration duration11 = statementConfiguration5.getQueryTimeoutDuration();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(duration11);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource6 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement7 = null;
        java.time.Duration duration12 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration13 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration12);
        boolean boolean14 = statementConfiguration13.isMaxFieldSizeSet();
        java.time.Duration duration15 = statementConfiguration13.getQueryTimeoutDuration();
        boolean boolean16 = statementConfiguration13.isFetchSizeSet();
        boolean boolean17 = statementConfiguration13.isMaxFieldSizeSet();
        boolean boolean18 = statementConfiguration13.isFetchDirectionSet();
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService20);
        java.sql.PreparedStatement preparedStatement22 = null;
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, true, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        javax.sql.DataSource dataSource28 = asyncQueryRunner26.getDataSource();
        java.sql.PreparedStatement preparedStatement29 = null;
        javax.sql.DataSource dataSource31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource31, true, executorService33);
        boolean boolean35 = asyncQueryRunner34.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement36 = null;
        java.lang.Object obj37 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner34.fillStatementWithBean(preparedStatement36, obj37, propertyDescriptorArray38);
        asyncQueryRunner26.fillStatementWithBean(preparedStatement29, (java.lang.Object) 0, propertyDescriptorArray38);
        asyncQueryRunner21.fillStatement(preparedStatement22, (java.lang.Object[]) propertyDescriptorArray38);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement7, (java.lang.Object) statementConfiguration13, propertyDescriptorArray38);
        boolean boolean43 = statementConfiguration13.isMaxFieldSizeSet();
        java.lang.Integer int44 = statementConfiguration13.getMaxRows();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray38);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray38, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = builder4.build();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration6 = builder4.build();
        java.lang.Integer int7 = statementConfiguration6.getMaxRows();
        java.lang.Integer int8 = statementConfiguration6.getMaxFieldSize();
        java.lang.Integer int9 = statementConfiguration6.getQueryTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(statementConfiguration5);
        org.junit.Assert.assertNotNull(statementConfiguration6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        boolean boolean8 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean9 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        javax.sql.DataSource dataSource15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource15, true, executorService17);
        boolean boolean19 = asyncQueryRunner18.isPmdKnownBroken();
        javax.sql.DataSource dataSource20 = asyncQueryRunner18.getDataSource();
        java.sql.PreparedStatement preparedStatement21 = null;
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, true, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement28 = null;
        java.lang.Object obj29 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner26.fillStatementWithBean(preparedStatement28, obj29, propertyDescriptorArray30);
        asyncQueryRunner18.fillStatementWithBean(preparedStatement21, (java.lang.Object) 0, propertyDescriptorArray30);
        asyncQueryRunner13.fillStatement(preparedStatement14, (java.lang.Object[]) propertyDescriptorArray30);
        asyncQueryRunner3.fillStatement(preparedStatement10, (java.lang.Object[]) propertyDescriptorArray30);
        javax.sql.DataSource dataSource36 = null;
        java.util.concurrent.ExecutorService executorService38 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner39 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource36, true, executorService38);
        boolean boolean40 = asyncQueryRunner39.isPmdKnownBroken();
        javax.sql.DataSource dataSource41 = asyncQueryRunner39.getDataSource();
        javax.sql.DataSource dataSource42 = asyncQueryRunner39.getDataSource();
        javax.sql.DataSource dataSource43 = asyncQueryRunner39.getDataSource();
        java.sql.PreparedStatement preparedStatement44 = null;
        java.time.Duration duration49 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration50 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration49);
        java.lang.String[] strArray51 = new java.lang.String[] {};
        asyncQueryRunner39.fillStatementWithBean(preparedStatement44, (java.lang.Object) 10, strArray51);
        java.sql.PreparedStatement preparedStatement53 = null;
        javax.sql.DataSource dataSource54 = null;
        java.util.concurrent.ExecutorService executorService56 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner57 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource54, true, executorService56);
        boolean boolean58 = asyncQueryRunner57.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement59 = null;
        java.lang.Object obj60 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner57.fillStatementWithBean(preparedStatement59, obj60, propertyDescriptorArray61);
        javax.sql.DataSource dataSource63 = asyncQueryRunner57.getDataSource();
        java.sql.PreparedStatement preparedStatement64 = null;
        java.sql.ParameterMetaData parameterMetaData65 = asyncQueryRunner57.getParameterMetaData(preparedStatement64);
        java.sql.PreparedStatement preparedStatement66 = null;
        javax.sql.DataSource dataSource67 = null;
        java.util.concurrent.ExecutorService executorService69 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner70 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource67, false, executorService69);
        boolean boolean71 = asyncQueryRunner70.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement72 = null;
        java.sql.ParameterMetaData parameterMetaData73 = null;
        javax.sql.DataSource dataSource74 = null;
        java.util.concurrent.ExecutorService executorService76 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner77 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource74, true, executorService76);
        boolean boolean78 = asyncQueryRunner77.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement79 = null;
        java.sql.ParameterMetaData parameterMetaData80 = null;
        javax.sql.DataSource dataSource81 = null;
        java.util.concurrent.ExecutorService executorService83 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner84 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource81, true, executorService83);
        boolean boolean85 = asyncQueryRunner84.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement86 = null;
        java.lang.Object obj87 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray88 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner84.fillStatementWithBean(preparedStatement86, obj87, propertyDescriptorArray88);
        asyncQueryRunner77.fillStatement(preparedStatement79, parameterMetaData80, (java.lang.Object[]) propertyDescriptorArray88);
        asyncQueryRunner70.fillStatement(preparedStatement72, parameterMetaData73, (java.lang.Object[]) propertyDescriptorArray88);
        asyncQueryRunner57.fillStatement(preparedStatement66, (java.lang.Object[]) propertyDescriptorArray88);
        asyncQueryRunner39.fillStatement(preparedStatement53, (java.lang.Object[]) propertyDescriptorArray88);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture94 = asyncQueryRunner3.update("", (java.lang.Object[]) propertyDescriptorArray88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray30);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray30, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertNull(dataSource43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray61);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray61, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource63);
        org.junit.Assert.assertNull(parameterMetaData65);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray88);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray88, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder8.fetchSize((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder8.maxFieldSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder14.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder14.queryTimeout((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        boolean boolean8 = statementConfiguration5.isFetchSizeSet();
        boolean boolean9 = statementConfiguration5.isMaxFieldSizeSet();
        boolean boolean10 = statementConfiguration5.isFetchSizeSet();
        java.time.Duration duration11 = statementConfiguration5.getQueryTimeoutDuration();
        java.lang.Integer int12 = statementConfiguration5.getMaxFieldSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(duration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, true, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.lang.Object obj14 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner11.fillStatementWithBean(preparedStatement13, obj14, propertyDescriptorArray15);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement6, (java.lang.Object) 0, propertyDescriptorArray15);
        boolean boolean18 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource19 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement20 = null;
        java.sql.ParameterMetaData parameterMetaData21 = null;
        java.lang.Object[] objArray22 = null;
        asyncQueryRunner3.fillStatement(preparedStatement20, parameterMetaData21, objArray22);
        java.sql.PreparedStatement preparedStatement24 = null;
        javax.sql.DataSource dataSource25 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource25, true, executorService27);
        boolean boolean29 = asyncQueryRunner28.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement30 = null;
        java.lang.Object obj31 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner28.fillStatementWithBean(preparedStatement30, obj31, propertyDescriptorArray32);
        javax.sql.DataSource dataSource34 = asyncQueryRunner28.getDataSource();
        javax.sql.DataSource dataSource35 = asyncQueryRunner28.getDataSource();
        java.sql.PreparedStatement preparedStatement36 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration42 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 100);
        javax.sql.DataSource dataSource43 = null;
        java.util.concurrent.ExecutorService executorService45 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner46 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource43, true, executorService45);
        boolean boolean47 = asyncQueryRunner46.isPmdKnownBroken();
        javax.sql.DataSource dataSource48 = asyncQueryRunner46.getDataSource();
        javax.sql.DataSource dataSource49 = asyncQueryRunner46.getDataSource();
        javax.sql.DataSource dataSource50 = asyncQueryRunner46.getDataSource();
        java.sql.PreparedStatement preparedStatement51 = null;
        java.time.Duration duration56 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration57 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration56);
        java.lang.String[] strArray58 = new java.lang.String[] {};
        asyncQueryRunner46.fillStatementWithBean(preparedStatement51, (java.lang.Object) 10, strArray58);
        asyncQueryRunner28.fillStatementWithBean(preparedStatement36, (java.lang.Object) statementConfiguration42, strArray58);
        asyncQueryRunner3.fillStatement(preparedStatement24, (java.lang.Object[]) strArray58);
        java.lang.Class<?> wildcardClass62 = asyncQueryRunner3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray32);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray32, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertNull(dataSource35);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(dataSource48);
        org.junit.Assert.assertNull(dataSource49);
        org.junit.Assert.assertNull(dataSource50);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        boolean boolean8 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean9 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner3.getParameterMetaData(preparedStatement10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture13 = asyncQueryRunner3.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(parameterMetaData11);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        boolean boolean8 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean9 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner3.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement18 = null;
        java.lang.Object obj19 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner16.fillStatementWithBean(preparedStatement18, obj19, propertyDescriptorArray20);
        javax.sql.DataSource dataSource22 = asyncQueryRunner16.getDataSource();
        javax.sql.DataSource dataSource23 = asyncQueryRunner16.getDataSource();
        java.sql.PreparedStatement preparedStatement24 = null;
        java.sql.ParameterMetaData parameterMetaData25 = null;
        javax.sql.DataSource dataSource26 = null;
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource26, true, executorService28);
        boolean boolean30 = asyncQueryRunner29.isPmdKnownBroken();
        javax.sql.DataSource dataSource31 = asyncQueryRunner29.getDataSource();
        java.sql.PreparedStatement preparedStatement32 = null;
        javax.sql.DataSource dataSource34 = null;
        java.util.concurrent.ExecutorService executorService36 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner37 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource34, true, executorService36);
        boolean boolean38 = asyncQueryRunner37.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement39 = null;
        java.lang.Object obj40 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray41 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner37.fillStatementWithBean(preparedStatement39, obj40, propertyDescriptorArray41);
        asyncQueryRunner29.fillStatementWithBean(preparedStatement32, (java.lang.Object) 0, propertyDescriptorArray41);
        asyncQueryRunner16.fillStatement(preparedStatement24, parameterMetaData25, (java.lang.Object[]) propertyDescriptorArray41);
        asyncQueryRunner3.fillStatement(preparedStatement12, (java.lang.Object[]) propertyDescriptorArray41);
        java.sql.PreparedStatement preparedStatement46 = null;
        java.sql.ParameterMetaData parameterMetaData47 = asyncQueryRunner3.getParameterMetaData(preparedStatement46);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray20, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray41);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray41, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData47);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder0.fetchSize((java.lang.Integer) 0);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration9 = builder6.build();
        boolean boolean10 = statementConfiguration9.isQueryTimeoutSet();
        java.lang.Integer int11 = statementConfiguration9.getMaxRows();
        boolean boolean12 = statementConfiguration9.isFetchSizeSet();
        boolean boolean13 = statementConfiguration9.isMaxRowsSet();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(statementConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource10 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        javax.sql.DataSource dataSource18 = asyncQueryRunner16.getDataSource();
        java.sql.PreparedStatement preparedStatement19 = null;
        javax.sql.DataSource dataSource21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource21, true, executorService23);
        boolean boolean25 = asyncQueryRunner24.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement26 = null;
        java.lang.Object obj27 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner24.fillStatementWithBean(preparedStatement26, obj27, propertyDescriptorArray28);
        asyncQueryRunner16.fillStatementWithBean(preparedStatement19, (java.lang.Object) 0, propertyDescriptorArray28);
        asyncQueryRunner3.fillStatement(preparedStatement11, parameterMetaData12, (java.lang.Object[]) propertyDescriptorArray28);
        boolean boolean32 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement33 = null;
        java.sql.ParameterMetaData parameterMetaData34 = null;
        java.util.concurrent.ExecutorService executorService36 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner37 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService36);
        java.sql.PreparedStatement preparedStatement38 = null;
        javax.sql.DataSource dataSource39 = null;
        java.util.concurrent.ExecutorService executorService41 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource39, true, executorService41);
        boolean boolean43 = asyncQueryRunner42.isPmdKnownBroken();
        javax.sql.DataSource dataSource44 = asyncQueryRunner42.getDataSource();
        java.sql.PreparedStatement preparedStatement45 = null;
        javax.sql.DataSource dataSource47 = null;
        java.util.concurrent.ExecutorService executorService49 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner50 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource47, true, executorService49);
        boolean boolean51 = asyncQueryRunner50.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement52 = null;
        java.lang.Object obj53 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner50.fillStatementWithBean(preparedStatement52, obj53, propertyDescriptorArray54);
        asyncQueryRunner42.fillStatementWithBean(preparedStatement45, (java.lang.Object) 0, propertyDescriptorArray54);
        asyncQueryRunner37.fillStatement(preparedStatement38, (java.lang.Object[]) propertyDescriptorArray54);
        asyncQueryRunner3.fillStatement(preparedStatement33, parameterMetaData34, (java.lang.Object[]) propertyDescriptorArray54);
        javax.sql.DataSource dataSource59 = asyncQueryRunner3.getDataSource();
        java.lang.Object[][] objArray61 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture62 = asyncQueryRunner3.batch("", objArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(dataSource44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray54);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray54, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource59);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.Connection connection5 = null;
        javax.sql.DataSource dataSource7 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource7, true, executorService9);
        boolean boolean11 = asyncQueryRunner10.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement12 = null;
        java.lang.Object obj13 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner10.fillStatementWithBean(preparedStatement12, obj13, propertyDescriptorArray14);
        javax.sql.DataSource dataSource16 = asyncQueryRunner10.getDataSource();
        java.sql.PreparedStatement preparedStatement17 = null;
        javax.sql.DataSource dataSource18 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource18, executorService19);
        javax.sql.DataSource dataSource21 = asyncQueryRunner20.getDataSource();
        java.sql.PreparedStatement preparedStatement22 = null;
        java.sql.ParameterMetaData parameterMetaData23 = null;
        javax.sql.DataSource dataSource24 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource24, true, executorService26);
        java.sql.PreparedStatement preparedStatement28 = null;
        java.sql.ParameterMetaData parameterMetaData29 = null;
        javax.sql.DataSource dataSource30 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner33 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource30, true, executorService32);
        boolean boolean34 = asyncQueryRunner33.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement35 = null;
        java.lang.Object obj36 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner33.fillStatementWithBean(preparedStatement35, obj36, propertyDescriptorArray37);
        javax.sql.DataSource dataSource39 = asyncQueryRunner33.getDataSource();
        javax.sql.DataSource dataSource40 = asyncQueryRunner33.getDataSource();
        java.sql.PreparedStatement preparedStatement41 = null;
        java.sql.ParameterMetaData parameterMetaData42 = null;
        javax.sql.DataSource dataSource43 = null;
        java.util.concurrent.ExecutorService executorService45 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner46 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource43, true, executorService45);
        boolean boolean47 = asyncQueryRunner46.isPmdKnownBroken();
        javax.sql.DataSource dataSource48 = asyncQueryRunner46.getDataSource();
        java.sql.PreparedStatement preparedStatement49 = null;
        javax.sql.DataSource dataSource51 = null;
        java.util.concurrent.ExecutorService executorService53 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner54 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource51, true, executorService53);
        boolean boolean55 = asyncQueryRunner54.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement56 = null;
        java.lang.Object obj57 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner54.fillStatementWithBean(preparedStatement56, obj57, propertyDescriptorArray58);
        asyncQueryRunner46.fillStatementWithBean(preparedStatement49, (java.lang.Object) 0, propertyDescriptorArray58);
        asyncQueryRunner33.fillStatement(preparedStatement41, parameterMetaData42, (java.lang.Object[]) propertyDescriptorArray58);
        java.sql.PreparedStatement preparedStatement62 = null;
        javax.sql.DataSource dataSource63 = null;
        java.util.concurrent.ExecutorService executorService65 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner66 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource63, true, executorService65);
        boolean boolean67 = asyncQueryRunner66.isPmdKnownBroken();
        javax.sql.DataSource dataSource68 = asyncQueryRunner66.getDataSource();
        java.sql.PreparedStatement preparedStatement69 = null;
        javax.sql.DataSource dataSource71 = null;
        java.util.concurrent.ExecutorService executorService73 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner74 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource71, true, executorService73);
        boolean boolean75 = asyncQueryRunner74.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement76 = null;
        java.lang.Object obj77 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray78 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner74.fillStatementWithBean(preparedStatement76, obj77, propertyDescriptorArray78);
        asyncQueryRunner66.fillStatementWithBean(preparedStatement69, (java.lang.Object) 0, propertyDescriptorArray78);
        asyncQueryRunner33.fillStatement(preparedStatement62, (java.lang.Object[]) propertyDescriptorArray78);
        asyncQueryRunner27.fillStatement(preparedStatement28, parameterMetaData29, (java.lang.Object[]) propertyDescriptorArray78);
        asyncQueryRunner20.fillStatement(preparedStatement22, parameterMetaData23, (java.lang.Object[]) propertyDescriptorArray78);
        asyncQueryRunner10.fillStatement(preparedStatement17, (java.lang.Object[]) propertyDescriptorArray78);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture85 = asyncQueryRunner3.update(connection5, "", (java.lang.Object[]) propertyDescriptorArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray14, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray37);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray37, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource39);
        org.junit.Assert.assertNull(dataSource40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(dataSource48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray58);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray58, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(dataSource68);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray78);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray78, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxRowsSet();
        java.lang.Integer int7 = statementConfiguration5.getQueryTimeout();
        boolean boolean8 = statementConfiguration5.isMaxFieldSizeSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        boolean boolean8 = statementConfiguration5.isFetchSizeSet();
        java.time.Duration duration9 = statementConfiguration5.getQueryTimeoutDuration();
        boolean boolean10 = statementConfiguration5.isFetchSizeSet();
        java.time.Duration duration11 = statementConfiguration5.getQueryTimeoutDuration();
        java.lang.Integer int12 = statementConfiguration5.getFetchSize();
        boolean boolean13 = statementConfiguration5.isFetchDirectionSet();
        java.lang.Integer int14 = statementConfiguration5.getFetchSize();
        boolean boolean15 = statementConfiguration5.isQueryTimeoutSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(duration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(duration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 10);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder8.queryTimeout(duration11);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder8.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder14.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder14.fetchDirection((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = builder19.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = builder19.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = builder23.maxRows((java.lang.Integer) 10);
        java.time.Duration duration26 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = builder23.queryTimeout(duration26);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder28 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder30 = builder28.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder32 = builder28.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder34 = builder32.maxRows((java.lang.Integer) 10);
        java.time.Duration duration35 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = builder34.queryTimeout(duration35);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration42 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration43 = statementConfiguration42.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder44 = builder36.queryTimeout(duration43);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder45 = builder27.queryTimeout(duration43);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder46 = builder14.queryTimeout(duration43);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration47 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) (-1), duration43);
        java.lang.Integer int48 = statementConfiguration47.getQueryTimeout();
        java.lang.Integer int49 = statementConfiguration47.getFetchDirection();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = builder10.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder10.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder10.queryTimeout((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder10.fetchDirection((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = builder17.maxRows((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(statementConfiguration11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource10 = asyncQueryRunner3.getDataSource();
        java.sql.Connection connection11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture14 = asyncQueryRunner3.update(connection11, "", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = builder10.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(statementConfiguration11);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        java.sql.PreparedStatement preparedStatement9 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService17);
        java.sql.PreparedStatement preparedStatement19 = null;
        javax.sql.DataSource dataSource20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource20, true, executorService22);
        boolean boolean24 = asyncQueryRunner23.isPmdKnownBroken();
        javax.sql.DataSource dataSource25 = asyncQueryRunner23.getDataSource();
        java.sql.PreparedStatement preparedStatement26 = null;
        javax.sql.DataSource dataSource28 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource28, true, executorService30);
        boolean boolean32 = asyncQueryRunner31.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement33 = null;
        java.lang.Object obj34 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner31.fillStatementWithBean(preparedStatement33, obj34, propertyDescriptorArray35);
        asyncQueryRunner23.fillStatementWithBean(preparedStatement26, (java.lang.Object) 0, propertyDescriptorArray35);
        asyncQueryRunner18.fillStatement(preparedStatement19, (java.lang.Object[]) propertyDescriptorArray35);
        asyncQueryRunner12.fillStatement(preparedStatement14, parameterMetaData15, (java.lang.Object[]) propertyDescriptorArray35);
        asyncQueryRunner3.fillStatement(preparedStatement9, (java.lang.Object[]) propertyDescriptorArray35);
        javax.sql.DataSource dataSource41 = asyncQueryRunner3.getDataSource();
        boolean boolean42 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean43 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement44 = null;
        javax.sql.DataSource dataSource45 = null;
        java.util.concurrent.ExecutorService executorService47 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner48 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource45, true, executorService47);
        boolean boolean49 = asyncQueryRunner48.isPmdKnownBroken();
        javax.sql.DataSource dataSource50 = asyncQueryRunner48.getDataSource();
        javax.sql.DataSource dataSource51 = asyncQueryRunner48.getDataSource();
        java.sql.PreparedStatement preparedStatement52 = null;
        java.time.Duration duration57 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration58 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration57);
        boolean boolean59 = statementConfiguration58.isMaxFieldSizeSet();
        java.time.Duration duration60 = statementConfiguration58.getQueryTimeoutDuration();
        boolean boolean61 = statementConfiguration58.isFetchSizeSet();
        boolean boolean62 = statementConfiguration58.isMaxFieldSizeSet();
        boolean boolean63 = statementConfiguration58.isFetchDirectionSet();
        java.util.concurrent.ExecutorService executorService65 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner66 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService65);
        java.sql.PreparedStatement preparedStatement67 = null;
        javax.sql.DataSource dataSource68 = null;
        java.util.concurrent.ExecutorService executorService70 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner71 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource68, true, executorService70);
        boolean boolean72 = asyncQueryRunner71.isPmdKnownBroken();
        javax.sql.DataSource dataSource73 = asyncQueryRunner71.getDataSource();
        java.sql.PreparedStatement preparedStatement74 = null;
        javax.sql.DataSource dataSource76 = null;
        java.util.concurrent.ExecutorService executorService78 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner79 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource76, true, executorService78);
        boolean boolean80 = asyncQueryRunner79.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement81 = null;
        java.lang.Object obj82 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray83 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner79.fillStatementWithBean(preparedStatement81, obj82, propertyDescriptorArray83);
        asyncQueryRunner71.fillStatementWithBean(preparedStatement74, (java.lang.Object) 0, propertyDescriptorArray83);
        asyncQueryRunner66.fillStatement(preparedStatement67, (java.lang.Object[]) propertyDescriptorArray83);
        asyncQueryRunner48.fillStatementWithBean(preparedStatement52, (java.lang.Object) statementConfiguration58, propertyDescriptorArray83);
        asyncQueryRunner3.fillStatement(preparedStatement44, (java.lang.Object[]) propertyDescriptorArray83);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray35);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray35, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(dataSource50);
        org.junit.Assert.assertNull(dataSource51);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(duration60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(dataSource73);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray83);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray83, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource10 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        javax.sql.DataSource dataSource18 = asyncQueryRunner16.getDataSource();
        java.sql.PreparedStatement preparedStatement19 = null;
        javax.sql.DataSource dataSource21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource21, true, executorService23);
        boolean boolean25 = asyncQueryRunner24.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement26 = null;
        java.lang.Object obj27 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner24.fillStatementWithBean(preparedStatement26, obj27, propertyDescriptorArray28);
        asyncQueryRunner16.fillStatementWithBean(preparedStatement19, (java.lang.Object) 0, propertyDescriptorArray28);
        asyncQueryRunner3.fillStatement(preparedStatement11, parameterMetaData12, (java.lang.Object[]) propertyDescriptorArray28);
        java.sql.PreparedStatement preparedStatement32 = null;
        javax.sql.DataSource dataSource33 = null;
        java.util.concurrent.ExecutorService executorService35 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner36 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource33, true, executorService35);
        boolean boolean37 = asyncQueryRunner36.isPmdKnownBroken();
        javax.sql.DataSource dataSource38 = asyncQueryRunner36.getDataSource();
        java.sql.PreparedStatement preparedStatement39 = null;
        javax.sql.DataSource dataSource41 = null;
        java.util.concurrent.ExecutorService executorService43 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner44 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource41, true, executorService43);
        boolean boolean45 = asyncQueryRunner44.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement46 = null;
        java.lang.Object obj47 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner44.fillStatementWithBean(preparedStatement46, obj47, propertyDescriptorArray48);
        asyncQueryRunner36.fillStatementWithBean(preparedStatement39, (java.lang.Object) 0, propertyDescriptorArray48);
        asyncQueryRunner3.fillStatement(preparedStatement32, (java.lang.Object[]) propertyDescriptorArray48);
        boolean boolean52 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource54 = null;
        java.util.concurrent.ExecutorService executorService56 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner57 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource54, true, executorService56);
        boolean boolean58 = asyncQueryRunner57.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement59 = null;
        java.lang.Object obj60 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner57.fillStatementWithBean(preparedStatement59, obj60, propertyDescriptorArray61);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture63 = asyncQueryRunner3.update("", (java.lang.Object[]) propertyDescriptorArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray48);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray48, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray61);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray61, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.maxRows((java.lang.Integer) 10);
        java.time.Duration duration13 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder10.queryTimeout(duration13);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder10.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.fetchDirection((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder18.maxFieldSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder20.fetchDirection((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration23 = builder20.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture24 = asyncQueryRunner2.update("hi!", (java.lang.Object) builder20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(statementConfiguration23);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder4.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.fetchDirection((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.maxFieldSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder12.fetchSize((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        boolean boolean7 = statementConfiguration5.isMaxFieldSizeSet();
        boolean boolean8 = statementConfiguration5.isMaxRowsSet();
        boolean boolean9 = statementConfiguration5.isMaxFieldSizeSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, true, executorService8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        javax.sql.DataSource dataSource11 = asyncQueryRunner9.getDataSource();
        javax.sql.DataSource dataSource12 = asyncQueryRunner9.getDataSource();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.time.Duration duration18 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration19 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration18);
        boolean boolean20 = statementConfiguration19.isMaxFieldSizeSet();
        java.time.Duration duration21 = statementConfiguration19.getQueryTimeoutDuration();
        boolean boolean22 = statementConfiguration19.isFetchSizeSet();
        boolean boolean23 = statementConfiguration19.isMaxFieldSizeSet();
        boolean boolean24 = statementConfiguration19.isFetchDirectionSet();
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService26);
        java.sql.PreparedStatement preparedStatement28 = null;
        javax.sql.DataSource dataSource29 = null;
        java.util.concurrent.ExecutorService executorService31 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner32 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource29, true, executorService31);
        boolean boolean33 = asyncQueryRunner32.isPmdKnownBroken();
        javax.sql.DataSource dataSource34 = asyncQueryRunner32.getDataSource();
        java.sql.PreparedStatement preparedStatement35 = null;
        javax.sql.DataSource dataSource37 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource37, true, executorService39);
        boolean boolean41 = asyncQueryRunner40.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement42 = null;
        java.lang.Object obj43 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner40.fillStatementWithBean(preparedStatement42, obj43, propertyDescriptorArray44);
        asyncQueryRunner32.fillStatementWithBean(preparedStatement35, (java.lang.Object) 0, propertyDescriptorArray44);
        asyncQueryRunner27.fillStatement(preparedStatement28, (java.lang.Object[]) propertyDescriptorArray44);
        asyncQueryRunner9.fillStatementWithBean(preparedStatement13, (java.lang.Object) statementConfiguration19, propertyDescriptorArray44);
        asyncQueryRunner3.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray44);
        boolean boolean50 = asyncQueryRunner3.isPmdKnownBroken();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray44);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray44, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxFieldSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder8.fetchDirection((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.maxRows((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource6 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement7 = null;
        java.time.Duration duration12 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration13 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration12);
        boolean boolean14 = statementConfiguration13.isMaxFieldSizeSet();
        java.time.Duration duration15 = statementConfiguration13.getQueryTimeoutDuration();
        boolean boolean16 = statementConfiguration13.isFetchSizeSet();
        boolean boolean17 = statementConfiguration13.isMaxFieldSizeSet();
        boolean boolean18 = statementConfiguration13.isFetchDirectionSet();
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService20);
        java.sql.PreparedStatement preparedStatement22 = null;
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, true, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        javax.sql.DataSource dataSource28 = asyncQueryRunner26.getDataSource();
        java.sql.PreparedStatement preparedStatement29 = null;
        javax.sql.DataSource dataSource31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource31, true, executorService33);
        boolean boolean35 = asyncQueryRunner34.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement36 = null;
        java.lang.Object obj37 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner34.fillStatementWithBean(preparedStatement36, obj37, propertyDescriptorArray38);
        asyncQueryRunner26.fillStatementWithBean(preparedStatement29, (java.lang.Object) 0, propertyDescriptorArray38);
        asyncQueryRunner21.fillStatement(preparedStatement22, (java.lang.Object[]) propertyDescriptorArray38);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement7, (java.lang.Object) statementConfiguration13, propertyDescriptorArray38);
        boolean boolean43 = statementConfiguration13.isFetchDirectionSet();
        boolean boolean44 = statementConfiguration13.isFetchDirectionSet();
        boolean boolean45 = statementConfiguration13.isMaxFieldSizeSet();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray38);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray38, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 1);
        java.lang.Integer int6 = statementConfiguration5.getMaxFieldSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 100);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchDirection((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.maxFieldSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder13.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder13.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = builder17.maxRows((java.lang.Integer) 10);
        java.time.Duration duration20 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = builder19.queryTimeout(duration20);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration27 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration28 = statementConfiguration27.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder29 = builder21.queryTimeout(duration28);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder30 = builder12.queryTimeout(duration28);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder32 = builder12.maxFieldSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder34 = builder32.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = builder32.fetchDirection((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource10 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        javax.sql.DataSource dataSource18 = asyncQueryRunner16.getDataSource();
        java.sql.PreparedStatement preparedStatement19 = null;
        javax.sql.DataSource dataSource21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource21, true, executorService23);
        boolean boolean25 = asyncQueryRunner24.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement26 = null;
        java.lang.Object obj27 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner24.fillStatementWithBean(preparedStatement26, obj27, propertyDescriptorArray28);
        asyncQueryRunner16.fillStatementWithBean(preparedStatement19, (java.lang.Object) 0, propertyDescriptorArray28);
        asyncQueryRunner3.fillStatement(preparedStatement11, parameterMetaData12, (java.lang.Object[]) propertyDescriptorArray28);
        boolean boolean32 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement33 = null;
        java.sql.ParameterMetaData parameterMetaData34 = null;
        java.util.concurrent.ExecutorService executorService36 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner37 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService36);
        java.sql.PreparedStatement preparedStatement38 = null;
        javax.sql.DataSource dataSource39 = null;
        java.util.concurrent.ExecutorService executorService41 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource39, true, executorService41);
        boolean boolean43 = asyncQueryRunner42.isPmdKnownBroken();
        javax.sql.DataSource dataSource44 = asyncQueryRunner42.getDataSource();
        java.sql.PreparedStatement preparedStatement45 = null;
        javax.sql.DataSource dataSource47 = null;
        java.util.concurrent.ExecutorService executorService49 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner50 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource47, true, executorService49);
        boolean boolean51 = asyncQueryRunner50.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement52 = null;
        java.lang.Object obj53 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner50.fillStatementWithBean(preparedStatement52, obj53, propertyDescriptorArray54);
        asyncQueryRunner42.fillStatementWithBean(preparedStatement45, (java.lang.Object) 0, propertyDescriptorArray54);
        asyncQueryRunner37.fillStatement(preparedStatement38, (java.lang.Object[]) propertyDescriptorArray54);
        asyncQueryRunner3.fillStatement(preparedStatement33, parameterMetaData34, (java.lang.Object[]) propertyDescriptorArray54);
        java.sql.Connection connection59 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture61 = asyncQueryRunner3.update(connection59, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(dataSource44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray54);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray54, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        boolean boolean6 = statementConfiguration5.isQueryTimeoutSet();
        boolean boolean7 = statementConfiguration5.isMaxRowsSet();
        java.time.Duration duration8 = statementConfiguration5.getQueryTimeoutDuration();
        java.time.Duration duration9 = statementConfiguration5.getQueryTimeoutDuration();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration9);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, true, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.lang.Object obj14 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner11.fillStatementWithBean(preparedStatement13, obj14, propertyDescriptorArray15);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement6, (java.lang.Object) 0, propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = asyncQueryRunner3.getParameterMetaData(preparedStatement18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.sql.ParameterMetaData parameterMetaData21 = asyncQueryRunner3.getParameterMetaData(preparedStatement20);
        java.sql.PreparedStatement preparedStatement22 = null;
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, true, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement28 = null;
        java.lang.Object obj29 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner26.fillStatementWithBean(preparedStatement28, obj29, propertyDescriptorArray30);
        asyncQueryRunner3.fillStatement(preparedStatement22, (java.lang.Object[]) propertyDescriptorArray30);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData19);
        org.junit.Assert.assertNull(parameterMetaData21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray30);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray30, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource6 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement7 = null;
        java.time.Duration duration12 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration13 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration12);
        boolean boolean14 = statementConfiguration13.isMaxFieldSizeSet();
        java.time.Duration duration15 = statementConfiguration13.getQueryTimeoutDuration();
        boolean boolean16 = statementConfiguration13.isFetchSizeSet();
        boolean boolean17 = statementConfiguration13.isMaxFieldSizeSet();
        boolean boolean18 = statementConfiguration13.isFetchDirectionSet();
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService20);
        java.sql.PreparedStatement preparedStatement22 = null;
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, true, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        javax.sql.DataSource dataSource28 = asyncQueryRunner26.getDataSource();
        java.sql.PreparedStatement preparedStatement29 = null;
        javax.sql.DataSource dataSource31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource31, true, executorService33);
        boolean boolean35 = asyncQueryRunner34.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement36 = null;
        java.lang.Object obj37 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner34.fillStatementWithBean(preparedStatement36, obj37, propertyDescriptorArray38);
        asyncQueryRunner26.fillStatementWithBean(preparedStatement29, (java.lang.Object) 0, propertyDescriptorArray38);
        asyncQueryRunner21.fillStatement(preparedStatement22, (java.lang.Object[]) propertyDescriptorArray38);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement7, (java.lang.Object) statementConfiguration13, propertyDescriptorArray38);
        javax.sql.DataSource dataSource43 = asyncQueryRunner3.getDataSource();
        java.sql.Connection connection44 = null;
        javax.sql.DataSource dataSource46 = null;
        java.util.concurrent.ExecutorService executorService48 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner49 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource46, true, executorService48);
        boolean boolean50 = asyncQueryRunner49.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement51 = null;
        java.lang.Object obj52 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner49.fillStatementWithBean(preparedStatement51, obj52, propertyDescriptorArray53);
        javax.sql.DataSource dataSource55 = asyncQueryRunner49.getDataSource();
        javax.sql.DataSource dataSource56 = asyncQueryRunner49.getDataSource();
        java.sql.PreparedStatement preparedStatement57 = null;
        java.sql.ParameterMetaData parameterMetaData58 = null;
        javax.sql.DataSource dataSource59 = null;
        java.util.concurrent.ExecutorService executorService61 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner62 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource59, true, executorService61);
        boolean boolean63 = asyncQueryRunner62.isPmdKnownBroken();
        javax.sql.DataSource dataSource64 = asyncQueryRunner62.getDataSource();
        java.sql.PreparedStatement preparedStatement65 = null;
        javax.sql.DataSource dataSource67 = null;
        java.util.concurrent.ExecutorService executorService69 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner70 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource67, true, executorService69);
        boolean boolean71 = asyncQueryRunner70.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement72 = null;
        java.lang.Object obj73 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray74 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner70.fillStatementWithBean(preparedStatement72, obj73, propertyDescriptorArray74);
        asyncQueryRunner62.fillStatementWithBean(preparedStatement65, (java.lang.Object) 0, propertyDescriptorArray74);
        asyncQueryRunner49.fillStatement(preparedStatement57, parameterMetaData58, (java.lang.Object[]) propertyDescriptorArray74);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture78 = asyncQueryRunner3.update(connection44, "", (java.lang.Object[]) propertyDescriptorArray74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray38);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray38, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray53);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray53, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource55);
        org.junit.Assert.assertNull(dataSource56);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(dataSource64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray74);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray74, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.time.Duration duration7 = statementConfiguration5.getQueryTimeoutDuration();
        boolean boolean8 = statementConfiguration5.isFetchSizeSet();
        java.lang.Integer int9 = statementConfiguration5.getFetchDirection();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(duration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder0.fetchSize((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxFieldSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder11 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder11.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder11.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder15.fetchSize((java.lang.Integer) 10);
        java.time.Duration duration18 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = builder17.queryTimeout(duration18);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration20 = builder17.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder17.fetchDirection((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = builder23.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = builder23.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder29 = builder27.maxRows((java.lang.Integer) 10);
        java.time.Duration duration30 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder31 = builder29.queryTimeout(duration30);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder33 = builder29.fetchDirection((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder35 = builder33.maxFieldSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder38 = builder36.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder40 = builder36.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder42 = builder40.maxRows((java.lang.Integer) 10);
        java.time.Duration duration43 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder44 = builder42.queryTimeout(duration43);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration50 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration51 = statementConfiguration50.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder52 = builder44.queryTimeout(duration51);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder53 = builder35.queryTimeout(duration51);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder54 = builder17.queryTimeout(duration51);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder55 = builder8.queryTimeout(duration51);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(statementConfiguration20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchDirection((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = builder6.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder6.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder13.maxFieldSize((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(statementConfiguration11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        boolean boolean8 = statementConfiguration5.isFetchSizeSet();
        java.time.Duration duration9 = statementConfiguration5.getQueryTimeoutDuration();
        java.lang.Integer int10 = statementConfiguration5.getFetchSize();
        boolean boolean11 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int12 = statementConfiguration5.getFetchDirection();
        java.time.Duration duration13 = statementConfiguration5.getQueryTimeoutDuration();
        java.time.Duration duration14 = statementConfiguration5.getQueryTimeoutDuration();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(duration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(duration13);
        org.junit.Assert.assertNull(duration14);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture10 = asyncQueryRunner3.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner3.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, false, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        javax.sql.DataSource dataSource20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource20, true, executorService22);
        boolean boolean24 = asyncQueryRunner23.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement25 = null;
        java.sql.ParameterMetaData parameterMetaData26 = null;
        javax.sql.DataSource dataSource27 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource27, true, executorService29);
        boolean boolean31 = asyncQueryRunner30.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement32 = null;
        java.lang.Object obj33 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner30.fillStatementWithBean(preparedStatement32, obj33, propertyDescriptorArray34);
        asyncQueryRunner23.fillStatement(preparedStatement25, parameterMetaData26, (java.lang.Object[]) propertyDescriptorArray34);
        asyncQueryRunner16.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray34);
        asyncQueryRunner3.fillStatement(preparedStatement12, (java.lang.Object[]) propertyDescriptorArray34);
        java.sql.PreparedStatement preparedStatement39 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder40 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder42 = builder40.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder44 = builder40.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder46 = builder44.maxRows((java.lang.Integer) 10);
        java.time.Duration duration47 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder48 = builder44.queryTimeout(duration47);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder50 = builder44.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder52 = builder50.fetchDirection((java.lang.Integer) 10);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement39, (java.lang.Object) 10, strArray53);
        boolean boolean55 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.Connection connection56 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture58 = asyncQueryRunner3.update(connection56, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray34);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray34, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 10);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder8.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.maxRows((java.lang.Integer) 10);
        java.time.Duration duration15 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder12.queryTimeout(duration15);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder12.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = builder23.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = builder23.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder29 = builder27.maxRows((java.lang.Integer) 10);
        java.time.Duration duration30 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder31 = builder29.queryTimeout(duration30);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder33 = builder31.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration34 = builder33.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = builder33.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder38 = builder33.queryTimeout((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder39 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder41 = builder39.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder43 = builder39.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder45 = builder43.maxRows((java.lang.Integer) 10);
        java.time.Duration duration46 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder47 = builder45.queryTimeout(duration46);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration53 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration54 = statementConfiguration53.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder55 = builder47.queryTimeout(duration54);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder56 = builder38.queryTimeout(duration54);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration57 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, duration54);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder58 = builder12.queryTimeout(duration54);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration64 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 0);
        java.time.Duration duration65 = statementConfiguration64.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder66 = builder12.queryTimeout(duration65);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration67 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 10, duration65);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration68 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 1, duration65);
        boolean boolean69 = statementConfiguration68.isFetchSizeSet();
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(statementConfiguration34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.sql.ParameterMetaData parameterMetaData4 = null;
        javax.sql.DataSource dataSource5 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource5, true, executorService7);
        boolean boolean9 = asyncQueryRunner8.isPmdKnownBroken();
        javax.sql.DataSource dataSource10 = asyncQueryRunner8.getDataSource();
        javax.sql.DataSource dataSource11 = asyncQueryRunner8.getDataSource();
        java.sql.PreparedStatement preparedStatement12 = null;
        java.time.Duration duration17 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration18 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration17);
        boolean boolean19 = statementConfiguration18.isMaxFieldSizeSet();
        java.time.Duration duration20 = statementConfiguration18.getQueryTimeoutDuration();
        boolean boolean21 = statementConfiguration18.isFetchSizeSet();
        boolean boolean22 = statementConfiguration18.isMaxFieldSizeSet();
        boolean boolean23 = statementConfiguration18.isFetchDirectionSet();
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.sql.PreparedStatement preparedStatement27 = null;
        javax.sql.DataSource dataSource28 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource28, true, executorService30);
        boolean boolean32 = asyncQueryRunner31.isPmdKnownBroken();
        javax.sql.DataSource dataSource33 = asyncQueryRunner31.getDataSource();
        java.sql.PreparedStatement preparedStatement34 = null;
        javax.sql.DataSource dataSource36 = null;
        java.util.concurrent.ExecutorService executorService38 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner39 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource36, true, executorService38);
        boolean boolean40 = asyncQueryRunner39.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement41 = null;
        java.lang.Object obj42 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner39.fillStatementWithBean(preparedStatement41, obj42, propertyDescriptorArray43);
        asyncQueryRunner31.fillStatementWithBean(preparedStatement34, (java.lang.Object) 0, propertyDescriptorArray43);
        asyncQueryRunner26.fillStatement(preparedStatement27, (java.lang.Object[]) propertyDescriptorArray43);
        asyncQueryRunner8.fillStatementWithBean(preparedStatement12, (java.lang.Object) statementConfiguration18, propertyDescriptorArray43);
        asyncQueryRunner2.fillStatement(preparedStatement3, parameterMetaData4, (java.lang.Object[]) propertyDescriptorArray43);
        java.sql.Connection connection49 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder51 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder53 = builder51.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder55 = builder51.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder57 = builder55.fetchDirection((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder59 = builder55.fetchDirection((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture60 = asyncQueryRunner2.update(connection49, "", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(duration20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray43);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray43, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 100, duration4);
        java.lang.Integer int6 = statementConfiguration5.getFetchDirection();
        java.lang.Integer int7 = statementConfiguration5.getFetchSize();
        java.lang.Integer int8 = statementConfiguration5.getMaxRows();
        boolean boolean9 = statementConfiguration5.isQueryTimeoutSet();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder2.maxFieldSize((java.lang.Integer) 100);
        java.time.Duration duration5 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder2.queryTimeout(duration5);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxFieldSize((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration9 = builder6.build();
        java.lang.Integer int10 = statementConfiguration9.getQueryTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(statementConfiguration9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder4.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.fetchDirection((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.maxFieldSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder14.fetchDirection((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = builder21.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = builder21.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = builder25.maxRows((java.lang.Integer) 10);
        java.time.Duration duration28 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder29 = builder25.queryTimeout(duration28);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder31 = builder25.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder38 = builder36.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder40 = builder36.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder42 = builder40.maxRows((java.lang.Integer) 10);
        java.time.Duration duration43 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder44 = builder42.queryTimeout(duration43);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder46 = builder44.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration47 = builder46.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder49 = builder46.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder51 = builder46.queryTimeout((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder52 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder54 = builder52.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder56 = builder52.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder58 = builder56.maxRows((java.lang.Integer) 10);
        java.time.Duration duration59 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder60 = builder58.queryTimeout(duration59);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration66 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration67 = statementConfiguration66.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder68 = builder60.queryTimeout(duration67);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder69 = builder51.queryTimeout(duration67);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration70 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, duration67);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder71 = builder25.queryTimeout(duration67);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration72 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0, duration67);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder73 = builder16.queryTimeout(duration67);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration74 = builder73.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(statementConfiguration47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(statementConfiguration74);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        boolean boolean8 = statementConfiguration5.isFetchSizeSet();
        java.time.Duration duration9 = statementConfiguration5.getQueryTimeoutDuration();
        boolean boolean10 = statementConfiguration5.isQueryTimeoutSet();
        java.lang.Integer int11 = statementConfiguration5.getFetchDirection();
        java.time.Duration duration12 = statementConfiguration5.getQueryTimeoutDuration();
        boolean boolean13 = statementConfiguration5.isMaxFieldSizeSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(duration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        java.sql.PreparedStatement preparedStatement9 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService17);
        java.sql.PreparedStatement preparedStatement19 = null;
        javax.sql.DataSource dataSource20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource20, true, executorService22);
        boolean boolean24 = asyncQueryRunner23.isPmdKnownBroken();
        javax.sql.DataSource dataSource25 = asyncQueryRunner23.getDataSource();
        java.sql.PreparedStatement preparedStatement26 = null;
        javax.sql.DataSource dataSource28 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource28, true, executorService30);
        boolean boolean32 = asyncQueryRunner31.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement33 = null;
        java.lang.Object obj34 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner31.fillStatementWithBean(preparedStatement33, obj34, propertyDescriptorArray35);
        asyncQueryRunner23.fillStatementWithBean(preparedStatement26, (java.lang.Object) 0, propertyDescriptorArray35);
        asyncQueryRunner18.fillStatement(preparedStatement19, (java.lang.Object[]) propertyDescriptorArray35);
        asyncQueryRunner12.fillStatement(preparedStatement14, parameterMetaData15, (java.lang.Object[]) propertyDescriptorArray35);
        asyncQueryRunner3.fillStatement(preparedStatement9, (java.lang.Object[]) propertyDescriptorArray35);
        javax.sql.DataSource dataSource41 = asyncQueryRunner3.getDataSource();
        boolean boolean42 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.Connection connection43 = null;
        javax.sql.DataSource dataSource45 = null;
        java.util.concurrent.ExecutorService executorService46 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner47 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource45, executorService46);
        javax.sql.DataSource dataSource48 = asyncQueryRunner47.getDataSource();
        java.sql.PreparedStatement preparedStatement49 = null;
        java.sql.ParameterMetaData parameterMetaData50 = null;
        javax.sql.DataSource dataSource51 = null;
        java.util.concurrent.ExecutorService executorService53 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner54 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource51, true, executorService53);
        boolean boolean55 = asyncQueryRunner54.isPmdKnownBroken();
        javax.sql.DataSource dataSource56 = asyncQueryRunner54.getDataSource();
        java.sql.PreparedStatement preparedStatement57 = null;
        javax.sql.DataSource dataSource59 = null;
        java.util.concurrent.ExecutorService executorService61 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner62 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource59, true, executorService61);
        boolean boolean63 = asyncQueryRunner62.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement64 = null;
        java.lang.Object obj65 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray66 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner62.fillStatementWithBean(preparedStatement64, obj65, propertyDescriptorArray66);
        asyncQueryRunner54.fillStatementWithBean(preparedStatement57, (java.lang.Object) 0, propertyDescriptorArray66);
        asyncQueryRunner47.fillStatement(preparedStatement49, parameterMetaData50, (java.lang.Object[]) propertyDescriptorArray66);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture70 = asyncQueryRunner3.update(connection43, "hi!", (java.lang.Object[]) propertyDescriptorArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray35);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray35, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(dataSource48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(dataSource56);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray66);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray66, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource6 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement7 = null;
        java.time.Duration duration12 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration13 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration12);
        boolean boolean14 = statementConfiguration13.isMaxFieldSizeSet();
        java.time.Duration duration15 = statementConfiguration13.getQueryTimeoutDuration();
        boolean boolean16 = statementConfiguration13.isFetchSizeSet();
        boolean boolean17 = statementConfiguration13.isMaxFieldSizeSet();
        boolean boolean18 = statementConfiguration13.isFetchDirectionSet();
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService20);
        java.sql.PreparedStatement preparedStatement22 = null;
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, true, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        javax.sql.DataSource dataSource28 = asyncQueryRunner26.getDataSource();
        java.sql.PreparedStatement preparedStatement29 = null;
        javax.sql.DataSource dataSource31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource31, true, executorService33);
        boolean boolean35 = asyncQueryRunner34.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement36 = null;
        java.lang.Object obj37 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner34.fillStatementWithBean(preparedStatement36, obj37, propertyDescriptorArray38);
        asyncQueryRunner26.fillStatementWithBean(preparedStatement29, (java.lang.Object) 0, propertyDescriptorArray38);
        asyncQueryRunner21.fillStatement(preparedStatement22, (java.lang.Object[]) propertyDescriptorArray38);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement7, (java.lang.Object) statementConfiguration13, propertyDescriptorArray38);
        javax.sql.DataSource dataSource43 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement44 = null;
        java.sql.ParameterMetaData parameterMetaData45 = null;
        javax.sql.DataSource dataSource46 = null;
        java.util.concurrent.ExecutorService executorService48 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner49 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource46, true, executorService48);
        boolean boolean50 = asyncQueryRunner49.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement51 = null;
        java.lang.Object obj52 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner49.fillStatementWithBean(preparedStatement51, obj52, propertyDescriptorArray53);
        java.sql.PreparedStatement preparedStatement55 = null;
        javax.sql.DataSource dataSource56 = null;
        java.util.concurrent.ExecutorService executorService57 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner58 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource56, executorService57);
        boolean boolean59 = asyncQueryRunner58.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement60 = null;
        java.sql.ParameterMetaData parameterMetaData61 = null;
        java.util.concurrent.ExecutorService executorService63 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner64 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService63);
        java.sql.PreparedStatement preparedStatement65 = null;
        javax.sql.DataSource dataSource66 = null;
        java.util.concurrent.ExecutorService executorService68 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner69 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource66, true, executorService68);
        boolean boolean70 = asyncQueryRunner69.isPmdKnownBroken();
        javax.sql.DataSource dataSource71 = asyncQueryRunner69.getDataSource();
        java.sql.PreparedStatement preparedStatement72 = null;
        javax.sql.DataSource dataSource74 = null;
        java.util.concurrent.ExecutorService executorService76 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner77 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource74, true, executorService76);
        boolean boolean78 = asyncQueryRunner77.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement79 = null;
        java.lang.Object obj80 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray81 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner77.fillStatementWithBean(preparedStatement79, obj80, propertyDescriptorArray81);
        asyncQueryRunner69.fillStatementWithBean(preparedStatement72, (java.lang.Object) 0, propertyDescriptorArray81);
        asyncQueryRunner64.fillStatement(preparedStatement65, (java.lang.Object[]) propertyDescriptorArray81);
        asyncQueryRunner58.fillStatement(preparedStatement60, parameterMetaData61, (java.lang.Object[]) propertyDescriptorArray81);
        asyncQueryRunner49.fillStatement(preparedStatement55, (java.lang.Object[]) propertyDescriptorArray81);
        asyncQueryRunner3.fillStatement(preparedStatement44, parameterMetaData45, (java.lang.Object[]) propertyDescriptorArray81);
        java.sql.Connection connection88 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture90 = asyncQueryRunner3.update(connection88, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray38);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray38, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray53);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray53, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(dataSource71);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray81);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray81, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration9 = builder8.build();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration10 = builder8.build();
        java.lang.Integer int11 = statementConfiguration10.getFetchSize();
        boolean boolean12 = statementConfiguration10.isFetchSizeSet();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(statementConfiguration9);
        org.junit.Assert.assertNotNull(statementConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner3.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, false, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        javax.sql.DataSource dataSource20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource20, true, executorService22);
        boolean boolean24 = asyncQueryRunner23.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement25 = null;
        java.sql.ParameterMetaData parameterMetaData26 = null;
        javax.sql.DataSource dataSource27 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource27, true, executorService29);
        boolean boolean31 = asyncQueryRunner30.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement32 = null;
        java.lang.Object obj33 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner30.fillStatementWithBean(preparedStatement32, obj33, propertyDescriptorArray34);
        asyncQueryRunner23.fillStatement(preparedStatement25, parameterMetaData26, (java.lang.Object[]) propertyDescriptorArray34);
        asyncQueryRunner16.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray34);
        asyncQueryRunner3.fillStatement(preparedStatement12, (java.lang.Object[]) propertyDescriptorArray34);
        java.sql.PreparedStatement preparedStatement39 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder40 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder42 = builder40.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder44 = builder40.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder46 = builder44.maxRows((java.lang.Integer) 10);
        java.time.Duration duration47 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder48 = builder44.queryTimeout(duration47);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder50 = builder44.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder52 = builder50.fetchDirection((java.lang.Integer) 10);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement39, (java.lang.Object) 10, strArray53);
        boolean boolean55 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean56 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean57 = asyncQueryRunner3.isPmdKnownBroken();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray34);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray34, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 100, duration4);
        boolean boolean6 = statementConfiguration5.isMaxRowsSet();
        boolean boolean7 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int8 = statementConfiguration5.getQueryTimeout();
        java.lang.Integer int9 = statementConfiguration5.getFetchDirection();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource6 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource7 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement8 = null;
        java.time.Duration duration13 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration14 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration13);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement8, (java.lang.Object) 10, strArray15);
        java.sql.PreparedStatement preparedStatement17 = null;
        javax.sql.DataSource dataSource18 = null;
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource18, true, executorService20);
        boolean boolean22 = asyncQueryRunner21.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement23 = null;
        java.lang.Object obj24 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner21.fillStatementWithBean(preparedStatement23, obj24, propertyDescriptorArray25);
        javax.sql.DataSource dataSource27 = asyncQueryRunner21.getDataSource();
        java.sql.PreparedStatement preparedStatement28 = null;
        java.sql.ParameterMetaData parameterMetaData29 = asyncQueryRunner21.getParameterMetaData(preparedStatement28);
        java.sql.PreparedStatement preparedStatement30 = null;
        javax.sql.DataSource dataSource31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource31, false, executorService33);
        boolean boolean35 = asyncQueryRunner34.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement36 = null;
        java.sql.ParameterMetaData parameterMetaData37 = null;
        javax.sql.DataSource dataSource38 = null;
        java.util.concurrent.ExecutorService executorService40 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner41 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource38, true, executorService40);
        boolean boolean42 = asyncQueryRunner41.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement43 = null;
        java.sql.ParameterMetaData parameterMetaData44 = null;
        javax.sql.DataSource dataSource45 = null;
        java.util.concurrent.ExecutorService executorService47 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner48 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource45, true, executorService47);
        boolean boolean49 = asyncQueryRunner48.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement50 = null;
        java.lang.Object obj51 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray52 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner48.fillStatementWithBean(preparedStatement50, obj51, propertyDescriptorArray52);
        asyncQueryRunner41.fillStatement(preparedStatement43, parameterMetaData44, (java.lang.Object[]) propertyDescriptorArray52);
        asyncQueryRunner34.fillStatement(preparedStatement36, parameterMetaData37, (java.lang.Object[]) propertyDescriptorArray52);
        asyncQueryRunner21.fillStatement(preparedStatement30, (java.lang.Object[]) propertyDescriptorArray52);
        asyncQueryRunner3.fillStatement(preparedStatement17, (java.lang.Object[]) propertyDescriptorArray52);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder59 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder61 = builder59.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder63 = builder59.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder65 = builder63.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder67 = builder63.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder69 = builder67.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder71 = builder67.fetchDirection((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder73 = builder71.maxFieldSize((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture74 = asyncQueryRunner3.update("hi!", (java.lang.Object) builder71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray25, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertNull(parameterMetaData29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray52);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray52, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration1 = builder0.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder3 = builder0.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder5 = builder0.maxRows((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(statementConfiguration1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder2.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = builder4.build();
        java.lang.Integer int6 = statementConfiguration5.getMaxRows();
        java.lang.Integer int7 = statementConfiguration5.getFetchDirection();
        java.time.Duration duration8 = statementConfiguration5.getQueryTimeoutDuration();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(statementConfiguration5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(duration8);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder0.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder0.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder8.fetchDirection((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder8.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder14.fetchSize((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration17 = builder14.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(statementConfiguration17);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        boolean boolean7 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int8 = statementConfiguration5.getQueryTimeout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        boolean boolean8 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean9 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource10 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = asyncQueryRunner3.getParameterMetaData(preparedStatement11);
        java.sql.PreparedStatement preparedStatement13 = null;
        java.lang.Object[] objArray14 = null;
        asyncQueryRunner3.fillStatement(preparedStatement13, objArray14);
        javax.sql.DataSource dataSource16 = asyncQueryRunner3.getDataSource();
        java.time.Duration duration22 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration23 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 0, duration22);
        boolean boolean24 = statementConfiguration23.isQueryTimeoutSet();
        java.lang.Integer int25 = statementConfiguration23.getFetchSize();
        boolean boolean26 = statementConfiguration23.isMaxFieldSizeSet();
        java.lang.Integer int27 = statementConfiguration23.getFetchDirection();
        boolean boolean28 = statementConfiguration23.isFetchDirectionSet();
        java.lang.Integer int29 = statementConfiguration23.getFetchSize();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture30 = asyncQueryRunner3.update("hi!", (java.lang.Object) int29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(parameterMetaData12);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        boolean boolean8 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean9 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource10 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = asyncQueryRunner3.getParameterMetaData(preparedStatement11);
        java.sql.PreparedStatement preparedStatement13 = null;
        java.lang.Object[] objArray14 = null;
        asyncQueryRunner3.fillStatement(preparedStatement13, objArray14);
        javax.sql.DataSource dataSource16 = asyncQueryRunner3.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture18 = asyncQueryRunner3.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(parameterMetaData12);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        boolean boolean5 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource6 = asyncQueryRunner2.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dataSource6);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.queryTimeout(duration11);
        java.time.Duration duration13 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder10.queryTimeout(duration13);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration15 = builder14.build();
        boolean boolean16 = statementConfiguration15.isFetchSizeSet();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(statementConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration6 = statementConfiguration5.getQueryTimeoutDuration();
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner3.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = asyncQueryRunner3.getParameterMetaData(preparedStatement12);
        boolean boolean14 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource16, true, executorService18);
        boolean boolean20 = asyncQueryRunner19.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement21 = null;
        java.lang.Object obj22 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner19.fillStatementWithBean(preparedStatement21, obj22, propertyDescriptorArray23);
        javax.sql.DataSource dataSource25 = asyncQueryRunner19.getDataSource();
        java.sql.PreparedStatement preparedStatement26 = null;
        java.sql.ParameterMetaData parameterMetaData27 = asyncQueryRunner19.getParameterMetaData(preparedStatement26);
        java.sql.PreparedStatement preparedStatement28 = null;
        java.sql.ParameterMetaData parameterMetaData29 = asyncQueryRunner19.getParameterMetaData(preparedStatement28);
        javax.sql.DataSource dataSource30 = asyncQueryRunner19.getDataSource();
        java.sql.PreparedStatement preparedStatement31 = null;
        javax.sql.DataSource dataSource32 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource32, true, executorService34);
        boolean boolean36 = asyncQueryRunner35.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement37 = null;
        java.lang.Object obj38 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner35.fillStatementWithBean(preparedStatement37, obj38, propertyDescriptorArray39);
        javax.sql.DataSource dataSource41 = asyncQueryRunner35.getDataSource();
        java.sql.PreparedStatement preparedStatement42 = null;
        java.sql.ParameterMetaData parameterMetaData43 = asyncQueryRunner35.getParameterMetaData(preparedStatement42);
        java.sql.PreparedStatement preparedStatement44 = null;
        javax.sql.DataSource dataSource45 = null;
        java.util.concurrent.ExecutorService executorService47 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner48 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource45, false, executorService47);
        boolean boolean49 = asyncQueryRunner48.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement50 = null;
        java.sql.ParameterMetaData parameterMetaData51 = null;
        javax.sql.DataSource dataSource52 = null;
        java.util.concurrent.ExecutorService executorService54 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner55 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource52, true, executorService54);
        boolean boolean56 = asyncQueryRunner55.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement57 = null;
        java.sql.ParameterMetaData parameterMetaData58 = null;
        javax.sql.DataSource dataSource59 = null;
        java.util.concurrent.ExecutorService executorService61 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner62 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource59, true, executorService61);
        boolean boolean63 = asyncQueryRunner62.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement64 = null;
        java.lang.Object obj65 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray66 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner62.fillStatementWithBean(preparedStatement64, obj65, propertyDescriptorArray66);
        asyncQueryRunner55.fillStatement(preparedStatement57, parameterMetaData58, (java.lang.Object[]) propertyDescriptorArray66);
        asyncQueryRunner48.fillStatement(preparedStatement50, parameterMetaData51, (java.lang.Object[]) propertyDescriptorArray66);
        asyncQueryRunner35.fillStatement(preparedStatement44, (java.lang.Object[]) propertyDescriptorArray66);
        java.sql.PreparedStatement preparedStatement71 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder72 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder74 = builder72.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder76 = builder72.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder78 = builder76.maxRows((java.lang.Integer) 10);
        java.time.Duration duration79 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder80 = builder76.queryTimeout(duration79);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder82 = builder76.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder84 = builder82.fetchDirection((java.lang.Integer) 10);
        java.lang.String[] strArray85 = new java.lang.String[] {};
        asyncQueryRunner35.fillStatementWithBean(preparedStatement71, (java.lang.Object) 10, strArray85);
        asyncQueryRunner19.fillStatement(preparedStatement31, (java.lang.Object[]) strArray85);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture88 = asyncQueryRunner3.update("", (java.lang.Object[]) strArray85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNull(parameterMetaData13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray23);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray23, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertNull(parameterMetaData27);
        org.junit.Assert.assertNull(parameterMetaData29);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray39);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray39, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertNull(parameterMetaData43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray66);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray66, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] {});
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        boolean boolean8 = statementConfiguration5.isMaxRowsSet();
        boolean boolean9 = statementConfiguration5.isQueryTimeoutSet();
        boolean boolean10 = statementConfiguration5.isFetchDirectionSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        boolean boolean5 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean6 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean7 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture10 = asyncQueryRunner2.update(connection8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 0, duration4);
        boolean boolean6 = statementConfiguration5.isQueryTimeoutSet();
        java.lang.Integer int7 = statementConfiguration5.getFetchSize();
        java.lang.Integer int8 = statementConfiguration5.getFetchSize();
        java.lang.Integer int9 = statementConfiguration5.getQueryTimeout();
        boolean boolean10 = statementConfiguration5.isMaxFieldSizeSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration9 = builder4.build();
        boolean boolean10 = statementConfiguration9.isMaxFieldSizeSet();
        boolean boolean11 = statementConfiguration9.isMaxRowsSet();
        boolean boolean12 = statementConfiguration9.isFetchSizeSet();
        boolean boolean13 = statementConfiguration9.isMaxRowsSet();
        boolean boolean14 = statementConfiguration9.isFetchSizeSet();
        java.lang.Integer int15 = statementConfiguration9.getMaxFieldSize();
        boolean boolean16 = statementConfiguration9.isQueryTimeoutSet();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(statementConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 100, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder4.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder4.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.fetchSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder15.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = builder15.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = builder19.maxRows((java.lang.Integer) 10);
        java.time.Duration duration22 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = builder21.queryTimeout(duration22);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration29 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration30 = statementConfiguration29.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder31 = builder23.queryTimeout(duration30);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder32 = builder14.queryTimeout(duration30);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration33 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 10, duration30);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = builder10.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder10.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration14 = builder13.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder13.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration19 = builder16.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(statementConfiguration11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(statementConfiguration14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(statementConfiguration19);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.queryTimeout(duration11);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder10.maxRows((java.lang.Integer) 10);
        java.time.Duration duration15 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder14.queryTimeout(duration15);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration17 = builder14.build();
        java.lang.Integer int18 = statementConfiguration17.getQueryTimeout();
        boolean boolean19 = statementConfiguration17.isFetchSizeSet();
        java.lang.Integer int20 = statementConfiguration17.getMaxRows();
        boolean boolean21 = statementConfiguration17.isMaxFieldSizeSet();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(statementConfiguration17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxRowsSet();
        boolean boolean7 = statementConfiguration5.isMaxFieldSizeSet();
        java.time.Duration duration8 = statementConfiguration5.getQueryTimeoutDuration();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(duration8);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, true, executorService8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        javax.sql.DataSource dataSource11 = asyncQueryRunner9.getDataSource();
        javax.sql.DataSource dataSource12 = asyncQueryRunner9.getDataSource();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.time.Duration duration18 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration19 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration18);
        boolean boolean20 = statementConfiguration19.isMaxFieldSizeSet();
        java.time.Duration duration21 = statementConfiguration19.getQueryTimeoutDuration();
        boolean boolean22 = statementConfiguration19.isFetchSizeSet();
        boolean boolean23 = statementConfiguration19.isMaxFieldSizeSet();
        boolean boolean24 = statementConfiguration19.isFetchDirectionSet();
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService26);
        java.sql.PreparedStatement preparedStatement28 = null;
        javax.sql.DataSource dataSource29 = null;
        java.util.concurrent.ExecutorService executorService31 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner32 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource29, true, executorService31);
        boolean boolean33 = asyncQueryRunner32.isPmdKnownBroken();
        javax.sql.DataSource dataSource34 = asyncQueryRunner32.getDataSource();
        java.sql.PreparedStatement preparedStatement35 = null;
        javax.sql.DataSource dataSource37 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource37, true, executorService39);
        boolean boolean41 = asyncQueryRunner40.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement42 = null;
        java.lang.Object obj43 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner40.fillStatementWithBean(preparedStatement42, obj43, propertyDescriptorArray44);
        asyncQueryRunner32.fillStatementWithBean(preparedStatement35, (java.lang.Object) 0, propertyDescriptorArray44);
        asyncQueryRunner27.fillStatement(preparedStatement28, (java.lang.Object[]) propertyDescriptorArray44);
        asyncQueryRunner9.fillStatementWithBean(preparedStatement13, (java.lang.Object) statementConfiguration19, propertyDescriptorArray44);
        asyncQueryRunner3.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray44);
        java.sql.Connection connection50 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder52 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder54 = builder52.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder56 = builder52.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder58 = builder56.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder60 = builder58.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder62 = builder60.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder64 = builder62.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration70 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
        java.time.Duration duration71 = statementConfiguration70.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder72 = builder64.queryTimeout(duration71);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder74 = builder72.maxRows((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder76 = builder72.queryTimeout((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder78 = builder76.queryTimeout((java.lang.Integer) (-1));
        java.lang.Object[] objArray79 = new java.lang.Object[] { (-1) };
        java.lang.Object[][] objArray80 = new java.lang.Object[][] { objArray79 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture81 = asyncQueryRunner3.batch(connection50, "hi!", objArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray44);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray44, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[-1]");
        org.junit.Assert.assertNotNull(objArray80);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource10 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        javax.sql.DataSource dataSource18 = asyncQueryRunner16.getDataSource();
        java.sql.PreparedStatement preparedStatement19 = null;
        javax.sql.DataSource dataSource21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource21, true, executorService23);
        boolean boolean25 = asyncQueryRunner24.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement26 = null;
        java.lang.Object obj27 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner24.fillStatementWithBean(preparedStatement26, obj27, propertyDescriptorArray28);
        asyncQueryRunner16.fillStatementWithBean(preparedStatement19, (java.lang.Object) 0, propertyDescriptorArray28);
        asyncQueryRunner3.fillStatement(preparedStatement11, parameterMetaData12, (java.lang.Object[]) propertyDescriptorArray28);
        java.sql.PreparedStatement preparedStatement32 = null;
        javax.sql.DataSource dataSource33 = null;
        java.util.concurrent.ExecutorService executorService35 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner36 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource33, true, executorService35);
        boolean boolean37 = asyncQueryRunner36.isPmdKnownBroken();
        javax.sql.DataSource dataSource38 = asyncQueryRunner36.getDataSource();
        java.sql.PreparedStatement preparedStatement39 = null;
        javax.sql.DataSource dataSource41 = null;
        java.util.concurrent.ExecutorService executorService43 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner44 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource41, true, executorService43);
        boolean boolean45 = asyncQueryRunner44.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement46 = null;
        java.lang.Object obj47 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner44.fillStatementWithBean(preparedStatement46, obj47, propertyDescriptorArray48);
        asyncQueryRunner36.fillStatementWithBean(preparedStatement39, (java.lang.Object) 0, propertyDescriptorArray48);
        asyncQueryRunner3.fillStatement(preparedStatement32, (java.lang.Object[]) propertyDescriptorArray48);
        java.sql.PreparedStatement preparedStatement52 = null;
        javax.sql.DataSource dataSource53 = null;
        java.util.concurrent.ExecutorService executorService55 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner56 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource53, true, executorService55);
        boolean boolean57 = asyncQueryRunner56.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement58 = null;
        java.lang.Object obj59 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray60 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner56.fillStatementWithBean(preparedStatement58, obj59, propertyDescriptorArray60);
        javax.sql.DataSource dataSource62 = asyncQueryRunner56.getDataSource();
        javax.sql.DataSource dataSource63 = asyncQueryRunner56.getDataSource();
        java.sql.PreparedStatement preparedStatement64 = null;
        java.sql.ParameterMetaData parameterMetaData65 = null;
        javax.sql.DataSource dataSource66 = null;
        java.util.concurrent.ExecutorService executorService68 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner69 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource66, true, executorService68);
        boolean boolean70 = asyncQueryRunner69.isPmdKnownBroken();
        javax.sql.DataSource dataSource71 = asyncQueryRunner69.getDataSource();
        java.sql.PreparedStatement preparedStatement72 = null;
        javax.sql.DataSource dataSource74 = null;
        java.util.concurrent.ExecutorService executorService76 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner77 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource74, true, executorService76);
        boolean boolean78 = asyncQueryRunner77.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement79 = null;
        java.lang.Object obj80 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray81 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner77.fillStatementWithBean(preparedStatement79, obj80, propertyDescriptorArray81);
        asyncQueryRunner69.fillStatementWithBean(preparedStatement72, (java.lang.Object) 0, propertyDescriptorArray81);
        asyncQueryRunner56.fillStatement(preparedStatement64, parameterMetaData65, (java.lang.Object[]) propertyDescriptorArray81);
        asyncQueryRunner3.fillStatement(preparedStatement52, (java.lang.Object[]) propertyDescriptorArray81);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture87 = asyncQueryRunner3.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray48);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray48, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray60);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray60, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource62);
        org.junit.Assert.assertNull(dataSource63);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(dataSource71);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray81);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray81, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer int6 = statementConfiguration5.getFetchDirection();
        java.lang.Integer int7 = statementConfiguration5.getFetchDirection();
        boolean boolean8 = statementConfiguration5.isMaxRowsSet();
        boolean boolean9 = statementConfiguration5.isMaxRowsSet();
        boolean boolean10 = statementConfiguration5.isFetchDirectionSet();
        java.lang.Integer int11 = statementConfiguration5.getMaxRows();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration18 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
        java.time.Duration duration19 = statementConfiguration18.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder12.queryTimeout(duration19);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder20.maxRows((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder24 = builder20.queryTimeout((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder26 = builder24.queryTimeout((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration27 = builder26.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(statementConfiguration27);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder16.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder20.maxRows((java.lang.Integer) 10);
        java.time.Duration duration23 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder24 = builder22.queryTimeout(duration23);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration30 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration31 = statementConfiguration30.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder32 = builder24.queryTimeout(duration31);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration33 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 100, duration31);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration34 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 0, duration31);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration35 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 10, duration31);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration36 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 0, duration31);
        java.lang.Integer int37 = statementConfiguration36.getQueryTimeout();
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder2.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder2.fetchSize((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 0);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService7);
        java.sql.PreparedStatement preparedStatement9 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, true, executorService12);
        boolean boolean14 = asyncQueryRunner13.isPmdKnownBroken();
        javax.sql.DataSource dataSource15 = asyncQueryRunner13.getDataSource();
        java.sql.PreparedStatement preparedStatement16 = null;
        javax.sql.DataSource dataSource18 = null;
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource18, true, executorService20);
        boolean boolean22 = asyncQueryRunner21.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement23 = null;
        java.lang.Object obj24 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner21.fillStatementWithBean(preparedStatement23, obj24, propertyDescriptorArray25);
        asyncQueryRunner13.fillStatementWithBean(preparedStatement16, (java.lang.Object) 0, propertyDescriptorArray25);
        asyncQueryRunner8.fillStatement(preparedStatement9, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray25);
        boolean boolean30 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource32 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource32, true, executorService34);
        boolean boolean36 = asyncQueryRunner35.isPmdKnownBroken();
        javax.sql.DataSource dataSource37 = asyncQueryRunner35.getDataSource();
        javax.sql.DataSource dataSource38 = asyncQueryRunner35.getDataSource();
        java.sql.PreparedStatement preparedStatement39 = null;
        java.sql.ParameterMetaData parameterMetaData40 = asyncQueryRunner35.getParameterMetaData(preparedStatement39);
        java.sql.PreparedStatement preparedStatement41 = null;
        java.sql.ParameterMetaData parameterMetaData42 = asyncQueryRunner35.getParameterMetaData(preparedStatement41);
        javax.sql.DataSource dataSource43 = asyncQueryRunner35.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture44 = asyncQueryRunner2.update("", (java.lang.Object) asyncQueryRunner35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray25, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(dataSource37);
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertNull(parameterMetaData40);
        org.junit.Assert.assertNull(parameterMetaData42);
        org.junit.Assert.assertNull(dataSource43);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchDirection((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = builder6.build();
        java.lang.Integer int12 = statementConfiguration11.getFetchSize();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(statementConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource10 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        javax.sql.DataSource dataSource18 = asyncQueryRunner16.getDataSource();
        java.sql.PreparedStatement preparedStatement19 = null;
        javax.sql.DataSource dataSource21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource21, true, executorService23);
        boolean boolean25 = asyncQueryRunner24.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement26 = null;
        java.lang.Object obj27 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner24.fillStatementWithBean(preparedStatement26, obj27, propertyDescriptorArray28);
        asyncQueryRunner16.fillStatementWithBean(preparedStatement19, (java.lang.Object) 0, propertyDescriptorArray28);
        asyncQueryRunner3.fillStatement(preparedStatement11, parameterMetaData12, (java.lang.Object[]) propertyDescriptorArray28);
        javax.sql.DataSource dataSource32 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement33 = null;
        java.sql.ParameterMetaData parameterMetaData34 = asyncQueryRunner3.getParameterMetaData(preparedStatement33);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture36 = asyncQueryRunner3.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertNull(parameterMetaData34);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        boolean boolean8 = statementConfiguration5.isFetchSizeSet();
        java.time.Duration duration9 = statementConfiguration5.getQueryTimeoutDuration();
        java.lang.Integer int10 = statementConfiguration5.getFetchSize();
        boolean boolean11 = statementConfiguration5.isMaxFieldSizeSet();
        boolean boolean12 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int13 = statementConfiguration5.getFetchSize();
        java.lang.Integer int14 = statementConfiguration5.getMaxFieldSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(duration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, true, executorService8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.lang.Object obj12 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement11, obj12, propertyDescriptorArray13);
        javax.sql.DataSource dataSource15 = asyncQueryRunner9.getDataSource();
        javax.sql.DataSource dataSource16 = asyncQueryRunner9.getDataSource();
        java.sql.PreparedStatement preparedStatement17 = null;
        java.sql.ParameterMetaData parameterMetaData18 = null;
        javax.sql.DataSource dataSource19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource19, true, executorService21);
        boolean boolean23 = asyncQueryRunner22.isPmdKnownBroken();
        javax.sql.DataSource dataSource24 = asyncQueryRunner22.getDataSource();
        java.sql.PreparedStatement preparedStatement25 = null;
        javax.sql.DataSource dataSource27 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource27, true, executorService29);
        boolean boolean31 = asyncQueryRunner30.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement32 = null;
        java.lang.Object obj33 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner30.fillStatementWithBean(preparedStatement32, obj33, propertyDescriptorArray34);
        asyncQueryRunner22.fillStatementWithBean(preparedStatement25, (java.lang.Object) 0, propertyDescriptorArray34);
        asyncQueryRunner9.fillStatement(preparedStatement17, parameterMetaData18, (java.lang.Object[]) propertyDescriptorArray34);
        java.sql.PreparedStatement preparedStatement38 = null;
        javax.sql.DataSource dataSource39 = null;
        java.util.concurrent.ExecutorService executorService41 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource39, true, executorService41);
        boolean boolean43 = asyncQueryRunner42.isPmdKnownBroken();
        javax.sql.DataSource dataSource44 = asyncQueryRunner42.getDataSource();
        java.sql.PreparedStatement preparedStatement45 = null;
        javax.sql.DataSource dataSource47 = null;
        java.util.concurrent.ExecutorService executorService49 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner50 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource47, true, executorService49);
        boolean boolean51 = asyncQueryRunner50.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement52 = null;
        java.lang.Object obj53 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner50.fillStatementWithBean(preparedStatement52, obj53, propertyDescriptorArray54);
        asyncQueryRunner42.fillStatementWithBean(preparedStatement45, (java.lang.Object) 0, propertyDescriptorArray54);
        asyncQueryRunner9.fillStatement(preparedStatement38, (java.lang.Object[]) propertyDescriptorArray54);
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray54);
        java.sql.PreparedStatement preparedStatement59 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData60 = asyncQueryRunner2.getParameterMetaData(preparedStatement59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray13, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray34);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray34, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(dataSource44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray54);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray54, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, true, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.lang.Object obj14 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner11.fillStatementWithBean(preparedStatement13, obj14, propertyDescriptorArray15);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement6, (java.lang.Object) 0, propertyDescriptorArray15);
        boolean boolean18 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean19 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean20 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean21 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource22 = asyncQueryRunner3.getDataSource();
        java.sql.Connection connection23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture25 = asyncQueryRunner3.update(connection23, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(dataSource22);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration1 = builder0.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder3 = builder0.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder5 = builder3.fetchSize((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(statementConfiguration1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder10.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration15 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder14.queryTimeout(duration15);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.fetchSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder16.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder16.maxRows((java.lang.Integer) (-1));
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, false, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement28 = null;
        java.sql.ParameterMetaData parameterMetaData29 = null;
        javax.sql.DataSource dataSource30 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner33 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource30, true, executorService32);
        boolean boolean34 = asyncQueryRunner33.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement35 = null;
        java.sql.ParameterMetaData parameterMetaData36 = null;
        javax.sql.DataSource dataSource37 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource37, true, executorService39);
        boolean boolean41 = asyncQueryRunner40.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement42 = null;
        java.lang.Object obj43 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner40.fillStatementWithBean(preparedStatement42, obj43, propertyDescriptorArray44);
        asyncQueryRunner33.fillStatement(preparedStatement35, parameterMetaData36, (java.lang.Object[]) propertyDescriptorArray44);
        asyncQueryRunner26.fillStatement(preparedStatement28, parameterMetaData29, (java.lang.Object[]) propertyDescriptorArray44);
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) (-1), propertyDescriptorArray44);
        java.sql.PreparedStatement preparedStatement49 = null;
        java.sql.ParameterMetaData parameterMetaData50 = asyncQueryRunner2.getParameterMetaData(preparedStatement49);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture52 = asyncQueryRunner2.update("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray44);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray44, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData50);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        java.time.Duration duration9 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.queryTimeout(duration9);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder8.queryTimeout(duration11);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder8.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = builder23.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = builder23.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder29 = builder27.maxRows((java.lang.Integer) 10);
        java.time.Duration duration30 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder31 = builder29.queryTimeout(duration30);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder33 = builder31.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration34 = builder33.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = builder33.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder38 = builder33.queryTimeout((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder39 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder41 = builder39.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder43 = builder39.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder45 = builder43.maxRows((java.lang.Integer) 10);
        java.time.Duration duration46 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder47 = builder45.queryTimeout(duration46);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration53 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration54 = statementConfiguration53.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder55 = builder47.queryTimeout(duration54);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder56 = builder38.queryTimeout(duration54);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration57 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 100, duration54);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration58 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 0, duration54);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder59 = builder8.queryTimeout(duration54);
        java.lang.Class<?> wildcardClass60 = duration54.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(statementConfiguration34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration9 = builder8.build();
        java.time.Duration duration10 = statementConfiguration9.getQueryTimeoutDuration();
        boolean boolean11 = statementConfiguration9.isQueryTimeoutSet();
        java.lang.Integer int12 = statementConfiguration9.getMaxFieldSize();
        java.lang.Integer int13 = statementConfiguration9.getMaxRows();
        java.lang.Integer int14 = statementConfiguration9.getFetchDirection();
        boolean boolean15 = statementConfiguration9.isMaxRowsSet();
        java.lang.Integer int16 = statementConfiguration9.getMaxRows();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(statementConfiguration9);
        org.junit.Assert.assertNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        boolean boolean8 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement9 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration15 = builder14.build();
        java.time.Duration duration16 = statementConfiguration15.getQueryTimeoutDuration();
        javax.sql.DataSource dataSource17 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource17, true, executorService19);
        boolean boolean21 = asyncQueryRunner20.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement22 = null;
        java.lang.Object obj23 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner20.fillStatementWithBean(preparedStatement22, obj23, propertyDescriptorArray24);
        javax.sql.DataSource dataSource26 = asyncQueryRunner20.getDataSource();
        javax.sql.DataSource dataSource27 = asyncQueryRunner20.getDataSource();
        java.sql.PreparedStatement preparedStatement28 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration34 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 100);
        javax.sql.DataSource dataSource35 = null;
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource35, true, executorService37);
        boolean boolean39 = asyncQueryRunner38.isPmdKnownBroken();
        javax.sql.DataSource dataSource40 = asyncQueryRunner38.getDataSource();
        javax.sql.DataSource dataSource41 = asyncQueryRunner38.getDataSource();
        javax.sql.DataSource dataSource42 = asyncQueryRunner38.getDataSource();
        java.sql.PreparedStatement preparedStatement43 = null;
        java.time.Duration duration48 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration49 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration48);
        java.lang.String[] strArray50 = new java.lang.String[] {};
        asyncQueryRunner38.fillStatementWithBean(preparedStatement43, (java.lang.Object) 10, strArray50);
        asyncQueryRunner20.fillStatementWithBean(preparedStatement28, (java.lang.Object) statementConfiguration34, strArray50);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement9, (java.lang.Object) statementConfiguration15, strArray50);
        java.sql.Connection connection54 = null;
        javax.sql.DataSource dataSource56 = null;
        java.util.concurrent.ExecutorService executorService57 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner58 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource56, executorService57);
        boolean boolean59 = asyncQueryRunner58.isPmdKnownBroken();
        boolean boolean60 = asyncQueryRunner58.isPmdKnownBroken();
        javax.sql.DataSource dataSource61 = asyncQueryRunner58.getDataSource();
        javax.sql.DataSource dataSource62 = asyncQueryRunner58.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture63 = asyncQueryRunner3.update(connection54, "", (java.lang.Object) dataSource62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(statementConfiguration15);
        org.junit.Assert.assertNull(duration16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray24, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(dataSource40);
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(dataSource61);
        org.junit.Assert.assertNull(dataSource62);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
        java.time.Duration duration6 = statementConfiguration5.getQueryTimeoutDuration();
        boolean boolean7 = statementConfiguration5.isMaxRowsSet();
        boolean boolean8 = statementConfiguration5.isMaxRowsSet();
        boolean boolean9 = statementConfiguration5.isQueryTimeoutSet();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 0, duration4);
        boolean boolean6 = statementConfiguration5.isMaxRowsSet();
        java.lang.Integer int7 = statementConfiguration5.getQueryTimeout();
        java.lang.Integer int8 = statementConfiguration5.getMaxFieldSize();
        boolean boolean9 = statementConfiguration5.isMaxRowsSet();
        java.lang.Integer int10 = statementConfiguration5.getMaxFieldSize();
        java.lang.Integer int11 = statementConfiguration5.getQueryTimeout();
        java.lang.Integer int12 = statementConfiguration5.getMaxFieldSize();
        java.lang.Integer int13 = statementConfiguration5.getMaxRows();
        boolean boolean14 = statementConfiguration5.isFetchDirectionSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.queryTimeout(duration11);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder10.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration24 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        boolean boolean25 = statementConfiguration24.isQueryTimeoutSet();
        boolean boolean26 = statementConfiguration24.isMaxRowsSet();
        java.time.Duration duration27 = statementConfiguration24.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration28 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 100, duration27);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder29 = builder10.queryTimeout(duration27);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration1 = builder0.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder3 = builder0.maxRows((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder5 = builder0.queryTimeout((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration6 = builder0.build();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration7 = builder0.build();
        org.junit.Assert.assertNotNull(statementConfiguration1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(statementConfiguration6);
        org.junit.Assert.assertNotNull(statementConfiguration7);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.queryTimeout(duration11);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.fetchSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder12.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder12.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder18.queryTimeout((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder18.maxFieldSize((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = builder4.build();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration6 = builder4.build();
        java.lang.Integer int7 = statementConfiguration6.getMaxRows();
        boolean boolean8 = statementConfiguration6.isFetchDirectionSet();
        java.lang.Integer int9 = statementConfiguration6.getQueryTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(statementConfiguration5);
        org.junit.Assert.assertNotNull(statementConfiguration6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, true, executorService8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        javax.sql.DataSource dataSource11 = asyncQueryRunner9.getDataSource();
        javax.sql.DataSource dataSource12 = asyncQueryRunner9.getDataSource();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.time.Duration duration18 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration19 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration18);
        boolean boolean20 = statementConfiguration19.isMaxFieldSizeSet();
        java.time.Duration duration21 = statementConfiguration19.getQueryTimeoutDuration();
        boolean boolean22 = statementConfiguration19.isFetchSizeSet();
        boolean boolean23 = statementConfiguration19.isMaxFieldSizeSet();
        boolean boolean24 = statementConfiguration19.isFetchDirectionSet();
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService26);
        java.sql.PreparedStatement preparedStatement28 = null;
        javax.sql.DataSource dataSource29 = null;
        java.util.concurrent.ExecutorService executorService31 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner32 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource29, true, executorService31);
        boolean boolean33 = asyncQueryRunner32.isPmdKnownBroken();
        javax.sql.DataSource dataSource34 = asyncQueryRunner32.getDataSource();
        java.sql.PreparedStatement preparedStatement35 = null;
        javax.sql.DataSource dataSource37 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource37, true, executorService39);
        boolean boolean41 = asyncQueryRunner40.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement42 = null;
        java.lang.Object obj43 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner40.fillStatementWithBean(preparedStatement42, obj43, propertyDescriptorArray44);
        asyncQueryRunner32.fillStatementWithBean(preparedStatement35, (java.lang.Object) 0, propertyDescriptorArray44);
        asyncQueryRunner27.fillStatement(preparedStatement28, (java.lang.Object[]) propertyDescriptorArray44);
        asyncQueryRunner9.fillStatementWithBean(preparedStatement13, (java.lang.Object) statementConfiguration19, propertyDescriptorArray44);
        asyncQueryRunner3.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray44);
        java.sql.Connection connection50 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture52 = asyncQueryRunner3.update(connection50, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray44);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray44, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 100, duration4);
        java.lang.Integer int6 = statementConfiguration5.getFetchDirection();
        java.lang.Integer int7 = statementConfiguration5.getMaxRows();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        boolean boolean7 = statementConfiguration5.isFetchSizeSet();
        java.lang.Integer int8 = statementConfiguration5.getFetchDirection();
        java.lang.Integer int9 = statementConfiguration5.getFetchSize();
        boolean boolean10 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int11 = statementConfiguration5.getMaxRows();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isQueryTimeoutSet();
        boolean boolean7 = statementConfiguration5.isMaxFieldSizeSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner3.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, false, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        javax.sql.DataSource dataSource20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource20, true, executorService22);
        boolean boolean24 = asyncQueryRunner23.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement25 = null;
        java.sql.ParameterMetaData parameterMetaData26 = null;
        javax.sql.DataSource dataSource27 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource27, true, executorService29);
        boolean boolean31 = asyncQueryRunner30.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement32 = null;
        java.lang.Object obj33 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner30.fillStatementWithBean(preparedStatement32, obj33, propertyDescriptorArray34);
        asyncQueryRunner23.fillStatement(preparedStatement25, parameterMetaData26, (java.lang.Object[]) propertyDescriptorArray34);
        asyncQueryRunner16.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray34);
        asyncQueryRunner3.fillStatement(preparedStatement12, (java.lang.Object[]) propertyDescriptorArray34);
        java.sql.PreparedStatement preparedStatement39 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder40 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder42 = builder40.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder44 = builder40.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder46 = builder44.maxRows((java.lang.Integer) 10);
        java.time.Duration duration47 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder48 = builder44.queryTimeout(duration47);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder50 = builder44.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder52 = builder50.fetchDirection((java.lang.Integer) 10);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement39, (java.lang.Object) 10, strArray53);
        boolean boolean55 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean56 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement57 = null;
        java.sql.ParameterMetaData parameterMetaData58 = asyncQueryRunner3.getParameterMetaData(preparedStatement57);
        javax.sql.DataSource dataSource59 = asyncQueryRunner3.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray34);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray34, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(parameterMetaData58);
        org.junit.Assert.assertNull(dataSource59);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner2.getDataSource();
        javax.sql.DataSource dataSource6 = asyncQueryRunner2.getDataSource();
        java.sql.Connection connection7 = null;
        javax.sql.DataSource dataSource9 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource9, false, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = null;
        javax.sql.DataSource dataSource16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource16, true, executorService18);
        boolean boolean20 = asyncQueryRunner19.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement21 = null;
        java.sql.ParameterMetaData parameterMetaData22 = null;
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, true, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement28 = null;
        java.lang.Object obj29 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner26.fillStatementWithBean(preparedStatement28, obj29, propertyDescriptorArray30);
        asyncQueryRunner19.fillStatement(preparedStatement21, parameterMetaData22, (java.lang.Object[]) propertyDescriptorArray30);
        asyncQueryRunner12.fillStatement(preparedStatement14, parameterMetaData15, (java.lang.Object[]) propertyDescriptorArray30);
        boolean boolean34 = asyncQueryRunner12.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement35 = null;
        java.sql.ParameterMetaData parameterMetaData36 = null;
        javax.sql.DataSource dataSource37 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource37, true, executorService39);
        boolean boolean41 = asyncQueryRunner40.isPmdKnownBroken();
        javax.sql.DataSource dataSource42 = asyncQueryRunner40.getDataSource();
        java.sql.PreparedStatement preparedStatement43 = null;
        javax.sql.DataSource dataSource45 = null;
        java.util.concurrent.ExecutorService executorService47 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner48 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource45, true, executorService47);
        boolean boolean49 = asyncQueryRunner48.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement50 = null;
        java.lang.Object obj51 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray52 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner48.fillStatementWithBean(preparedStatement50, obj51, propertyDescriptorArray52);
        asyncQueryRunner40.fillStatementWithBean(preparedStatement43, (java.lang.Object) 0, propertyDescriptorArray52);
        asyncQueryRunner12.fillStatement(preparedStatement35, parameterMetaData36, (java.lang.Object[]) propertyDescriptorArray52);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture56 = asyncQueryRunner2.update(connection7, "hi!", (java.lang.Object[]) propertyDescriptorArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray30);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray30, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray52);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray52, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        java.sql.PreparedStatement preparedStatement9 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService17);
        java.sql.PreparedStatement preparedStatement19 = null;
        javax.sql.DataSource dataSource20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource20, true, executorService22);
        boolean boolean24 = asyncQueryRunner23.isPmdKnownBroken();
        javax.sql.DataSource dataSource25 = asyncQueryRunner23.getDataSource();
        java.sql.PreparedStatement preparedStatement26 = null;
        javax.sql.DataSource dataSource28 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource28, true, executorService30);
        boolean boolean32 = asyncQueryRunner31.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement33 = null;
        java.lang.Object obj34 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner31.fillStatementWithBean(preparedStatement33, obj34, propertyDescriptorArray35);
        asyncQueryRunner23.fillStatementWithBean(preparedStatement26, (java.lang.Object) 0, propertyDescriptorArray35);
        asyncQueryRunner18.fillStatement(preparedStatement19, (java.lang.Object[]) propertyDescriptorArray35);
        asyncQueryRunner12.fillStatement(preparedStatement14, parameterMetaData15, (java.lang.Object[]) propertyDescriptorArray35);
        asyncQueryRunner3.fillStatement(preparedStatement9, (java.lang.Object[]) propertyDescriptorArray35);
        javax.sql.DataSource dataSource41 = asyncQueryRunner3.getDataSource();
        boolean boolean42 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean43 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean44 = asyncQueryRunner3.isPmdKnownBroken();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray35);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray35, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder4.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.maxFieldSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder13.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder13.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = builder17.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = builder19.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = builder21.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = builder23.maxFieldSize((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder26 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder28 = builder26.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder30 = builder26.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder32 = builder30.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder34 = builder30.queryTimeout((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = builder34.fetchDirection((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration37 = builder36.build();
        java.time.Duration duration38 = statementConfiguration37.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder39 = builder23.queryTimeout(duration38);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder40 = builder10.queryTimeout(duration38);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(statementConfiguration37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = builder10.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder10.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder10.queryTimeout((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder15.queryTimeout((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(statementConfiguration11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 0);
        java.time.Duration duration6 = statementConfiguration5.getQueryTimeoutDuration();
        java.lang.Integer int7 = statementConfiguration5.getFetchSize();
        java.lang.Integer int8 = statementConfiguration5.getMaxRows();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = builder4.build();
        java.time.Duration duration6 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder7 = builder4.queryTimeout(duration6);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder9 = builder4.fetchDirection((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder11 = builder9.fetchSize((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder11.fetchDirection((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(statementConfiguration5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isQueryTimeoutSet();
        boolean boolean7 = statementConfiguration5.isFetchDirectionSet();
        java.lang.Integer int8 = statementConfiguration5.getQueryTimeout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchDirection((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = builder6.build();
        java.lang.Integer int12 = statementConfiguration11.getMaxFieldSize();
        java.time.Duration duration13 = statementConfiguration11.getQueryTimeoutDuration();
        boolean boolean14 = statementConfiguration11.isQueryTimeoutSet();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(statementConfiguration11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 10);
        java.lang.Integer int6 = statementConfiguration5.getMaxRows();
        boolean boolean7 = statementConfiguration5.isMaxRowsSet();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = builder10.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder10.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder10.queryTimeout((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder16.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder20.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder24 = builder22.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder26 = builder24.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder28 = builder26.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration34 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
        java.time.Duration duration35 = statementConfiguration34.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = builder28.queryTimeout(duration35);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder10.queryTimeout(duration35);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder39 = builder10.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder41 = builder10.fetchDirection((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder43 = builder10.fetchDirection((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(statementConfiguration11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.queryTimeout(duration11);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder10.maxRows((java.lang.Integer) 10);
        java.time.Duration duration15 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder14.queryTimeout(duration15);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.fetchSize((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass19 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder8.fetchDirection((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.maxFieldSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder12.queryTimeout((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.fetchSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder18.fetchDirection((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, true, executorService8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.lang.Object obj12 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement11, obj12, propertyDescriptorArray13);
        javax.sql.DataSource dataSource15 = asyncQueryRunner9.getDataSource();
        javax.sql.DataSource dataSource16 = asyncQueryRunner9.getDataSource();
        java.sql.PreparedStatement preparedStatement17 = null;
        java.sql.ParameterMetaData parameterMetaData18 = null;
        javax.sql.DataSource dataSource19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource19, true, executorService21);
        boolean boolean23 = asyncQueryRunner22.isPmdKnownBroken();
        javax.sql.DataSource dataSource24 = asyncQueryRunner22.getDataSource();
        java.sql.PreparedStatement preparedStatement25 = null;
        javax.sql.DataSource dataSource27 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource27, true, executorService29);
        boolean boolean31 = asyncQueryRunner30.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement32 = null;
        java.lang.Object obj33 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner30.fillStatementWithBean(preparedStatement32, obj33, propertyDescriptorArray34);
        asyncQueryRunner22.fillStatementWithBean(preparedStatement25, (java.lang.Object) 0, propertyDescriptorArray34);
        asyncQueryRunner9.fillStatement(preparedStatement17, parameterMetaData18, (java.lang.Object[]) propertyDescriptorArray34);
        asyncQueryRunner3.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray34);
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        java.lang.Object[] objArray41 = new java.lang.Object[] {};
        java.lang.Object[] objArray42 = new java.lang.Object[] {};
        java.lang.Object[][] objArray43 = new java.lang.Object[][] { objArray40, objArray41, objArray42 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture44 = asyncQueryRunner3.batch("", objArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray13, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray34);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray34, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertArrayEquals(objArray40, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertArrayEquals(objArray41, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertArrayEquals(objArray42, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        java.sql.PreparedStatement preparedStatement9 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService17);
        java.sql.PreparedStatement preparedStatement19 = null;
        javax.sql.DataSource dataSource20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource20, true, executorService22);
        boolean boolean24 = asyncQueryRunner23.isPmdKnownBroken();
        javax.sql.DataSource dataSource25 = asyncQueryRunner23.getDataSource();
        java.sql.PreparedStatement preparedStatement26 = null;
        javax.sql.DataSource dataSource28 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource28, true, executorService30);
        boolean boolean32 = asyncQueryRunner31.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement33 = null;
        java.lang.Object obj34 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner31.fillStatementWithBean(preparedStatement33, obj34, propertyDescriptorArray35);
        asyncQueryRunner23.fillStatementWithBean(preparedStatement26, (java.lang.Object) 0, propertyDescriptorArray35);
        asyncQueryRunner18.fillStatement(preparedStatement19, (java.lang.Object[]) propertyDescriptorArray35);
        asyncQueryRunner12.fillStatement(preparedStatement14, parameterMetaData15, (java.lang.Object[]) propertyDescriptorArray35);
        asyncQueryRunner3.fillStatement(preparedStatement9, (java.lang.Object[]) propertyDescriptorArray35);
        java.sql.PreparedStatement preparedStatement41 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration47 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer int48 = statementConfiguration47.getFetchDirection();
        java.lang.Integer int49 = statementConfiguration47.getFetchDirection();
        boolean boolean50 = statementConfiguration47.isMaxRowsSet();
        boolean boolean51 = statementConfiguration47.isFetchSizeSet();
        java.lang.Integer int52 = statementConfiguration47.getFetchSize();
        boolean boolean53 = statementConfiguration47.isFetchSizeSet();
        javax.sql.DataSource dataSource54 = null;
        java.util.concurrent.ExecutorService executorService56 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner57 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource54, true, executorService56);
        boolean boolean58 = asyncQueryRunner57.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement59 = null;
        java.lang.Object obj60 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner57.fillStatementWithBean(preparedStatement59, obj60, propertyDescriptorArray61);
        javax.sql.DataSource dataSource63 = asyncQueryRunner57.getDataSource();
        javax.sql.DataSource dataSource64 = asyncQueryRunner57.getDataSource();
        java.sql.PreparedStatement preparedStatement65 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration71 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 100);
        javax.sql.DataSource dataSource72 = null;
        java.util.concurrent.ExecutorService executorService74 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner75 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource72, true, executorService74);
        boolean boolean76 = asyncQueryRunner75.isPmdKnownBroken();
        javax.sql.DataSource dataSource77 = asyncQueryRunner75.getDataSource();
        javax.sql.DataSource dataSource78 = asyncQueryRunner75.getDataSource();
        javax.sql.DataSource dataSource79 = asyncQueryRunner75.getDataSource();
        java.sql.PreparedStatement preparedStatement80 = null;
        java.time.Duration duration85 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration86 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration85);
        java.lang.String[] strArray87 = new java.lang.String[] {};
        asyncQueryRunner75.fillStatementWithBean(preparedStatement80, (java.lang.Object) 10, strArray87);
        asyncQueryRunner57.fillStatementWithBean(preparedStatement65, (java.lang.Object) statementConfiguration71, strArray87);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement41, (java.lang.Object) statementConfiguration47, strArray87);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray35);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray35, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray61);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray61, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource63);
        org.junit.Assert.assertNull(dataSource64);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(dataSource77);
        org.junit.Assert.assertNull(dataSource78);
        org.junit.Assert.assertNull(dataSource79);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] {});
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        boolean boolean8 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int9 = statementConfiguration5.getMaxRows();
        java.time.Duration duration10 = statementConfiguration5.getQueryTimeoutDuration();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(duration10);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.queryTimeout(duration11);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.fetchSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder12.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder12.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder18.maxFieldSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration21 = builder20.build();
        boolean boolean22 = statementConfiguration21.isQueryTimeoutSet();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(statementConfiguration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        java.time.Duration duration9 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.queryTimeout(duration9);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder8.queryTimeout(duration11);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.fetchDirection((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder14.maxFieldSize((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.maxRows((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.fetchDirection((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.fetchSize((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder10.queryTimeout((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.time.Duration duration7 = statementConfiguration5.getQueryTimeoutDuration();
        boolean boolean8 = statementConfiguration5.isFetchSizeSet();
        boolean boolean9 = statementConfiguration5.isMaxFieldSizeSet();
        boolean boolean10 = statementConfiguration5.isFetchDirectionSet();
        java.lang.Integer int11 = statementConfiguration5.getQueryTimeout();
        java.time.Duration duration12 = statementConfiguration5.getQueryTimeoutDuration();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(duration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(duration12);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner2.getDataSource();
        java.sql.Connection connection6 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, true, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        javax.sql.DataSource dataSource13 = asyncQueryRunner11.getDataSource();
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = asyncQueryRunner11.getParameterMetaData(preparedStatement14);
        boolean boolean16 = asyncQueryRunner11.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement17 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder18.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder20.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration23 = builder22.build();
        java.time.Duration duration24 = statementConfiguration23.getQueryTimeoutDuration();
        javax.sql.DataSource dataSource25 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource25, true, executorService27);
        boolean boolean29 = asyncQueryRunner28.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement30 = null;
        java.lang.Object obj31 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner28.fillStatementWithBean(preparedStatement30, obj31, propertyDescriptorArray32);
        javax.sql.DataSource dataSource34 = asyncQueryRunner28.getDataSource();
        javax.sql.DataSource dataSource35 = asyncQueryRunner28.getDataSource();
        java.sql.PreparedStatement preparedStatement36 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration42 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 100);
        javax.sql.DataSource dataSource43 = null;
        java.util.concurrent.ExecutorService executorService45 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner46 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource43, true, executorService45);
        boolean boolean47 = asyncQueryRunner46.isPmdKnownBroken();
        javax.sql.DataSource dataSource48 = asyncQueryRunner46.getDataSource();
        javax.sql.DataSource dataSource49 = asyncQueryRunner46.getDataSource();
        javax.sql.DataSource dataSource50 = asyncQueryRunner46.getDataSource();
        java.sql.PreparedStatement preparedStatement51 = null;
        java.time.Duration duration56 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration57 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration56);
        java.lang.String[] strArray58 = new java.lang.String[] {};
        asyncQueryRunner46.fillStatementWithBean(preparedStatement51, (java.lang.Object) 10, strArray58);
        asyncQueryRunner28.fillStatementWithBean(preparedStatement36, (java.lang.Object) statementConfiguration42, strArray58);
        asyncQueryRunner11.fillStatementWithBean(preparedStatement17, (java.lang.Object) statementConfiguration23, strArray58);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture62 = asyncQueryRunner2.update(connection6, "", (java.lang.Object[]) strArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(parameterMetaData15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(statementConfiguration23);
        org.junit.Assert.assertNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray32);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray32, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertNull(dataSource35);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(dataSource48);
        org.junit.Assert.assertNull(dataSource49);
        org.junit.Assert.assertNull(dataSource50);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] {});
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.queryTimeout((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.queryTimeout(duration11);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.fetchSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder12.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder12.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder18.maxFieldSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration21 = builder20.build();
        boolean boolean22 = statementConfiguration21.isFetchSizeSet();
        java.lang.Class<?> wildcardClass23 = statementConfiguration21.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(statementConfiguration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxRows();
        boolean boolean8 = statementConfiguration5.isFetchDirectionSet();
        boolean boolean9 = statementConfiguration5.isQueryTimeoutSet();
        java.lang.Integer int10 = statementConfiguration5.getQueryTimeout();
        boolean boolean11 = statementConfiguration5.isQueryTimeoutSet();
        java.lang.Integer int12 = statementConfiguration5.getQueryTimeout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource10 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        javax.sql.DataSource dataSource18 = asyncQueryRunner16.getDataSource();
        java.sql.PreparedStatement preparedStatement19 = null;
        javax.sql.DataSource dataSource21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource21, true, executorService23);
        boolean boolean25 = asyncQueryRunner24.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement26 = null;
        java.lang.Object obj27 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner24.fillStatementWithBean(preparedStatement26, obj27, propertyDescriptorArray28);
        asyncQueryRunner16.fillStatementWithBean(preparedStatement19, (java.lang.Object) 0, propertyDescriptorArray28);
        asyncQueryRunner3.fillStatement(preparedStatement11, parameterMetaData12, (java.lang.Object[]) propertyDescriptorArray28);
        boolean boolean32 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement33 = null;
        java.sql.ParameterMetaData parameterMetaData34 = null;
        java.util.concurrent.ExecutorService executorService36 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner37 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService36);
        java.sql.PreparedStatement preparedStatement38 = null;
        javax.sql.DataSource dataSource39 = null;
        java.util.concurrent.ExecutorService executorService41 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource39, true, executorService41);
        boolean boolean43 = asyncQueryRunner42.isPmdKnownBroken();
        javax.sql.DataSource dataSource44 = asyncQueryRunner42.getDataSource();
        java.sql.PreparedStatement preparedStatement45 = null;
        javax.sql.DataSource dataSource47 = null;
        java.util.concurrent.ExecutorService executorService49 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner50 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource47, true, executorService49);
        boolean boolean51 = asyncQueryRunner50.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement52 = null;
        java.lang.Object obj53 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner50.fillStatementWithBean(preparedStatement52, obj53, propertyDescriptorArray54);
        asyncQueryRunner42.fillStatementWithBean(preparedStatement45, (java.lang.Object) 0, propertyDescriptorArray54);
        asyncQueryRunner37.fillStatement(preparedStatement38, (java.lang.Object[]) propertyDescriptorArray54);
        asyncQueryRunner3.fillStatement(preparedStatement33, parameterMetaData34, (java.lang.Object[]) propertyDescriptorArray54);
        javax.sql.DataSource dataSource59 = asyncQueryRunner3.getDataSource();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder61 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder63 = builder61.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder65 = builder61.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder67 = builder65.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder69 = builder65.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration70 = builder69.build();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration71 = builder69.build();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration77 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration78 = statementConfiguration77.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder79 = builder69.queryTimeout(duration78);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture80 = asyncQueryRunner3.update("hi!", (java.lang.Object) builder79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(dataSource44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray54);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray54, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource59);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(statementConfiguration70);
        org.junit.Assert.assertNotNull(statementConfiguration71);
        org.junit.Assert.assertNotNull(duration78);
        org.junit.Assert.assertNotNull(builder79);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxRows();
        boolean boolean8 = statementConfiguration5.isFetchDirectionSet();
        boolean boolean9 = statementConfiguration5.isMaxRowsSet();
        boolean boolean10 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int11 = statementConfiguration5.getQueryTimeout();
        boolean boolean12 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int13 = statementConfiguration5.getMaxFieldSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 10);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder8.queryTimeout(duration11);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder8.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder15.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = builder15.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = builder19.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = builder21.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = builder21.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration26 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = builder25.queryTimeout(duration26);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder29 = builder25.maxRows((java.lang.Integer) 10);
        java.time.Duration duration30 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder31 = builder29.queryTimeout(duration30);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration32 = builder29.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder33 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder35 = builder33.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder33.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder39 = builder33.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder41 = builder33.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder42 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder44 = builder42.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder46 = builder42.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder48 = builder46.maxRows((java.lang.Integer) 10);
        java.time.Duration duration49 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder50 = builder48.queryTimeout(duration49);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration56 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration57 = statementConfiguration56.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder58 = builder50.queryTimeout(duration57);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder59 = builder41.queryTimeout(duration57);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder60 = builder29.queryTimeout(duration57);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder61 = builder14.queryTimeout(duration57);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder62 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder64 = builder62.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder66 = builder62.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder68 = builder66.fetchSize((java.lang.Integer) 10);
        java.time.Duration duration69 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder70 = builder68.queryTimeout(duration69);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder72 = builder70.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration78 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration79 = statementConfiguration78.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder80 = builder70.queryTimeout(duration79);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder81 = builder61.queryTimeout(duration79);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration82 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 1, duration79);
        boolean boolean83 = statementConfiguration82.isFetchSizeSet();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(statementConfiguration32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchDirection((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass11 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = builder10.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder10.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration14 = builder13.build();
        java.time.Duration duration15 = statementConfiguration14.getQueryTimeoutDuration();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(statementConfiguration11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(statementConfiguration14);
        org.junit.Assert.assertNull(duration15);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder2.maxFieldSize((java.lang.Integer) 100);
        java.time.Duration duration5 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder2.queryTimeout(duration5);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxFieldSize((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration9 = builder6.build();
        java.lang.Integer int10 = statementConfiguration9.getMaxFieldSize();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(statementConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        boolean boolean8 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = asyncQueryRunner3.getParameterMetaData(preparedStatement9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(parameterMetaData10);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration14 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration15 = statementConfiguration14.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder8.queryTimeout(duration15);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.fetchDirection((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder16.queryTimeout((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder10.maxFieldSize((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder10.queryTimeout((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = builder21.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = builder21.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = builder25.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder29 = builder25.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration35 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
        java.time.Duration duration36 = statementConfiguration35.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder25.queryTimeout(duration36);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration38 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 10, duration36);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder39 = builder16.queryTimeout(duration36);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder41 = builder39.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder46 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder48 = builder46.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder50 = builder46.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder52 = builder50.maxRows((java.lang.Integer) 10);
        java.time.Duration duration53 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder54 = builder50.queryTimeout(duration53);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder56 = builder50.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder58 = builder56.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder60 = builder56.fetchDirection((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder61 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder63 = builder61.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder65 = builder61.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder67 = builder65.maxRows((java.lang.Integer) 10);
        java.time.Duration duration68 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder69 = builder65.queryTimeout(duration68);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder70 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder72 = builder70.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder74 = builder70.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder76 = builder74.maxRows((java.lang.Integer) 10);
        java.time.Duration duration77 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder78 = builder76.queryTimeout(duration77);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration84 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration85 = statementConfiguration84.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder86 = builder78.queryTimeout(duration85);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder87 = builder69.queryTimeout(duration85);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder88 = builder56.queryTimeout(duration85);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration89 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) (-1), duration85);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder90 = builder41.queryTimeout(duration85);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(duration85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder90);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchDirection((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.fetchDirection((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder8.fetchSize((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder8.queryTimeout((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass13 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, true, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.lang.Object obj14 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner11.fillStatementWithBean(preparedStatement13, obj14, propertyDescriptorArray15);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement6, (java.lang.Object) 0, propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = asyncQueryRunner3.getParameterMetaData(preparedStatement18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.sql.ParameterMetaData parameterMetaData21 = asyncQueryRunner3.getParameterMetaData(preparedStatement20);
        boolean boolean22 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean23 = asyncQueryRunner3.isPmdKnownBroken();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = builder25.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder29 = builder25.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder31 = builder29.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder33 = builder29.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration39 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
        java.time.Duration duration40 = statementConfiguration39.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder41 = builder29.queryTimeout(duration40);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder43 = builder29.maxFieldSize((java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture44 = asyncQueryRunner3.update("", (java.lang.Object) builder43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData19);
        org.junit.Assert.assertNull(parameterMetaData21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) (-1), duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        boolean boolean8 = statementConfiguration5.isMaxRowsSet();
        boolean boolean9 = statementConfiguration5.isMaxFieldSizeSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        boolean boolean8 = statementConfiguration5.isFetchSizeSet();
        java.time.Duration duration9 = statementConfiguration5.getQueryTimeoutDuration();
        java.lang.Integer int10 = statementConfiguration5.getFetchSize();
        java.lang.Integer int11 = statementConfiguration5.getFetchDirection();
        boolean boolean12 = statementConfiguration5.isMaxFieldSizeSet();
        boolean boolean13 = statementConfiguration5.isFetchDirectionSet();
        java.lang.Integer int14 = statementConfiguration5.getQueryTimeout();
        boolean boolean15 = statementConfiguration5.isMaxRowsSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(duration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration13 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
        java.time.Duration duration14 = statementConfiguration13.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration15 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 100, duration14);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration16 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 100, duration14);
        java.lang.Integer int17 = statementConfiguration16.getMaxFieldSize();
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = builder10.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder10.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder10.queryTimeout((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder16.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder20.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder24 = builder22.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder26 = builder24.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder28 = builder26.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration34 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
        java.time.Duration duration35 = statementConfiguration34.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = builder28.queryTimeout(duration35);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder10.queryTimeout(duration35);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder39 = builder37.maxRows((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder41 = builder37.maxRows((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(statementConfiguration11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource10 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        javax.sql.DataSource dataSource18 = asyncQueryRunner16.getDataSource();
        java.sql.PreparedStatement preparedStatement19 = null;
        javax.sql.DataSource dataSource21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource21, true, executorService23);
        boolean boolean25 = asyncQueryRunner24.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement26 = null;
        java.lang.Object obj27 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner24.fillStatementWithBean(preparedStatement26, obj27, propertyDescriptorArray28);
        asyncQueryRunner16.fillStatementWithBean(preparedStatement19, (java.lang.Object) 0, propertyDescriptorArray28);
        asyncQueryRunner3.fillStatement(preparedStatement11, parameterMetaData12, (java.lang.Object[]) propertyDescriptorArray28);
        boolean boolean32 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement33 = null;
        java.lang.Object[] objArray34 = null;
        asyncQueryRunner3.fillStatement(preparedStatement33, objArray34);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture37 = asyncQueryRunner3.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.queryTimeout(duration11);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.fetchSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder12.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration17 = builder12.build();
        boolean boolean18 = statementConfiguration17.isFetchDirectionSet();
        boolean boolean19 = statementConfiguration17.isMaxFieldSizeSet();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(statementConfiguration17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 100, duration4);
        boolean boolean6 = statementConfiguration5.isMaxRowsSet();
        boolean boolean7 = statementConfiguration5.isMaxFieldSizeSet();
        java.time.Duration duration8 = statementConfiguration5.getQueryTimeoutDuration();
        boolean boolean9 = statementConfiguration5.isMaxFieldSizeSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(duration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 100);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        boolean boolean8 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean9 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource10 = asyncQueryRunner3.getDataSource();
        boolean boolean11 = asyncQueryRunner3.isPmdKnownBroken();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        boolean boolean5 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement6 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder7 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder9 = builder7.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder11 = builder7.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder11.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder13.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder15.fetchDirection((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = builder17.fetchSize((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = builder17.maxFieldSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = builder21.queryTimeout((java.lang.Integer) 0);
        javax.sql.DataSource dataSource24 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource24, true, executorService26);
        boolean boolean28 = asyncQueryRunner27.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement29 = null;
        java.lang.Object obj30 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner27.fillStatementWithBean(preparedStatement29, obj30, propertyDescriptorArray31);
        javax.sql.DataSource dataSource33 = asyncQueryRunner27.getDataSource();
        javax.sql.DataSource dataSource34 = asyncQueryRunner27.getDataSource();
        java.sql.PreparedStatement preparedStatement35 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration41 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 100);
        javax.sql.DataSource dataSource42 = null;
        java.util.concurrent.ExecutorService executorService44 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner45 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource42, true, executorService44);
        boolean boolean46 = asyncQueryRunner45.isPmdKnownBroken();
        javax.sql.DataSource dataSource47 = asyncQueryRunner45.getDataSource();
        javax.sql.DataSource dataSource48 = asyncQueryRunner45.getDataSource();
        javax.sql.DataSource dataSource49 = asyncQueryRunner45.getDataSource();
        java.sql.PreparedStatement preparedStatement50 = null;
        java.time.Duration duration55 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration56 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration55);
        java.lang.String[] strArray57 = new java.lang.String[] {};
        asyncQueryRunner45.fillStatementWithBean(preparedStatement50, (java.lang.Object) 10, strArray57);
        asyncQueryRunner27.fillStatementWithBean(preparedStatement35, (java.lang.Object) statementConfiguration41, strArray57);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement6, (java.lang.Object) builder21, strArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray31);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray31, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(dataSource47);
        org.junit.Assert.assertNull(dataSource48);
        org.junit.Assert.assertNull(dataSource49);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] {});
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner3.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = asyncQueryRunner3.getParameterMetaData(preparedStatement12);
        java.sql.PreparedStatement preparedStatement14 = null;
        javax.sql.DataSource dataSource15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource15, true, executorService17);
        boolean boolean19 = asyncQueryRunner18.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement20 = null;
        java.lang.Object obj21 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner18.fillStatementWithBean(preparedStatement20, obj21, propertyDescriptorArray22);
        javax.sql.DataSource dataSource24 = asyncQueryRunner18.getDataSource();
        java.sql.PreparedStatement preparedStatement25 = null;
        javax.sql.DataSource dataSource26 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource26, executorService27);
        javax.sql.DataSource dataSource29 = asyncQueryRunner28.getDataSource();
        java.sql.PreparedStatement preparedStatement30 = null;
        java.sql.ParameterMetaData parameterMetaData31 = null;
        javax.sql.DataSource dataSource32 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource32, true, executorService34);
        java.sql.PreparedStatement preparedStatement36 = null;
        java.sql.ParameterMetaData parameterMetaData37 = null;
        javax.sql.DataSource dataSource38 = null;
        java.util.concurrent.ExecutorService executorService40 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner41 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource38, true, executorService40);
        boolean boolean42 = asyncQueryRunner41.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement43 = null;
        java.lang.Object obj44 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner41.fillStatementWithBean(preparedStatement43, obj44, propertyDescriptorArray45);
        javax.sql.DataSource dataSource47 = asyncQueryRunner41.getDataSource();
        javax.sql.DataSource dataSource48 = asyncQueryRunner41.getDataSource();
        java.sql.PreparedStatement preparedStatement49 = null;
        java.sql.ParameterMetaData parameterMetaData50 = null;
        javax.sql.DataSource dataSource51 = null;
        java.util.concurrent.ExecutorService executorService53 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner54 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource51, true, executorService53);
        boolean boolean55 = asyncQueryRunner54.isPmdKnownBroken();
        javax.sql.DataSource dataSource56 = asyncQueryRunner54.getDataSource();
        java.sql.PreparedStatement preparedStatement57 = null;
        javax.sql.DataSource dataSource59 = null;
        java.util.concurrent.ExecutorService executorService61 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner62 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource59, true, executorService61);
        boolean boolean63 = asyncQueryRunner62.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement64 = null;
        java.lang.Object obj65 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray66 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner62.fillStatementWithBean(preparedStatement64, obj65, propertyDescriptorArray66);
        asyncQueryRunner54.fillStatementWithBean(preparedStatement57, (java.lang.Object) 0, propertyDescriptorArray66);
        asyncQueryRunner41.fillStatement(preparedStatement49, parameterMetaData50, (java.lang.Object[]) propertyDescriptorArray66);
        java.sql.PreparedStatement preparedStatement70 = null;
        javax.sql.DataSource dataSource71 = null;
        java.util.concurrent.ExecutorService executorService73 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner74 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource71, true, executorService73);
        boolean boolean75 = asyncQueryRunner74.isPmdKnownBroken();
        javax.sql.DataSource dataSource76 = asyncQueryRunner74.getDataSource();
        java.sql.PreparedStatement preparedStatement77 = null;
        javax.sql.DataSource dataSource79 = null;
        java.util.concurrent.ExecutorService executorService81 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner82 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource79, true, executorService81);
        boolean boolean83 = asyncQueryRunner82.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement84 = null;
        java.lang.Object obj85 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray86 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner82.fillStatementWithBean(preparedStatement84, obj85, propertyDescriptorArray86);
        asyncQueryRunner74.fillStatementWithBean(preparedStatement77, (java.lang.Object) 0, propertyDescriptorArray86);
        asyncQueryRunner41.fillStatement(preparedStatement70, (java.lang.Object[]) propertyDescriptorArray86);
        asyncQueryRunner35.fillStatement(preparedStatement36, parameterMetaData37, (java.lang.Object[]) propertyDescriptorArray86);
        asyncQueryRunner28.fillStatement(preparedStatement30, parameterMetaData31, (java.lang.Object[]) propertyDescriptorArray86);
        asyncQueryRunner18.fillStatement(preparedStatement25, (java.lang.Object[]) propertyDescriptorArray86);
        asyncQueryRunner3.fillStatement(preparedStatement14, (java.lang.Object[]) propertyDescriptorArray86);
        boolean boolean94 = asyncQueryRunner3.isPmdKnownBroken();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNull(parameterMetaData13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray22, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray45);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray45, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource47);
        org.junit.Assert.assertNull(dataSource48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(dataSource56);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray66);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray66, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(dataSource76);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray86);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray86, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 10);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder8.queryTimeout(duration11);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder8.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder15.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = builder15.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = builder19.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = builder21.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = builder21.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration26 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = builder25.queryTimeout(duration26);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder29 = builder25.maxRows((java.lang.Integer) 10);
        java.time.Duration duration30 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder31 = builder29.queryTimeout(duration30);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration32 = builder29.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder33 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder35 = builder33.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder33.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder39 = builder33.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder41 = builder33.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder42 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder44 = builder42.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder46 = builder42.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder48 = builder46.maxRows((java.lang.Integer) 10);
        java.time.Duration duration49 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder50 = builder48.queryTimeout(duration49);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration56 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration57 = statementConfiguration56.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder58 = builder50.queryTimeout(duration57);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder59 = builder41.queryTimeout(duration57);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder60 = builder29.queryTimeout(duration57);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder61 = builder14.queryTimeout(duration57);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration62 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, duration57);
        java.lang.Integer int63 = statementConfiguration62.getFetchSize();
        java.lang.Integer int64 = statementConfiguration62.getFetchDirection();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(statementConfiguration32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration9 = builder4.build();
        boolean boolean10 = statementConfiguration9.isFetchSizeSet();
        boolean boolean11 = statementConfiguration9.isQueryTimeoutSet();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(statementConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 100);
        java.lang.Integer int6 = statementConfiguration5.getFetchDirection();
        java.lang.Integer int7 = statementConfiguration5.getFetchDirection();
        boolean boolean8 = statementConfiguration5.isMaxRowsSet();
        boolean boolean9 = statementConfiguration5.isFetchSizeSet();
        java.lang.Integer int10 = statementConfiguration5.getFetchSize();
        boolean boolean11 = statementConfiguration5.isFetchSizeSet();
        java.lang.Integer int12 = statementConfiguration5.getFetchDirection();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 10);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getQueryTimeout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 10);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder8.queryTimeout(duration11);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder8.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = builder19.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = builder19.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = builder23.maxRows((java.lang.Integer) 10);
        java.time.Duration duration26 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = builder25.queryTimeout(duration26);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder29 = builder27.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration30 = builder29.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder32 = builder29.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder34 = builder29.queryTimeout((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder35 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder35.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder39 = builder35.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder41 = builder39.maxRows((java.lang.Integer) 10);
        java.time.Duration duration42 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder43 = builder41.queryTimeout(duration42);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration49 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration50 = statementConfiguration49.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder51 = builder43.queryTimeout(duration50);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder52 = builder34.queryTimeout(duration50);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration53 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, duration50);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder54 = builder8.queryTimeout(duration50);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration60 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 0);
        java.time.Duration duration61 = statementConfiguration60.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder62 = builder8.queryTimeout(duration61);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration63 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 1, duration61);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(statementConfiguration30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(builder62);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder4.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder15.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = builder15.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = builder19.maxRows((java.lang.Integer) 10);
        java.time.Duration duration22 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = builder21.queryTimeout(duration22);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = builder23.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration26 = builder25.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder28 = builder25.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder30 = builder25.queryTimeout((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder31 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder33 = builder31.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder35 = builder31.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder35.maxRows((java.lang.Integer) 10);
        java.time.Duration duration38 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder39 = builder37.queryTimeout(duration38);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration45 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration46 = statementConfiguration45.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder47 = builder39.queryTimeout(duration46);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder48 = builder30.queryTimeout(duration46);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration49 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, duration46);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder50 = builder4.queryTimeout(duration46);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration56 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 0);
        java.time.Duration duration57 = statementConfiguration56.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder58 = builder4.queryTimeout(duration57);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder60 = builder58.fetchSize((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(statementConfiguration26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 100, duration4);
        boolean boolean6 = statementConfiguration5.isMaxRowsSet();
        java.time.Duration duration7 = statementConfiguration5.getQueryTimeoutDuration();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(duration7);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = builder10.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder10.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration14 = builder13.build();
        java.lang.Integer int15 = statementConfiguration14.getFetchSize();
        java.lang.Integer int16 = statementConfiguration14.getFetchDirection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(statementConfiguration11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(statementConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(int16);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration9 = builder4.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder11 = builder4.fetchDirection((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder11.fetchDirection((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(statementConfiguration9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        boolean boolean8 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean9 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner3.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement18 = null;
        java.lang.Object obj19 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner16.fillStatementWithBean(preparedStatement18, obj19, propertyDescriptorArray20);
        javax.sql.DataSource dataSource22 = asyncQueryRunner16.getDataSource();
        javax.sql.DataSource dataSource23 = asyncQueryRunner16.getDataSource();
        java.sql.PreparedStatement preparedStatement24 = null;
        java.sql.ParameterMetaData parameterMetaData25 = null;
        javax.sql.DataSource dataSource26 = null;
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource26, true, executorService28);
        boolean boolean30 = asyncQueryRunner29.isPmdKnownBroken();
        javax.sql.DataSource dataSource31 = asyncQueryRunner29.getDataSource();
        java.sql.PreparedStatement preparedStatement32 = null;
        javax.sql.DataSource dataSource34 = null;
        java.util.concurrent.ExecutorService executorService36 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner37 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource34, true, executorService36);
        boolean boolean38 = asyncQueryRunner37.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement39 = null;
        java.lang.Object obj40 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray41 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner37.fillStatementWithBean(preparedStatement39, obj40, propertyDescriptorArray41);
        asyncQueryRunner29.fillStatementWithBean(preparedStatement32, (java.lang.Object) 0, propertyDescriptorArray41);
        asyncQueryRunner16.fillStatement(preparedStatement24, parameterMetaData25, (java.lang.Object[]) propertyDescriptorArray41);
        asyncQueryRunner3.fillStatement(preparedStatement12, (java.lang.Object[]) propertyDescriptorArray41);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture47 = asyncQueryRunner3.update("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray20, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray41);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray41, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder4.queryTimeout((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder0.fetchSize((java.lang.Integer) (-1));
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder9 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder11 = builder9.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder9.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder13.maxRows((java.lang.Integer) 10);
        java.time.Duration duration16 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder13.queryTimeout(duration16);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = builder13.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = builder19.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = builder19.fetchDirection((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder24 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder26 = builder24.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder28 = builder24.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder30 = builder28.maxRows((java.lang.Integer) 10);
        java.time.Duration duration31 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder32 = builder28.queryTimeout(duration31);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder33 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder35 = builder33.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder33.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder39 = builder37.maxRows((java.lang.Integer) 10);
        java.time.Duration duration40 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder41 = builder39.queryTimeout(duration40);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration47 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration48 = statementConfiguration47.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder49 = builder41.queryTimeout(duration48);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder50 = builder32.queryTimeout(duration48);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder51 = builder19.queryTimeout(duration48);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder52 = builder8.queryTimeout(duration48);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder54 = builder52.maxFieldSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder56 = builder54.maxFieldSize((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder58 = builder54.fetchDirection((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource10 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration17 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 100);
        javax.sql.DataSource dataSource18 = null;
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource18, true, executorService20);
        boolean boolean22 = asyncQueryRunner21.isPmdKnownBroken();
        javax.sql.DataSource dataSource23 = asyncQueryRunner21.getDataSource();
        javax.sql.DataSource dataSource24 = asyncQueryRunner21.getDataSource();
        javax.sql.DataSource dataSource25 = asyncQueryRunner21.getDataSource();
        java.sql.PreparedStatement preparedStatement26 = null;
        java.time.Duration duration31 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration32 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration31);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        asyncQueryRunner21.fillStatementWithBean(preparedStatement26, (java.lang.Object) 10, strArray33);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement11, (java.lang.Object) statementConfiguration17, strArray33);
        java.sql.PreparedStatement preparedStatement36 = null;
        java.sql.ParameterMetaData parameterMetaData37 = asyncQueryRunner3.getParameterMetaData(preparedStatement36);
        javax.sql.DataSource dataSource38 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement39 = null;
        java.sql.ParameterMetaData parameterMetaData40 = null;
        java.lang.Object[] objArray41 = new java.lang.Object[] {};
        asyncQueryRunner3.fillStatement(preparedStatement39, parameterMetaData40, objArray41);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertNull(parameterMetaData37);
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertArrayEquals(objArray41, new java.lang.Object[] {});
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1));
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getFetchDirection();
        java.lang.Class<?> wildcardClass8 = statementConfiguration5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource10 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        javax.sql.DataSource dataSource18 = asyncQueryRunner16.getDataSource();
        java.sql.PreparedStatement preparedStatement19 = null;
        javax.sql.DataSource dataSource21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource21, true, executorService23);
        boolean boolean25 = asyncQueryRunner24.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement26 = null;
        java.lang.Object obj27 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner24.fillStatementWithBean(preparedStatement26, obj27, propertyDescriptorArray28);
        asyncQueryRunner16.fillStatementWithBean(preparedStatement19, (java.lang.Object) 0, propertyDescriptorArray28);
        asyncQueryRunner3.fillStatement(preparedStatement11, parameterMetaData12, (java.lang.Object[]) propertyDescriptorArray28);
        javax.sql.DataSource dataSource32 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement33 = null;
        java.sql.ParameterMetaData parameterMetaData34 = asyncQueryRunner3.getParameterMetaData(preparedStatement33);
        javax.sql.DataSource dataSource35 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement36 = null;
        java.lang.Object[] objArray37 = null;
        asyncQueryRunner3.fillStatement(preparedStatement36, objArray37);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertNull(parameterMetaData34);
        org.junit.Assert.assertNull(dataSource35);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder6.fetchDirection((java.lang.Integer) 100);
        java.time.Duration duration11 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder10.queryTimeout(duration11);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.fetchSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder12.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder12.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder18.maxFieldSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder18.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration23 = builder22.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(statementConfiguration23);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration9 = builder8.build();
        java.time.Duration duration10 = statementConfiguration9.getQueryTimeoutDuration();
        boolean boolean11 = statementConfiguration9.isQueryTimeoutSet();
        java.lang.Integer int12 = statementConfiguration9.getMaxFieldSize();
        java.lang.Integer int13 = statementConfiguration9.getMaxRows();
        boolean boolean14 = statementConfiguration9.isMaxFieldSizeSet();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(statementConfiguration9);
        org.junit.Assert.assertNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder0.fetchSize((java.lang.Integer) (-1));
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder9 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder11 = builder9.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder9.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder13.maxRows((java.lang.Integer) 10);
        java.time.Duration duration16 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder13.queryTimeout(duration16);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = builder13.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = builder19.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = builder19.fetchDirection((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder24 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder26 = builder24.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder28 = builder24.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder30 = builder28.maxRows((java.lang.Integer) 10);
        java.time.Duration duration31 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder32 = builder28.queryTimeout(duration31);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder33 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder35 = builder33.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder33.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder39 = builder37.maxRows((java.lang.Integer) 10);
        java.time.Duration duration40 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder41 = builder39.queryTimeout(duration40);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration47 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration48 = statementConfiguration47.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder49 = builder41.queryTimeout(duration48);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder50 = builder32.queryTimeout(duration48);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder51 = builder19.queryTimeout(duration48);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder52 = builder8.queryTimeout(duration48);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder54 = builder52.maxFieldSize((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder4.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder4.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder12.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration17 = builder12.build();
        java.lang.Integer int18 = statementConfiguration17.getMaxRows();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(statementConfiguration17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.maxRows((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.queryTimeout((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder8.queryTimeout((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.maxFieldSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration20 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
        java.time.Duration duration21 = statementConfiguration20.getQueryTimeoutDuration();
        boolean boolean22 = statementConfiguration20.isMaxRowsSet();
        boolean boolean23 = statementConfiguration20.isMaxRowsSet();
        java.time.Duration duration24 = statementConfiguration20.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = builder12.queryTimeout(duration24);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = builder25.fetchSize((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxRows((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxFieldSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder8.queryTimeout((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration13 = builder12.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(statementConfiguration13);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder0.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder0.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.fetchSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder11 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder11.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder15 = builder11.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = builder15.maxRows((java.lang.Integer) 10);
        java.time.Duration duration18 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = builder17.queryTimeout(duration18);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration25 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration26 = statementConfiguration25.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = builder19.queryTimeout(duration26);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder28 = builder10.queryTimeout(duration26);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder30 = builder10.fetchDirection((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration9 = builder4.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(statementConfiguration9);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        boolean boolean8 = statementConfiguration5.isFetchSizeSet();
        boolean boolean9 = statementConfiguration5.isMaxFieldSizeSet();
        boolean boolean10 = statementConfiguration5.isFetchSizeSet();
        java.time.Duration duration11 = statementConfiguration5.getQueryTimeoutDuration();
        java.lang.Integer int12 = statementConfiguration5.getFetchSize();
        boolean boolean13 = statementConfiguration5.isQueryTimeoutSet();
        boolean boolean14 = statementConfiguration5.isMaxRowsSet();
        boolean boolean15 = statementConfiguration5.isQueryTimeoutSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(duration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        boolean boolean8 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        java.sql.Connection connection10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture12 = asyncQueryRunner3.update(connection10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 10);
        java.time.Duration duration7 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.queryTimeout(duration7);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.maxRows((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder8.fetchSize((java.lang.Integer) 0);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder17 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder19 = builder17.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder21 = builder17.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = builder21.maxRows((java.lang.Integer) 10);
        java.time.Duration duration24 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = builder23.queryTimeout(duration24);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = builder25.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration28 = builder27.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder30 = builder27.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder32 = builder27.queryTimeout((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder33 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder35 = builder33.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder37 = builder33.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder39 = builder37.maxRows((java.lang.Integer) 10);
        java.time.Duration duration40 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder41 = builder39.queryTimeout(duration40);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration47 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration48 = statementConfiguration47.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder49 = builder41.queryTimeout(duration48);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder50 = builder32.queryTimeout(duration48);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration51 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 100, duration48);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder52 = builder8.queryTimeout(duration48);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(statementConfiguration28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = asyncQueryRunner3.getParameterMetaData(preparedStatement5);
        java.sql.PreparedStatement preparedStatement7 = null;
        java.time.Duration duration12 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration13 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 100, duration12);
        java.lang.Integer int14 = statementConfiguration13.getFetchDirection();
        java.lang.Integer int15 = statementConfiguration13.getMaxRows();
        java.lang.Integer int16 = statementConfiguration13.getMaxRows();
        java.lang.Integer int17 = statementConfiguration13.getQueryTimeout();
        java.lang.Integer int18 = statementConfiguration13.getFetchDirection();
        javax.sql.DataSource dataSource19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource19, true, executorService21);
        boolean boolean23 = asyncQueryRunner22.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement24 = null;
        java.lang.Object obj25 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement24, obj25, propertyDescriptorArray26);
        javax.sql.DataSource dataSource28 = asyncQueryRunner22.getDataSource();
        java.sql.PreparedStatement preparedStatement29 = null;
        java.sql.ParameterMetaData parameterMetaData30 = asyncQueryRunner22.getParameterMetaData(preparedStatement29);
        java.sql.PreparedStatement preparedStatement31 = null;
        javax.sql.DataSource dataSource32 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource32, false, executorService34);
        boolean boolean36 = asyncQueryRunner35.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement37 = null;
        java.sql.ParameterMetaData parameterMetaData38 = null;
        javax.sql.DataSource dataSource39 = null;
        java.util.concurrent.ExecutorService executorService41 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource39, true, executorService41);
        boolean boolean43 = asyncQueryRunner42.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement44 = null;
        java.sql.ParameterMetaData parameterMetaData45 = null;
        javax.sql.DataSource dataSource46 = null;
        java.util.concurrent.ExecutorService executorService48 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner49 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource46, true, executorService48);
        boolean boolean50 = asyncQueryRunner49.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement51 = null;
        java.lang.Object obj52 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner49.fillStatementWithBean(preparedStatement51, obj52, propertyDescriptorArray53);
        asyncQueryRunner42.fillStatement(preparedStatement44, parameterMetaData45, (java.lang.Object[]) propertyDescriptorArray53);
        asyncQueryRunner35.fillStatement(preparedStatement37, parameterMetaData38, (java.lang.Object[]) propertyDescriptorArray53);
        asyncQueryRunner22.fillStatement(preparedStatement31, (java.lang.Object[]) propertyDescriptorArray53);
        java.sql.PreparedStatement preparedStatement58 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder59 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder61 = builder59.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder63 = builder59.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder65 = builder63.maxRows((java.lang.Integer) 10);
        java.time.Duration duration66 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder67 = builder63.queryTimeout(duration66);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder69 = builder63.fetchDirection((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder71 = builder69.fetchDirection((java.lang.Integer) 10);
        java.lang.String[] strArray72 = new java.lang.String[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement58, (java.lang.Object) 10, strArray72);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement7, (java.lang.Object) int18, strArray72);
        java.sql.Connection connection75 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder77 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder79 = builder77.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder81 = builder79.maxFieldSize((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder83 = builder81.maxFieldSize((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture84 = asyncQueryRunner3.update(connection75, "hi!", (java.lang.Object) builder83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(parameterMetaData6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray26, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertNull(parameterMetaData30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray53);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray53, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder83);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 100, duration4);
        java.lang.Integer int6 = statementConfiguration5.getFetchSize();
        java.lang.Integer int7 = statementConfiguration5.getFetchSize();
        java.lang.Integer int8 = statementConfiguration5.getMaxRows();
        boolean boolean9 = statementConfiguration5.isMaxFieldSizeSet();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1));
        boolean boolean6 = statementConfiguration5.isMaxFieldSizeSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxRows();
        java.lang.Integer int8 = statementConfiguration5.getFetchDirection();
        boolean boolean9 = statementConfiguration5.isFetchSizeSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder10 = builder8.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder12 = builder8.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder14 = builder12.maxRows((java.lang.Integer) 10);
        java.time.Duration duration15 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder12.queryTimeout(duration15);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder12.maxFieldSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder23 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder25 = builder23.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder27 = builder23.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder29 = builder27.maxRows((java.lang.Integer) 10);
        java.time.Duration duration30 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder31 = builder29.queryTimeout(duration30);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder33 = builder31.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration34 = builder33.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder36 = builder33.maxRows((java.lang.Integer) 100);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder38 = builder33.queryTimeout((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder39 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder41 = builder39.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder43 = builder39.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder45 = builder43.maxRows((java.lang.Integer) 10);
        java.time.Duration duration46 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder47 = builder45.queryTimeout(duration46);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration53 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
        java.time.Duration duration54 = statementConfiguration53.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder55 = builder47.queryTimeout(duration54);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder56 = builder38.queryTimeout(duration54);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration57 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0, duration54);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder58 = builder12.queryTimeout(duration54);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration64 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 0);
        java.time.Duration duration65 = statementConfiguration64.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder66 = builder12.queryTimeout(duration65);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration67 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 10, duration65);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration68 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1), duration65);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(statementConfiguration34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(builder66);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner3.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = asyncQueryRunner3.getParameterMetaData(preparedStatement12);
        boolean boolean14 = asyncQueryRunner3.isPmdKnownBroken();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder18 = builder16.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder20 = builder18.maxFieldSize((java.lang.Integer) 100);
        java.time.Duration duration21 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder22 = builder18.queryTimeout(duration21);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder24 = builder22.maxFieldSize((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture25 = asyncQueryRunner3.update("hi!", (java.lang.Object) builder22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray7, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNull(parameterMetaData13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder2.maxFieldSize((java.lang.Integer) 100);
        java.time.Duration duration5 = null;
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder2.queryTimeout(duration5);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder6.maxFieldSize((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration9 = builder8.build();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder11 = builder8.maxFieldSize((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration.Builder builder13 = builder8.maxRows((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(statementConfiguration9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 0, duration4);
        boolean boolean6 = statementConfiguration5.isMaxRowsSet();
        java.lang.Integer int7 = statementConfiguration5.getQueryTimeout();
        java.lang.Integer int8 = statementConfiguration5.getMaxFieldSize();
        boolean boolean9 = statementConfiguration5.isMaxRowsSet();
        java.lang.Integer int10 = statementConfiguration5.getFetchSize();
        boolean boolean11 = statementConfiguration5.isMaxRowsSet();
        boolean boolean12 = statementConfiguration5.isQueryTimeoutSet();
        boolean boolean13 = statementConfiguration5.isFetchDirectionSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.dbutils.StatementConfiguration.Builder builder0 = new org.apache.commons.dbutils.StatementConfiguration.Builder();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder2 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder4 = builder0.fetchSize((java.lang.Integer) 1);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder6 = builder4.fetchSize((java.lang.Integer) 10);
        org.apache.commons.dbutils.StatementConfiguration.Builder builder8 = builder4.maxRows((java.lang.Integer) (-1));
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration14 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
        java.time.Duration duration15 = statementConfiguration14.getQueryTimeoutDuration();
        org.apache.commons.dbutils.StatementConfiguration.Builder builder16 = builder4.queryTimeout(duration15);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration17 = builder4.build();
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration18 = builder4.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(statementConfiguration17);
        org.junit.Assert.assertNotNull(statementConfiguration18);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.time.Duration duration4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = new org.apache.commons.dbutils.StatementConfiguration((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, duration4);
        boolean boolean6 = statementConfiguration5.isMaxRowsSet();
        java.lang.Integer int7 = statementConfiguration5.getMaxFieldSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }
}


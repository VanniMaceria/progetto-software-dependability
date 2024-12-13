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

package org.apache.commons.dbutils.jmh;

import org.apache.commons.dbutils.AsyncQueryRunner;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.openjdk.jmh.annotations.*;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
public class AsyncQueryRunnerBenchmark {

    private AsyncQueryRunner asyncQueryRunner;
    private ArrayHandler arrayHandler;
    private DataSource dataSource;
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    @Setup
    public void setup() throws Exception {
        // Inizializza il DataSource con SimpleDataSource
        dataSource = new SimpleDataSource("jdbc:mysql://localhost:3306/your_database", "your_username", "your_password");

        // Ottieni la connessione
        connection = dataSource.getConnection();

        // Prepara la query
        preparedStatement = connection.prepareStatement("SELECT 1");
        resultSet = preparedStatement.executeQuery();

        // Inizializza ArrayHandler e AsyncQueryRunner
        arrayHandler = new ArrayHandler();
        asyncQueryRunner = new AsyncQueryRunner(Executors.newFixedThreadPool(1), new QueryRunner(dataSource));
    }

    @TearDown
    public void tearDown() throws Exception {
        if (resultSet != null) resultSet.close();
        if (preparedStatement != null) preparedStatement.close();
        if (connection != null) connection.close();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void testAsyncQuery() throws Exception {
        // Usa AsyncQueryRunner per eseguire la query
        asyncQueryRunner.query("SELECT 1", arrayHandler).get();
    }
}

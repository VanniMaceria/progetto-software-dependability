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

import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.openjdk.jmh.annotations.*;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
public class ArrayHandlerBenchmark {

    private ArrayHandler arrayHandler;
    private ResultSet resultSet;
    private Statement statement;
    private Connection connection;

    @Setup
    public void setup() throws Exception {
        // Inizializza il DataSource usando SimpleDataSource
        DataSource dataSource = new SimpleDataSource("jdbc:mysql://localhost:3306/your_database", "your_username", "your_password");

        // Ottieni una connessione e crea uno statement
        connection = dataSource.getConnection();
        statement = connection.createStatement();

        // Esegui una query per inizializzare il ResultSet
        resultSet = statement.executeQuery("SELECT 1");
        arrayHandler = new ArrayHandler();
    }

    @TearDown
    public void tearDown() throws Exception {
        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();
        if (connection != null) connection.close();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void testArrayHandler() throws Exception {
        // Usa l'ArrayHandler per processare il ResultSet
        arrayHandler.handle(resultSet);
    }
}

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

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Implementazione semplice di DataSource che utilizza DriverManager
 * per ottenere connessioni al database.
 */
public class SimpleDataSource implements DataSource {
    private final String url;
    private final String username;
    private final String password;

    /**
     * Costruttore della classe SimpleDataSource.
     *
     * @param url      URL del database
     * @param username Nome utente per il database
     * @param password Password per il database
     */
    public SimpleDataSource(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    @Override
    public java.io.PrintWriter getLogWriter() {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public void setLogWriter(java.io.PrintWriter out) {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public void setLoginTimeout(int seconds) {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public int getLoginTimeout() {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public java.util.logging.Logger getParentLogger() {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public <T> T unwrap(Class<T> iface) {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) {
        return false;
    }
}


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

package org.apache.commons.dbutils.constants;

public final class SQLExceptionCostants {
    /**
     * Error message for a null database connection.
     */
    public static final String NULL_CONNECTION_ERROR = "Null connection error";

    /**
     * Error message for null params .
     */
    public static final String NULL_PARAMS_ERROR = "Null parameters error";

    /**
     * Error message for a null sql statement.
     */
    public static final String NULL_STATEMENT_ERROR = "Null SQL statement";

    /**
     * Error message for a null result set .
     */
    public static final String NULL_RESULT_SET_ERROR = "Null result set error";

    private SQLExceptionCostants() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

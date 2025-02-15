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
package org.apache.ignite.testsuites;

import junit.framework.Test;
import org.apache.ignite.test.H2TestSuiteBuilder;
import org.junit.internal.runners.SuiteMethod;
import org.junit.runner.RunWith;

/**
 * H2 in-memory multi-threaded tests in lazy-mode.
 */
@RunWith(SuiteMethod.class)
public class H2InMemoryMultiThreadLazyTestSuite {
    /** */
    public static Test suite() {
        H2TestSuiteBuilder builder = new H2TestSuiteBuilder();

        builder.memory = true;
        builder.multiThreaded = true;
        builder.lazy = true;

        return builder.buildSuite(H2InMemoryMultiThreadLazyTestSuite.class, true);
    }
}

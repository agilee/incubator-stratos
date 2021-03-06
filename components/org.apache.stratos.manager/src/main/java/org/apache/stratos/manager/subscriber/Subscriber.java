/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.stratos.manager.subscriber;

import java.io.Serializable;

public class Subscriber implements Serializable {

    private static final long serialVersionUID = 6429685206817913437L;
    private String adminUserName;
    private int tenantId;
    private String tenantDomain;

    public Subscriber (String adminUserName, int tenantId, String tenantDomain) {

        this.adminUserName = adminUserName;
        this.tenantId = tenantId;
        this.tenantDomain = tenantDomain;
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantDomain() {
        return tenantDomain;
    }

    public void setTenantDomain(String tenantDomain) {
        this.tenantDomain = tenantDomain;
    }

    @Override
    public String toString() {
        return "Subscriber [adminUserName=" + adminUserName + ", tenantId=" + tenantId +
               ", tenantDomain=" + tenantDomain + "]";
    }

}

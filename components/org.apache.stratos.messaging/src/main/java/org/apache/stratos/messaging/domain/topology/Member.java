/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.stratos.messaging.domain.topology;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Defines a member node in a cluster.
 * Key: serviceName, clusterId, memberId
 */
public class Member implements Serializable {
    private static final long serialVersionUID = 4179661867903664661L;
	private String serviceName;
    private String clusterId;
    private String memberId;
    private MemberStatus status;
    private float loadAverage;
    private float memoryConsumption;
    private String memberIp;
    private Map<String, Port> portMap;
    private Properties properties;
    private String iaasNodeId;

    public Member(String serviceName, String clusterId, String memberId) {
        this.serviceName = serviceName;
        this.clusterId = clusterId;
        this.memberId = memberId;
        this.portMap = new HashMap<String, Port>();
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getClusterId() {
        return clusterId;
    }

    public String getMemberId() {
        return memberId;
    }

    public MemberStatus getStatus() {
        return status;
    }

    public void setStatus(MemberStatus status) {
        this.status = status;
    }

    public boolean isActive() {
        return (this.status == MemberStatus.Activated);
    }

    public Collection<Port> getPorts() {
        return portMap.values();
    }

    public void addPort(Port port) {
        this.portMap.put(port.getProtocol(), port);
    }

    public void addPorts(Collection<Port> ports) {
        for(Port port: ports) {
            addPort(port);
        }
    }

    public void removePort(Port port) {
        this.portMap.remove(port.getProtocol());
    }

    public void removePort(String protocol) {
        this.portMap.remove(protocol);
    }

    public boolean portExists(Port port) {
        return this.portMap.containsKey(port.getProtocol());
    }

    public Port getPort(String protocol) {
        return this.portMap.get(protocol);
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

	public String getMemberIp() {
	    return memberIp;
    }

	public void setMemberIp(String memberIp) {
	    this.memberIp = memberIp;
    }

    public float getLoadAverage() {
        return loadAverage;
    }

    public void setLoadAverage(float loadAverage) {
        this.loadAverage = loadAverage;
    }

    public float getMemoryConsumption() {
        return memoryConsumption;
    }

    public void setMemoryConsumption(float memoryConsumption) {
        this.memoryConsumption = memoryConsumption;
    }

     public String getIaasNodeId() {
        return iaasNodeId;
    }

    public void setIaasNodeId(String iaasNodeId) {
        this.iaasNodeId = iaasNodeId;
    }
}

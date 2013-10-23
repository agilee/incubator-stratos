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

package org.apache.stratos.autoscaler.policy.model;

/**
 * The model class for MemoryConsumption definition.
 */
public class MemoryConsumption {

	private int upperLimit;
	private int lowerLimit;
	private int idealGraidient;

    /**
     * Gets the value of the upperLimit property.  
     */
    public int getUpperLimit() {
        return upperLimit;
    }

    /**
     * Sets the value of the upperLimit property.   
     */
    public void setUpperLimit(int value) {
        this.upperLimit = value;
    }

    /**
     * Gets the value of the lowerLimit property. 
     */
    public int getLowerLimit() {
        return lowerLimit;
    }

    /**
     * Sets the value of the lowerLimit property. 
     */
    public void setLowerLimit(int value) {
        this.lowerLimit = value;
    }

    /**
     * Gets the value of the idealGraidient property.   
     */
    public int getIdealGraidient() {
        return idealGraidient;
    }

    /**
     * Sets the value of the idealGraidient property.    
     */
    public void setIdealGraidient(int value) {
        this.idealGraidient = value;
    }



}
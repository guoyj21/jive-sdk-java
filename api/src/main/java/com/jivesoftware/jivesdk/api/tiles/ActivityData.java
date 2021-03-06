/*
 * Copyright (c) 2013. Jive Software
 *  
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *  
 *       http://www.apache.org/licenses/LICENSE-2.0
 *  
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 */

package com.jivesoftware.jivesdk.api.tiles;

import org.codehaus.jackson.map.annotate.JsonRootName;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
@JsonRootName(value = "activity")
public class ActivityData {

	private ActivityAction action = new ActivityAction();
	private Map<String, String> actor = new HashMap<String, String>();
	private Map<String, String> object = new HashMap<String, String>();
	private String externalID;

	public ActivityData() {
	}

	public ActivityData(String externalID) {
		this.externalID = externalID;
	}

	public ActivityAction getAction() {
		return action;
	}

	public void setAction(ActivityAction action) {
		this.action = action;
	}

	public Map<String, String> getActor() {
		return actor;
	}

	public void setActor(Map<String, String> actor) {
		this.actor = actor;
	}

	public Map<String, String> getObject() {
		return object;
	}

	public void setObject(Map<String, String> object) {
		this.object = object;
	}

	public String getExternalID() {
		return externalID;
	}

	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}
}


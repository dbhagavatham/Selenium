package com.hp.exstream.qa.bean;


public class ScheduleBean {

	private String name;
	private String type;
	private String recurring;
	private boolean active;
	private String actionType;
	private String description;
	
	// Advanced Option
	private String[] jobDefinition;
	private String[] srcjobDefinition;
	private String[] targetjobDefinition;
	
	private String[] jobState;
	private String[] srcjobState;
	private String[] targetjobState;
	private String olderThan;
	
	// Others
	
	private String xmlContent;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRecurring() {
		return recurring;
	}
	public void setRecurring(String recurring) {
		this.recurring = recurring;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String[] getJobDefinition() {
		return jobDefinition;
	}
	public void setJobDefinition(String[] jobDefinition) {
		this.jobDefinition = jobDefinition;
	}
	public String[] getJobState() {
		return jobState;
	}
	public void setJobState(String[] jobState) {
		this.jobState = jobState;
	}
	public String getOlderThan() {
		return olderThan;
	}
	public void setOlderThan(String olderThan) {
		this.olderThan = olderThan;
	}
	public String[] getSrcjobDefinition() {
		return srcjobDefinition;
	}
	public void setSrcjobDefinition(String[] srcjobDefinition) {
		this.srcjobDefinition = srcjobDefinition;
	}
	public String[] getTargetjobDefinition() {
		return targetjobDefinition;
	}
	public void setTargetjobDefinition(String[] targetjobDefinition) {
		this.targetjobDefinition = targetjobDefinition;
	}
	public String[] getSrcjobState() {
		return srcjobState;
	}
	public void setSrcjobState(String[] srcjobState) {
		this.srcjobState = srcjobState;
	}
	public String[] getTargetjobState() {
		return targetjobState;
	}
	public void setTargetjobState(String[] targetjobState) {
		this.targetjobState = targetjobState;
	}
	public String getXmlContent() {
		return xmlContent;
	}
	public void setXmlContent(String xmlContent) {
		this.xmlContent = xmlContent;
	}
}

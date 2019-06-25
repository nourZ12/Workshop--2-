package com.exalt.workshop;

import java.util.HashMap;

public class Manager extends Employee{
	private Project []projectSet;
	private HashMap<Task, String> subscribedTasks = new HashMap<Task, String>();
	public Manager(int iD, String name, Department department, Qualification[] qualificationSet) {
		super(iD, name, department, qualificationSet);
		
	}
	
	public Manager(int iD, String name) {
		super(iD, name);
	}
	
	public Project[] getProjectSet() {
		return projectSet;
	}
	
	public void setProjectSet(Project[] projectSet) {
		this.projectSet = projectSet;
	}
	public void updateTaskState(Task subscribedTask, String state) {
		String taskState = subscribedTasks.get(subscribedTask);
		if(taskState != null) {
			subscribedTasks.replace(subscribedTask, state);
		}
	}
	
}

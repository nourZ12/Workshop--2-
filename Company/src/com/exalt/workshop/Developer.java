package com.exalt.workshop;

public class Developer extends Employee {
	private Task[] taskSet;

	public Developer(int iD, String name, Department department, Qualification[] qualificationSet) {
		super(iD, name, department, qualificationSet);
	}
	
	public Developer(int iD, String name) {
		super(iD, name);
	}

	public Task[] getTaskSet() {
		return taskSet;
	}

	public void setTaskSet(Task[] taskSet) {
		this.taskSet = taskSet;
	}
	public Task getTask(int taskIndex) {
		return this.taskSet[taskIndex];
	}
	

}

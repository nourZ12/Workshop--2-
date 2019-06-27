package com.exalt.workshop;

public class Project {
	private String name;
    private Manager head;
    private Task [] taskSet;
    
    public Project(Manager head, String name) {
		super();
		this.head = head;
		this.name = name;
	}
    public Manager getHead() {
		return head;
	}
	public void setHead(Manager head) {
		this.head = head;
	}
	public Task[] getTaskSet() {
		return taskSet;
	}
	public void setTaskSet(Task[] taskSet) {
		this.taskSet = taskSet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

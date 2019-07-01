package com.exalt.workshop;

import java.util.HashMap;
import java.util.Iterator;

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
		loadSubscribedTasks();
	}
	public void updateTaskState(Task subscribedTask, String state) {
		String taskState = subscribedTasks.get(subscribedTask);
		if(taskState != null) {
			subscribedTasks.replace(subscribedTask, state);
		}
	}
	public void loadSubscribedTasks(){
	    for(int i = 0; i < projectSet.length; i++){
	        Task []projectTasks = projectSet[i].getTaskSet();
	        for(int j = 0; j < projectTasks.length; j++) {
	        	subscribedTasks.put(projectTasks[j], projectTasks[j].getStatus());
	        	projectTasks[j].addObserverManager(this);
	        }
	    }
	}
	
	public void printSubscribedTasks() {
		Iterator<Task> it = subscribedTasks.keySet().iterator();
		Task temp;
		while(it.hasNext()) {
			temp = it.next();
			System.out.println(temp.getName() + ": " +subscribedTasks.get(temp));
		}
	}
	
}

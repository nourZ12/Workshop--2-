package com.exalt.workshop;

public class Task  implements Observer{
private Task [] subTasks;
private String name;
private String status;

public Task(String name, String status) {
	super();
	this.name = name;
	this.status = status;
}

public Task[] getSubTasks() {
	return subTasks;
}
public void setSubTasks(Task[] subTasks) {
	this.subTasks = subTasks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStatus() {
	return status;
}
public void setStatus(String st) {
	this.status = st;
}

public void updateTask(String newState) {
	this.status = new String(newState);
	informManagers();
}

@Override
public void informManagers() {
	for(int i = 0; i < observerManagers.size(); i++) {
		observerManagers.get(i).updateTaskState(this, status);
	}
	
}

@Override
public void addObserverManager(Manager manager) {
	if(!observerManagers.contains(manager)) {
		observerManagers.add(manager);
	}	
	
}


}

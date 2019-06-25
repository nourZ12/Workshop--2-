package com.exalt.workshop;

public class Task  implements Observer{
private Task [] subTasks;
private String name;
private String status;

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


}

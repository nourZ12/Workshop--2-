package com.exalt.workshop;

public class Manager extends Employee implements Observer{
private Project [] projectSet;

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

@Override
public void notify(Task newFinishedTask) {
	subscribedList.add(newFinishedTask);
}



}

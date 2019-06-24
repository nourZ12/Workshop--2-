package com.exalt.workshop;

public class Employee {
private int ID;
private String name;
private Department department;
private Qualification [] qualificationSet;

public Employee() {}

public Employee(int iD, String name, Department department, Qualification[] qualificationSet) {
	super();
	ID = iD;
	this.name = name;
	this.department = department;
	this.qualificationSet = qualificationSet;
}



public Employee(int iD, String name) {
	super();
	ID = iD;
	this.name = name;
}

public int getID() {
	return ID;
}

public void setID(int iD) {
	ID = iD;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}

public Qualification[] getQualificationSet() {
	return qualificationSet;
}

public void setQualificationSet(Qualification[] qualificationSet) {
	this.qualificationSet = qualificationSet;
}


}

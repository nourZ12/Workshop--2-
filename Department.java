package com.exalt.workshop;

public class Department {
private String name;
private Employee [] employeeSet;
private Project [] projectSet;

public Department(String name, Employee[] employeeSet, Project[] projectSet) {
	super();
	this.name = name;
	this.employeeSet = employeeSet;
	this.projectSet = projectSet;
}

}

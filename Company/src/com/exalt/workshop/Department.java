package com.exalt.workshop;

public class Department {
	private String name;
	private Employee [] employeeSet;
	private Project [] projectSet;
	
	public Department(String name, Employee[] employeeSet, Project[] projectSet) {
		this.name = name;
		this.employeeSet = employeeSet;
		this.projectSet = projectSet;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee[] getEmployeeSet() {
		return employeeSet;
	}

	public void setEmployeeSet(Employee[] employeeSet) {
		this.employeeSet = employeeSet;
	}

	public Project[] getProjectSet() {
		return projectSet;
	}

	public void setProjectSet(Project[] projectSet) {
		this.projectSet = projectSet;
	}
}

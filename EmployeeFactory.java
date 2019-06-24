package com.exalt.workshop;

public class EmployeeFactory {
	
	public Employee createEmployee(String type, int id, String name) {
		if (type.equals("Manager")){
			return new Manager(id, name);
		} else {
			return new Developer(id, name);
		}
	}

}

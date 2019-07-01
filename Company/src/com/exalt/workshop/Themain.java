package com.exalt.workshop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Themain {
	static Department accountingDep;

	static Department researchDep;

	static Department productionDep;

	static Qualification leadership, communication, frontEnd, backEnd, mobile;

	static Manager ahmad, samar;

	static Developer nour, hadi, firas, nadin;

	static Project project1, project2, project3;

	static Task task1_1, task2_1, task2_2, task3_1, task3_2, task3_3;
	
	static ArrayList<Department> departmentsArray = new ArrayList<Department>();
	static ArrayList<Manager> managersArray = new ArrayList<Manager>();
	static ArrayList<Developer> developersArray = new ArrayList<Developer>();
	static ArrayList<Project> projectsArray = new ArrayList<Project>();
	static ArrayList<Task> tasksArray = new ArrayList<Task>();
	static ArrayList<Qualification> qualificationsArray = new ArrayList<Qualification>();

	
	public static void main(String []argv) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		int answer;
		loadBasicInfo();
		System.out.println("..............Welcome..............");
		
		while(true) {
			mainMenu();
			answer = in.nextInt();
			if(answer == 0){
				viewMenu();
				answer = in.nextInt();
			} else if(answer == 1){
				updateMenu();
				answer = in.nextInt();
			} else {
					System.out.println("error: invalid input!");
			}
		}

	}

	private static void updateMenu() {
		// TODO Auto-generated method stub
		
	}

	private static void viewMenu() {
		System.out.println("Managers :");
		printArray("manager");
		
		System.out.println("departments :");
		printArray("department");
		
		System.out.println("developers :");
		printArray("developers");
		
		System.out.println("projects :");
		printArray("project");
		
		System.out.println("tasks :");
		printArray("task");
		
		System.out.println("qualifications :");
		printArray("qualification");
		
	}

	private static void printArray(String string) {
		
		switch (string) {
			case "manager":
				ArrayList<Manager> mList = managersArray;
				for (Manager temp : mList) {
					System.out.println("   "  + temp.getName() + " : " + temp.getID());
				}
				break;
				
				
			case "department":
				ArrayList<Department> dList = departmentsArray;
				for (Department temp : dList) {
					System.out.println("   "  +  temp.getName());
				}
				break;
			case "developers":
				ArrayList<Developer> vList =  developersArray;
				for (Developer temp : vList) {
					System.out.println("   "  +  temp.getName());
				}
				break;
			case "project":
				ArrayList<Project> pList =  projectsArray;
				for (Project temp : pList) {
					System.out.println("   "  +  temp.getName());
				}
				break;
			case "task":
				ArrayList<Task> tList =  tasksArray;
				for (Task temp : tList) {
					System.out.println("   "  +  temp.getName());
				}
				break;
			case "qualification":
				ArrayList<Qualification> qList =  qualificationsArray;
				for (Qualification temp : qList) {
					System.out.println("   "  +  temp.getName());
				}
				break;
		}
		
		
//		
//		 Iterator i = aList.iterator();
//	      System.out.println(string + "s  : ");
//	      while (i.hasNext()) {
//	         System.out.println(i.next());
//	      }
		
	}

	public static void mainMenu(){
		System.out.println("Choose out of the following:(enter 0/1)");
		System.out.println("0. View");
		System.out.println("1. Update");
	}

	public static void loadBasicInfo() {
		accountingDep = new Department("Accounting Department");
		researchDep = new Department("Research Department");
		productionDep = new Department("Production Department");

		leadership = new Qualification("Leadership");
		communication = new Qualification("Communication");
		frontEnd = new Qualification("Front End Experience");
		backEnd = new Qualification("Back End Experience");
		mobile = new Qualification("Mobile Experience");

		ahmad = new Manager(111, "Ahmad", accountingDep, new Qualification[] {leadership, communication});
		samar = new Manager(222, "Samar", productionDep, new Qualification[] {leadership, communication, frontEnd});

		nour = new Developer(333, "Nour", researchDep, new Qualification[] {mobile, backEnd, frontEnd});
		hadi = new Developer(444, "Hadi", researchDep, new Qualification[] {backEnd, frontEnd});
		firas = new Developer(555, "Firas", productionDep, new Qualification[] {mobile, frontEnd});
	  nadin = new Developer(666, "Nadin", accountingDep, new Qualification[] {mobile, backEnd, frontEnd});

		project1 = new Project(ahmad, "Project 1");
		project2 = new Project(ahmad, "Project 2");
		project3 = new Project(samar, "Project 3");

		task1_1 = new Task("Task 1.1", "pending");
		task2_1 = new Task("Task 2.1", "pending");
		task2_2 = new Task("Task 2.2", "pending");
		task3_1 = new Task("Task 3.1", "pending");
		task3_2 = new Task("Task 3.2", "pending");
		task3_3 = new Task("Task 3.3", "pending");

		project1.setTaskSet(new Task[] {task1_1});
		project2.setTaskSet(new Task[] {task2_1, task2_2});
		project3.setTaskSet(new Task[] {task3_1, task3_2, task3_3});

		ahmad.setProjectSet(new Project[] {project1, project2});
		samar.setProjectSet(new Project[] {project3});

		nour.setTaskSet(new Task[] {task1_1, task2_1});
		hadi.setTaskSet(new Task[] {task3_1});
		firas.setTaskSet(new Task[] {task3_3});
		nadin.setTaskSet(new Task[] {task2_2, task3_2});
		
		departmentsArray.add(accountingDep);
		departmentsArray.add(productionDep);
		departmentsArray.add(researchDep);
		
		qualificationsArray.add(backEnd);
		qualificationsArray.add(frontEnd);
		qualificationsArray.add(leadership);
		qualificationsArray.add(mobile);
		qualificationsArray.add(communication);
		
		managersArray.add(ahmad);
		managersArray.add(samar);
		
		developersArray.add(firas);
		developersArray.add(hadi);
		developersArray.add(nadin);
		developersArray.add(nour);
		
		projectsArray.add(project1);
		projectsArray.add(project2);
		projectsArray.add(project3);
		
		tasksArray.add(task1_1);
		tasksArray.add(task2_1);
		tasksArray.add(task2_2);
		tasksArray.add(task3_1);
		tasksArray.add(task3_2);
		tasksArray.add(task3_3);	
	
	}
}

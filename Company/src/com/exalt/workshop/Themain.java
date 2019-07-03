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

	static String opjectsArray[] = {"department" ,"manager", "developer", "project" , "task" , "qualification"};
	static ArrayList<ArrayList> ArraysArray = new ArrayList<ArrayList>();
	
	public static void main(String[] args) throws InterruptedException {	
		
		Scanner in = new Scanner(System.in);
		int answer;
		loadBasicInfo();
		System.out.println("..............Welcome..............");
		
		while(true) {
			mainMenu();
			answer = in.nextInt();
			if (answer == 0) {
				viewMenu();
				//answer = in.nextInt();
			} else if (answer == 1) {
				
				chooseTheArrayToUpdate();
				int arrayToUodate = in.nextInt();  // the index of the array to add to 
				
				updateActionMenu();
				answer = in.nextInt();
				
				if(answer == 0) { // add
					addingToArray(arrayToUodate);
				} else if (answer == 1) { // delete
					System.out.println("Enter the index of the object you want to remove");
					printArray(""+arrayToUodate);
					answer = in.nextInt();
					ArraysArray.get(arrayToUodate).remove(answer);
				} else {
					System.out.println("error: invalid input!");
				}
			} else {
					System.out.println("error: invalid input!");
			}
		}

	}

	private static void addingToArray(int arrayToUodate) {
		Scanner in = new Scanner(System.in);
		if (arrayToUodate == 0) {
			System.out.println("Enter department name:");
			String depName = in.nextLine();
			departmentsArray.add(new Department(depName));
		} else if (arrayToUodate == 1) {
			System.out.println("Enter manager Id:");
			String mangerId = in.nextLine();
			
			System.out.println("Enter manager name:");
			String managerName = in.nextLine();
			
			System.out.println("Enter dep number:");
			printArray("department");
			String depName = in.nextLine();
			boolean c = true;
			while (c) {
			System.out.println("Enter qualifications name from list then press 1 when you're done");
			printArray("qualification");
			String quali = in.nextLine();
			qualificationsArray.get(Integer.parseInt(depName)); // this way we reach the quali to add , cant do arrayOfQuali.add as its not a List Type. 
			if (quali.equals("1"))c=false;
			}
			
			managersArray.add(new Manager(Integer.parseInt(mangerId),managerName,
							departmentsArray.get(Integer.parseInt(depName)),null));// must take inserted # insted of name and chose it from list
		} else if (arrayToUodate == 2) {
			System.out.println("Enter developers Id:");
			String devId = in.nextLine();
			
			System.out.println("Enter developers name:");
			String devName = in.nextLine();
			
			System.out.println("Enter dep number:");
			printArray("department");
			String depName = in.nextLine();
			boolean c = true;
			while (c) {
			System.out.println("Enter qualifications name from list then press 1 when you're done");
			printArray("qualification");
			String quali = in.nextLine();
			qualificationsArray.get(Integer.parseInt(depName)); 
			if (quali.equals("1"))c=false;
			}
			
			developersArray.add(new Developer(Integer.parseInt(devId),devName,
							    departmentsArray.get(Integer.parseInt(depName)),null));// must take inserted # insted of name and chose it from list
		
		} else if (arrayToUodate == 3) {
			System.out.println("Enter developers Id:");
			String devId = in.nextLine();
			
			System.out.println("Enter developers name:");
			String devName = in.nextLine();
			
			System.out.println("Enter dep number:");
			printArray("department");
			String depName = in.nextLine();
//			boolean c = true;
//			while (c) {
//			System.out.println("Enter qualifications name from list then press 1 when you're done");
//			printArray("qualification");
//			String quali = in.nextLine();
//			qualificationsArray.get(Integer.parseInt(depName)); 
//			if (quali.equals("1"))c=false;
//			}
			
			developersArray.add(new Developer(Integer.parseInt(devId),devName,
							  departmentsArray.get(Integer.parseInt(depName)),null));// must take inserted # insted of name and chose it from list
		
		} else if (arrayToUodate == 4) {
			
			System.out.println("Enter the task's name");
			String taskName = in.nextLine();
			
			System.out.println("task progress will be :  pending ");

			
			tasksArray.add(new Task(taskName,"pending"));
		
		} else if (arrayToUodate == 5) {
			System.out.println("Enter Qualification name ");
			String qualiName = in.nextLine();
			qualificationsArray.add(new Qualification(qualiName) );
		} else {
			System.out.println("error: invalid input!");
		}
	}

	private static void chooseTheArrayToUpdate() {
		System.out.println("what clasification do you want to update ? (Enter the number)");
		for (int x = 0 ; x< opjectsArray.length; x++) {
			System.out.println(x +". " + opjectsArray[x]);
		}
		
	}

	private static void updateActionMenu() {
		System.out.println("what is the action you want to take ? (Enter the number)");
		System.out.println("0. add");
		System.out.println("1. delete");
		
	}

	private static void viewMenu() {
		System.out.println("Managers:");
		printArray("manager");
		
		System.out.println("Departments:");
		printArray("department");
		
		System.out.println("Developers:");
		printArray("developers");
		
		System.out.println("Projects:");
		printArray("project");
		
		System.out.println("Tasks:");
		printArray("task");
		
		System.out.println("Qualifications:");
		printArray("qualification");
		
	}
	
	private static void printArray(String string) {
		
		switch (string) {
			case "department":
			case "0" :
				ArrayList<Department> dList = departmentsArray;
				for (Department temp : dList) {
					System.out.println("   " + dList.indexOf(temp)+". " +  temp.getName());
				}
				break;	
				
			case "manager":
			case  "1" :
				ArrayList<Manager> mList = managersArray;
				for (Manager temp : mList) {
					System.out.println("   "  + mList.indexOf(temp)+". " + temp.getName() + " : " + temp.getID());
				}
				break;
				
			case "developers":
			case "2" : 
				ArrayList<Developer> vList =  developersArray;
				for (Developer temp : vList) {
					System.out.println("   "  + vList.indexOf(temp)+". " +  temp.getName());
				}
				break;
			case "project":
			case "3" : 
				ArrayList<Project> pList =  projectsArray;
				for (Project temp : pList) {
					System.out.println("   "  + pList.indexOf(temp)+". " +  temp.getName());
				}
				break;
			case "task":
			case "4" : 
				ArrayList<Task> tList =  tasksArray;
				for (Task temp : tList) {
					System.out.println("   "  + tList.indexOf(temp)+". " +  temp.getName());
				}
				break;
			case "qualification":
			case "5" : 
				ArrayList<Qualification> qList =  qualificationsArray;
				for (Qualification temp : qList) {
					System.out.println("   "  + qList.indexOf(temp)+". " +  temp.getName());
				}
				break;
			default:
		}		
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
		
		
		//Arrays :
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
	
		ArraysArray.add(departmentsArray);
		ArraysArray.add(managersArray);
		ArraysArray.add(developersArray);
		ArraysArray.add(projectsArray);
		ArraysArray.add(tasksArray);
		ArraysArray.add(qualificationsArray);
	}
}

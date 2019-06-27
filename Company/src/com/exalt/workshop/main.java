package com.exalt.workshop;

public class main {
	Department accountingDep, researchDep, productionDep;

	Qualification leadership, communication, frontEnd, backEnd, mobile;

	Manager ahmad, samar;

	Developer nour, hadi, firas, nadin;

	Project project1, project2, project3;

	Task task1_1, task2_1, task2_2, task3_1, task3_2, task3_3;

	public static void main(String []argv) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		int answer;
		loadBasicInfo();
		System.out.println("..............Welcome..............");
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

	public void mainMenu(){
		System.out.println("Choose out of the following:(enter 0/1)");
		System.out.println("0. View");
		System.out.println("1. Update");
	}

	public void loadBasicInfo() {
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
	}
}

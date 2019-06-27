package com.exalt.workshop;

import java.util.ArrayList;

interface Observer {
	ArrayList<Manager> observerManagers = new ArrayList<Manager>();
	void informManagers();
	void addObserverManager(Manager manager);
}

package tn.esprit.espoline.controller;

import java.util.List;

import tn.esprit.espoline.service.IDependencyService;

public class DependencyController {
	
	IDependencyService myService;

	public IDependencyService getMyService() {
		return myService;
	}

	public void setMyService(IDependencyService myService) {
		this.myService = myService;
	}
	public List<String> coursesList() {
		return myService.getCourses();
	}
	

}

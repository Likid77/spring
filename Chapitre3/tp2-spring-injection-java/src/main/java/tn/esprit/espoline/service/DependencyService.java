
package tn.esprit.espoline.service;

import java.util.List;

import tn.esprit.espoline.repository.IDependencyRepository;

public class DependencyService implements IDependencyService {
	
	IDependencyRepository myRepository;
	
	public IDependencyRepository getMyRepository() {
		return myRepository;
	}

	public void setMyRepository(IDependencyRepository myRepository) {
		this.myRepository = myRepository;
	}

	@Override
	public List<String> getCourses() {
		return myRepository.getCoursesList();
	}

}

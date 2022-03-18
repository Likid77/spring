package tn.esprit.espoline.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tn.esprit.espoline.controller.DependencyController;
import tn.esprit.espoline.repository.DependencyRepository;
import tn.esprit.espoline.service.DependencyService;

@Configuration
public class BeansConfiguration {

	@Bean(name = "dependencyController")
	public DependencyController createDependencyControl() {
		DependencyController depController = new DependencyController();
		depController.setMyService(createDependencyService());
		return depController;
	}
	@Bean(name = "dependencyService")
	public DependencyService createDependencyService() {
		DependencyService depService = new DependencyService();
		depService.setMyRepository(createDependencyRepository());
		return depService;
	}
	@Bean(name = "dependencyRepository")
	public DependencyRepository createDependencyRepository() {
		DependencyRepository depRepository = new DependencyRepository();
		return depRepository;
	}
}

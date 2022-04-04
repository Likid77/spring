package tn.esprit.espoline;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tn.esprit.espoline.config.BeansConfiguration;
import tn.esprit.espoline.controller.DependencyController;

public class Main {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(
				BeansConfiguration.class)) {
		System.out.println("Contains dependencyController " + applicationContext.containsBeanDefinition("dependencyController"));
		System.out.println("Contains dependencyService " + applicationContext.containsBeanDefinition("dependencyService"));
		System.out.println("Contains dependencyRepository " + applicationContext.containsBeanDefinition("dependencyRepository"));
		System.out.println((applicationContext.getBean(DependencyController.class)).coursesList());
		}
	}
}

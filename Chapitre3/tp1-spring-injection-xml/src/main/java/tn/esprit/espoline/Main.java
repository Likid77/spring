package tn.esprit.espoline;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.esprit.espoline.controller.DependencyController;

public class Main {

	public static void main(String[] args) {

		// Chargement du Conteneur Spring IoC : 
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tp1-beans.xml");
		System.out.println("Contains dependencyController " + applicationContext.containsBeanDefinition("dependencyController"));
		System.out.println("Contains dependencyService " + applicationContext.containsBeanDefinition("dependencyService"));
		System.out.println("Contains dependencyRepository " + applicationContext.containsBeanDefinition("dependencyRepository"));
		System.out.println((applicationContext.getBean(DependencyController.class)).coursesList());
		((ClassPathXmlApplicationContext) applicationContext).close();
	}
}

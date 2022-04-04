package tn.esprit.espoline.repository;
import java.util.ArrayList;
import java.util.List;

public class DependencyRepository implements IDependencyRepository {

	@Override
	public List<String> getCoursesList() {
		List<String> courses = new ArrayList<String>();
		courses.add("Maven");
		courses.add("Dependency Injection");
		courses.add("Spring Data JPA");
		courses.add("Spring AOP");
		return courses;
	}
	
}

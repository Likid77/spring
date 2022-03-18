package tn.esprit.espoline.repository;

import java.util.ArrayList;
import java.util.List;

public class DependencyRepository implements IDependencyRepository {

	@Override
	public List<String> getCoursesList() {
		List<String> courses = new ArrayList<String>();
		courses.add("diagramme de cas utilisation");
		courses.add("diagramme de classes");
		courses.add("diagramme de séquences");
		courses.add("diagramme état transition");
		return courses;
	}
	
}

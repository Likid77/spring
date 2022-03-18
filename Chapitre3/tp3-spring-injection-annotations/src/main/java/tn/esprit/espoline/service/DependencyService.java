package tn.esprit.espoline.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.espoline.repository.IDependencyRepository;

@Service
public class DependencyService implements IDependencyService {
	@Autowired
	private IDependencyRepository myRepository;	
	public IDependencyRepository getMyRepository() { return myRepository; }
	public void setMyRepository(IDependencyRepository myRepository) { this.myRepository = myRepository; }
	public List<String> getCoursesList() { return myRepository.getCoursesList(); }
}

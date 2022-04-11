package tn.nids.remadi.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.nids.remadi.entities.Operateur;
import tn.nids.remadi.service.OperateurService;

@RestController
@RequestMapping("/operateur")
public class OperateurRestController {

	@Autowired
	OperateurService operateurService;

//	http://localhost:8090/SpringMVC/operateur/retrieve-all-operateurs
	@GetMapping("/retrieve-all-operateurs")
	@ResponseBody
	public List<Operateur> getOperateurs() {
		List<Operateur> listOperateurs = operateurService.retrieveAllOperateurs();
		return listOperateurs;
	}

//	http://localhost:8090/SpringMVC/operateur/retrieve-operateur/{operateur-id}
	@GetMapping("/retrieve-operateur/{operateur-id}")
	@ResponseBody
	public Optional<Operateur> retrieveOperateur(@PathVariable("operateur-id") Long Id) {
		return operateurService.retrieveOperateur(Id);
	}

//	http://localhost:8090/SpringMVC/operateur/add-operateur
	@PostMapping("/add-operateur")
	@ResponseBody
	public Operateur addOperateur(@RequestBody Operateur o) {
		Operateur operateur = operateurService.addOperateur(o);
		return operateur;
	}

//	http://localhost:8090/SpringMVC/operateur/modify-operateur
	@PutMapping("/modify-operateur")
	@ResponseBody
	public Operateur updateOperateur(@RequestBody Operateur o) {
		return operateurService.updateOperateur(o);
	}

//	http://localhost:8090/SpringMVC/operateur/remove-operateur/{operateur-id}
	@DeleteMapping("/remove-operateur/{operateur-id}")
	@ResponseBody
	public void removeOperateur(@PathVariable("operateur-id") Long Id) {
		operateurService.removeOperateur(Id);
	}

}

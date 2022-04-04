package tn.nids.remadi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.nids.remadi.entities.Operateur;
import tn.nids.remadi.repository.OperateurRepository;

@Slf4j
@Service("operateurService")
public class OperateurServiceImpl implements OperateurService {

	@Autowired
	private OperateurRepository operateurRepository;

	@Override
	public List<Operateur> retrieveAllOperateurs() {
		List<Operateur> operateurs = (List<Operateur>) operateurRepository.findAll();
		for (Operateur operateur : operateurs) {
			log.info("Opérateur : " + operateur);

		}
		return operateurs;
	}

	@Override
	public Operateur addOperateur(Operateur o) {
		return operateurRepository.save(o);
	}

	@Override
	public Operateur updateOperateur(Operateur o) {
		return operateurRepository.save(o);
	}

	@Override
	public Optional<Operateur> retrieveOperateur(Long id) {
		return operateurRepository.findById(id);
	}

	@Override
	public void removeOperateur(Long id) {
		operateurRepository.deleteById(id);
	}
}

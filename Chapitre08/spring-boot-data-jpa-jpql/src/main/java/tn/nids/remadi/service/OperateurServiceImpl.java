package tn.nids.remadi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.nids.remadi.entities.Operateur;
import tn.nids.remadi.repository.OperateurRepository;

@Service("operateurService")
public class OperateurServiceImpl implements OperateurService {

	@Autowired
	private OperateurRepository operateurRepository;

	@Override
	public List<Operateur> retrieveAllOperateurs() {
		return (List<Operateur>) operateurRepository.findAll();
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

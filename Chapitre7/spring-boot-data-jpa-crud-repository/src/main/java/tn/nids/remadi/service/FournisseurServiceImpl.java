package tn.nids.remadi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.nids.remadi.entities.Fournisseur;
import tn.nids.remadi.repository.FournisseurRepository;

@Service("fournisseurService")
public class FournisseurServiceImpl implements FournisseurService {

	@Autowired
	private FournisseurRepository fournisseurRepository;

	@Override
	public List<Fournisseur> retrieveAllFournisseurs() {
		return (List<Fournisseur>) fournisseurRepository.findAll();
	}

	@Override
	public Fournisseur addFournisseur(Fournisseur f) {
		return fournisseurRepository.save(f);
	}

	@Override
	public Fournisseur updateFournisseur(Fournisseur f) {
		return fournisseurRepository.save(f);
	}

	@Override
	public Optional<Fournisseur> retrieveFournisseur(Long id) {
		return fournisseurRepository.findById(id);
	}

}

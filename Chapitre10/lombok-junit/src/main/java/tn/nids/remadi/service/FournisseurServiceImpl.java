package tn.nids.remadi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.nids.remadi.entities.Fournisseur;
import tn.nids.remadi.repository.FournisseurRepository;

@Slf4j
@Service("fournisseurService")
public class FournisseurServiceImpl implements FournisseurService {

	@Autowired
	private FournisseurRepository fournisseurRepository;

	@Override
	public List<Fournisseur> retrieveAllFournisseurs() {
		List<Fournisseur> fournisseurs = (List<Fournisseur>) fournisseurRepository.findAll();
		for (Fournisseur fournisseur : fournisseurs) {
			log.info("Fournisseur : " + fournisseur);
		}
		return fournisseurs;
	}

	@Override
	public Fournisseur addFournisseur(Fournisseur f) {
//		NB: pour l'ajout de fournisseur, il faut créer en même temps le détail fournisseur (entité fournisseur avec l’entité associé detailFournisseur).
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

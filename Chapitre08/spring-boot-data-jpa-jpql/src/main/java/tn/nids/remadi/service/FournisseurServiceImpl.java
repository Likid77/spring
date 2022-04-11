package tn.nids.remadi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.nids.remadi.entities.CategorieFournisseur;
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

//	SELECT
	@Override
	public List<Fournisseur> retrieveFournisseurByCategorieFournisseur(CategorieFournisseur cf) {
		return (List<Fournisseur>) fournisseurRepository.retrieveFournisseurByCategorieFournisseur(cf);
	}

	@Override
	public List<Fournisseur> retrieveFournisseursByCategorieFournisseur(CategorieFournisseur cf) {
		return (List<Fournisseur>) fournisseurRepository.retrieveFournisseursByCategorieFournisseur(cf);
	}

//	UPDATE
	@Override
	public int updateFournisseurByCategorieFournisseur(CategorieFournisseur cf, Long id) {
		return fournisseurRepository.updateFournisseurByCategorieFournisseur(cf, id);
	}

	// DELETE
	@Override
	public int deleteFournisseurByCategorieFournisseur(CategorieFournisseur cf) {
		return fournisseurRepository.deleteFournisseurByCategorieFournisseur(cf);
	}

//	INSERT
	@Override
	public void insertFournisseur(String codeFournisseur, String libelleFournisseur, CategorieFournisseur cf) {
	}
}

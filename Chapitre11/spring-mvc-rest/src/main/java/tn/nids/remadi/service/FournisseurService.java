package tn.nids.remadi.service;

import java.util.List;
import java.util.Optional;

import tn.nids.remadi.entities.CategorieFournisseur;
import tn.nids.remadi.entities.Fournisseur;

public interface FournisseurService {

	public List<Fournisseur> retrieveAllFournisseurs();

	public Fournisseur addFournisseur(Fournisseur f);

	public Fournisseur updateFournisseur(Fournisseur f);

	public Optional<Fournisseur> retrieveFournisseur(Long id);

//	SELECT
	public List<Fournisseur> retrieveFournisseurByCategorieFournisseur(CategorieFournisseur cf);

	public List<Fournisseur> retrieveFournisseursByCategorieFournisseur(CategorieFournisseur cf);

//	UPDATE
	public int updateFournisseurByCategorieFournisseur(CategorieFournisseur cf, Long id);

//	DELETE
	public int deleteFournisseurByCategorieFournisseur(CategorieFournisseur cf);

//	INSERT
	public void insertFournisseur(String codeFournisseur, String libelleFournisseur, CategorieFournisseur cf);

}

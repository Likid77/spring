package tn.nids.remadi.service;

import java.util.List;
import java.util.Optional;

import tn.nids.remadi.entities.Fournisseur;

public interface FournisseurService {

	public List<Fournisseur> retrieveAllFournisseurs();

	public Fournisseur addFournisseur(Fournisseur f);

	public Fournisseur updateFournisseur(Fournisseur f);

	public Optional<Fournisseur> retrieveFournisseur(Long id);

}

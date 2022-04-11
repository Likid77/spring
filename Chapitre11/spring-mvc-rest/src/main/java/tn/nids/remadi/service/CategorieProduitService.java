package tn.nids.remadi.service;

import java.util.List;
import java.util.Optional;

import tn.nids.remadi.entities.CategorieProduit;

public interface CategorieProduitService {

	public List<CategorieProduit> retrieveAllCategorieProduits();

	public CategorieProduit addCategorieProduit(CategorieProduit cp);

	public CategorieProduit updateCategorieProduit(CategorieProduit cp);

	public Optional<CategorieProduit> retrieveCategorieProduit(Long id);

	public void removeCategorieProduit(Long id);

}

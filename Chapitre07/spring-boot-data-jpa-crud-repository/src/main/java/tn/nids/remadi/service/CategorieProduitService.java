package tn.nids.remadi.service;

import tn.nids.remadi.entities.CategorieProduit;
import java.util.List;
import java.util.Optional;

public interface CategorieProduitService {

	public List<CategorieProduit> retrieveAllCategorieProduits();

	public CategorieProduit addCategorieProduit(CategorieProduit cp);

	public CategorieProduit updateCategorieProduit(CategorieProduit cp);

	public Optional<CategorieProduit> retrieveCategorieProduit(Long id);

	public void removeCategorieProduit(Long id);

}

package tn.nids.remadi.service;

import tn.nids.remadi.entities.Produit;
import java.util.List;
import java.util.Optional;

public interface ProduitService {

	public List<Produit> retrieveAllProduits();

	public Produit addProduit(Produit p, Long idCategorieProduit, Long idStock);

	public Produit updateProduit(Produit p, Long idCategorieProduit, Long idStock);

	public Optional<Produit> retrieveProduit(Long id);

}

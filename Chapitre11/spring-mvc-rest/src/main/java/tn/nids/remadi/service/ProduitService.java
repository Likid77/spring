package tn.nids.remadi.service;

import java.util.List;
import java.util.Optional;

import tn.nids.remadi.entities.Produit;

public interface ProduitService {

	public List<Produit> retrieveAllProduits();

	public Produit addProduit(Produit p, Long idCategorieProduit, Long idStock);

	public Produit updateProduit(Produit p, Long idCategorieProduit, Long idStock);

	public Optional<Produit> retrieveProduit(Long id);

}

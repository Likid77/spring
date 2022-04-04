package tn.nids.remadi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.nids.remadi.entities.Produit;
import tn.nids.remadi.repository.ProduitRepository;

@Slf4j
@Service("produitService")
public class ProduitServiceImpl implements ProduitService {

	@Autowired
	private ProduitRepository produitRepository;

	@Override
	public List<Produit> retrieveAllProduits() {
		List<Produit> produits = (List<Produit>) produitRepository.findAll();
		for (Produit produit : produits) {
			log.info("Produit : " + produit);
		}
		return produits;
	}

	@Override
	public Produit addProduit(Produit p, Long idCategorieProduit, Long idStock) {
		return produitRepository.save(p);
	}

	@Override
	public Produit updateProduit(Produit p, Long idCategorieProduit, Long idStock) {
		return produitRepository.save(p);
	}

	@Override
	public Optional<Produit> retrieveProduit(Long id) {
		return produitRepository.findById(id);
	}

}

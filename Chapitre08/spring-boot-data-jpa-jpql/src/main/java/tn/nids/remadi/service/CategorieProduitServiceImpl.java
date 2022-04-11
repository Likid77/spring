package tn.nids.remadi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.nids.remadi.entities.CategorieProduit;
import tn.nids.remadi.repository.CategorieProduitRepository;

@Service("categorieProduitService")
public class CategorieProduitServiceImpl implements CategorieProduitService {

	@Autowired
	private CategorieProduitRepository categorieProduitRepository;

	@Override
	public List<CategorieProduit> retrieveAllCategorieProduits() {
		return (List<CategorieProduit>) categorieProduitRepository.findAll();
	}

	@Override
	public CategorieProduit addCategorieProduit(CategorieProduit cp) {
		return categorieProduitRepository.save(cp);
	}

	@Override
	public CategorieProduit updateCategorieProduit(CategorieProduit cp) {
		return categorieProduitRepository.save(cp);
	}	
	
	@Override
	public Optional<CategorieProduit> retrieveCategorieProduit(Long id) {
		return categorieProduitRepository.findById(id);
	}

	@Override
	public void removeCategorieProduit(Long id) {
		categorieProduitRepository.deleteById(id);
	}
}

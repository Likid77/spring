package tn.nids.remadi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.nids.remadi.entities.Facture;
import tn.nids.remadi.repository.FactureRepository;

@Slf4j
@Service("factureService")
public class FactureServiceImpl implements FactureService {

	@Autowired
	private FactureRepository factureRepository;

	@Override
	public List<Facture> retrieveAllFactures() {
		List<Facture> factures = (List<Facture>) factureRepository.findAll();
		for (Facture facture : factures) {
			log.info("Facture : " + facture);
		}
		return factures;
	}

	@Override
	public Optional<Facture> retrieveFacture(Long id) {
		return factureRepository.findById(id);
	}

	@Override
	public void cancelFacture(Long id) {
//		NB : pour l'annulation de la facture, il faut que le champ archivee de la table facture soit mis à true.
		factureRepository.deleteById(id);
	}
}

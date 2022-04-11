package tn.nids.remadi.service;

import java.util.List;
import java.util.Optional;

import tn.nids.remadi.entities.Facture;

public interface FactureService {

	public List<Facture> retrieveAllFactures();

	public Optional<Facture> retrieveFacture(Long id);

	public void cancelFacture(Long id);

}

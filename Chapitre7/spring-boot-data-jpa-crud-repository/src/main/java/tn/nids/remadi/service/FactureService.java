package tn.nids.remadi.service;

import tn.nids.remadi.entities.Facture;
import java.util.List;
import java.util.Optional;

public interface FactureService {

	public List<Facture> retrieveAllFactures();

	public Optional<Facture> retrieveFacture(Long id);

	public void cancelFacture(Long id);

}

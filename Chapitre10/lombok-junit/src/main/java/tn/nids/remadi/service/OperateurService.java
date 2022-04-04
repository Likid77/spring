package tn.nids.remadi.service;

import java.util.List;
import java.util.Optional;

import tn.nids.remadi.entities.Operateur;

public interface OperateurService {

	public List<Operateur> retrieveAllOperateurs();

	public Operateur addOperateur(Operateur o);

	public Operateur updateOperateur(Operateur o);

	public Optional<Operateur> retrieveOperateur(Long id);

	public void removeOperateur(Long id);

}

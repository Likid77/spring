package tn.nids.remadi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.nids.remadi.entities.Fournisseur;

@Repository
public interface FournisseurRepository extends CrudRepository<Fournisseur, Long> {

}

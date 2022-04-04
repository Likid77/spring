package tn.nids.remadi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.nids.remadi.entities.Facture;

@Repository
public interface FactureRepository extends CrudRepository<Facture, Long> {

}

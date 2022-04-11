package tn.nids.remadi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.nids.remadi.entities.CategorieProduit;

@Repository
public interface CategorieProduitRepository extends CrudRepository<CategorieProduit, Long> {

}

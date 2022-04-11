package tn.nids.remadi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.nids.remadi.entities.Produit;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, Long> {

}

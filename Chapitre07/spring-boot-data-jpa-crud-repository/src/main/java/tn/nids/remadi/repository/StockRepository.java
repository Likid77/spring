package tn.nids.remadi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.nids.remadi.entities.Stock;

@Repository
public interface StockRepository extends CrudRepository<Stock, Long> {

}

package tn.nids.remadi.service;

import tn.nids.remadi.entities.Stock;
import java.util.List;
import java.util.Optional;

public interface StockService {

	public List<Stock> retrieveAllStocks();

	public Stock addStock(Stock s);

	public Stock updateStock(Stock s);

	public Optional<Stock> retrieveStock(Long id);

	public void removeStock(Long id);

}

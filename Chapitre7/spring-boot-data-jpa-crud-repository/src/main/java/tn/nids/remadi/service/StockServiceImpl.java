package tn.nids.remadi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.nids.remadi.entities.Stock;
import tn.nids.remadi.repository.StockRepository;

@Service("stockService")
public class StockServiceImpl implements StockService {

	@Autowired
	private StockRepository stockRepository;

	@Override
	public List<Stock> retrieveAllStocks() {
		return (List<Stock>) stockRepository.findAll();
	}

	@Override
	public Stock addStock(Stock s) {
		return stockRepository.save(s);
	}

	@Override
	public Stock updateStock(Stock s) {
		return stockRepository.save(s);
	}	
	
	@Override
	public Optional<Stock> retrieveStock(Long id) {
		return stockRepository.findById(id);
	}

	@Override
	public void removeStock(Long id) {
		stockRepository.deleteById(id);
	}
}

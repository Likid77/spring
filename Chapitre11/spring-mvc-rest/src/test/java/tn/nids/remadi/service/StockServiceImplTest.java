package tn.nids.remadi.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.nids.remadi.entities.Stock;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StockServiceImplTest {

	@Autowired
	StockService stockService;

	@Test
	public void testAddStock() {
		List<Stock> stocks = stockService.retrieveAllStocks();
		int expected = stocks.size();
		Stock s = new Stock();
		s.setLibelleStock("Stock test");
		s.setQte(10);
		s.setQteMin(100);
		Stock savedStock = stockService.addStock(s);
		assertEquals(expected + 1, stockService.retrieveAllStocks().size());
		assertNotNull(savedStock.getIdStock());

	}
}

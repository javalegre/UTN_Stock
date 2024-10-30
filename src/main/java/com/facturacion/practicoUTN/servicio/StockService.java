package com.facturacion.practicoUTN.servicio;

import com.facturacion.practicoUTN.modelo.Stock;
import com.facturacion.practicoUTN.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {
    @Autowired
    private StockRepository stockRepository;
    public List<Stock> listarStocks() {
        return stockRepository.findAll();
    }
    public Stock guardarStock(Stock stock) {
        return stockRepository.save(stock);
    }
    public void eliminarStock(Long id) {
        stockRepository.deleteById(id);
    }
}
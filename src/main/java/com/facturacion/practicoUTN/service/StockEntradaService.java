package com.facturacion.practicoUTN.service;

import com.facturacion.practicoUTN.model.StockEntrada;
import com.facturacion.practicoUTN.repository.StockEntradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockEntradaService {

    private final StockEntradaRepository stockEntradaRepository;

    @Autowired
    public StockEntradaService(StockEntradaRepository stockEntradaRepository) {
        this.stockEntradaRepository = stockEntradaRepository;
    }

    // Método para obtener una entrada de stock por su id
    public Optional<StockEntrada> getStockEntradaById(Long id) {
        return stockEntradaRepository.findById(id);
    }

    // Método para obtener todas las entradas de stock
    public List<StockEntrada> getAllStockEntradas() {
        return (List<StockEntrada>) stockEntradaRepository.findAll();
    }

    // Método para guardar una nueva entrada de stock
    public StockEntrada saveStockEntrada(StockEntrada stockEntrada) {
        // Si la entrada no tiene fecha, asigna la fecha actual
        if (stockEntrada.getFecha() == null) {
            stockEntrada.setFecha(java.time.LocalDateTime.now());
        }
        // Establece la fecha de modificación al momento de guardar
        stockEntrada.setModified(java.time.LocalDateTime.now());
        return stockEntradaRepository.save(stockEntrada);
    }

    // Método para actualizar una entrada de stock
    public StockEntrada updateStockEntrada(Long id, StockEntrada stockEntrada) {
        if (stockEntradaRepository.existsById(id)) {
            stockEntrada.setId(id);  // Asegúrate de que el ID no cambie
            stockEntrada.setModified(java.time.LocalDateTime.now()); // Actualiza la fecha de modificación
            return stockEntradaRepository.save(stockEntrada);
        }
        return null;
    }

    // Método para eliminar una entrada de stock
    public void deleteStockEntrada(Long id) {
        stockEntradaRepository.deleteById(id);
    }

    // Método para buscar entradas por número
    public List<StockEntrada> getStockEntradasByNumero(String numero) {
        return stockEntradaRepository.findByNumero(numero);
    }
}

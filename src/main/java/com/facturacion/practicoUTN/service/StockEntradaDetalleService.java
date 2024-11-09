package com.facturacion.practicoUTN.service;

import com.facturacion.practicoUTN.model.StockEntradaDetalle;
import com.facturacion.practicoUTN.repository.StockEntradaDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockEntradaDetalleService {

    private final StockEntradaDetalleRepository stockEntradaDetalleRepository;

    @Autowired
    public StockEntradaDetalleService(StockEntradaDetalleRepository stockEntradaDetalleRepository) {
        this.stockEntradaDetalleRepository = stockEntradaDetalleRepository;
    }

    // Método para obtener un detalle de entrada de stock por su id
    public Optional<StockEntradaDetalle> getStockEntradaDetalleById(Long id) {
        return stockEntradaDetalleRepository.findById(id);
    }

    // Método para obtener detalles de entrada de stock por stock_entrada_id
    public List<StockEntradaDetalle> getDetallesByStockEntradaId(Long stockEntradaId) {
        return stockEntradaDetalleRepository.findByStockEntradaId(stockEntradaId);
    }

    // Método para guardar un nuevo detalle de entrada de stock
    public StockEntradaDetalle saveStockEntradaDetalle(StockEntradaDetalle stockEntradaDetalle) {
        return stockEntradaDetalleRepository.save(stockEntradaDetalle);
    }

    // Método para eliminar un detalle de entrada de stock
    public void deleteStockEntradaDetalle(Long id) {
        stockEntradaDetalleRepository.deleteById(id);
    }
}

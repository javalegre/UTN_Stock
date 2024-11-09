package com.facturacion.practicoUTN.repository;

import com.facturacion.practicoUTN.model.StockEntrada;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockEntradaRepository extends CrudRepository<StockEntrada, Long> {
    // Método para buscar entradas de stock por el número
    List<StockEntrada> findByNumero(String numero);
}

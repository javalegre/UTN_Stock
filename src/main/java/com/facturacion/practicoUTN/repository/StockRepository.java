package com.facturacion.practicoUTN.repository;

import com.facturacion.practicoUTN.modelo.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {

}
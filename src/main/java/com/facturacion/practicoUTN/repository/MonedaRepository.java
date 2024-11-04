package com.facturacion.practicoUTN.repository;

import com.facturacion.practicoUTN.model.Moneda;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

// Repositorio para la entidad Moneda, Spring Data generará la implementación de la interfaz
public interface MonedaRepository extends CrudRepository<Moneda, Long> {
    // Método personalizado para buscar monedas por su símbolo
    Iterable<Moneda> findBySimbolo(String simbolo);

    // Método personalizado para buscar monedas predeterminadas
    Iterable<Moneda> findByPredeterminada(Boolean predeterminada);

}
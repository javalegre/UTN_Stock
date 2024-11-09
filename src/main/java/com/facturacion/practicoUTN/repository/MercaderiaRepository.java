package com.facturacion.practicoUTN.repository;

import com.facturacion.practicoUTN.model.Mercaderias;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MercaderiaRepository extends CrudRepository<Mercaderias, Long> {
    // Método para buscar mercaderías por nombre
    List<Mercaderias> findByNombre(String nombre);
}

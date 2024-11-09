package com.facturacion.practicoUTN.repository;

import com.facturacion.practicoUTN.model.Almacenes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlmacenesRepository extends CrudRepository<Almacenes, Long> {
    // Aquí puedes agregar consultas personalizadas si las necesitas
}

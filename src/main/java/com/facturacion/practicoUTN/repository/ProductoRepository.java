package com.facturacion.practicoUTN.repository;

import com.facturacion.practicoUTN.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
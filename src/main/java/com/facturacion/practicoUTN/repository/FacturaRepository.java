package com.facturacion.practicoUTN.repository;

import com.facturacion.practicoUTN.modelo.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Long> {

}

package com.facturacion.practicoUTN.repository;

import com.facturacion.practicoUTN.modelo.FacturaDetalle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaDetalleRepository extends JpaRepository<FacturaDetalle, Long> {

}
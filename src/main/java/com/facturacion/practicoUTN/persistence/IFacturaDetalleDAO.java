package com.facturacion.practicoUTN.persistence;


import java.util.List;

public interface IFacturaDetalleDAO {
    List<FacturaDetalleDTO> listarFacturaDetalles();
    FacturaDetalleDTO guardarFacturaDetalle(FacturaDetalleDTO facturaDetalle);
    void eliminarFacturaDetalle(Long id);
}

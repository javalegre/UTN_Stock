package com.facturacion.practicoUTN.persistence;

public interface IFacturaDAO {
    void listarFacturas();
    FacturaDTO guardarFactura(FacturaDTO factura);
    void eliminarFactura(Long id);
}

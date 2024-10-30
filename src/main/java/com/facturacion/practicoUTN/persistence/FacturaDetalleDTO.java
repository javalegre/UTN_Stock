package com.facturacion.practicoUTN.persistence;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FacturaDetalleDTO {
    private Long id;
    private FacturaDTO factura;
    private ProductoDTO producto;
    private Integer cantidad;
    // Getters y setters
}


package com.facturacion.practicoUTN.persistence;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class FacturaDTO {
    private Long id;
    private String númeroFactura;
    private Date fechaEmisión;
    // Getters y setters
}


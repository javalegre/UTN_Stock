package com.facturacion.practicoUTN.persistence;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoDTO {
    private Long id;
    private String códigoBarras;
    private String descripción;

}

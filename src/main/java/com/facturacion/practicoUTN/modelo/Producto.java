package com.facturacion.practicoUTN.modelo;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Producto")

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigoBarras;
    private String descripcion;
    private Double precioUnitario;
    private String unidadMedida;
    private String categoria;
    private String imagen;

}

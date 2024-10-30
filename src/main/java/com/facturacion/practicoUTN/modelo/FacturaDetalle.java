package com.facturacion.practicoUTN.modelo;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Getter
@Setter
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FacturaDetalle")

public class FacturaDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Factura factura;
    @ManyToOne
    private Producto producto;
    private Integer cantidad;
    private Double precioUnitario;
    private Double subtotal;

}
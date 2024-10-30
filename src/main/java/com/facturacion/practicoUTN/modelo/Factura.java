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
@Table(name = "Factura")

public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroFactura;
    private Date fechaEmision;
    @ManyToOne
    private Cliente cliente;
    private Double total;
    private Double impuestos;
    private String estado;

}

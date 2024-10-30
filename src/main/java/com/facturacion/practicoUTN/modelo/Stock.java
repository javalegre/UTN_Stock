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
@Table(name = "Stock")

public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Producto producto;
    private Integer cantidadDisponible;
    private String ubicacionAlmacen;
    private Date fechaUltimaActualizacion;

}

package com.facturacion.practicoUTN.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("stock_entradas_detalles")
public class StockEntradaDetalle {

    @Id
    private Long id;

    @Column("stock_entrada_id")
    private Integer stockEntradaId; // ID de la entrada de stock

    @Column("Cantidad")
    private Double cantidad; // Cantidad del producto en la entrada de stock

    @Column("mercaderia_id")
    private Integer mercaderiaId; // ID de la mercadería

    @Column("descripcion")
    private String descripcion; // Descripción del detalle

    @Column("precio_unitario")
    private BigDecimal precioUnitario; // Precio unitario del producto

    @Column("total")
    private BigDecimal total; // Total (cantidad * precio_unitario)

    @Column("created")
    private LocalDateTime created; // Fecha de creación

    @Column("modified")
    private LocalDateTime modified; // Fecha de modificación

    @Column("deleted")
    private LocalDateTime deleted; // Fecha de eliminación (puede ser nula)

    public StockEntradaDetalle(Integer stockEntradaId, Double cantidad, Integer mercaderiaId, String descripcion,
                               BigDecimal precioUnitario, BigDecimal total) {
        this.stockEntradaId = stockEntradaId;
        this.cantidad = cantidad;
        this.mercaderiaId = mercaderiaId;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.total = total;
        this.created = LocalDateTime.now(); // Establece la fecha actual al crear la instancia
        this.modified = LocalDateTime.now(); // Establece la fecha actual al crear la instancia
    }

    public void update() {
        this.modified = LocalDateTime.now(); // Actualiza solo la fecha de modificación
    }
}


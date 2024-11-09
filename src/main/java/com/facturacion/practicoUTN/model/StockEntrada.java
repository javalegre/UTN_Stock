package com.facturacion.practicoUTN.model;

import jakarta.validation.constraints.NotEmpty;
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
@Table("stock_entradas")
public class StockEntrada {

    @Id
    private Long id;

    @Column("fecha")
    private LocalDateTime fecha; // Fecha de la entrada

    @Column("numero")
    private String numero; // Número de la entrada

    @Column("total")
    private BigDecimal total; // Total de la entrada

    @Column("observaciones")
    private String observaciones; // Observaciones de la entrada

    @Column("almacene_id")
    private Integer almaceneId; // ID del almacén

    @Column("created")
    private LocalDateTime created; // Fecha de creación

    @Column("modified")
    private LocalDateTime modified; // Fecha de modificación

    @Column("deleted")
    private LocalDateTime deleted; // Fecha de eliminación (puede ser nula)

    public StockEntrada(String numero, BigDecimal total, String observaciones, Integer almaceneId) {
        this.numero = numero;
        this.total = total;
        this.observaciones = observaciones;
        this.almaceneId = almaceneId;
        this.created = LocalDateTime.now(); // Establece la fecha actual al crear la instancia
        this.modified = LocalDateTime.now(); // Establece la fecha actual al crear la instancia
    }

    public void update() {
        this.modified = LocalDateTime.now(); // Actualiza solo la fecha de modificación
    }
}

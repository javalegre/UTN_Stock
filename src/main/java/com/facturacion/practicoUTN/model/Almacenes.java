package com.facturacion.practicoUTN.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("almacenes")
public class Almacenes {
    @Id
    private Long id;

    @NotEmpty(message = "El nombre del almacen es obligatorio")
    @Column("Nombre")
    private String nombre; // Nombre del almacen

    @Column("direccion")
    private String direccion;

    @Column("Predeterminado")
    private Boolean predeterminado; // Indica si es el almacen predeterminado

    @Column("created")
    private LocalDateTime created;

    @Column("modified")
    private LocalDateTime  modified;

    public Almacenes(String nombre, String direccion, Boolean predeterminado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.predeterminado = predeterminado;
        this.created = LocalDateTime.now(); // Establece la fecha actual al crear la instancia
        this.modified = LocalDateTime.now(); // Establece la fecha actual al crear la instancia
    }

    public void update() {
        this.modified = LocalDateTime.now(); // Actualiza solo la fecha de modificación
    }
}

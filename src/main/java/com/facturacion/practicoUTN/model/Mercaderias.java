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
@Table("mercaderias")
public class Mercaderias {

    @Id
    private Long id;

    @NotEmpty(message = "El nombre de la mercadería es obligatorio")
    @Column("nombre")
    private String nombre; // Nombre de la mercadería

    @Column("nombre_resumido")
    private String nombreResumido; // Nombre resumido de la mercadería

    @Column("NivelMinimo")
    private Integer nivelMinimo; // Nivel mínimo de la mercadería

    @Column("NivelOptimo")
    private Integer nivelOptimo; // Nivel óptimo de la mercadería

    @Column("Unidad")
    private String unidad; // Unidad de medida

    @Column("Descripcion")
    private String descripcion; // Descripción de la mercadería

    @Column("EnPedido")
    private Integer enPedido; // Cantidad en pedido

    @Column("PrecioContado")
    private BigDecimal precioContado; // Precio de contado

    @Column("PrecioFinanciado")
    private BigDecimal precioFinanciado; // Precio financiado

    @Column("PrecioCosto")
    private BigDecimal precioCosto; // Precio de costo

    @Column("Ingresar")
    private Integer ingresar; // Indicador de si se debe ingresar

    @Column("Vencimiento")
    private Integer vencimiento; // Vencimiento (probablemente en días o meses)

    @Column("Composicion")
    private String composicion; // Composición de la mercadería

    @Column("FechaActualizacion")
    private String fechaActualizacion; // Fecha de la última actualización (como texto)

    @Column("fe_condiciones_iva_id")
    private Integer feCondicionesIvaId; // ID de condiciones de IVA

    @Column("CodImpuesto")
    private Integer codImpuesto; // Código de impuesto

    @Column("moneda_id")
    private Integer monedaId; // ID de la moneda

    @Column("created")
    private LocalDateTime created; // Fecha de creación

    @Column("modified")
    private LocalDateTime modified; // Fecha de modificación

    @Column("deleted")
    private LocalDateTime deleted; // Fecha de eliminación (puede ser nula)

    public Mercaderias(String nombre, String nombreResumido, Integer nivelMinimo, Integer nivelOptimo, String unidad,
                      String descripcion, Integer enPedido, BigDecimal precioContado, BigDecimal precioFinanciado,
                      BigDecimal precioCosto, Integer ingresar, Integer vencimiento, String composicion,
                      String fechaActualizacion, Integer feCondicionesIvaId, Integer codImpuesto, Integer monedaId) {
        this.nombre = nombre;
        this.nombreResumido = nombreResumido;
        this.nivelMinimo = nivelMinimo;
        this.nivelOptimo = nivelOptimo;
        this.unidad = unidad;
        this.descripcion = descripcion;
        this.enPedido = enPedido;
        this.precioContado = precioContado;
        this.precioFinanciado = precioFinanciado;
        this.precioCosto = precioCosto;
        this.ingresar = ingresar;
        this.vencimiento = vencimiento;
        this.composicion = composicion;
        this.fechaActualizacion = fechaActualizacion;
        this.feCondicionesIvaId = feCondicionesIvaId;
        this.codImpuesto = codImpuesto;
        this.monedaId = monedaId;
        this.created = LocalDateTime.now(); // Establece la fecha actual al crear la instancia
        this.modified = LocalDateTime.now(); // Establece la fecha actual al crear la instancia
    }

    public void update() {
        this.modified = LocalDateTime.now(); // Actualiza solo la fecha de modificación
    }
}

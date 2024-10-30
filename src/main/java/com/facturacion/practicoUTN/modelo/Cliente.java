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
@Table(name = "Cliente")

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String razonSocial;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private Date fechaRegistro;

}

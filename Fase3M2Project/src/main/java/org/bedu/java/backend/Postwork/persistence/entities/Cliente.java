package org.bedu.java.backend.Postwork.persistence.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table(name = "CLIENTES")
@Entity
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     @Column(name = "nombre", nullable = false)
    private String nombreEmpleado;

    @Column(name = "contacto", nullable = false)
    private String cargo;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "actividad")
    private String actividad;

    @Column(name = "numeroEmpleado")
    private String numeroEmpleado;
}
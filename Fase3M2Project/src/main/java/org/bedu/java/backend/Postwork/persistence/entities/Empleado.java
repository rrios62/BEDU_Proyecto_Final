package org.bedu.java.backend.Postwork.persistence.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table(name = "EMPLEADOS")
@Entity
@NoArgsConstructor
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado;

    @Column(name = "nombre", nullable = false)
    private String nombreEmpleado;

    @Column(name = "cargo", nullable = false)
    private String cargo;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "actividad")
    private String actividad;

    @Column(name = "numeroEmpleado")
    private int numeroEmpleado;
}

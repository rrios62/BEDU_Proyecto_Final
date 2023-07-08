package org.bedu.java.backend.Postwork.persistence.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table(name = "PEDIDOS")
@Entity
@NoArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cliente", nullable = false)
    private String cliente;

    @Column(name = "equipo", nullable = false)
    private String equipo;

    @Column(name = "fecha", nullable = false)
    private String fecha;

    @Column(name = "potencia", nullable = false)
    private int potencia;

    @Column(name = "unidadMedida", nullable = false)
    private String unidadMedida;

    @Column(name = "frecuencia", nullable = false)
    private int frecuencia;

    @Column(name = "amperes", nullable = false)
    private int amperes;

    @Column(name = "armazon", nullable = false)
    private String armazon;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "serie", nullable = false)
    private String serie;

    @Column(name = "desensamblaje", nullable = false)
    private String desensamblaje;

    @Column(name = "ensamblaje", nullable = false)
    private String ensamblaje;

    @Column(name = "embobinado", nullable = false)
    private String embobinado;

    @Column(name = "pruebas", nullable = false)
    private String pruebas;

    @Column(name = "estatus", nullable = false)
    private String estatus;

    @Column(name = "factura", nullable = false)
    private String factura;

}

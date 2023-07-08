package org.bedu.java.backend.Postwork.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Pedido {
    private Long id;
    private String cliente;
    private String equipo;
    private Date fecha;
    private int potencia;
    private String unidadMedida;
    private int rpm;
    private int frecuencia;
    private int amperes;
    private String armazon;
    private String marca;
    private String serie;
    private String desensamble;
    private String ensamble;
    private String embobinado;
    private String pruebas;
    private String notas;
    private String estatus;
    private String factura;

}

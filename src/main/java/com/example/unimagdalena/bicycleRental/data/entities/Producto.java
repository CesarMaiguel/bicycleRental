package com.example.unimagdalena.bicycleRental.data.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "descripcion", nullable = false, length = Integer.MAX_VALUE)
    private String descripcion;

    @Column(name = "precio", nullable = false, precision = 18)
    private BigDecimal precio;

    @Column(name = "estado", nullable = false, length = 50)
    private String estado;

    @Column(name = "disponibilidad", nullable = false)
    private Boolean disponibilidad = false;

    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;

    @Column(name = "id_tipoproducto", nullable = false)
    private Integer idTipoproducto;

}
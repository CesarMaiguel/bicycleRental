package com.example.unimagdalena.bicycleRental.data.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "bicicleta")
public class Bicicleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bicicleta", nullable = false)
    private Integer id;

    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;

    @Column(name = "modelo", nullable = false, length = 50)
    private String modelo;

    @Column(name = "marca", nullable = false, length = 50)
    private String marca;

    @Column(name = "id_reserva", nullable = false)
    private Integer idReserva;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto idProducto;

    @OneToMany(mappedBy = "idBicicleta")
    private Set<Reserva> reservas = new LinkedHashSet<>();

}
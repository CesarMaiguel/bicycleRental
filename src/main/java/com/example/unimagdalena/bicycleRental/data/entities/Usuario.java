package com.example.unimagdalena.bicycleRental.data.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "telefono", nullable = false, length = 50)
    private String telefono;

    @Column(name = "direccion", nullable = false, length = Integer.MAX_VALUE)
    private String direccion;

    @Column(name = "fecha_registro", nullable = false)
    private Instant fechaRegistro;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_roles", nullable = false)
    private Roles idRoles;

    @OneToMany(mappedBy = "idUsuario")
    private Set<Pqr> pqrs = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idUsuario")
    private Set<Reserva> reservas = new LinkedHashSet<>();

}
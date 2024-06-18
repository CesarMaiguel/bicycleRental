package com.example.unimagdalena.bicycleRental.data.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "programacion")
public class Programacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_programacion", nullable = false)
    private Integer idProgramacion;

    @Column(name = "programacion", nullable = false, length = 50)
    private String programacion;

    @Column(name = "fecha", nullable = false)
    private Instant fecha;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_ruta", nullable = false)
    private Ruta idRuta;

    @Column(name = "duracion", nullable = false, length = 50)
    private String duracion;

    @Column(name = "dificultad", nullable = false, length = 50)
    private String dificultad;

}
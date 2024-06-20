package com.example.unimagdalena.bicycleRental.data.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_roles", nullable = false)
    private Integer id;

    @Column(name = "tipo_roles", nullable = false, length = 50)
    private String tipoRoles;

    @Column(name = "estado", nullable = false, length = 50)
    private String estado;

    @OneToMany(mappedBy = "idRoles")
    private Set<Usuario> usuarios = new LinkedHashSet<>();

}
package com.example.unimagdalena.bicycleRental.web.models;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class UsuarioResponse {

    private BigDecimal idUsuario;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;
    private LocalDate fechaRegistro;
    private BigDecimal idRoles;
}
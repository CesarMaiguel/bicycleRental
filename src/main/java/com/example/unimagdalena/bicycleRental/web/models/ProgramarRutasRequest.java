package com.example.unimagdalena.bicycleRental.web.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProgramarRutasRequest {

    private String programacion;
    private String fecha;
    private BigDecimal idRuta;
    private String duracion;
    private String dificultad;

}
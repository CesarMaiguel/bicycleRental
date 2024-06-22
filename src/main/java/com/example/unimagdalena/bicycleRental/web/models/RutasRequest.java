package com.example.unimagdalena.bicycleRental.web.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RutasRequest {

    private BigDecimal idRuta;
    private String nombre;
    private String descripcion;
    private String estado;

}
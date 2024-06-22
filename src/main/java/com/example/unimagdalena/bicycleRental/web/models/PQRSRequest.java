package com.example.unimagdalena.bicycleRental.web.models;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class PQRSRequest {
    private String tipo;
    private String descripcion;
    private BigDecimal idUsuario;
    private String fechaCreacion;
}

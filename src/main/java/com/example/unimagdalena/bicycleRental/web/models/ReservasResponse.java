
package com.example.unimagdalena.bicycleRental.web.models;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class ReservasResponse {

    private BigDecimal idReserva;
    private BigDecimal idUsuario;
    private LocalDate fechaRegistro;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String estado;
    private BigDecimal idBicicleta;
    private BigDecimal idRuta;

}
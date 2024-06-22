package com.example.unimagdalena.bicycleRental.web.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CatalogoProductosResponse {

    private BigDecimal idProducto;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private String estado;
    private Boolean disponibilidad;
    private BigDecimal idBicicleta;
    private String idTipoProducto;

}

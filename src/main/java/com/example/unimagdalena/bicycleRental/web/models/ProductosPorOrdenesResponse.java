package com.example.unimagdalena.bicycleRental.web.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductosPorOrdenesResponse {

    private BigDecimal idProducto;
    private BigDecimal idOrden;
    private BigDecimal precio;
}
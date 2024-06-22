package com.example.unimagdalena.bicycleRental.web.controllers;

import com.example.unimagdalena.bicycleRental.web.models.ProductoResponse;
import com.example.unimagdalena.bicycleRental.web.models.RutasResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping(value = "/producto-inventario", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
public class ListarProductosInventarioController {

    @GetMapping("/consultar")
    public ResponseEntity<List<ProductoResponse>> consultarProductosInventario(@RequestParam Long idProducto) {
        log.info("Request - consultarProductosInventario");
        log.info("Response - consultarProductosInventario -> statusCode: {}",
                HttpStatus.OK.value());
        return ResponseEntity.ok(List.of(new ProductoResponse(), new ProductoResponse()));
    }

}
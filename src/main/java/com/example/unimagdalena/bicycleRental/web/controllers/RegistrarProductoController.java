package com.example.unimagdalena.bicycleRental.web.controllers;

import com.example.unimagdalena.bicycleRental.web.models.ProductoRequest;
import com.example.unimagdalena.bicycleRental.web.models.ProductoResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/registrar-productos", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
public class RegistrarProductoController {

    @PostMapping("/registrar")
    public ResponseEntity<ProductoResponse> registrarProducto(@RequestBody ProductoRequest productoRequest) {
        log.info("Request - registrarProducto");
        log.info("Response - registrarProducto -> statusCode: {}",
                HttpStatus.OK.value());
        return ResponseEntity.ok(new ProductoResponse());
    }

}
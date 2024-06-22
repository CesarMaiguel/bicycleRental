package com.example.unimagdalena.bicycleRental.web.controllers;

import com.example.unimagdalena.bicycleRental.web.models.ProductoRequest;
import com.example.unimagdalena.bicycleRental.web.models.ProductoResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/modificar-producto", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
public class ModificarProductoController {

    @PostMapping("/modificar")
    public ResponseEntity<ProductoResponse> modificarProducto(@RequestBody ProductoRequest productoRequest) {
        log.info("Request - modificarProducto");
        log.info("Response - modificarProducto -> statusCode: {}",
                HttpStatus.OK.value());
        return ResponseEntity.ok(new ProductoResponse());
    }

}
package com.example.unimagdalena.bicycleRental.web.controllers;

import com.example.unimagdalena.bicycleRental.service.interfaz.ProductoService;
import com.example.unimagdalena.bicycleRental.web.models.ProductoResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/catalogos-producto", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
public class CatalogoProductosController {

    private final ProductoService productoService;

    @GetMapping("/consultar")
    public ResponseEntity<List<ProductoResponse>> consultarCatalogoProductos() {
        log.info("Request - consultarCatalogoProductos");
        log.info("Response - consultarCatalogoProductos -> statusCode: {}",
                HttpStatus.OK.value());
        return ResponseEntity.ok(productoService.getAllProducts());
    }

}
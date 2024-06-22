package com.example.unimagdalena.bicycleRental.web.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/alquilar-producto", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
public class AlquilarProductoController {
    @PostMapping("/alquilar")
    public ResponseEntity<String> alquilarProducto(@RequestParam Long idProducto) {
        log.info("Request - alquilarProducto");
        log.info("Response - alquilarProducto -> statusCode: {}",
                HttpStatus.OK.value());
        return ResponseEntity.ok("Producto alquilado exitosamente.");
    }
}
package com.example.unimagdalena.bicycleRental.web.controllers;

import com.example.unimagdalena.bicycleRental.web.models.ProductoRequest;
import com.example.unimagdalena.bicycleRental.web.models.ProductoResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping(value = "/comprar-producto", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
public class ComprarProductoController {
    @PostMapping("/comprar")
    public ResponseEntity<String> comprarProducto(@RequestParam Long idProducto) {
        log.info("Request - comprarProducto");
        log.info("Response - comprarProducto -> statusCode: {}",
                HttpStatus.OK.value());
        return ResponseEntity.ok("Producto comprado exitosamente.");
    }
}
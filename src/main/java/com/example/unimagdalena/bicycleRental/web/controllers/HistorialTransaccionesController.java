package com.example.unimagdalena.bicycleRental.web.controllers;

import com.example.unimagdalena.bicycleRental.web.models.ProductosPorOrdenesResponse;
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

import java.util.List;

@RestController
@RequestMapping(value = "/historial-transacciones", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
public class HistorialTransaccionesController {

    @GetMapping("/consultar")
    public ResponseEntity<List<ProductosPorOrdenesResponse>> consultarHistorialTransacciones(@RequestParam Long idUsuario) {
        log.info("Request - consultarHistorialTransacciones");
        log.info("Response - consultarHistorialTransacciones -> statusCode: {}",
                HttpStatus.OK.value());
        return ResponseEntity.ok(List.of(new ProductosPorOrdenesResponse(), new ProductosPorOrdenesResponse()));
    }

}
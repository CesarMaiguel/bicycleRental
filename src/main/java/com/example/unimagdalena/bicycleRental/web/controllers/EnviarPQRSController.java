package com.example.unimagdalena.bicycleRental.web.controllers;

import com.example.unimagdalena.bicycleRental.web.models.PQRSRequest;
import com.example.unimagdalena.bicycleRental.web.models.ProductoRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/enviar-pqr", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
public class EnviarPQRSController {
    @PostMapping("/enviar")
    public ResponseEntity<String> enviarPQR(@RequestBody PQRSRequest PQRSRequest) {
        log.info("Request - enviarPQR");
        log.info("Response - enviarPQR -> statusCode: {}",
                HttpStatus.OK.value());
        return ResponseEntity.ok("PQRS enviado exitosamente.");
    }
}
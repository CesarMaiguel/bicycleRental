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
@RequestMapping(value = "/entregar-bicicleta", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
public class EntregarBicicletaController {

    @PostMapping("/entregar")
    public ResponseEntity<String> entregarBicicleta(@RequestParam Long idBicicleta) {
        log.info("Request - entregarBicicleta");
        log.info("Response - entregarBicicleta -> statusCode: {}",
                HttpStatus.OK.value());
        return ResponseEntity.ok("Bicicleta alquilado exitosamente.");
    }

}
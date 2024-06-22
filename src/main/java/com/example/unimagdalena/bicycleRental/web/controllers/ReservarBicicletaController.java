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
@RequestMapping(value = "/reserva-bicicleta", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
public class ReservarBicicletaController {

    @PostMapping("/reservar")
    public ResponseEntity<String> reservarBicicleta(@RequestParam Long idBicicleta) {
        log.info("Request - reservarBicicleta");
        log.info("Response - reservarBicicleta -> statusCode: {}",
                HttpStatus.OK.value());
        return ResponseEntity.ok("Bicicleta reservada exitosamente.");
    }

}
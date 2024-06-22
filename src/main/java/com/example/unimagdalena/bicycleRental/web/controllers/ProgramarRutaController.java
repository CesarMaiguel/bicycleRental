package com.example.unimagdalena.bicycleRental.web.controllers;

import com.example.unimagdalena.bicycleRental.web.models.ProgramarRutasRequest;
import com.example.unimagdalena.bicycleRental.web.models.RutasRequest;
import com.example.unimagdalena.bicycleRental.web.models.RutasResponse;
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
@RequestMapping(value = "/programar-ruta", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
public class ProgramarRutaController {

    @PostMapping("/programar")
    public ResponseEntity<String> programarRuta(@RequestBody ProgramarRutasRequest programarRutasRequest) {
        log.info("Request - programarRuta");
        log.info("Response - programarRuta -> statusCode: {}",
                HttpStatus.OK.value());
        return ResponseEntity.ok("Ruta programada exitosamente");
    }

}
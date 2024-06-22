package com.example.unimagdalena.bicycleRental.web.controllers;

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
@RequestMapping(value = "/registrar-ruta", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
public class RegistrarRutaController {

    @PostMapping("/registrar")
    public ResponseEntity<RutasResponse> registrarRutas(@RequestBody RutasRequest rutaRequest) {
        log.info("Request - registrarRutas");
        log.info("Response - registrarRutas -> statusCode: {}",
                HttpStatus.OK.value());
        return ResponseEntity.ok(new RutasResponse());
    }

}
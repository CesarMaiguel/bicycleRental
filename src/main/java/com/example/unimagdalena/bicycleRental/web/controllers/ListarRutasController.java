package com.example.unimagdalena.bicycleRental.web.controllers;

import com.example.unimagdalena.bicycleRental.service.interfaz.RutaService;
import com.example.unimagdalena.bicycleRental.web.models.RutasResponse;
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
@RequestMapping(value = "/rutas", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
public class ListarRutasController {

    private final RutaService rutaService;

    @GetMapping("/consultar")
    public ResponseEntity<List<RutasResponse>> consultarRutas() {
        log.info("Request - consultarRutas");
        log.info("Response - consultarRutas -> statusCode: {}",
                HttpStatus.OK.value());
        return ResponseEntity.ok(rutaService.getAllRutas());
    }

}
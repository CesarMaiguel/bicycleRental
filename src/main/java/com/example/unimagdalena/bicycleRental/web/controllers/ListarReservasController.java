package com.example.unimagdalena.bicycleRental.web.controllers;

import com.example.unimagdalena.bicycleRental.web.models.ReservasResponse;
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
@RequestMapping(value = "/reservas", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
public class ListarReservasController {

    @GetMapping("/consultar")
    public ResponseEntity<List<ReservasResponse>> consultarReservas() {
        log.info("Request - consultarReservas");
        log.info("Response - consultarReservas -> statusCode: {}",
                HttpStatus.OK.value());
        return ResponseEntity.ok(List.of(new ReservasResponse(), new ReservasResponse()));
    }

}
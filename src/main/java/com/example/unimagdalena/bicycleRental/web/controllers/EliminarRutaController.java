package com.example.unimagdalena.bicycleRental.web.controllers;

import com.example.unimagdalena.bicycleRental.web.models.ProductoRequest;
import com.example.unimagdalena.bicycleRental.web.models.RutasRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/eliminar-ruta", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
public class EliminarRutaController {

    @DeleteMapping("/eliminar")
    public ResponseEntity<String> eliminarRuta(@RequestParam Long idRuta) {
        log.info("Request - eliminarRuta");
        log.info("Response - eliminarRuta -> statusCode: {}",
                HttpStatus.OK.value());
        return ResponseEntity.ok("La ruta ha sido eliminada exitosamente.");
    }

}
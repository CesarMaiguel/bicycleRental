package com.example.unimagdalena.bicycleRental.web.controllers;

import com.example.unimagdalena.bicycleRental.web.models.ProductoRequest;
import com.example.unimagdalena.bicycleRental.web.models.ProductoResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/eliminar-producto", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
public class EliminarProductoController {

    @DeleteMapping("/eliminar")
    public ResponseEntity<String> eliminarProducto(@RequestParam Long idProducto) {
        log.info("Request - eliminarProducto");
        log.info("Response - eliminarProducto -> statusCode: {}",
                HttpStatus.OK.value());
        return ResponseEntity.ok("EL producto ha sido eliminado exitosamente.");
    }

}
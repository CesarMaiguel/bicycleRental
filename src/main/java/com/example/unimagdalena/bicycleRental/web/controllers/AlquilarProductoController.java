package com.example.unimagdalena.bicycleRental.web.controllers;

//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@RequestMapping(value = "/alquilar-producto", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
@Tag(name = "API de alquiler de biciletas", description = "API de ejemplo para demostración")
public class AlquilarProductoController {
    @PostMapping("/alquilar")
    @Operation(summary = "Alquilar un producto por identificador", description = "El objetivo es alquilar un producto")
    public ResponseEntity<String> alquilarProducto(@RequestParam Long idProducto) {
        log.info("Request - alquilarProducto");
        log.info("Response - alquilarProducto -> statusCode: {}",
                HttpStatus.OK.value());
        return ResponseEntity.ok("Producto alquilado exitosamente.");
    }
}
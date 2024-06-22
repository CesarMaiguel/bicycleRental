package com.example.unimagdalena.bicycleRental.web.controllers;

import com.example.unimagdalena.bicycleRental.web.models.RutasRequest;
import com.example.unimagdalena.bicycleRental.web.models.RutasResponse;
import com.example.unimagdalena.bicycleRental.web.models.UsuarioRequest;
import com.example.unimagdalena.bicycleRental.web.models.UsuarioResponse;
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
@RequestMapping(value = "/registrar-usuarios", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
public class RegistrarUsuarioController {

    @PostMapping("/registrar")
    public ResponseEntity<UsuarioResponse> registrarUsuario(@RequestBody UsuarioRequest usuarioRequest) {
        log.info("Request - registrarUsuario");
        log.info("Response - registrarUsuario -> statusCode: {}",
                HttpStatus.OK.value());
        return ResponseEntity.ok(new UsuarioResponse());
    }

}
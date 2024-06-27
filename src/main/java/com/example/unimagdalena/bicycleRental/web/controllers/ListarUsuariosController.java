package com.example.unimagdalena.bicycleRental.web.controllers;

import com.example.unimagdalena.bicycleRental.service.interfaz.UsuarioService;
import com.example.unimagdalena.bicycleRental.web.models.UsuarioResponse;
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
@RequestMapping(value = "/usuarios", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Slf4j
public class ListarUsuariosController {

    private final UsuarioService usuarioService;

    @GetMapping("/consultar")
    public ResponseEntity<List<UsuarioResponse>> consultarUsuarios() {
        log.info("Request - consultarUsuarios");
        log.info("Response - consultarUsuarios -> statusCode: {}",
                HttpStatus.OK.value());
        return ResponseEntity.ok(usuarioService.getAllUsers());
    }

}
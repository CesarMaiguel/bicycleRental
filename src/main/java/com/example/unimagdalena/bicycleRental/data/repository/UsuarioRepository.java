package com.example.unimagdalena.bicycleRental.data.repository;

import com.example.unimagdalena.bicycleRental.data.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
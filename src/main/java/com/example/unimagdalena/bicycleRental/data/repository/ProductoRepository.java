package com.example.unimagdalena.bicycleRental.data.repository;

import com.example.unimagdalena.bicycleRental.data.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
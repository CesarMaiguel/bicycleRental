package com.example.unimagdalena.bicycleRental.data.repository;

import com.example.unimagdalena.bicycleRental.data.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
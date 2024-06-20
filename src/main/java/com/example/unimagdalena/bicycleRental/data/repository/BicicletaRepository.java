package com.example.unimagdalena.bicycleRental.data.repository;

import com.example.unimagdalena.bicycleRental.data.entities.Bicicleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BicicletaRepository extends JpaRepository<Bicicleta, Integer> {
}
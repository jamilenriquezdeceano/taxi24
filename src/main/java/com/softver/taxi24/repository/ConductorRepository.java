package com.softver.taxi24.repository;

import com.softver.taxi24.model.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface ConductorRepository extends JpaRepository<Conductor, Long> {
    @Query(value = "SELECT * FROM conductores c WHERE c.disponibilidad = true", nativeQuery = true)
    List<Conductor> buscarConductoresDisponibles();


    @Query(value = "SELECT * FROM conductores c WHERE c.disponibilidad = true and c.ubicacion BETWEEN :radioInf and :radioSup", nativeQuery = true)
    List<Conductor> buscarConductoresDisponiblesPorKm(@Param("radioInf") Integer radioInferior, @Param("radioSup") Integer radioSuperior);



}
package com.softver.taxi24.service;


import com.softver.taxi24.model.Conductor;
import com.softver.taxi24.model.Pasajero;
import com.softver.taxi24.repository.ConductorRepository;
import com.softver.taxi24.repository.PasajeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PasajeroService {

    @Autowired
    PasajeroRepository pasajeroRepository;

    @Autowired
    ConductorRepository conductorRepository;

    public List<Pasajero> obtenerTodosPasajeros(){
        return pasajeroRepository.findAll();
    }

    public Optional<Pasajero> buscarPorId(Long id){
        return pasajeroRepository.findById(id);
    }

    public List<Conductor> buscarConductoresCercanos(Integer ubicacion){
        return conductorRepository.buscarConductoresCercanos(ubicacion);
    }

}

package com.softver.taxi24.service;

import com.softver.taxi24.model.Conductor;
import com.softver.taxi24.repository.ConductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConductorService {

    @Autowired
    ConductorRepository conductorRepository;

    public Conductor crear(Conductor conductor){
        return conductorRepository.save(conductor);
    }

    public List<Conductor> todos(){
        return conductorRepository.findAll();
    }

    public Optional<Conductor> buscarPorId(Long id){
        return conductorRepository.findById(id);
    }

   public List<Conductor> obtenerTodosConductoresDisponibles(){
        return conductorRepository.buscarConductoresDisponibles();
    }

    public List<Conductor> obtenerTodosConductoresDisponibles3KM(Integer ubicacion){
        return conductorRepository.buscarConductoresDisponiblesPorKm(ubicacion - 3, ubicacion + 3);
    }



}

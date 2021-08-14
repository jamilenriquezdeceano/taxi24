package com.softver.taxi24.service;

import com.softver.taxi24.model.Viaje;
import com.softver.taxi24.repository.ViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ViajeService {

    @Autowired
    ViajeRepository viajeRepository;
    public Viaje crear(Viaje viaje){
        return viajeRepository.save(viaje);
    }

    public List<Viaje> todos(){
        return viajeRepository.findAll();
    }

    public Viaje completarViaje(Long id){
        Viaje viaje = viajeRepository.findById(id).get();
        viaje.setEstatus("COMPLETADO");
        return viajeRepository.save(viaje);

    }
}

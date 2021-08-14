package com.softver.taxi24.service;


import com.softver.taxi24.model.Conductor;
import com.softver.taxi24.model.Pasajero;
import com.softver.taxi24.repository.PasajeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasajeroService {

    @Autowired
    PasajeroRepository pasajeroRepository;

    public List<Pasajero> obtenerTodosPasajeros(){
        return pasajeroRepository.findAll();
    }

}

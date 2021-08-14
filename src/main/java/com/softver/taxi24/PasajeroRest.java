package com.softver.taxi24;


import com.softver.taxi24.model.Conductor;
import com.softver.taxi24.model.Pasajero;
import com.softver.taxi24.service.ConductorService;
import com.softver.taxi24.service.PasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PasajeroRest {

    @Autowired
    private PasajeroService pasajeroService;


    @GetMapping("/pasajeros")
    private ResponseEntity<List<Pasajero>> todos(){
        return ResponseEntity.ok(pasajeroService.obtenerTodosPasajeros());
    }
}

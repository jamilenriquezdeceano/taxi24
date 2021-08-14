package com.softver.taxi24;


import com.softver.taxi24.model.Conductor;
import com.softver.taxi24.model.Pasajero;
import com.softver.taxi24.service.ConductorService;
import com.softver.taxi24.service.PasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PasajeroRest {

    @Autowired
    private PasajeroService pasajeroService;




    @GetMapping("/pasajeros")
    private ResponseEntity<List<Pasajero>> todos(){
        return ResponseEntity.ok(pasajeroService.obtenerTodosPasajeros());
    }
    @GetMapping("/pasajero/{id}")
    private ResponseEntity<Optional<Pasajero>> pasajero(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok(pasajeroService.buscarPorId(id));
    }

    @GetMapping("/pasajero/buscar/viaje/cercano/{ubicacion}")
    private ResponseEntity<List<Conductor>> pasajero(@PathVariable(value = "ubicacion") Integer ubicacion){
        return ResponseEntity.ok(pasajeroService.buscarConductoresCercanos(ubicacion));
    }
}

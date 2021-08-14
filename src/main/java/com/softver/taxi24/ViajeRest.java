package com.softver.taxi24;


import com.softver.taxi24.model.Conductor;
import com.softver.taxi24.model.Viaje;
import com.softver.taxi24.service.ConductorService;
import com.softver.taxi24.service.ViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ViajeRest {

    @Autowired
    private ViajeService viajeService;

    @GetMapping("/viajes")
    private ResponseEntity<List<Viaje>> todos(){
        return ResponseEntity.ok(viajeService.todos());
    }

    @PostMapping("/viaje")
    public Viaje crear(@RequestBody Viaje viaje) {
        return viajeService.crear(viaje);
    }

    @PutMapping("/viaje/completar/{id}")
    public Viaje completaViaje(@PathVariable(value = "id") Long id) {
        return viajeService.completarViaje(id);
    }

}

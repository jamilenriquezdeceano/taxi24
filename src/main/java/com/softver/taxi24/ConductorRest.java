package com.softver.taxi24;

import com.softver.taxi24.model.Conductor;
import com.softver.taxi24.repository.ConductorRepository;
import com.softver.taxi24.service.ConductorService;
import com.sun.istack.NotNull;
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
public class ConductorRest {

    @Autowired
    private ConductorService conductorService;
    //private ConductorRepository conductorRepository;


    @GetMapping("/conductores")
    private ResponseEntity<List<Conductor>> todos(){
        return ResponseEntity.ok(conductorService.todos());
    }

    @GetMapping("/conductores/disponibles")
    private ResponseEntity<List<Conductor>> disponibles(){
        return ResponseEntity.ok(conductorService.obtenerTodosConductoresDisponibles());
    }

    @GetMapping("/conductor/{id}")
    private ResponseEntity<Optional<Conductor>> conductor(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok(conductorService.buscarPorId(id));
    }

    @GetMapping("/conductores/disponibles/radio3km/{ubicacion}")
    private ResponseEntity<List<Conductor>> conductoresDisponibles3km(@PathVariable(value = "ubicacion") Integer ubicacion){
        return ResponseEntity.ok(conductorService.obtenerTodosConductoresDisponibles3KM(ubicacion));
    }
}

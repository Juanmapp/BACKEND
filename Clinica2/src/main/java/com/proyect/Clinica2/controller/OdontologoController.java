package com.proyect.Clinica2.controller;

import com.proyect.Clinica2.persistence.entity.Odontologo;
import com.proyect.Clinica2.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    @Autowired
    private OdontologoService odontologoService;

    @GetMapping()
    public List<Odontologo> listarTodos() {
        return this.odontologoService.listar();
    }

    @PostMapping()
    public ResponseEntity<?> registrarOdontologo(@RequestBody Odontologo odontologo) {
        odontologoService.guardar(odontologo);
        return ResponseEntity.ok(HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public Optional<Odontologo> buscarOdontologo(@PathVariable Integer id) {
       return odontologoService.buscar(id);

    }

    @PutMapping()
    public ResponseEntity<?> modificarOdontolog(@RequestBody Odontologo odontologo) {
        odontologoService.modificar(odontologo);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarOdontologo(@PathVariable Integer id) {
        odontologoService.eliminar(id);
        return ResponseEntity.ok(HttpStatus.OK)
    }



}

















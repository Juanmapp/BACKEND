package com.proyect.Clinica2.controller;

import com.proyect.Clinica2.persistence.entity.Odontologo;
import com.proyect.Clinica2.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<Odontologo> registrarOdontologo(@RequestBody Odontologo odontologo) {
        return ResponseEntity.ok(odontologoService.guardar(odontologo));
    }















}

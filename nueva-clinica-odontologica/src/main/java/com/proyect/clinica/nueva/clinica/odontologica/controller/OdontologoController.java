package com.proyect.clinica.nueva.clinica.odontologica.controller;

import com.proyect.clinica.nueva.clinica.odontologica.DTO.OdontologoDTO;
import com.proyect.clinica.nueva.clinica.odontologica.model.Odontologo;
import com.proyect.clinica.nueva.clinica.odontologica.repository.impl.OdontologoDAOH2;
import com.proyect.clinica.nueva.clinica.odontologica.service.OdontologoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {

    private OdontologoService odontologoService = new OdontologoService(new OdontologoDAOH2());

    @GetMapping()
    public List<OdontologoDTO> listarTodos() {
        return this.odontologoService.listar();
    }

    @PostMapping()
    public ResponseEntity<Odontologo> registrarOdontologo(@RequestBody Odontologo odontologo) {
        return ResponseEntity.ok(odontologoService.agregar(odontologo));
    }













}

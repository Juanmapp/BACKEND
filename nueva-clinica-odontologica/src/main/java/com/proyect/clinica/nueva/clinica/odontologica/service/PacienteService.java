package com.proyect.clinica.nueva.clinica.odontologica.service;

import com.proyect.clinica.nueva.clinica.odontologica.model.Paciente;
import com.proyect.clinica.nueva.clinica.odontologica.repository.IDAO;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

    private IDAO<Paciente> pacienteIDAO;

    public PacienteService(IDAO<Paciente> pacienteIDAO) {
        this.pacienteIDAO = pacienteIDAO;
    }

    public Paciente listar(int id) {
        return this.pacienteIDAO.listar(id);
    }
    public Paciente agregar(Paciente paciente) {
        return this.pacienteIDAO.agregar(paciente);
    }
    public void eliminar(int id) {
        this.pacienteIDAO.eliminar(id);
    }
    public Paciente actualizar(Paciente paciente) {
        return this.pacienteIDAO.actualizar(paciente);
    }

}

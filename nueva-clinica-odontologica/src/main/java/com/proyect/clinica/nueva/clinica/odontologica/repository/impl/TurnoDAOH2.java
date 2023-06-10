package com.proyect.clinica.nueva.clinica.odontologica.repository.impl;

import com.proyect.clinica.nueva.clinica.odontologica.model.Turno;
import com.proyect.clinica.nueva.clinica.odontologica.repository.IDAO;

import java.util.List;

public class TurnoDAOH2 implements IDAO<Turno> {

    private List<Turno> turnos;

    @Override
    public List<Turno> listar() {
        return null;
    }

    @Override
    public Turno agregar(Turno turno) {
        turnos.add(turno);
        return turno;
    }

    @Override
    public void eliminar(int id) {

    }

    @Override
    public Turno actualizar(Turno turno) {
        return null;
    }
}

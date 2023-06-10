package com.proyect.clinica.nueva.clinica.odontologica.service;

import com.proyect.clinica.nueva.clinica.odontologica.model.Turno;
import com.proyect.clinica.nueva.clinica.odontologica.repository.IDAO;
import com.proyect.clinica.nueva.clinica.odontologica.repository.impl.TurnoDAOH2;

import java.util.List;

public class TurnoService {

        public IDAO<Turno> turnosDAHOH2;

    public Turno registrarTurno(Turno turno){
        return  turnosDAHOH2.agregar(turno);
    }

}

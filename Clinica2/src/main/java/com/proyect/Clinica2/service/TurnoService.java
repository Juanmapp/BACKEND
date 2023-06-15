package com.proyect.Clinica2.service;

import com.proyect.Clinica2.persistence.entity.Turno;
import com.proyect.Clinica2.persistence.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoService {

    @Autowired
    TurnoRepository turnoRepository;

    public Turno guardarTurno(Turno turno) {

        return turnoRepository.save(turno);

    }
    public List<Turno> listarTodos() {
        return turnoRepository.findAll();
    }

    public Turno modificarTurno(Turno turno) {

        return turnoRepository.save(turno);

    }

    public void eliminarTurno(Integer id) {
        turnoRepository.deleteById(id);
    }


}

package com.proyect.Clinica2.service;

import com.proyect.Clinica2.persistence.entity.Domicilio;
import com.proyect.Clinica2.persistence.entity.Odontologo;
import com.proyect.Clinica2.persistence.entity.Paciente;
import com.proyect.Clinica2.persistence.entity.Turno;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@SpringBootTest
class TurnoServiceTest {
    @Autowired
    private TurnoService turnoService;
    @Autowired
    private OdontologoService odontologoService;
    @Autowired
    private PacienteService pacienteService;

    @Test
    void guardarTurno() {
        Odontologo odontologo = new Odontologo("Costa", "Diego", "12214");
        odontologoService.guardar(odontologo);
        Paciente paciente = new Paciente( "Sergio", "Aguero", "3789559", new Date(05-01-2023));
        pacienteService.guardar(paciente);
        Turno turno = new Turno(paciente,odontologo,new Date(06-05-2023));
        Turno turno1 = turnoService.guardarTurno(turno);
        assertNotNull(turno1);
    }

    @Test
    void listarTodos() {
        List<Turno> turnos = turnoService.modificarTurno();
        assertTrue(turnos.size()>0);
    }

    @Test
    void modificarTurno() {
        Turno turno = turnoService.lis
        turnoService.modificarTurno()
    }

    @Test
    void eliminarTurno() {
    }
}
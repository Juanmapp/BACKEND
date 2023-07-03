package com.proyect.Clinica2.service;

import com.proyect.Clinica2.persistence.entity.Domicilio;
import com.proyect.Clinica2.persistence.entity.Odontologo;
import com.proyect.Clinica2.persistence.entity.Paciente;
import com.proyect.Clinica2.persistence.entity.Turno;
import org.junit.Assert;
import org.junit.Before;
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

    @Before
    public void registrarTurnoBefore() {
        Odontologo odontologo = new Odontologo("De paul", "Lucas", "12214");
        odontologoService.guardar(odontologo);
        Paciente paciente = new Paciente( "Matias", "Kraneviter", "32342345", new Date(05-01-2023));
        pacienteService.guardar(paciente);
        Turno turno = new Turno(paciente,odontologo,new Date(07-04-2023));
        turnoService.guardarTurno(turno);
    }

    @Test
    void guardarTurno() {
        Odontologo odontologo = new Odontologo("Costa", "Diego", "12214");
        odontologoService.guardar(odontologo);
        Paciente paciente = new Paciente( "Sergio", "Aguero", "3789559", new Date(2023-4-7));
        pacienteService.guardar(paciente);
        Turno turno = new Turno(paciente,odontologo,new Date(123,04,03,04,05,01));
        Turno turno1 = turnoService.guardarTurno(turno);
        assertNotNull(turno1);
    }

    @Test
    void listarTodos() {
        this.registrarTurnoBefore();
        List<Turno> turnos = turnoService.listarTodos();
        Assert.assertTrue(turnos.size()>0);
    }

    @Test
    void modificarTurno() {
        Turno turno = new Turno(1,pacienteService.buscar(1).get(), odontologoService.buscar(1).get(), new Date(05-01-2023));
        turnoService.modificarTurno(turno);
        Assert.assertTrue(turnoService.buscarTurno(1).get().getOdontologo().getId() == 1);

    }

    @Test
    void eliminarTurno() {

        turnoService.eliminarTurno(2);
        assertNull(turnoService.buscarTurno(2));

    }
}
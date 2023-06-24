package com.proyect.Clinica2.service;
import com.proyect.Clinica2.persistence.entity.Paciente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.*;



import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@SpringBootTest
class PacienteServiceTest {

    @Autowired
    private PacienteService pacienteService;


    @Before
    public void registrarPacientesBefore() {
        Paciente paciente = new Paciente("Pepito", "Milanesa","134324", new Date(03-01-2023));
        pacienteService.guardar(paciente);
    }


    @Test
    public void listar() {
        List<Paciente> pacientes = pacienteService.listar();
        Assertions.assertTrue(pacientes.size()>0);
    }

    @Test
    public void guardar() {
        Paciente paciente2 = new Paciente("Pepe", "Milas", "1232365", new Date(01-05-2023));
        Paciente paciente = pacienteService.guardar(paciente2);

        Assert.assertNotNull(paciente);
    }

    @Test
    public void modificar() {

            Paciente paciente = pacienteService.buscar(1).get();
            paciente.setApellido("Carnita");
            pacienteService.modificar(paciente);
            Assert.assertTrue(pacienteService.buscar(1).get().getApellido().equals("Carnita"));

    }

    @Test
    public void eliminar() {
    }

    @Test
    public void buscar() {
    }
}
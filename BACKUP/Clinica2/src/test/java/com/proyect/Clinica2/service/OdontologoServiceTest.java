package com.proyect.Clinica2.service;

import com.proyect.Clinica2.persistence.entity.Odontologo;
import org.junit.*;



import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@SpringBootTest
public class OdontologoServiceTest {

    @Autowired
    private OdontologoService odontologoService;

    @Before
    public void registrarOdontologosBefore() {
        Odontologo odontologo = new Odontologo("Licini", "Juan Manuel", "ASAGF");
        odontologoService.guardar(odontologo);
    }

    @Test
    public void listar() {

        List<Odontologo> odontologos = odontologoService.listar();
        Assert.assertTrue(odontologos.size()>0);


    }

    @Test
    public void guardar() {
<<<<<<< HEAD
        Odontologo odontologo = new Odontologo("Messi", "Leo", "DSASAD");

=======
        Odontologo odontologo2 = new Odontologo("Messi", "Leo", "123AAA");
        Odontologo odontologo = odontologoService.guardar(odontologo2);

        Assert.assertNotNull(odontologo);
>>>>>>> 0a048ed8f6bc3c449716c9750af9b0b62e42a04c



    }

    @Test
    public void modificar() {

        Odontologo odontologo = odontologoService.buscar(2).get();
        odontologo.setApellido("Messi");
        odontologoService.modificar(odontologo);
        Assert.assertTrue(odontologoService.buscar(2).get().getApellido().equals("Messi"));



    }

    @Test
    public void eliminar() {
        odontologoService.eliminar(1);
        Assert.assertFalse(odontologoService.buscar(1).isPresent());

    }

    @Test
    public void buscar() {
    Optional<Odontologo> odontologo3 = odontologoService.buscar(1);
    Assert.assertTrue(odontologo3 != null);

    }
}
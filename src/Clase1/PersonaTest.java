package Clase1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    public void esCorrectoElNombre(){
        Persona persona = new Persona("Juan" , "Manuel", "jm@gmail.com", LocalDate.of(1980,1,3));

        String esCorrecto = persona.calcularNombreCompleto();

        assertEquals("Juan Manuel", esCorrecto);

    }
    @Test
    public void esMayorDe18(){
        Persona persona2 = new Persona("Pepe", "Licini", "juanma12@yahoo.com", LocalDate.of(1981,1,3));

        boolean esMayor = persona2.esMayorDe18();

        assertEquals(true, esMayor);
    }

}
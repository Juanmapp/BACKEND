import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    public Persona persona;
    public Persona persona1;
    public Persona persona2;

    @Test
    public void getEsMayorDe18() {
        assertEquals(persona.esMayorDeEdad(), true);
        assertEquals(persona1.esMayorDeEdad(), false);
        assertEquals(persona2.esMayorDeEdad(), false);
    }
    @Test
    public void getNombreCompleto() {

        assertEquals("Javier, Test", persona.calcularNombreCompleto());
        assertEquals("Vale, Nov", persona1.calcularNombreCompleto());
        assertEquals("Tito, Perez", persona2.calcularNombreCompleto());
    }

    @Before
    public void doBefore() {
        persona = new Persona("Javier", "Test");
        persona.setEdad(LocalDate.of(1980, 4, 12));
        persona1 = new Persona("Vale", "Nov");
        persona1.setEdad(LocalDate.of(2003, 9, 20));
        persona2 = new Persona("Tito", "Perez");
        persona2.setEdad(LocalDate.of(2019, 12, 04));
    }





}
package Clase9;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlyweightFactoryRopaTest {

    @Test
    public void getRopa() {
        Ropa ropa = FlyweightFactoryRopa.obtenerRopa("pantalon");
        Ropa ropa2 = FlyweightFactoryRopa.obtenerRopa("pantalon");
        Ropa ropa3 = FlyweightFactoryRopa.obtenerRopa("pantalon");
        Ropa ropa4 = FlyweightFactoryRopa.obtenerRopa("pantalon");
        Ropa ropa5 = FlyweightFactoryRopa.obtenerRopa("pantalon");
        Ropa ropa6 = FlyweightFactoryRopa.obtenerRopa("pantalon");
        Ropa ropa7 = FlyweightFactoryRopa.obtenerRopa("remera");

        ropa4.setTalle("xs");
        ropa6.setTipo("remera");

        assertEquals(ropa4.getTalle(), "xs");
        assertEquals(ropa6.getTipo(), "remera");



        assertEquals(ropa.getTipo(), "pantalon");
        assertEquals(FlyweightFactoryRopa.ropasMap.size() == 2, true);
    }
}
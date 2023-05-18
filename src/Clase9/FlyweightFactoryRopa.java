package Clase9;

import java.util.HashMap;

public class FlyweightFactoryRopa {

    public static final HashMap<String, Ropa> ropasMap= new HashMap<>();

    public static Ropa obtenerRopa(String tipo) {

        Ropa ropa= ropasMap.get(tipo);
        if(ropa ==null) {
            ropa = new Ropa(tipo);
            ropasMap.put(tipo, ropa);
            System.out.println("Obteniendo ropa nuevo" + ropa.getTipo());

        }
        return ropa;
    }

}

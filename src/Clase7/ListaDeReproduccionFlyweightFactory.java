package Clase7;

import java.util.HashMap;
import java.util.List;

public class ListaDeReproduccionFlyweightFactory {

    private String nombre;
    private static final HashMap<String, Cancion> cancionMap = new HashMap<>();

    private List<Cancion> listaDeCanciones;

    public Cancion obtenerCancion(String nombre) {
        Cancion cancion = cancionMap.get(nombre);
      if(cancion == null) {
          cancion = new Cancion(nombre);
          cancionMap.put(nombre, cancion);
          System.out.println("Creando cancion: " + nombre);
      }
        System.out.println("Obtenemos cancion ya creada:" + nombre);

      return cancion;
    }

    public void agregarCancion(String nombre) {
        this.obtenerCancion((nombre));
    }

    public void eliminarCancion(String nombre) {
        cancionMap.remove(this.obtenerCancion(nombre));
    }







}

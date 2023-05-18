package Clase7;

public class Main {

    public static void main(String[] args) {
    ListaDeReproduccionFlyweightFactory cancion = new ListaDeReproduccionFlyweightFactory();

    Cancion cancion1 = cancion.obtenerCancion("take on me");
    cancion1.setArtista("arjona");
    Cancion cancion2 = cancion.obtenerCancion("take on me");
    cancion2.setArtista("Montaner");

    }

}

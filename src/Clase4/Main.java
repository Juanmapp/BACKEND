package Clase4;

public class Main {
    public static void main(String[] args) {
CompruebaCalidad proceso = new CompruebaCalidad();

    proceso.comprobarCalidad(new Articulo("Leche", 1500, 1250, "sano"));
    proceso.comprobarCalidad(new Articulo("Carne", 100, 25000, "roto"));
    proceso.comprobarCalidad(new Articulo("Sal", 1200, 1300, "casi sano"));

}
}

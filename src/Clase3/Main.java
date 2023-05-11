package Clase3;

public class Main {

    public static void main(String[] args) {

        Vendedor vendedor1 = new Empleado("Juan", 5);
        Vendedor vendedor2 = new Afiliado("Nico");

        vendedor1.setVentas(5);
        vendedor2.setVentas(2);

        System.out.println(vendedor1.mostrarCategoria());
        System.out.println(vendedor2.mostrarCategoria());
    }
}

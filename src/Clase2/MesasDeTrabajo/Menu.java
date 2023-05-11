package Clase2.MesasDeTrabajo;

public abstract class Menu {

    private Double precioBase;

    public Menu(Double precioBase) {
        this.precioBase = precioBase;
    }

    public abstract Double calcularPrecio();
}

package Clase2.MesasDeTrabajo;

public class Infantil extends Menu{

    private int cantidadDeJuguetes;

    private Double PrecioPorJuguete;

    public Infantil(Double precioBase, int cantidadDeJuguetes, Double precioPorJuguete) {
        super(precioBase);
        this.cantidadDeJuguetes = cantidadDeJuguetes;
        PrecioPorJuguete = precioPorJuguete;
    }

    @Override
    public Double calcularPrecio() {
        return cantidadDeJuguetes*PrecioPorJuguete;
    }
}

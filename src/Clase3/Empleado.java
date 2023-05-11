package Clase3;

import java.util.ArrayList;

public class Empleado extends Vendedor{

    private ArrayList<Vendedor> afiliados = new ArrayList<>();
    private int aniosAntiguedad;

    public Empleado(String nombre, int aniosAntiguedad) {
        super(nombre);
        this.aniosAntiguedad = aniosAntiguedad;
    }


    public void addAfiliado (Vendedor afiliado) {

    }



    @Override
    public int calcularPuntos() {

        return (afiliados.size() * 10) + (getVentas() * 5) + (getAniosAntiguedad() * 5);



    }

    public ArrayList<Vendedor> getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(ArrayList<Vendedor> afiliados) {
        this.afiliados = afiliados;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }
}

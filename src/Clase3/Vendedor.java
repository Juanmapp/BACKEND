package Clase3;

import java.security.PublicKey;

public abstract class Vendedor {

    protected int PUNTOS_POR_VENTAS;
    protected int ventas;
    protected String nombre;

    public Vendedor(String nombre) {
        this.nombre = nombre;
    }

    public void vender( int cantVentas) {
        //logica
    }

    public abstract int calcularPuntos();

    public String mostrarCategoria(){
        calcularPuntos();
        return getNombreCategoria();
    }
    public String getNombreCategoria() {
        if(calcularPuntos() < 20 ) {
            return "Novatos";
        } else if (calcularPuntos() > 21 && calcularPuntos() < 30) {
            return "Aprendices";
        } else if (calcularPuntos() > 31 && calcularPuntos() < 40) {
            return "Buenos";
        } else if ( calcularPuntos() > 40) {
            return "Maestros";
        }
        return "No se encontro categoria";
    }

    public int getPUNTOS_POR_VENTAS() {
        return PUNTOS_POR_VENTAS;
    }

    public void setPUNTOS_POR_VENTAS(int PUNTOS_POR_VENTAS) {
        this.PUNTOS_POR_VENTAS = PUNTOS_POR_VENTAS;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

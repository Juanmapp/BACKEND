package Clase3;

public class Afiliado extends Vendedor{


    public Afiliado(String nombre) {
        super(nombre);
    }

    @Override
    public int calcularPuntos() {
        return getVentas() * 15;
    }
}

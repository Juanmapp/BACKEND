package Clase4;

public class Peso extends AnalistaDeCalidad {

    public void validarCalidadDelProducto(Articulo articulo) {
        if (articulo.getPeso() < 1200 || articulo.getPeso() > 1300) {
            System.out.println("Rechazado, error en el peso");
        } else {
            if (this.getSigControl() != null) {
                System.out.println("Aprobado, peso");
                getSigControl().validarCalidadDelProducto(articulo);
            }
        }
    }
}


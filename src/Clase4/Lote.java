package Clase4;

public class Lote extends AnalistaDeCalidad{

    @Override
    public void validarCalidadDelProducto(Articulo articulo) {
        if (articulo.getLote() < 1000 || articulo.getLote() > 2000 ){
            System.out.println("Rechazado, error en el lote");
        } else {
            if(this.getSigControl() != null) {
                System.out.println("Aprobado, lote");
                getSigControl().validarCalidadDelProducto(articulo);
            }
        }
    }
}

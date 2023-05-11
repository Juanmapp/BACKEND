package Clase4;

public class Envase extends AnalistaDeCalidad{


    @Override
    public void validarCalidadDelProducto(Articulo articulo) {
        if (articulo.getEnvasado().equals("sano") || articulo.getEnvasado().equals("casi sano")){
            System.out.println("Aprobado, envase");
            System.out.println("Articulo en correcto estado");
            if(this.getSigControl() != null) {
                getSigControl().validarCalidadDelProducto(articulo);
            }
        } else {

            System.out.println("Rechazado, error en el envase");

        }
    }
}

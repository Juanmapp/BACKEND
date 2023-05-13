package Clase5.MesasDeTrabajo;

public class ServicioDescargaProxy implements Servicio{

    @Override
    public void descargar(String cancion, String tipoUsuario) {

        if (tipoUsuario.equalsIgnoreCase("Premium")) {
            ServicioDescarga servicio = new ServicioDescarga();
            servicio.descargar(cancion, tipoUsuario);
            System.out.println("Descrga completada");
        } else {
            System.out.println("No sos usuario premiun");
        }

    }
}

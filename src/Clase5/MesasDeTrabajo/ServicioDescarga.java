package Clase5.MesasDeTrabajo;

import Clase5.MesasDeTrabajo.Servicio;

public class ServicioDescarga implements Servicio {

    @Override
    public void descargar(String cancion, String tipoUsuario) {

        System.out.println("Descargando " + cancion);

    }
}

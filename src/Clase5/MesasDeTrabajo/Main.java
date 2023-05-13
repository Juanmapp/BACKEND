package Clase5.MesasDeTrabajo;

import Clase5.MesasDeTrabajo.ServicioDescargaProxy;
import Clase5.ProyectoVacuna.Usuario;

public class Main {
    public static void main(String[] args) {

        Usuario p1 = new Usuario("Nico", "Premium");
        ServicioDescargaProxy servicio = new ServicioDescargaProxy();
        servicio.descargar("Himno", p1.getTipoUsuario());

    }
}
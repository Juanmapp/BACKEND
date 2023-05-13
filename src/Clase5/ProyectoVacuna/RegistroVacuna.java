package Clase5.ProyectoVacuna;

public class RegistroVacuna implements Registro{
    @Override
    public void vacunar(Object[] datos) {
        System.out.println("Se ha registrado " + datos[0] + " fecha " + datos[1] + " ha sido vacunado");
    }
}

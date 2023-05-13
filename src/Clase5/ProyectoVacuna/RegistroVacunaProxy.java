package Clase5.ProyectoVacuna;

import java.util.Date;

public class RegistroVacunaProxy implements Registro{

    @Override
    public void vacunar(Object[] datos) {
        if (comprobarFecha((Date)datos[1])){
            RegistroVacuna registro = new RegistroVacuna();
            registro.vacunar(datos);
        }
    }

    public boolean comprobarFecha(Date fecha){
        return fecha.before(new Date());
    }
}

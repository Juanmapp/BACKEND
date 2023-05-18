package Clase8;

import java.time.LocalDate;

public class Vuelo {

    private LocalDate fechaDeSalida;
    private LocalDate fechaDeRegreso;
    private String origen;
    private String destino;

    public Vuelo(LocalDate fechaDeSalida, LocalDate fechaDeRegreso, String origen, String destino) {
        this.fechaDeSalida = fechaDeSalida;
        this.fechaDeRegreso = fechaDeRegreso;
        this.origen = origen;
        this.destino = destino;
    }

    public LocalDate getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(LocalDate fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    public LocalDate getFechaDeRegreso() {
        return fechaDeRegreso;
    }

    public void setFechaDeRegreso(LocalDate fechaDeRegreso) {
        this.fechaDeRegreso = fechaDeRegreso;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}

package Clase8;

import java.time.LocalDate;
import java.util.List;

public class Busqueda implements IBusqueda{

    private Hotel hotel;
    private Vuelo vuelo;

    private List<Hotel> hoteles;
    private List<Vuelo> vuelos;

    public Busqueda(Hotel hotel, Vuelo vuelo) {
        this.hotel = hotel;
        this.vuelo = vuelo;
    }

    @Override
    public void buscar(String hotel, LocalDate fecha) {



    }
}

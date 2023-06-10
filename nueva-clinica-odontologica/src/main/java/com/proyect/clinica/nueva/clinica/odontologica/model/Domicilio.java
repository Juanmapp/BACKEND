package com.proyect.clinica.nueva.clinica.odontologica.model;

public class Domicilio {

    private int id;
    private String calle;
    private int altura;
    private String localidad;
    private String provincia;

    public Domicilio() {
    }

    public Domicilio(int id, String calle, int altura, String localidad, String provincia) {
        this.id = id;
        this.calle = calle;
        this.altura = altura;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public Domicilio(String calle, int altura, String localidad, String provincia) {
        this.calle = calle;
        this.altura = altura;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}

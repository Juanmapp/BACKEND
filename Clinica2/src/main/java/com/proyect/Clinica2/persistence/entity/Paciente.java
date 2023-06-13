package com.proyect.Clinica2.persistence.entity;



import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Paciente {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    //Como ver la relacion para ponerlo en la tabla

    @Column
    private String dni;
    @Column
    private Date fechaDeAlta; // Hay que hacer una clase?

    public Paciente() {
    }

    public Paciente(Integer id, String nombre, String apellido, String dni, Date fechaDeAlta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;

        this.dni = dni;
        this.fechaDeAlta = fechaDeAlta;

    }

    public Paciente(String nombre, String apellido, String dni, Date fechaDeAlta ) {
        this.nombre = nombre;
        this.apellido = apellido;

        this.dni = dni;
        this.fechaDeAlta = fechaDeAlta;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(Date fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

}

package com.proyect.Clinica2.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;


import java.util.Date;

@Entity
public class Turno {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paciente_id" , nullable = false)
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Paciente paciente;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "odontologo_id" , nullable = false)
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Odontologo odontologo;
    @Column
    private Date fechayHora;

    public Turno() {
    }

    public Turno(Paciente paciente, Odontologo odontologo, Date fechayHora) {
        this.paciente = paciente;
        this.odontologo = odontologo;
        this.fechayHora = fechayHora;
    }

    public Turno(Integer id, Paciente paciente, Odontologo odontologo, Date fechayHora) {
        this.id = id;
        this.paciente = paciente;
        this.odontologo = odontologo;
        this.fechayHora = fechayHora;
    }

    public Integer getId() {
        return id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public Date getFechayHora() {
        return fechayHora;
    }

    public void setFechayHora(Date fechayHora) {
        this.fechayHora = fechayHora;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "id=" + id +
                ", paciente=" + paciente +
                ", odontologo=" + odontologo +
                ", fechayHora=" + fechayHora +
                '}';
    }


}

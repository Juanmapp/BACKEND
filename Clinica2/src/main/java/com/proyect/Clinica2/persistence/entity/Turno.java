package com.proyect.Clinica2.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Turno {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column
    private Paciente paciente;
    @Column
    private Odontologo odontologo;
    @Column
    private LocalDateTime fechayHora;

    public Turno() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public LocalDateTime getFechayHora() {
        return fechayHora;
    }

    public void setFechayHora(LocalDateTime fechayHora) {
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

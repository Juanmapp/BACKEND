package Clase1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private String nombre;

    private String apellido;

    private String email;

    private LocalDate edad;

    public Persona(String nombre, String apellido, String email, LocalDate edad) {
        nombre = nombre;
        apellido = apellido;
        email = email;
        edad = edad;
    }

    public String calcularNombreCompleto() {
        return  nombre + " " + apellido;
    }

    public boolean esMayorDe18() {
        return Period.between(this.edad, LocalDate.of(2023, 5 , 8)).getYears() > 18;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getEdad() {
        return edad;
    }

    public void setEdad(LocalDate edad) {
        this.edad = edad;
    }
}

package com.proyect.clinica.nueva.clinica.odontologica.repository;

import com.proyect.clinica.nueva.clinica.odontologica.model.Odontologo;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface IDAO<T> {

    public List<T> listar();

    public T agregar(T t);

    public void eliminar(int id);

    public T actualizar(T t);


}

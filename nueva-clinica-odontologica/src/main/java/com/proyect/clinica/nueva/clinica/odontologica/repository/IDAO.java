package com.proyect.clinica.nueva.clinica.odontologica.repository;

import com.proyect.clinica.nueva.clinica.odontologica.model.Odontologo;

public interface IDAO<T> {

    public T listar(int id);

    public T agregar(T t);

    public void eliminar(int id);

    public T actualizar(T t);


}

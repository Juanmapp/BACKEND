package com.proyect.clinica.nueva.clinica.odontologica.service;

import com.proyect.clinica.nueva.clinica.odontologica.model.Odontologo;
import com.proyect.clinica.nueva.clinica.odontologica.repository.IDAO;
import org.springframework.stereotype.Service;

@Service
public class OdontologoService {

    private IDAO<Odontologo> odontologoDAO;

    public OdontologoService(IDAO<Odontologo> odontologoDAO) {
        this.odontologoDAO = odontologoDAO;
    }

    public Odontologo listar(int id) {
    return this.odontologoDAO.listar(id);
    }

    public Odontologo agregar(Odontologo odontologo) {
       return this.odontologoDAO.agregar(odontologo);
    }

    public void eliminar(int id) {
        odontologoDAO.eliminar(id);
    }

    public Odontologo actualizar(Odontologo odontologo) {
        return this.odontologoDAO.actualizar(odontologo);
    }



}

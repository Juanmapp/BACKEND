package com.proyect.clinica.nueva.clinica.odontologica.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyect.clinica.nueva.clinica.odontologica.DTO.OdontologoDTO;
import com.proyect.clinica.nueva.clinica.odontologica.model.Odontologo;
import com.proyect.clinica.nueva.clinica.odontologica.repository.IDAO;
import com.proyect.clinica.nueva.clinica.odontologica.repository.impl.OdontologoDAOH2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class OdontologoService {

    private OdontologoDAOH2 odontologoDAO;

    public OdontologoService(OdontologoDAOH2 odontologoDAO) {
        this.odontologoDAO = odontologoDAO;
    }

    public List<OdontologoDTO> listar() {
        ObjectMapper mapper = new ObjectMapper();
        List<Odontologo> odontologos = odontologoDAO.listar();
        List<OdontologoDTO> odontologosDTO = new ArrayList<>();


        for(Odontologo odontologo : odontologos) {
            OdontologoDTO odontologoDTO = mapper.convertValue(odontologo , OdontologoDTO.class);
            odontologosDTO.add(odontologoDTO);
        }

        return odontologosDTO;
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

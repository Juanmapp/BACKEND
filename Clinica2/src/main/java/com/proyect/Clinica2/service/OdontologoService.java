package com.proyect.Clinica2.service;

import com.proyect.Clinica2.persistence.entity.Odontologo;
import com.proyect.Clinica2.persistence.repository.OdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdontologoService {

    @Autowired
    OdontologoRepository odontologoRepository;

    public List<Odontologo> listar() {
        return odontologoRepository.findAll();
    }

    public Odontologo guardar(Odontologo odontologo) {
        if(odontologoRepository.save(odontologo) != null) {
            return odontologo;
        }
        else {
            return null;
        }
    }



}

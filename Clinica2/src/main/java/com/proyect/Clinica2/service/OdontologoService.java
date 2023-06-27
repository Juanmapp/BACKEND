package com.proyect.Clinica2.service;

import com.proyect.Clinica2.persistence.entity.Odontologo;
import com.proyect.Clinica2.persistence.repository.OdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OdontologoService {

    @Autowired
    OdontologoRepository odontologoRepository;

    public List<Odontologo> listar() {
        return odontologoRepository.findAll();
    }

    public Odontologo guardar(Odontologo odontologo) {
        return odontologoRepository.save(odontologo);

    }
    public Odontologo modificar(Odontologo odontologo) {
        Integer id = odontologo.getId();
<<<<<<< HEAD
        if(id != null) {
            return odontologoRepository.save(odontologo);
        }
        else {
            return null;
        }
=======
        if ( odontologoRepository.findById(id).isPresent()) {
            return odontologoRepository.save(odontologo);
        } return null;
>>>>>>> 0a048ed8f6bc3c449716c9750af9b0b62e42a04c
    }

    public void eliminar(Integer id) {
      odontologoRepository.deleteById(id);
    }

    public Optional<Odontologo> buscar(Integer id) {
        return odontologoRepository.findById(id);


    }


}

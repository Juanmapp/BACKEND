package com.proyect.Clinica2.service;

import com.proyect.Clinica2.persistence.entity.Paciente;
import com.proyect.Clinica2.persistence.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    PacienteRepository pacienteRepository;

    public List<Paciente> listar() {
        return pacienteRepository.findAll();
    }

    public Paciente guardar(Paciente paciente) {
        if(pacienteRepository.save(paciente) != null) {
            return paciente;
        }
        else {
            return null;
        }
    }
    public Paciente modificar(Paciente paciente) {
        Integer id = paciente.getId();
        if ( pacienteRepository.findById(id).isPresent()) {
            return pacienteRepository.save(paciente);
        }
        return null;
    }

    public void eliminar(Integer id) {
        pacienteRepository.deleteById(id);      ;
    }

    public Optional<Paciente> buscar(Integer id) {
        if(pacienteRepository.findById(id).isEmpty()){
            return null;
        }
            return pacienteRepository.findById(id);

    }

    @Configuration
    public static class PasswordEncoder {

        @Bean
        public BCryptPasswordEncoder bCryptPasswordEncoder() {

            return new BCryptPasswordEncoder();
        }
    }
}

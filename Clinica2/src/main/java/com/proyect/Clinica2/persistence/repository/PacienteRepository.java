package com.proyect.Clinica2.persistence.repository;

import com.proyect.Clinica2.persistence.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
}

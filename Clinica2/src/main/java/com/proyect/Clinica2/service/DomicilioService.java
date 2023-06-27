package com.proyect.Clinica2.service;

import com.proyect.Clinica2.persistence.entity.AppUser;
import com.proyect.Clinica2.persistence.entity.AppUserRole;
import com.proyect.Clinica2.persistence.entity.Domicilio;
import com.proyect.Clinica2.persistence.repository.DomicilioRepository;
import com.proyect.Clinica2.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DomicilioService {
    @Autowired
    DomicilioRepository domicilioRepository;

    public Domicilio crearDomicilio(Domicilio domicilio) {
        return domicilioRepository.save(domicilio);
    }

    @Component
    public static class DataLoader implements ApplicationRunner {

        private UserRepository userRepository;

        @Autowired
        public DataLoader(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        public void run(ApplicationArguments args) {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String hashedPassword = passwordEncoder.encode("password");
            BCryptPasswordEncoder passwordEncoder2 = new BCryptPasswordEncoder();
            String hashedPassword2 = passwordEncoder2.encode("password2");
            userRepository.save(new AppUser("Diego", "diego", "diego@digital.com", hashedPassword, AppUserRole.ADMIN));
            userRepository.save(new AppUser("Paula", "paula", "paula@digital.com", hashedPassword2, AppUserRole.USER));
        }
    }
}

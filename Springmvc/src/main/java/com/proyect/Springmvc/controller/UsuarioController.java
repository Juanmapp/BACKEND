package com.proyect.Springmvc.controller;

import com.fasterxml.jackson.databind.ser.std.UUIDSerializer;
import com.proyect.Springmvc.dominio.Usuario;
import com.proyect.Springmvc.service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    private UsuarioService usuarioService = new UsuarioService();

    @GetMapping("/")
    public Usuario crearUsuario(){
       return usuarioService.crearUsuario();
    }

    @GetMapping("/crearMuchos")
    public List<Usuario> crearMuchosUsuarios() {
        return usuarioService.crearMuchosUsuarios();
    }

}

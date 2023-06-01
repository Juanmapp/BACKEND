package com.proyect.Springmvc.service;

import com.proyect.Springmvc.dominio.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

    public Usuario crearUsuario() {
    Usuario usuario = new Usuario("Carlos", "Rodriguez");
    return usuario;
    }

    public List<Usuario> crearMuchosUsuarios() {
        List<Usuario> listaUusariosARetornar = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            listaUusariosARetornar.add(new Usuario("Nombre "+i , "Apellido "+i));
        }
        return listaUusariosARetornar;
    }

}

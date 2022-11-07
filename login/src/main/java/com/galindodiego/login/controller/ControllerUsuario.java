package com.galindodiego.login.controller;

import com.galindodiego.login.entity.Usuario;
import com.galindodiego.login.repository.RepositoryUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerUsuario {

    @Autowired
    private RepositoryUsuario repositoryUsuario;

    @GetMapping("")
    public String home(){
        return "index";
    }


    @GetMapping("/registrar")
    public String telaRegistrar(Model model){
        model.addAttribute("usuario",new Usuario());
        return "formulario_registro";
    }

    @PostMapping("registrar_usuario")
    public String registrarUsuario(Usuario usuario){
        repositoryUsuario.save(usuario);
        return "usuario_registrado";
    }
}

package com.jrarm.biblioteca.usuario;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/usuario")
    public List<Usuario> obtenerusuarios(){
        return usuarioService.obtenerUsuarios();
    }


    @PostMapping("/usuario")
    public Usuario agregarUsuario(@RequestBody Usuario usuario){
        return usuarioService.anadirUsuario(usuario);
    }
}

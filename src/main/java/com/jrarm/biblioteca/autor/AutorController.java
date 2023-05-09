package com.jrarm.biblioteca.autor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AutorController {

    private final AutorService usuarioService;

    @Autowired
    public AutorController(AutorService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/autor")
    public List<Autor> obtenerusuarios(){
        return usuarioService.obtenerAutores();
    }



}

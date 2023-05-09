package com.jrarm.biblioteca.autor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    private final AutorRepository autorRepository;

    @Autowired
    public AutorService(AutorRepository usuarioRepository) {
        this.autorRepository = usuarioRepository;
    }

    public List<Autor> obtenerAutores() {
        return autorRepository.findAll();
    }

    public Autor anadirUsuario(Autor usuario) {
        autorRepository.save(usuario);
        return usuario;

    }


}

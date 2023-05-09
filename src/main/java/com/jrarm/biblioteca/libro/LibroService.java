package com.jrarm.biblioteca.libro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    private final LibroRepository libroRepository;

    @Autowired
    public LibroService(LibroRepository usuarioRepository) {
        this.libroRepository = usuarioRepository;
    }

    public List<Libro> obtenerAutores() {
        return libroRepository.findAll();
    }

    public Libro anadirUsuario(Libro usuario) {
        libroRepository.save(usuario);
        return usuario;

    }


}

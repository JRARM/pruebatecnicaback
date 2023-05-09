package com.jrarm.biblioteca.prestamo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoService {

    private final PrestamoRepository prestamoRepository;

    @Autowired
    public PrestamoService(PrestamoRepository usuarioRepository) {
        this.prestamoRepository = usuarioRepository;
    }

    public List<Prestamo> obtenerPrestamos() {
        return prestamoRepository.findAll();
    }

    public Prestamo anadirUsuario(Prestamo usuario) {
        prestamoRepository.save(usuario);
        return usuario;

    }


}

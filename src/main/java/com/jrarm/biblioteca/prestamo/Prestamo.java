package com.jrarm.biblioteca.prestamo;


import jakarta.persistence.*;

@Entity
@Table(name = "libros")
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "fecharestamo")
    String fechaPrestamo;
    @Column(name = "fechadevolucion")
    String fechaDevolucion;
    @Column(name = "usuarios_id")
    Integer usuarioId;
    @Column(name = "libros_id")
    String libroId;


    public Prestamo(String fechaPrestamo, String fechaDevolucion, Integer usuarioId, String libroId) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.usuarioId = usuarioId;
        this.libroId = libroId;
    }

    public Prestamo() {
    }

    public Long getIdprestamo() {
        return id;
    }

    public void setIdprestamo(Long idprestamo) {
        this.id = idprestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getLibroId() {
        return libroId;
    }

    public void setLibroId(String libroId) {
        this.libroId = libroId;
    }
}
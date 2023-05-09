package com.jrarm.biblioteca.autor;


import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String codigo;
    String nombre;

    public Autor(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Autor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
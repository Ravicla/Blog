package com.raviclablog.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idAutor;
    private String nombre;
    private String apellido;
    private String apodo;
    private String email;
    @Column(name = "imagen_url")
    private String foto;
}

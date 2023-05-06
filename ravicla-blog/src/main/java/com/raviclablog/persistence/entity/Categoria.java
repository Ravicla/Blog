package com.raviclablog.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idCategoria;
    @Column(name = "nombre")
    private String categoria;


}

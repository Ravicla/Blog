package com.raviclablog.persistence.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comentarios")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idComentario;
    @Column(name = "nombre")
    private String categoria;
    @Column(name = "contenido")
    private String comentario;
    @Column(name = "fecha_creacion")
    private Date fechaComentario;



}

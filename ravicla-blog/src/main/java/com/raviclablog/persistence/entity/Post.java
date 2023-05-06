package com.raviclablog.persistence.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idPost;
    private String titulo;
    @Column(name = "descripcion")
    private String post;
    @Column(name = "fecha_publicacion")
    private Date fechaPublicacion;
    @Column(name = "imagen_url")
    private String foto;
    @Column(name = "id")
    private Integer idAutor;

}

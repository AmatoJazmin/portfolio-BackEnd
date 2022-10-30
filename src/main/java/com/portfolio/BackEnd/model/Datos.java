package com.portfolio.BackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Datos {
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private Long id;
    private String imagen;
    private String profesion;
    private String correo;
    private String gitHub;
    private String linkedin;
    @Column(length=500)
    private String descripcion1;
    private String descripcion2;
    private String descripcion3;

    public Datos() {
    }

    public Datos(Long id, String imagen, String profesion, String correo, String gitHub, String linkedin, String descripcion1, String descripcion2, String descripcion3) {
        this.id = id;
        this.imagen = imagen;
        this.profesion = profesion;
        this.correo = correo;
        this.gitHub = gitHub;
        this.linkedin = linkedin;
        this.descripcion1 = descripcion1;
        this.descripcion2 = descripcion2;
        this.descripcion3 = descripcion3;
    }

}



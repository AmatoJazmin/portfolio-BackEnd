package com.portfolio.BackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Estudio {
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private Long id;
    private String img;
    private String url;
    private String institucion; 
    private String duracion;
    private String titulo;

    public Estudio() {
    }

    public Estudio(Long id, String img, String institucion, String duracion, String titulo) {
        this.id = id;
        this.img = img;
        this.institucion = institucion;
        this.duracion = duracion;
        this.titulo = titulo;
    }
  
}
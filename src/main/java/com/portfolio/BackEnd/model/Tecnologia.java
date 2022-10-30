package com.portfolio.BackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tecnologia {
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private Long id;
    private String nombre; 
    private String img;
    private String url;

    public Tecnologia() {
    }

    public Tecnologia(Long id, String nombre, String img, String url) {
        this.id = id;
        this.nombre = nombre;
        this.img = img;
        this.url = url;
    }
    
}
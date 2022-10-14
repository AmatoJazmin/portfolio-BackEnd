package com.portfolio.BackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidad {
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private Long id;
    private String nombre; 

    public Habilidad() {
    }

    public Habilidad(String nombre) {
        this.nombre = nombre;
    }

    
}
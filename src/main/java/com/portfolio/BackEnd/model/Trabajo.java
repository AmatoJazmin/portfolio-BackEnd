package com.portfolio.BackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Trabajo {
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private Long id;
    private String img;
    private String empresa; 
    private String duracion;
    private String puesto;

    public Trabajo() {
    }

    public Trabajo(Long id, String img, String empresa, String duracion, String puesto) {
        this.id = id;
        this.img = img;
        this.empresa = empresa;
        this.duracion = duracion;
        this.puesto = puesto;
    }

        
}

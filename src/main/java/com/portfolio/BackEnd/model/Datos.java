package com.portfolio.BackEnd.model;

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
    private String nombre;
    private String profesion;
    private int edad;
    private String ciudad;
    private String telefono;
    private String correo;

    public Datos() {
    }

    public Datos(String nombre, String profesion, int edad, String ciudad, String telefono, String correo) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.edad = edad;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.correo = correo;
    }

}


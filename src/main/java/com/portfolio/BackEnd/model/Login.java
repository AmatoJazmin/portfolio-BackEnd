package com.portfolio.BackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Login {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String usuario;
    private String contrasena;

    public Login() {
    }

    public Login(Long id, String usuario, String contrasena) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
}

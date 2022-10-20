package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Login;
import com.portfolio.BackEnd.repository.LoginRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginService implements ILoginService{
    
    @Autowired
    private LoginRepository loginRepository;

    @Override
    public boolean autorizado(Login login) {
        boolean autorizado = false;
        List<Login> usuarios = loginRepository.findAll();
        if (!usuarios.isEmpty()) {
            Login usuario = usuarios.get(0);
            if (usuario.getContrasena().equals(login.getContrasena())){
                autorizado = true;
            }
        }
        return autorizado;
    }
    
}

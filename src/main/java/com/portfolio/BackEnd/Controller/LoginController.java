package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.model.Login;
import com.portfolio.BackEnd.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class LoginController {
    
    @Autowired
    private ILoginService loginService;
    
    @PostMapping ("/Login")
    public boolean login (@RequestBody Login login){
        return loginService.autorizado(login);
    }
}

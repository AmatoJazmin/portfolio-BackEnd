package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Login;
import org.springframework.stereotype.Service;

@Service
public interface ILoginService {
   public boolean autorizado(Login login);
}

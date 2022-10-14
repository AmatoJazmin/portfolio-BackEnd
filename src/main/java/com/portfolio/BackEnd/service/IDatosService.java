package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Datos;
import java.util.List;

public interface IDatosService {
    public List<Datos> verDatos();
    public void editarDatos (Datos datos);

}

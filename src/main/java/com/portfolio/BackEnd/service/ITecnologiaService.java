package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Tecnologia;
import java.util.List;

public interface ITecnologiaService {
    public List<Tecnologia> verTecnologias();
    public void agregarTecnologia (Tecnologia Tec);
    public void borrarTecnologia (Long id);
    public void editarTecnologia (Tecnologia Tec);
}

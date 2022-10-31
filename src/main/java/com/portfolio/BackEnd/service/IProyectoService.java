package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    public List<Proyecto> verProyectos();
    public void agregarProyecto (Proyecto proy);
    public void borrarProyecto (Long id);
    public void editarProyecto (Proyecto proy); 
}

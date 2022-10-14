package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Trabajo;
import java.util.List;

public interface ITrabajoService {
    public List<Trabajo> verTrabajos();
    public void agregarTrabajo (Trabajo trab);
    public void borrarTrabajo (Trabajo trab);
    public void editarTrabajo (Trabajo trab);
}

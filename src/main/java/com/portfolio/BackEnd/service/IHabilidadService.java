package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Habilidad;
import java.util.List;

public interface IHabilidadService {
    public List<Habilidad> verHabilidades();
    public void agregarHabilidad (Habilidad hab);
    public void borrarHabilidad (Habilidad hab);
    public void editarHabilidad (Habilidad hab);
}

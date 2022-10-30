package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Estudio;
import java.util.List;

public interface IEstudioService {
    public List<Estudio> verEstudios();
    public void agregarEstudio (Estudio est);
    public void borrarEstudio (Long id);
    public void editarEstudio (Estudio est);
}

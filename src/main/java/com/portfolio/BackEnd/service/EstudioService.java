package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Estudio;
import com.portfolio.BackEnd.repository.EstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioService implements IEstudioService{

    @Autowired
    private EstudioRepository estRepository;
    
    @Override
    public List<Estudio> verEstudios() {
        return estRepository.findAll();
    }

    @Override
    public void agregarEstudio(Estudio est) {
        estRepository.save(est);
    }

    @Override
    public void borrarEstudio(Estudio est) {
        estRepository.delete(est);
    }

    @Override
    public void editarEstudio(Estudio est) {
        estRepository.save(est);
    }
    
}

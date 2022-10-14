package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Trabajo;
import com.portfolio.BackEnd.repository.TrabajoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrabajoService implements ITrabajoService{

    @Autowired
    private TrabajoRepository trabRepository;
    
    @Override
    public List<Trabajo> verTrabajos() {
        return trabRepository.findAll();
    }

    @Override
    public void agregarTrabajo(Trabajo trab) {
        trabRepository.save(trab);
    }

    @Override
    public void borrarTrabajo(Trabajo trab) {
        trabRepository.delete(trab);
    }

    @Override
    public void editarTrabajo(Trabajo trab) {
        trabRepository.save(trab);
    }
    
}

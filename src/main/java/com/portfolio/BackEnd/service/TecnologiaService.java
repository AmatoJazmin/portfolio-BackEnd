package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Tecnologia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.BackEnd.repository.TecnologiaRepository;

@Service
public class TecnologiaService implements ITecnologiaService{

    @Autowired
    private TecnologiaRepository tecRepository;
    
    @Override
    public List<Tecnologia> verTecnologias() {
        return tecRepository.findAll();
    }

    @Override
    public void agregarTecnologia(Tecnologia tec) {
        tecRepository.save(tec);
    }

    @Override
    public void borrarTecnologia(Long id) {
        tecRepository.deleteById(id);
    }

    @Override
    public void editarTecnologia(Tecnologia tec) {
        tecRepository.save(tec);
    }
    
}

package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Habilidad;
import com.portfolio.BackEnd.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService{

    @Autowired
    private HabilidadRepository habRepository;
    
    @Override
    public List<Habilidad> verHabilidades() {
        return habRepository.findAll();
    }

    @Override
    public void agregarHabilidad(Habilidad hab) {
        habRepository.save(hab);
    }

    @Override
    public void borrarHabilidad(Habilidad hab) {
        habRepository.delete(hab);
    }

    @Override
    public void editarHabilidad(Habilidad hab) {
        habRepository.save(hab);
    }
    
}

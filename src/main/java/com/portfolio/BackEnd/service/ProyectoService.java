package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Proyecto;
import com.portfolio.BackEnd.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    private ProyectoRepository proyRepository;

    @Override
    public List<Proyecto> verProyectos() {
        return proyRepository.findAll();
    }

    @Override
    public void agregarProyecto(Proyecto proy) {
        proyRepository.save(proy);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyRepository.deleteById(id);
    }

    @Override
    public void editarProyecto(Proyecto proy) {
        proyRepository.save(proy);
    }
    
}

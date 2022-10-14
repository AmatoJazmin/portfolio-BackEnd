package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Datos;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;
import com.portfolio.BackEnd.repository.DatosRepository;

@Service
public class DatosService implements IDatosService{
    
   @Autowired
   private DatosRepository datosRepository;

    @Override
    public List<Datos> verDatos() {
        return datosRepository.findAll();
    }

    @Override
    public void editarDatos(Datos datos) {
        datosRepository.save(datos);
    }

}

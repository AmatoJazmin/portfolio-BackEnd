package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.model.Datos;
import com.portfolio.BackEnd.service.DatosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/datospersonales")
public class DatosController {
   
    @Autowired
    private DatosService datosService;
    
    @GetMapping
    @ResponseBody
    public List<Datos> verDatos(){
        return datosService.verDatos();
    }
    
    @PutMapping ("/editar/datos")
        public void editarDatos(Datos datos) {
        datosService.editarDatos(datos);
    }
    
}
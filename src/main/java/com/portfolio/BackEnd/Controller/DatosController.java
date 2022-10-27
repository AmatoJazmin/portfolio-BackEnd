package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.model.Datos;
import com.portfolio.BackEnd.service.DatosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
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
    
    @PutMapping ("/editar")
        public void editarDatos(@RequestBody Datos datos) {
        datosService.editarDatos(datos);
    }
    
}

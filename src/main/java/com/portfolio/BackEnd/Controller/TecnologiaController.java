package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.model.Tecnologia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.BackEnd.service.ITecnologiaService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping ("/tecnologias")
public class TecnologiaController {
    
    @Autowired
    private ITecnologiaService tecService;
    
    @GetMapping
    @ResponseBody
    public List<Tecnologia> verTecnologias(){
        return tecService.verTecnologias();
    }
    
    @PostMapping ("/agregar")
    public void agregarTecnologia (@RequestBody Tecnologia tec){
        tecService.agregarTecnologia(tec);
    }
    
    @PutMapping ("/editar")
    public void editarTecnologia(@RequestBody Tecnologia tec) {
        tecService.editarTecnologia(tec);
    }
    
    @DeleteMapping ("/eliminar/{id}")
    public void borrarTecnologia(@PathVariable Long id){
        tecService.borrarTecnologia(id);
    }
 
}

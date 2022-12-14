package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.model.Estudio;
import com.portfolio.BackEnd.service.IEstudioService;
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

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping ("/estudios")
public class EstudioController {
    
    @Autowired
    private IEstudioService estService;
    
    @GetMapping
    @ResponseBody
    public List<Estudio> verEstudios(){
        return estService.verEstudios();
    }
    
    @PostMapping ("/agregar")
    public void agregarEstudio (@RequestBody Estudio est){
        estService.agregarEstudio(est);
    }
    
    @PutMapping ("/editar")
    public void editarEstudio(@RequestBody Estudio est) {
        estService.editarEstudio(est);
    }
    
    @DeleteMapping ("/eliminar/{id}")
    public void borrarEstudio(@PathVariable Long id){
        estService.borrarEstudio(id);
    }
    
}

package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.model.Proyecto;
import com.portfolio.BackEnd.service.IProyectoService;
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
@RequestMapping ("/proyectos")
public class ProyectoController {
    
    @Autowired
    private IProyectoService proyService;
    
    @GetMapping
    @ResponseBody
    public List<Proyecto> verProyectos(){
        return proyService.verProyectos();
    }
    
    @PostMapping ("/agregar")
    public void agregarProyecto (@RequestBody Proyecto proy){
        proyService.agregarProyecto(proy);
    }
    
    @PutMapping ("/editar")
    public void editarProyecto(@RequestBody Proyecto proy) {
        proyService.editarProyecto(proy);
    }
    
    @DeleteMapping ("/eliminar/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyService.borrarProyecto(id);
    }
    
}

package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.model.Trabajo;
import com.portfolio.BackEnd.service.ITrabajoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/experiencia")
public class TrabajoController {
    
    @Autowired
    private ITrabajoService trabService;
    
    @GetMapping
    @ResponseBody
    public List<Trabajo> verTrabajos(){
        return trabService.verTrabajos();
    }
    
    @PostMapping ("/agregar")
    public void agregarTrabajo (@RequestBody Trabajo trab){
        trabService.agregarTrabajo(trab);
    }
    
    @PutMapping ("/editar")
    public void editarTrabajo(@RequestBody Trabajo trab) {
        trabService.editarTrabajo(trab);
    }
    
    @DeleteMapping ("/eliminar")
    public void borrarTrabajo(@RequestBody Trabajo trab){
        trabService.borrarTrabajo(trab);
    }
 
}

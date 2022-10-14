package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.model.Habilidad;
import com.portfolio.BackEnd.service.IHabilidadService;
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
@RequestMapping ("/habilidades")
public class HabilidadController {
    
    @Autowired
    private IHabilidadService habService;
    
    @GetMapping
    @ResponseBody
    public List<Habilidad> verHabilidades(){
        return habService.verHabilidades();
    }
    
    @PostMapping ("/agregar/habilidad")
    public void agregarHabilidad (@RequestBody Habilidad hab){
        habService.agregarHabilidad(hab);
    }
    
    @DeleteMapping ("/eliminar/habilidad")
    public void borrarHabilidad(@RequestBody Habilidad hab){
        habService.borrarHabilidad(hab);
    }
    
    @PutMapping ("/editar/habilidad")
        public void editarHabilidad(Habilidad hab) {
        habService.editarHabilidad(hab);
    }
    
}

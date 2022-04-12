
package com.backEndApp.PortfoliobackEnd.controller;

import com.backEndApp.PortfoliobackEnd.model.Experiencia;
import com.backEndApp.PortfoliobackEnd.model.Persona;
import com.backEndApp.PortfoliobackEnd.service.IExperienciaService;
import com.backEndApp.PortfoliobackEnd.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    

    
    @Autowired
    private IPersonaService iPersona;
    @Autowired 
     private IExperienciaService iExperiencia;
    @PostMapping("/new/persona")
    public void agregarPersonas(@RequestBody Persona perso){
       iPersona.crearPersona(perso);
    }
    @GetMapping("/ver/personas")
    @ResponseBody 
    public List<Persona> verPersonas(){
      return iPersona.verPersonas();
}
    @DeleteMapping("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
        iPersona.borrarPersona(id);
        
    }
     @GetMapping("/persona/ver/{id}")
     @ResponseBody
     public Persona buscarPersona(@PathVariable Long id){
      return iPersona.buscarPersona(id);
     }
     
     @PutMapping("/persona/editar/{id}")
     public void editPersona(@PathVariable Long id,
                                @RequestParam ("nombre")String nuevoNombre,
                                @RequestParam ("apellido")String nuevoApellido,
                                @RequestParam ("nacimiento")String nuevoNac
                                ){
   
     iPersona.editPersona(id, nuevoNombre, nuevoApellido, nuevoNac);
         
     };
     
     @PostMapping ("/persona/ver/{id}/agregarExp")
       public void agregarExperiencia (@PathVariable Long id,
               @RequestBody Experiencia expe){
          
     
       }
    
}


package com.backEndApp.PortfoliobackEnd.controller;

import com.backEndApp.PortfoliobackEnd.dto.PersonaDTO;
import com.backEndApp.PortfoliobackEnd.model.Experiencia;
import com.backEndApp.PortfoliobackEnd.model.Persona;
import com.backEndApp.PortfoliobackEnd.service.IExperienciaService;
import com.backEndApp.PortfoliobackEnd.service.IPersonaService;
import java.util.Date;
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
    
    
    
    
    @PostMapping("/new/persona")
    public void agregarPersonas(@RequestBody Persona perso){
       iPersona.crearPersona(perso);
    }
    @GetMapping("/ver/personas")
    @ResponseBody 
    public List<Persona> verPersonas(){
      return iPersona.verPersonas();
}
    @DeleteMapping("/delete/{idPersona}")
    public void borrarPersona (@PathVariable Long idPersona){
        iPersona.borrarPersona(idPersona);
        
    }
     @GetMapping("/persona/ver/{idPersona}")
     @ResponseBody
     public Persona buscarPersona(@PathVariable Long idPersona){
      return iPersona.buscarPersona(idPersona);
     }
     
     @PostMapping("/persona/editar/{idPersona}")
     public void editPersona(@PathVariable Long idPersona,
                                @RequestParam ("nombre")String nuevoNombre,
                                @RequestParam ("apellido")String nuevoApellido,
                                @RequestParam ("fotoUrl")String nuevoFotoUrl
                                ){
   
     iPersona.editPersona(idPersona, nuevoNombre, nuevoApellido, nuevoFotoUrl);
         
     };
     
    /* @PostMapping ("/persona/ver/{id}/agregarExp")
       public void agregarExperiencia (@PathVariable Long id,
                                       @RequestBody List<Experiencia> expe){
           Persona perso= iPersona.buscarPersona(id);
           Experiencia expe = perso.getExperienciaLista() ;
                    iExperiencia.agregarExperiencia(expe);
           
          
           
           
       };
     */
     
    
     
    
}

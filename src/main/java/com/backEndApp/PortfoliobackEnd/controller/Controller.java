
package com.backEndApp.PortfoliobackEnd.controller;

import com.backEndApp.PortfoliobackEnd.model.Experiencia;
import com.backEndApp.PortfoliobackEnd.model.Persona;
import com.backEndApp.PortfoliobackEnd.service.IExperienciaService;
import com.backEndApp.PortfoliobackEnd.service.IPersonaService;
import java.util.ArrayList;
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
    private IPersonaService persoServ;

    @PostMapping("/new/persona")
    public void agregarPersonas(@RequestBody Persona perso){
       persoServ.crearPersona(perso);
    }
    @GetMapping("/ver/personas")
    @ResponseBody 
    public List<Persona> verPersonas(){
      return persoServ.verPersonas();
}
    @DeleteMapping("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);
        
    }
     @GetMapping("/persona/ver/{id}")
     @ResponseBody
     public Persona buscarPersona(@PathVariable Long id){
      return persoServ.buscarPersona(id);
     }
     
     @PutMapping("/persona/editar/{id}")
     public Persona editPersona(@PathVariable Long id,
                                @RequestParam ("nombre")String nuevoNombre,
                                @RequestParam ("apellido")String nuevoApellido,
                                @RequestParam ("nacimiento")String nuevoNac
                                ){
         Persona perso = persoServ.buscarPersona(id);
         perso.setApellido(nuevoApellido);
         perso.setNombre(nuevoNombre);
         perso.setNacimiento(nuevoNac);
      return perso;
     };
        
          /*
     aca para no confundirme visualmente voy aponer de prueba para el model experiencia
     @Autowired
     private IExperienciaService expeServ;
     @PostMapping("/exp")
     public void agregarExperiencias(
                                    @RequestBody 
                                    Experiencia expe){
         expeServ.agregarExperiencia(expe); 
     }
     */
     
            
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backEndApp.PortfoliobackEnd.controller;

import com.backEndApp.PortfoliobackEnd.model.Experiencia;
import com.backEndApp.PortfoliobackEnd.model.Persona;

import com.backEndApp.PortfoliobackEnd.service.IExperienciaService;
import com.backEndApp.PortfoliobackEnd.service.IPersonaService;

import java.util.Date;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping("/api/personas")
public class ExperienciaController {
     //******************/iExperiencia******************///////
      @Autowired
    private IPersonaService iPersona;
 
    
    @Autowired
     private IExperienciaService iExpe;
  
  
     @PostMapping("/persona/ver/{idPersona}/newExperiencia")
     public void agregarExpPerso(
                                @PathVariable Long idPersona,
                            
                                @RequestBody Experiencia expe ){
 
      expe.setPersona(iPersona.buscarPersona(idPersona));
       
        iExpe.agregarExperiencia(expe);
     };
     @GetMapping("/persona/ver/{idPersona}/listExperiencia")
     public List experienciasPersona(@PathVariable Long idPersona){
             Persona per=iPersona.buscarPersona(idPersona);
             List<Experiencia> persoExperiencias=per.getExperiencias();
            
             return persoExperiencias;
       };
    
     
@DeleteMapping("/persona/ver/delExp/{idExperiencia}")
    public void borrarExpe(@PathVariable Long idExperiencia){
    iExpe.borrarExperiencia(idExperiencia);
    };
    
    
    
    
  @PutMapping("/persona/ver/{idPersona}/editExpe")
    public void editExpe(@PathVariable Long idPersona, @RequestBody Experiencia expe){
    
         expe.setPersona(iPersona.buscarPersona(idPersona));
       
        iExpe.editarExperiencia(expe);
        
        
    };
    
     
    
}

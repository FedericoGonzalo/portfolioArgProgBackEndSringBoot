/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backEndApp.PortfoliobackEnd.controller;

/**
 *
 * @author BASSTARD
 */



import com.backEndApp.PortfoliobackEnd.model.Formacion;
import com.backEndApp.PortfoliobackEnd.model.Persona;

import com.backEndApp.PortfoliobackEnd.service.IFormacionService;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/personas")
//@CrossOrigin(origins = "http://localhost:4200&quot;)
public class FormacionController {
    
 //*******iFormacion***********
     
     
     @Autowired
     private IFormacionService iFormacion;
    

     @Autowired
    private IPersonaService iPersona;
     
     
     @PostMapping ("/persona/ver/{idPersona}/newFormacion")
     public void agregarFormacion(@PathVariable Long idPersona,
                                   
                                   @RequestBody Formacion nuevaFormacion){
            Persona perso=iPersona.buscarPersona(idPersona);
        
          
            nuevaFormacion.setPersona(perso);
          
            iFormacion.agregarFormacion(nuevaFormacion);
     };
    
     @DeleteMapping ("/persona/ver/delFormacion/{idFormacion}")
     public void borrarFormacion(@PathVariable Long idFormacion){
            iFormacion.borrarFormacion(idFormacion);
     };
     
     
      @GetMapping("/persona/ver/{idPersona}/listFormacion")
      @ResponseBody
      public List formacionesPersona(@PathVariable Long idPersona){
              Persona per=iPersona.buscarPersona(idPersona);
              List<Formacion> persoFormacion=per.getFormaciones();
               return persoFormacion;
      };

      @PutMapping("/persona/ver/{idPersona}/listFormacion")
      public void editarFormacion(@PathVariable Long idPersona,
                                   @RequestBody Formacion formacion){
         formacion.setPersona(iPersona.buscarPersona(idPersona));
         iFormacion.editarFormacion(formacion);
      
      };
 
}

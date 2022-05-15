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
                                   @RequestParam ("tipoFormacion")Long idTipoFormacion,
                                   @RequestBody Formacion nuevaFormacion){
            Persona perso=iPersona.buscarPersona(idPersona);
        
          
            nuevaFormacion.setPersona(perso);
          
            iFormacion.agregarFormacion(nuevaFormacion);
     };
    
     @DeleteMapping ("/persona/ver/delFormacion")
     public void borrarFormacion(@RequestParam("idFormacion")Long idFormacion){
            iFormacion.borrarFormacion(idFormacion);
     };
     
     
      @GetMapping("/persona/ver/{idPersona}/listFormacion")
      @ResponseBody
      public List formacionesPersona(@PathVariable Long idPersona){
              Persona per=iPersona.buscarPersona(idPersona);
              List<Formacion> persoFormacion=per.getFormaciones();
               return persoFormacion;
      };

     @PutMapping ("/persona/ver/formacion/edit/titulo")
     public void cambiarFormacionTitulo(@RequestParam("idFormacion")Long idFormacion,
                               @RequestParam("nuevoTitulo")String nuevoTitulo){
         
         iFormacion.editarFormacionNombreTitulo(idFormacion, nuevoTitulo);     
     };
      @PutMapping ("/persona/ver/{idPersona}/formacion/edit/nombreInstituto")
      public void cambiarFormacionNombreInst(@RequestParam("idFormacion")Long idFormacion,
                               @RequestParam("nuevoInstituto")String nuevoInst){
               iFormacion.editarFormacionNombreInstituto(idFormacion, nuevoInst);
      };
      @PutMapping ("/persona/ver/{idPersona}/formacion/edit/FechaInicio")
       public void cambiarFormacionFechaInicio(@RequestParam("idFormacion")Long idFormacion,
                               @RequestParam("nuevaFechaInicio")Date nuevoFechaInicio){
              iFormacion.editarFormacionFechaInicio(idFormacion, nuevoFechaInicio);
       };
       
       @PutMapping ("/persona/ver/{idPersona}/formacion/edit/FechaFin")
       public void cambiarFormacionFechaFin(@RequestParam("idFormacion")Long idFormacion,
                               @RequestParam("nuevaFechaFin")Date nuevoFechaFin){
              iFormacion.editarFormacionFechaFin(idFormacion, nuevoFechaFin);
       };
       
        @PutMapping ("/persona/ver/{idPersona}/formacion/edit/finalizado")
        public void cambiarFormacionFinalizado(@RequestParam("idFormacion")Long idFormacion,
                               @RequestParam("nuevoFinalizado") Boolean nuevoFinalizado){
        
                 iFormacion.editarFormacionFinalizado(idFormacion, nuevoFinalizado);
        };
       
       





}

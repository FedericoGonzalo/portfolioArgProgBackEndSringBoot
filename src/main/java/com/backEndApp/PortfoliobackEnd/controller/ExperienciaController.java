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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api/personas")
//@CrossOrigin(origins = "http://localhost:4200&quot;)
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
    
     @PostMapping("/persona/ver/{idExperiencia}/editPuesto")
     public void editarExpePuesto(@RequestParam("puesto") String nuevoPuesto,
                          @PathVariable Long idExperiencia ){
        iExpe.editarExperienciaPuesto(idExperiencia, nuevoPuesto);
         
     
     };
     @PostMapping("/persona/ver/{idExperiencia}/editDescripcion")
     public void editarExpeDescrip(@RequestParam("descripcion") String nuevaDescripcion,
                            @PathVariable Long idExperiencia  ){
                 iExpe.editarExperienciaDescripcion(idExperiencia, nuevaDescripcion);
     };
       
    @PostMapping("/persona/ver/{idExperiencia}/editEmpresa")
     public void editarExpeEmpresa(@RequestParam("empresa") String nuevaEmpresa,
                           @PathVariable Long idExperiencia){
               iExpe.editarExperienciaEmpresa(idExperiencia, nuevaEmpresa);
     };
     
     @PostMapping("/persona/ver/{idExperiencia}/editLogoEmp")
     public void editarExpeLogoEmp(@RequestParam("logoEmp") String nuevoLogoEmpresa,
                             @PathVariable Long idExperiencia){
     iExpe.editarExperienciaLogoEmp(idExperiencia, nuevoLogoEmpresa);
     };
   @PostMapping("/persona/ver/{idExperiencia}/editInicio")
     public void editarExpeInicio(@RequestParam("nuevoInicio")Date nuevoInicio,
                            @PathVariable Long idExperiencia){
         iExpe.editarExperienciaFechaInicio(idExperiencia, nuevoInicio);
     
     };
     
      @PostMapping("/persona/ver/{idExperiencia}/editFin")
     public void editarExpeFin(@RequestParam("nuevoFin")Date nuevoFin,
                               @PathVariable Long idExperiencia){
      
        iExpe.editarExperienciaFechaFin(idExperiencia, nuevoFin);
                     
     };
@DeleteMapping("/persona/ver/{idExperiencia}/delExp")
    public void borrarExpe(@PathVariable Long idExperiencia){
    iExpe.borrarExperiencia(idExperiencia);
    };
    
     //con este
    
     //
   
       
    
     
    
}

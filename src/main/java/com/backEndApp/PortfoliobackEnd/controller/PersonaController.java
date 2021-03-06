/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backEndApp.PortfoliobackEnd.controller;


import com.backEndApp.PortfoliobackEnd.dto.PersonaDTO;
import com.backEndApp.PortfoliobackEnd.model.Persona;

import com.backEndApp.PortfoliobackEnd.service.IPersonaService;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BASSTARD
 */
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
 @RestController

@RequestMapping("/api/personas")
@Getter
@Setter
 public class PersonaController{
    
      ////*********iPersona*****************/////
    @Autowired
    private IPersonaService iPersona;
  


    @PostMapping("/new/persona")//Tambien crea tabla acerca persona
    public void agregarPersonas(@RequestBody Persona perso){
        iPersona.crearPersona(perso);
        
     
             
        };
    
    @GetMapping("/ver/personas")
    @ResponseBody 
    public List<Persona> verPersonas(){
      return iPersona.verPersonas();
};
   
    @DeleteMapping("/delete/{idPersona}")
    public void borrarPersona (@PathVariable Long idPersona){
        iPersona.borrarPersona(idPersona);
        
    };
     
  
    @GetMapping("/persona/ver/{idPersona}")
     @ResponseBody
     public PersonaDTO buscarPersona(@PathVariable Long idPersona){
          Persona perso= iPersona.buscarPersona(idPersona);
          PersonaDTO persoDTO=new PersonaDTO();
          persoDTO.setIdPersona(perso.getIdPersona());
          persoDTO.setNombre(perso.getNombre());
          persoDTO.setApellido(perso.getApellido());
          persoDTO.setResidencia(perso.getResidencia());
          persoDTO.setUrlResidencia(perso.getUrlResidencia());
           persoDTO.setNacimiento(perso.getNacimiento());
            persoDTO.setFotoUrl(perso.getFotoUrl());
             persoDTO.setImgHeaderUrl(perso.getImgHeaderUrl());
              persoDTO.setAcercaTexto(perso.getAcercaTexto());
               persoDTO.setTextoUsuario(perso.getTextoUsuario());
         return persoDTO;
     };
   
     @PutMapping("/persona/editar/{idPersona}")
     public void editPersonaNombre(@PathVariable Long idPersona,@RequestBody Persona perso){
         Persona sinMod=iPersona.buscarPersona(idPersona);
     
                sinMod.setNombre(perso.getNombre());   
         sinMod.setApellido(perso.getApellido());
         sinMod.setAcercaTexto(perso.getAcercaTexto());
         sinMod.setTextoUsuario(perso.getTextoUsuario());
         sinMod.setFotoUrl(perso.getFotoUrl());
         sinMod.setImgHeaderUrl(perso.getImgHeaderUrl());
         sinMod.setResidencia(perso.getResidencia());
       
         sinMod.setNacimiento(perso.getNacimiento());
         sinMod.setUrlResidencia(perso.getUrlResidencia());
         
         iPersona.editPersona(sinMod);
       
        };
      

  
     
   
   
     
    
  
 
 }

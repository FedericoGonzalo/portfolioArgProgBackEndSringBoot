/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backEndApp.PortfoliobackEnd.controller;

import com.backEndApp.PortfoliobackEnd.model.AcercaPersona;
import com.backEndApp.PortfoliobackEnd.model.Experiencia;
import com.backEndApp.PortfoliobackEnd.model.Persona;
import com.backEndApp.PortfoliobackEnd.model.TipoExperiencia;
import com.backEndApp.PortfoliobackEnd.service.IAcercaPersonaService;
import com.backEndApp.PortfoliobackEnd.service.IExperienciaService;
import com.backEndApp.PortfoliobackEnd.service.IPersonaService;
import com.backEndApp.PortfoliobackEnd.service.ITipoExperienciaService;
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

/**
 *
 * @author BASSTARD
 */
 @RestController

@RequestMapping("/api/personas")
//@CrossOrigin(origins = "http://localhost:4200&quot;)
 public class PersonaController{
    
      ////*********iPersona*****************/////
    @Autowired
    private IPersonaService iPersona;
    @Autowired
    private IAcercaPersonaService iAcerca;

    @PostMapping("/new/persona")//Tambien crea tabla acerca persona
    public void agregarPersonas(@RequestBody Persona perso){
        iPersona.crearPersona(perso);
        AcercaPersona acerP=new AcercaPersona();
        acerP.setPersona(perso);
        iAcerca.crearAcercaPersona(acerP);         
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
     public Persona buscarPersona(@PathVariable Long idPersona){
      return iPersona.buscarPersona(idPersona);
     };
     ///// el edit persona tiene algunos parametros funciona si se pasan los parametros sino erro ergo hay que hacerlo uno por uno 
    
 
     @PutMapping("/persona/editar/{idPersona}/nombre")
     public void editPersonaNombre(@PathVariable Long idPersona,@RequestParam ("nombre")String nuevoNombre){
      iPersona.editPersonaNombre(idPersona, nuevoNombre);
        };
    
     @PutMapping("/persona/editar/{idPersona}/apellido")
     public void editPersonaApellido(@PathVariable Long idPersona,@RequestParam ("apellido")String nuevoApellido){
         iPersona.editPersonaApellido(idPersona, nuevoApellido);};
    
     @PutMapping("/persona/editar/{idPersona}/nac")
     public void editPersonaNacimiento(@PathVariable Long idPersona,@RequestParam ("nacimiento")Date nuevoNacimiento){
         iPersona.editPersonaNacimiento(idPersona, nuevoNacimiento);};
    
     @PutMapping("/persona/editar/{idPersona}/foto")
     public void editPersonaFotoUrl(@PathVariable Long idPersona,@RequestParam ("fotoUrl")String nuevaFotoUrl){iPersona.editPersonaFoto(idPersona, nuevaFotoUrl);};
    
     @PutMapping("/persona/editar/{idPersona}/img")
     public void editPersonaImgUrl(@PathVariable Long idPersona,@RequestParam ("imgUrl") String nuevaImgHeader){ 
              iPersona.editPersonaImg(idPersona, nuevaImgHeader);};
    @PutMapping("/persona/editar/{idPersona}/acercaTxt")
     public void editPersonaAcercaTexto(@PathVariable Long idPersona,@RequestParam ("acercaTexto") String nuevoAcercaTexto){ 
              iPersona.editPersonaImg(idPersona, nuevoAcercaTexto);};
     
     @PutMapping("/persona/editar/{idPersona}/residencia")
     public void editPersonaResidencia(@PathVariable Long idPersona,@RequestParam ("residencia") String nuevaResidencia){ 
              iPersona.editPersonaResidencia(idPersona, nuevaResidencia);};
    

  
     
       //**********Acerca De******************////
   
  
  /*  ///No usar,se crea con creacion de usuario///
@PostMapping("/persona/ver/{idPersona}/acercaPersona")
     public void agregarAcerca(@PathVariable Long idPersona,
                                @RequestBody AcercaPersona acerPer){
         Persona persona=iPersona.buscarPersona(idPersona);
         acerPer.setPersona(persona);
         iAcerca.crearAcercaPersona(acerPer); };  */

   
     
    
    @PostMapping("/persona/ver/{idPersona}/edit/AcercaPersona")
     public void cambiarTextoAcerPers(@PathVariable Long idPersona,
                                       @RequestParam("textoAcerca") String nuevoTextoAcerca){
       
         iAcerca.editarAcercaPersona((idPersona+1),  nuevoTextoAcerca);
    
     }
 
 }

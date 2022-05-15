/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backEndApp.PortfoliobackEnd.controller;

import com.backEndApp.PortfoliobackEnd.model.HardSkill;
import com.backEndApp.PortfoliobackEnd.model.Persona;
import com.backEndApp.PortfoliobackEnd.service.IHardSkillService;
import com.backEndApp.PortfoliobackEnd.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BASSTARD
 */

@RestController

@RequestMapping("/api/personas")
//@CrossOrigin(origins = "http://localhost:4200&quot;)
public class HardSkillController {
   @Autowired
   private IPersonaService iPerso;
    @Autowired
    private IHardSkillService iHSkill;
    @PostMapping("/persona/ver/{idPersona}/newHSkill")
    public void crearHSkill(@PathVariable Long idPersona,
                           
                           @RequestParam("nombreSkill") String nombreSkill,
                           @RequestParam("porcentajeSkill")Long porcentajeSkill
                             ){
    HardSkill nHSkill=new HardSkill();
    nHSkill.setNombreHardSkill(nombreSkill);
    nHSkill.setPorcentajeHardSkill(porcentajeSkill);
    Persona persona=iPerso.buscarPersona(idPersona);
    nHSkill.setPersona(persona);
    iHSkill.agregarHardSkill(nHSkill);
    
    };
    
    @DeleteMapping("/persona/ver/delHSkill")
         public void borrar(@RequestParam("idHardSkill")Long idHardSkill){
         iHSkill.borrarHardSkill(idHardSkill);
         }; 
    
    @PutMapping("/persona/ver/edit/nombreHSkill") 
        public void editSkillNombre(@RequestParam("idHardSkill")Long idHardSkill,
                               @RequestParam("newNombre")String newNombre ){
            iHSkill.editarHardSkillTitulo(idHardSkill, newNombre);
        };
      @PutMapping("/persona/ver/edit/porcentajeHSkill") 
       public void editSkillPorcentaje(@RequestParam("idHardSkill")Long idSkill, 
                                      @RequestParam("newPorcentaje")Long nuevoPorcentaje ){
       iHSkill.editarHardSkillPorcentaje(idSkill, nuevoPorcentaje);
       }; 
    
    
}

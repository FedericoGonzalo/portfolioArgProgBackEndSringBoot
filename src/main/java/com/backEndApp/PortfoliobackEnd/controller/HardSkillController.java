/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backEndApp.PortfoliobackEnd.controller;

import com.backEndApp.PortfoliobackEnd.model.HardSkill;
import com.backEndApp.PortfoliobackEnd.model.Persona;
import com.backEndApp.PortfoliobackEnd.service.IHardSkillService;
import com.backEndApp.PortfoliobackEnd.service.IPersonaService;
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
                           
                           @RequestBody HardSkill hardSkill){
    
    hardSkill.setPersona(iPerso.buscarPersona(idPersona));
    iHSkill.agregarHardSkill(hardSkill);
    
    };
    
    @DeleteMapping("/persona/ver/delHSkill")
         public void borrar(@RequestParam("idHardSkill")Long idHardSkill){
         iHSkill.borrarHardSkill(idHardSkill);
         }; 
    
    @PutMapping("/persona/ver/{idPersona}/edit/nombreHSkill") 
        public void editHardSkill(@PathVariable Long idPersona,
                               @RequestBody HardSkill hardSkill ){
           hardSkill.setPersona(iPerso.buscarPersona(idPersona));
           iHSkill.editarHardSkill(hardSkill);
        };

    @GetMapping("/persona/ver/{idPersona}/listahSkill")
    public List<HardSkill> listaHardSkill(@PathVariable Long idPersona){
           List <HardSkill> listaHardSkill=iPerso.buscarPersona(idPersona).getHardSkills();
           
   
            return listaHardSkill;};
}

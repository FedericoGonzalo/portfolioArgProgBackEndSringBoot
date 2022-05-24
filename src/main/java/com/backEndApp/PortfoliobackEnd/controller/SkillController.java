/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backEndApp.PortfoliobackEnd.controller;

import com.backEndApp.PortfoliobackEnd.model.Skill;
import com.backEndApp.PortfoliobackEnd.service.IPersonaService;
import com.backEndApp.PortfoliobackEnd.service.ISkillService;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BASSTARD
 */
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController

@RequestMapping("/api/personas")

public class SkillController {
    
     //*************iSkill****************************    
      @Autowired
     private ISkillService iSkill;

       @Autowired
    private IPersonaService iPersona;
      
     @PostMapping("/persona/ver/{idPersona}/newSkill")
     public void crearSkill(@PathVariable Long idPersona,
                           
                           @RequestBody Skill skill
                           
                             ){
        
        skill.setPersona(iPersona.buscarPersona(idPersona));
        
         iSkill.agregarSkill(skill);
     };
      
      @DeleteMapping("/persona/ver/delSkill/{idSkill}")
         public void borrar(@PathVariable Long idSkill){
         iSkill.borrarSkill(idSkill);
         }; 
        
        @PutMapping("/persona/ver/{idPersona}/editSkill") 
        public void editSkill(@PathVariable Long idPersona,@RequestBody Skill skill ){
           skill.setPersona(iPersona.buscarPersona(idPersona));
           iSkill.editarSkill(skill);
            
        };
      
      
     
       
       @GetMapping("/persona/ver/{idPersona}/listSkill")
       @ResponseBody
       public List<Skill> listaSkill(@PathVariable Long idPersona){
           List <Skill> listaSkill=iPersona.buscarPersona(idPersona).getSkills();
           
   
            return listaSkill;};
     
    
      
    
}

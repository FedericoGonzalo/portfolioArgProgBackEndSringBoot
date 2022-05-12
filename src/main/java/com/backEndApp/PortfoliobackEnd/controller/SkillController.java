/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backEndApp.PortfoliobackEnd.controller;

import com.backEndApp.PortfoliobackEnd.model.Skill;
import com.backEndApp.PortfoliobackEnd.service.IPersonaService;
import com.backEndApp.PortfoliobackEnd.service.ISkillService;
import com.backEndApp.PortfoliobackEnd.service.ITipoSkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
public class SkillController {
    
     //*************iSkill****************************    
      @Autowired
     private ISkillService iSkill;
       @Autowired
     private ITipoSkillService iTipoSkill;
       @Autowired
    private IPersonaService iPersona;
      
     @PostMapping("/persona/ver/{idPersona}/newSkill")
     public void crearSkill(@PathVariable Long idPersona,
                           @RequestParam("idTipoSkill") Long idTipoSkill,
                           @RequestParam("nombreSkill") String nombreSkill,
                           @RequestParam("porcentajeSkill")Long porcentajeSkill
                             ){
        
         Skill newSkill=new Skill();
         newSkill.setPersona(iPersona.buscarPersona(idPersona));
         newSkill.setTipoSkill(iTipoSkill.buscarTipoSkill(idTipoSkill));
         newSkill.setNombreSkill(nombreSkill);
         newSkill.setPorcentajeSkill(porcentajeSkill);
         iSkill.agregarSkill(newSkill);
     };
      
      @DeleteMapping("/persona/ver/delSkill")
         public void borrar(@RequestParam("idSkill")Long idSkill){
         iSkill.borrarSkill(idSkill);
         }; 
        
        @PutMapping("/persona/ver/edit/nombreSkill") 
        public void editSkillNombre(@RequestParam("idSkill")Long idSkill,
                               @RequestParam("newNombre")String newNombre ){
            iSkill.editarSkillNombre(idSkill, newNombre);
        };
      @PutMapping("/persona/ver/edit/porcentajeSkill") 
       public void editSkillPorcentaje(@RequestParam("idSkill")Long idSkill, 
                                      @RequestParam("newPorcentaje")Long nuevoPorcentaje ){
       iSkill.editarSkillPorcentaje(idSkill, nuevoPorcentaje);
       }; 
       //aca abajo prueba para mandar listas skill pero por tipo(hard,soft,language)
     
       
       @GetMapping("/persona/ver/{idPersona}/listSkill")
       @ResponseBody
       public List<Skill> listaSkill(@PathVariable Long idPersona){
           List <Skill> listaSkill=iPersona.buscarPersona(idPersona).getSkills();
           
   
            return listaSkill;};
       //****mapeo raro
    
      
    
}

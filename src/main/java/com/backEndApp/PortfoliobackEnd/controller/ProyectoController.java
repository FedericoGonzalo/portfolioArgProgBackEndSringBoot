/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backEndApp.PortfoliobackEnd.controller;

import com.backEndApp.PortfoliobackEnd.model.Persona;
import com.backEndApp.PortfoliobackEnd.model.Proyecto;
import com.backEndApp.PortfoliobackEnd.service.IPersonaService;
import com.backEndApp.PortfoliobackEnd.service.IProyectoService;
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
public class ProyectoController {
    
    //******iProyecto********
     @Autowired
     private IProyectoService iProyecto;
     
     @Autowired
    private IPersonaService iPersona;
     
    @PostMapping("/personas/ver/{idPersona}/newProyecto")
    public void agregarProyecto(@PathVariable Long idPersona,
                           @RequestBody Proyecto nuevoProyecto){
        
       Persona per=iPersona.buscarPersona(idPersona);
       nuevoProyecto.setPersona(per);
        iProyecto.agregarProyecto(nuevoProyecto);
    }; 
    @DeleteMapping("/personas/ver/delProyecto")
    public void borrarProyecto(@RequestParam("idProyecto")Long idProyecto){
    iProyecto.borrarProyecto(idProyecto);
    };
    
    @GetMapping("/personas/ver/{idPersona}/listaProyecto")
    @ResponseBody
    public List listaProyecto(@PathVariable Long idPersona){
          Persona per=iPersona.buscarPersona(idPersona);
          List<Proyecto> persoProyecto=per.getProyectos();
               return persoProyecto;
        
       };
    
    @PutMapping("/personas/ver/Proyecto/editNombre")
    public void editProyectoNombre(@RequestParam("idProyecto")Long idProyecto
                                   ,@RequestParam("nuevoNombre") String nuevoNombre){
        iProyecto.editarProyectoNombre(idProyecto, nuevoNombre); 
   
    };
     @PutMapping("/personas/ver/Proyecto/editFecha")
    public void editProyectoFecha(@RequestParam("idProyecto")Long idProyecto,
                                        @RequestParam("nuevaFecha")Date nuevaFecha){
    iProyecto.editarProyectoFechaRealizacion(idProyecto, nuevaFecha); 
    };
    
    
    @PutMapping("/personas/ver/Proyecto/editDescripcion")
    public void editProyectoDescripcion(@RequestParam("idProyecto")Long idProyecto,
                                        @RequestParam("nuevaDescripcion")String nuevaDescripcion){
    iProyecto.editarProyectoDescripcion(idProyecto, nuevaDescripcion); 
    };
   
    
    @PutMapping("/personas/ver/Proyecto/editUrlProyecto")
    public void editProyectoUrlProyecto(@RequestParam("idProyecto")Long idProyecto,
                                        @RequestParam("nuevoUrlProyecto")String nuevaUrlProyecto){
    iProyecto.editarProyectoUrlProyecto(idProyecto, nuevaUrlProyecto); 
    
    };
    @PutMapping("/personas/ver/Proyecto/editUrlImagenProyecto")
    public void editProyectoUrlImagenProyecto(@RequestParam("idProyecto")Long idProyecto,
                                               @RequestParam("nuevoUrlImagenProyecto")String nuevaUrlImagenProyecto){
    iProyecto.editarProyectoUrlImagenProyecto(idProyecto, nuevaUrlImagenProyecto); 
    };
    
    
    
}

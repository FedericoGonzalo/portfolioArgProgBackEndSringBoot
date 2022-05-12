/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backEndApp.PortfoliobackEnd.controller;

import com.backEndApp.PortfoliobackEnd.model.Persona;
import com.backEndApp.PortfoliobackEnd.model.RedSocial;
import com.backEndApp.PortfoliobackEnd.model.TipoRedSocial;
import com.backEndApp.PortfoliobackEnd.service.IPersonaService;
import com.backEndApp.PortfoliobackEnd.service.IRedSocialService;
import com.backEndApp.PortfoliobackEnd.service.ITipoRedSocialService;
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
public class RedSocialController {
     //********iRedSocial********
    @Autowired
    private IRedSocialService iRedSocial;
    @Autowired
    private ITipoRedSocialService iTipoRedSoc;
     @Autowired
    private IPersonaService iPersona;
     
    @PostMapping ("/personas/ver/{idPersona}/newRedSocial")
    public void newRedSocial(@PathVariable Long idPersona,
                                   @RequestParam("tipoRedSocial") Long idTipoRedSocial,
                                     @RequestParam("urlRedSocial") String urlRedSocial){
          RedSocial redSoc = new RedSocial();
          Persona perso=iPersona.buscarPersona(idPersona); 
          TipoRedSocial tipRed=iTipoRedSoc.buscarTipoRedSocial(idTipoRedSocial);
          redSoc.setPersona(perso);
          redSoc.setUrlRedSocial(urlRedSocial);
          redSoc.setTipoRedSocial(tipRed);
          iRedSocial.agregarRedSocial(redSoc);
    };
    @DeleteMapping ("/personas/ver/delRedSocial")
    public void borrarRedSocial(@RequestParam("idRedSocial") Long idRedSocial){
       iRedSocial.borrarRedSocial(idRedSocial);
     };
    @GetMapping("/personas/ver/{idPersona}/listaRedSocial")
     @ResponseBody
    public List<RedSocial> redesPersona(@PathVariable Long idPersona){
        Persona per=iPersona.buscarPersona(idPersona);
        return  per.getRedesSociales();
    };
    
    @PutMapping("/persona/ver/editUrlRedSocial")
    public void cambiarUrlRedSocial(@RequestParam("idRedSocial")Long idRedSocial,
                                     @RequestParam("nuevoUrl") String nuevoUrl){
           iRedSocial.editarRedSocial(idRedSocial, nuevoUrl);
           
    };    
    
    
}

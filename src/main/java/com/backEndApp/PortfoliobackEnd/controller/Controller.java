
package com.backEndApp.PortfoliobackEnd.controller;

import com.backEndApp.PortfoliobackEnd.model.Persona;
import com.backEndApp.PortfoliobackEnd.model.TipoExperiencia;
import com.backEndApp.PortfoliobackEnd.model.TipoFormacion;
import com.backEndApp.PortfoliobackEnd.model.TipoRedSocial;
import com.backEndApp.PortfoliobackEnd.model.TipoSkill;
import com.backEndApp.PortfoliobackEnd.service.IPersonaService;
import com.backEndApp.PortfoliobackEnd.service.ITipoExperienciaService;
import com.backEndApp.PortfoliobackEnd.service.ITipoFormacionService;
import com.backEndApp.PortfoliobackEnd.service.ITipoRedSocialService;
import com.backEndApp.PortfoliobackEnd.service.ITipoSkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    

    
    @Autowired
    private IPersonaService iPersona;

    
    
    @PostMapping("/new/persona")
    public void agregarPersonas(@RequestBody Persona perso){
       iPersona.crearPersona(perso);
    }
    @GetMapping("/ver/personas")
    @ResponseBody 
    public List<Persona> verPersonas(){
      return iPersona.verPersonas();
}
    @DeleteMapping("/delete/{idPersona}")
    public void borrarPersona (@PathVariable Long idPersona){
        iPersona.borrarPersona(idPersona);
        
    }
     @GetMapping("/persona/ver/{idPersona}")
     @ResponseBody
     public Persona buscarPersona(@PathVariable Long idPersona){
      return iPersona.buscarPersona(idPersona);
     }
     
     @PostMapping("/persona/editar/{idPersona}")
     public void editPersona(@PathVariable Long idPersona,
                                @RequestParam ("nombre")String nuevoNombre,
                                @RequestParam ("apellido")String nuevoApellido,
                                @RequestParam ("fotoUrl")String nuevoFotoUrl
                                ){
   
     iPersona.editPersona(idPersona, nuevoNombre, nuevoApellido, nuevoFotoUrl);
         
     };
   //aca los iTipo  
   @Autowired
   private ITipoSkillService iTipoSkill;
  
   
   @GetMapping("/listTipo/skill")
   public List<TipoSkill> verTipoSkill(){
   return iTipoSkill.verTipoSkills();};
  
   @PostMapping("/newTipo/skill")
   public void agregarTipoSkill(@RequestBody TipoSkill newTipoSkill){
   iTipoSkill.agregarTipoSkill(newTipoSkill);} ;
   
   @DeleteMapping("/deleteTipo/skill/{idTipoSkill}")
   public void borrarTipoSkill (@PathVariable Long idTipoSkill){
    iTipoSkill.borrarTipoSkill(idTipoSkill); };
   
   @GetMapping("/getTipo/skill/{idTipoSkill}")
   public TipoSkill buscarTipoSkill(@PathVariable Long idTipoSkill){
      return iTipoSkill.buscarTipoSkill(idTipoSkill);
             };
   
   @PostMapping("/editTipo/skill/{idTipoSkill}")
   public void editTipoSkill   (@PathVariable Long idTipoSkill,
                                @RequestParam ("nombreTipoSkill")String nuevoNombreTipoSkill){
       iTipoSkill.editarTipoSkill(idTipoSkill, nuevoNombreTipoSkill);
};
   
    //
   @Autowired
   private ITipoRedSocialService iTipoRedSoc;
  
   
   @GetMapping("/listTipo/redSocial")
   public List<TipoRedSocial> verTiposRedSocial(){
   return iTipoRedSoc.verTiposRedSocial();}
  
   @PostMapping("/newTipo/redSocial")
   public void agregarTipoRedSocial(@RequestBody TipoRedSocial newTipoRedSocial){
   iTipoRedSoc.agregarTipoRedsocial(newTipoRedSocial);} ;
   
   @DeleteMapping("/deleteTipo/redSocial/{idTipoRedSocial}")
   public void borrarTipoRedSocial (@PathVariable Long idTipoRedSocial){
    iTipoRedSoc.borrarTipoRedSocial(idTipoRedSocial); };
   
   @GetMapping("/getTipo/redSocial/{idTipoRedSocial}")
   public TipoRedSocial buscarTipoRedSocial(@PathVariable Long idTipoRedSocial){
      return iTipoRedSoc.buscarTipoRedSocial(idTipoRedSocial);
             };
   
   @PostMapping("/editTipo/redSocial/{idTipoRedSocial}")
   public void editTipoRedSocial (@PathVariable Long idTipoRedSocial,
                                @RequestParam ("nombreRedSocial")String nuevoNombreRedSocial,
                                @RequestParam("urlLogo")String nuevoUrlLogo){
       iTipoRedSoc.editarTipoRedSocial(idTipoRedSocial, nuevoNombreRedSocial, nuevoUrlLogo);
};
   
      //  
   @Autowired
   private ITipoFormacionService iTipoForma;
  
   
   @GetMapping("/listTipo/formacion")
   public List<TipoFormacion> verFormaciones(){
   return iTipoForma.verTiposFormacion();}
  
   @PostMapping("/newTipo/formacion")
   public void agregarForma(@RequestBody TipoFormacion newTipoFormacion){
   iTipoForma.verTiposFormacion();} ;
   
   @DeleteMapping("/deleteTipo/formacion/{idTipoFormacion}")
   public void borrarTipoFormacion (@PathVariable Long idTipoFormacion){
    iTipoForma.borrarTipoFormacion(idTipoFormacion); };
   
  
   @GetMapping("/getTipo/formacion/{idTipoFormacion}")
   public TipoFormacion buscarTipoForma(@PathVariable Long idTipoFormacion){
   
       return iTipoForma.buscarTipoFormacion(idTipoFormacion);};
   
   
  
   
   @PostMapping("/editTipo/formacion/{idTipoFormacion}")
   public void editTipoForma (@PathVariable Long idTipoFormacion,
                                @RequestParam ("nombreFormacion")String nuevoNombreFormacion){
       iTipoForma.editTipoFormacion(idTipoFormacion, nuevoNombreFormacion);
};
    
  ///

   
   @Autowired
   private ITipoExperienciaService iTipoExpe;
  
   
   @GetMapping("/listTipo/experiencia")
   public List<TipoExperiencia> verTiposExperiencias(){
   return iTipoExpe.verTipoExperiencias();}
  
   @PostMapping("/newTipo/experiencia")
   public void agregarExpe(@RequestBody TipoExperiencia newTipoExperiencia){
   iTipoExpe.agregarTipoExperiencia(newTipoExperiencia);} ;
   
   @DeleteMapping("/deleteTipo/experiencia/{idTipoExperiencia}")
   public void borrarTipoExpe (@PathVariable Long idTipoExperiencia){
    iTipoExpe.borrarTipoExperiencia(idTipoExperiencia); };
   
  
   @GetMapping("/getTipo/experiencia/{idTipoExperiencia}")
   public TipoExperiencia buscarTipoExpe(@PathVariable Long idTipoExperiencia){
   
       return iTipoExpe.buscarTipoExperiencia(idTipoExperiencia);};
   
   
  
   
   @PostMapping("/editTipo/experiencia/{idTipoExperiencia}")
   public void editTipoExpe (@PathVariable Long idTipoExperiencia,
                                @RequestParam ("tipoExperiencia")String nuevoTipoExperiencia){
       iTipoExpe.editarTipoExperiencia(idTipoExperiencia, nuevoTipoExperiencia);
};
   
    
}

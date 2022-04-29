
package com.backEndApp.PortfoliobackEnd.controller;

import com.backEndApp.PortfoliobackEnd.model.AcercaPersona;
import com.backEndApp.PortfoliobackEnd.model.Experiencia;
import com.backEndApp.PortfoliobackEnd.model.Persona;
import com.backEndApp.PortfoliobackEnd.model.TipoExperiencia;
import com.backEndApp.PortfoliobackEnd.model.TipoFormacion;
import com.backEndApp.PortfoliobackEnd.model.TipoRedSocial;
import com.backEndApp.PortfoliobackEnd.model.TipoSkill;
import com.backEndApp.PortfoliobackEnd.service.IAcercaPersonaService;
import com.backEndApp.PortfoliobackEnd.service.IExperienciaService;
import com.backEndApp.PortfoliobackEnd.service.IPersonaService;
import com.backEndApp.PortfoliobackEnd.service.ITipoExperienciaService;
import com.backEndApp.PortfoliobackEnd.service.ITipoFormacionService;
import com.backEndApp.PortfoliobackEnd.service.ITipoRedSocialService;
import com.backEndApp.PortfoliobackEnd.service.ITipoSkillService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    
      ////iPersona/////
    @Autowired
    private IPersonaService iPersona;

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
    
     @PostMapping("/persona/editar/{idPersona}")
     public void editPersona(@PathVariable Long idPersona,
                                @RequestParam ("nombre")String nuevoNombre,
                                @RequestParam ("apellido")String nuevoApellido,
                                @RequestParam ("fotoUrl")String nuevoFotoUrl
                                ){
   
     iPersona.editPersona(idPersona, nuevoNombre, nuevoApellido, nuevoFotoUrl);
         
     };
   
    
  
    ////////iExperiencia///////
    @Autowired
     private IExperienciaService iExpe;
   
  
     @PostMapping("/persona/ver/{idPersona}/newExperiencia")
     public void agregarExpPerso(
                                @PathVariable Long idPersona,
                                @RequestParam("tipoExperiencia")Long idTipoExperiencia,
                                @RequestBody Experiencia expe ){
   
        expe.setPersona(iPersona.buscarPersona(idPersona));
        expe.setTipoExperiencia(iTipoExpe.buscarTipoExperiencia(idTipoExperiencia));
        iExpe.agregarExperiencia(expe);
     };
     @GetMapping("/persona/ver/{idPersona}/listExperiencia")
     public List experienciasPersona(@PathVariable Long idPersona){
             Persona per=iPersona.buscarPersona(idPersona);
             List<Experiencia> persoExperiencias=per.getExperiencias();
            
             return persoExperiencias;
       };
     //edicion por cada elemento. abajo templeate para repetir
   /*
     @PostMapping("/persona/ver/{idExperiencia}/editExperiencia")
     public void editarExpe(@PathVariable Long idExperiencia
            
               ){
     
     };
   */
     @PostMapping("/persona/ver/{idExperiencia}/editPuesto")
     public void editarPuesto(@RequestParam("puesto") String nuevoPuesto,
                          @PathVariable Long idExperiencia ){
        iExpe.editarExperienciaPuesto(idExperiencia, nuevoPuesto);
         
     
     };
     @PostMapping("/persona/ver/{idExperiencia}/editDescripcion")
     public void editarDescrip(@RequestParam("descripcion") String nuevaDescripcion,
                            @PathVariable Long idExperiencia  ){
                 iExpe.editarExperienciaDescripcion(idExperiencia, nuevaDescripcion);
     };
       
    @PostMapping("/persona/ver/{idExperiencia}/editEmpresa")
     public void editarEmpresa(@RequestParam("empresa") String nuevaEmpresa,
                           @PathVariable Long idExperiencia){
               iExpe.editarExperienciaEmpresa(idExperiencia, nuevaEmpresa);
     };
     
     @PostMapping("/persona/ver/{idExperiencia}/editLogoEmp")
     public void editarLogoEmp(@RequestParam("logoEmp") String nuevoLogoEmpresa,
                             @PathVariable Long idExperiencia){
     iExpe.editarExperienciaLogoEmp(idExperiencia, nuevoLogoEmpresa);
     };
     @PostMapping("/persona/ver/{idExperiencia}/editExperienciaInicio")
     public void editarInicio(@RequestParam("nuevoInicio")Date nuevoInicio,
                            @PathVariable Long idExperiencia){
         iExpe.editarExperienciaFechaInicio(idExperiencia, nuevoInicio);
     
     };
     
     
     @PostMapping("/persona/ver/{idExperiencia}/TipoExpe")
     public void editarTipoExpe(
                                @RequestParam("tipoExperiencia") Long idTipoExperiencia,
                                @PathVariable Long idExperiencia
                            ){
         TipoExperiencia nuevoTipoExperiencia=iTipoExpe.buscarTipoExperiencia(idTipoExperiencia);
         iExpe.editarExperienciaTipoExpe(idExperiencia, nuevoTipoExperiencia);
       };
     
    
     
       ///////////////Acerca De//////////////////
@Autowired
    private IAcercaPersonaService iAcerca;

  /*
  //No usar,se crea con creacion de usuario
@PostMapping("/persona/ver/{idPersona}/acercaPersona")
     public void agregarAcerca(@PathVariable Long idPersona,
                                @RequestBody AcercaPersona acerPer){
         Persona persona=iPersona.buscarPersona(idPersona);
         acerPer.setPersona(persona);
         iAcerca.crearAcercaPersona(acerPer);

     };
*/
     @PostMapping("/persona/ver/{idPersona}/edit/AcercaPersona")
     public void cambiarTextoAcerPers(@PathVariable Long idPersona,
                                       @RequestParam("textoAcerca") String nuevoTextoAcerca){
       
         iAcerca.editarAcercaPersona((idPersona+1),  nuevoTextoAcerca);
    
     };
                
   //aca los iTipo  //
     
   //TipoSkill  //
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
                                @RequestParam("nombreTipoSkill")String nuevoNombreTipoSkill){
       iTipoSkill.editTipoSkill(idTipoSkill, nuevoNombreTipoSkill);
};
   
   
   
   //TipoRedSoc
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
   
      
   //TipoFormacion
   @Autowired
   private ITipoFormacionService iTipoForma;
  
   @PostMapping("/newTipo/formacion")
   public void agregarTipoForma(@RequestBody TipoFormacion tipoForm){
   iTipoForma.crearTipoFormacion(tipoForm);} ;
   
   @GetMapping("/listTipo/formacion")
   public List<TipoFormacion> verFormaciones(){
   return iTipoForma.verTiposFormacion();}
  
   
   
   @DeleteMapping("/deleteTipo/formacion/{idTipoFormacion}")
   public void borrarTipoFormacion (@PathVariable Long idTipoFormacion){
    iTipoForma.borrarTipoFormacion(idTipoFormacion); };
   
  
   @GetMapping("/getTipo/formacion/{idTipoFormacion}")
   public TipoFormacion buscarTipoForma(@PathVariable Long idTipoFormacion){
   
       return iTipoForma.buscarTipoFormacion(idTipoFormacion);};
   
   
  
   
   @PostMapping("/editTipo/formacion/{idTipoFormacion}")
   public void editTipoForma (@PathVariable Long idTipoFormacion,
                                @RequestParam ("nombreTipoFormacion")String nuevoNombreTipoFormacion){
       iTipoForma.editTipoFormacion(idTipoFormacion, nuevoNombreTipoFormacion);
       
};
    
 
   
   // TipoExpe

   
   @Autowired
   private ITipoExperienciaService iTipoExpe;
  @PostMapping("/newTipo/experiencia")
   public void newTipoExperienia(@RequestBody TipoExperiencia tipoExper){
   iTipoExpe.agregarTipoExperiencia(tipoExper);} ;
   
   @GetMapping("/listTipo/experiencia")
   public List<TipoExperiencia> verTiposExperiencias(){
   return iTipoExpe.verTipoExperiencias();};
  
   
   
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
   ////
   
  

   
   
    
}

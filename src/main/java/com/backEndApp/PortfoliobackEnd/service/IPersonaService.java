
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.Persona;
import java.util.Date;
import java.util.List;


public interface IPersonaService {
   public List<Persona> verPersonas();
   public Persona buscarPersona(Long idPersona);
   public void crearPersona (Persona per);
   public void borrarPersona (Long idPersona);
   public void editPersonaNombre(Long idPersona,String nuevoNombre);
   public void editPersonaApellido(Long idPersona,String nuevoApellido);
   public void editPersonaResidencia(Long idPersona,String nuevaResidencia);
   public void editPersonaUrlResidencia(Long idPersona, String nuevaUrlResidencia);
   public void editPersonaNacimiento(Long idPersona,Date nuevoNacimiento);
   public void editPersonaFoto(Long idPersona,String nuevaFotoUrl);
   public void editPersonaImg(Long idPersona,String nuevaImgHeaderUrl);
   public void editPersonaAcercaTexto(Long idPersona,String nuevoAcercaTexto);
   
 
}

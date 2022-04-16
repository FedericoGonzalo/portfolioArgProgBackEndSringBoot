
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.Persona;
import java.util.Date;
import java.util.List;


public interface IPersonaService {
    public List<Persona> verPersonas();
    public void crearPersona (Persona per);
    public void borrarPersona (Long idPersona);
    public Persona buscarPersona(Long idPersona);
    public Persona editPersona(Long idPersona,
                               String nuevoNombre, 
                               String nuevoApellido, 
                               Date nuevoNac);
   
 
 
}

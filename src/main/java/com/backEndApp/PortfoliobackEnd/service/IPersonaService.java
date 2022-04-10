
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> verPersonas();
    public void crearPersona (Persona per);
    public void borrarPersona (Long id);
    public Persona buscarPersona(Long id);
    public Persona editPersona(Long id,
                               String nuevoNombre, 
                               String nuevoApellido, 
                               String nuevoNac);
   
    
 
 
}

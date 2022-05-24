package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.Persona;
import com.backEndApp.PortfoliobackEnd.repository.PersonaRepository;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService implements IPersonaService{
    @Autowired
     public PersonaRepository persoRepo;
           
    @Override
    public List<Persona> verPersonas() {
      return persoRepo.findAll();
    }
   
    @Override
    public void crearPersona(Persona perso) {
       persoRepo.save(perso);
    }

    @Override
    public void borrarPersona(Long idPersona) {
      persoRepo.deleteById(idPersona);
    }

    @Override
    public Persona buscarPersona(Long idPersona) {
      return persoRepo.findById(idPersona).orElse(null);  
    }

 

    

    @Override
    public void editPersona( Persona per) {
        
           
        persoRepo.save(per);
    
    }



}
   
    

   
    


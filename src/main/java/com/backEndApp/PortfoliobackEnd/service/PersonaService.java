package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.Persona;
import com.backEndApp.PortfoliobackEnd.repository.PersonaRepository;
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
    public void borrarPersona(Long id) {
      persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
      return persoRepo.findById(id).orElse(null);  
    }

    @Override
    public Persona editPersona(Long id, String nuevoNombre, String nuevoApellido, String nuevoNac) {
      Persona perso = persoRepo.getById(id);
        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);
        perso.setNacimiento(nuevoNac);
        persoRepo.save(perso);
     
         
         
      return perso;
    }
  

    

   

   
       
      
       
    }

   

    

   
    


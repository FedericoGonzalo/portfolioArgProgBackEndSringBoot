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
    public void editPersonaNombre(Long idPersona, String nuevoNombre) {
     Persona perso = persoRepo.getById(idPersona);
        perso.setNombre(nuevoNombre);
      
        persoRepo.save(perso);    
    
    }

    @Override
    public void editPersonaApellido(Long idPersona, String nuevoApellido) {
     
     Persona perso = persoRepo.getById(idPersona);
        perso.setApellido(nuevoApellido);
      
        persoRepo.save(perso);
    }

   

    @Override
    public void editPersonaNacimiento(Long idPersona, Date nuevoNacimiento) {
    Persona perso = persoRepo.getById(idPersona);
        perso.setNacimiento(nuevoNacimiento);
      
        persoRepo.save(perso); }

    @Override
    public void editPersonaFoto(Long idPersona, String nuevaFotoUrl) {
    Persona perso = persoRepo.getById(idPersona);
        perso.setFotoUrl(nuevaFotoUrl);
      
        persoRepo.save(perso); }

    @Override
    public void editPersonaImg(Long idPersona, String nuevaImgHeaderUrl) {
    Persona perso = persoRepo.getById(idPersona);
        perso.setImgHeaderUrl(nuevaImgHeaderUrl);
      
        persoRepo.save(perso); }

    @Override
    public void editPersonaAcercaTexto(Long idPersona, String nuevoAcercaTexto) {
       Persona perso = persoRepo.getById(idPersona);
        perso.setAcercaTexto(nuevoAcercaTexto);
      
        persoRepo.save(perso);
    }

    @Override
    public void editPersonaResidencia(Long idPersona, String nuevaResidencia) {
         Persona perso=persoRepo.getById(idPersona);
         perso.setResidencia(nuevaResidencia);
         persoRepo.save(perso);
    }



}
   
    

   
    


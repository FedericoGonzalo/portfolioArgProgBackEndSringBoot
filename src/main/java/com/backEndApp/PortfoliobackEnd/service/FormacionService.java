
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.Formacion;

import com.backEndApp.PortfoliobackEnd.repository.FormacionRepository;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormacionService implements IFormacionService {
    @Autowired
    public FormacionRepository formaRepo;

    @Override
    public List<Formacion> verFormaciones() {
        return formaRepo.findAll();
    }

    @Override
    public void agregarFormacion(Formacion forma) {
      formaRepo.save(forma);
    }

    @Override
    public void borrarFormacion(Long idFormacion) {
       formaRepo.deleteById(idFormacion);
    }

    @Override
    public Formacion buscarFormacion(Long idFormacion) {
     
        
        return formaRepo.findById(idFormacion).orElse(null) ;
    }

    @Override
    public void editarFormacionNombreTitulo(Long idFormacion, String nuevoNombreTitulo) {
     Formacion forma= formaRepo.getById(idFormacion);
        forma.setNombreTitulo(nuevoNombreTitulo);
         formaRepo.save(forma);
        ;
     
    }

    /*
     Experiencia expe=expeRepo.getById(idExperiencia);
         expe.setTipoExperiencia(nuevoTipoExperiencia);
         expeRepo.save(expe);
    */
    
    
    
    @Override
    public void editarFormacionNombreInstituto(Long idFormacion, String nuevoNombreInstituto) {
    Formacion forma= formaRepo.getById(idFormacion);
        forma.setNombreInstituto(nuevoNombreInstituto);
         formaRepo.save(forma); 
    }

    @Override
    public void editarFormacionFechaInicio(Long idFormacion, Date nuevoFechaInicio) {
    Formacion forma= formaRepo.getById(idFormacion);
        forma.setFechaInicio(nuevoFechaInicio);
         formaRepo.save(forma);
    }

    @Override
    public void editarFormacionFechaFin(Long idFormacion, Date nuevoFechaFin) {
    Formacion forma= formaRepo.getById(idFormacion);
        forma.setFechaFin(nuevoFechaFin);
         formaRepo.save(forma);
    }

    @Override
    public void editarFormacionFinalizado(Long idFormacion, Boolean nuevoFinalizado) {
    Formacion forma= formaRepo.getById(idFormacion);
        forma.setFinalizado(nuevoFinalizado);
         formaRepo.save(forma);
    }

    

   
    
}

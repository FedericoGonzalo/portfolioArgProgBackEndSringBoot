package com.backEndApp.PortfoliobackEnd.service;


import com.backEndApp.PortfoliobackEnd.model.Experiencia;
import com.backEndApp.PortfoliobackEnd.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
   
    public ExperienciaRepository expeRepo;

    @Override
    public List<Experiencia> verExperiencias() {
     return  expeRepo.findAll();
    }

    @Override
    public void agregarExperiencia(Experiencia expe) {
      expeRepo.save(expe);
    }

    @Override
    public void borrarExperiencia(Long id) {
     expeRepo.deleteById(id);
    }
    

  
    
    
    
    
    
}

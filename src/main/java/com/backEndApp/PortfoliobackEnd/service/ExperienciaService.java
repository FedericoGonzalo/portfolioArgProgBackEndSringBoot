package com.backEndApp.PortfoliobackEnd.service;


import com.backEndApp.PortfoliobackEnd.model.Experiencia;

import com.backEndApp.PortfoliobackEnd.repository.ExperienciaRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    @Autowired
    public ExperienciaRepository expeRepo;

    @Override
    public List<Experiencia> verExperiencias() {
       return expeRepo.findAll();
    }

    @Override
    public void agregarExperiencia(Experiencia expe) {
     expeRepo.save(expe);
    }

    @Override
    public void borrarExperiencia(Long idExperiencia) {
         expeRepo.deleteById(idExperiencia);
    }

    @Override
    public Experiencia buscarExperiencia(Long idExperiencia) {
       return expeRepo.findById(idExperiencia).orElse(null);
    }

  

  
    @Override
    public void editarExperienciaPuesto(Long idExperiencia, String nuevoPuesto) {
        Experiencia expe=expeRepo.getById(idExperiencia);
         expe.setPuesto(nuevoPuesto);
         expeRepo.save(expe);
    }

    @Override
    public void editarExperienciaDescripcion(Long idExperiencia, String nuevoDescripcion) {
        Experiencia expe=expeRepo.getById(idExperiencia);
         expe.setDescripcion(nuevoDescripcion);
         expeRepo.save(expe);
    }

    @Override
    public void editarExperienciaEmpresa(Long idExperiencia, String nuevoEmpresa) {
      Experiencia expe=expeRepo.getById(idExperiencia);
          expe.setEmpresa(nuevoEmpresa);
         expeRepo.save(expe);
    }
    
    @Override
    public void editarExperienciaLogoEmp(Long idExperiencia, String nuevoLogoEmpresa) {
    Experiencia expe=expeRepo.getById(idExperiencia);
          expe.setLogoEmpresa(nuevoLogoEmpresa);
         expeRepo.save(expe);
    }

    @Override
    public void editarExperienciaFechaInicio(Long idExperiencia, Date nuevoFechaInicio) {
   Experiencia expe=expeRepo.getById(idExperiencia);
         expe.setFechaInicio(nuevoFechaInicio);
         expeRepo.save(expe);
    }

    @Override
    public void editarExperienciaFechaFin(Long idExperiencia, Date nuevoFechaFin) {
      Experiencia expe=expeRepo.getById(idExperiencia);
         expe.setFechaFin(nuevoFechaFin);
         expeRepo.save(expe);   
    }

   

}

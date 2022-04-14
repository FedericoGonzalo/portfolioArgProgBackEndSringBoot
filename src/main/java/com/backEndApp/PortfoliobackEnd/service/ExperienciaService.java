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
    public Experiencia editarBuscarExperiencia(Long idExperiencia, String nuevoPuesto, String nuevoDescripcion, String nuevoEmpresa, String nuevoLogoEmpresa, Date nuevoFechaInicio, Date nuevoFechaFin, Long nuevoTipoExperienciaIdExperiencia) {
      Experiencia expe=expeRepo.getById(idExperiencia);
       expe.setPuesto(nuevoPuesto);
       expe.setDescripcion(nuevoDescripcion);
       expe.setEmpresa(nuevoEmpresa);
       expe.setLogoEmpresa(nuevoEmpresa);
       expe.setFechaInicio(nuevoFechaInicio);
       expe.setFechaFin(nuevoFechaFin);
       
        expeRepo.save(expe);
        return expe;
    }

  
    
    
    
    
    
}

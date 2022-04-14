
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.Formacion;
import com.backEndApp.PortfoliobackEnd.repository.FormacionRepository;
import java.util.Date;
import java.util.List;
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
    public Formacion editarFormacion(Long idFormacion, String nuevoNombreTitulo, String nuevoNombreInstituto, Date nuevoFechaInicio, Date nuevoFechaFin, Boolean nuevoFinalizado) {
        Formacion forma=formaRepo.getById(idFormacion);
        forma.setNombreTitulo(nuevoNombreTitulo);
        forma.setNombreInstituto(nuevoNombreInstituto);
        forma.setFechaInicio(nuevoFechaInicio);
        forma.setFechafin(nuevoFechaFin);
        forma.setFinalizado(nuevoFinalizado);
        formaRepo.save(forma);
        return forma ;
    }
    
}

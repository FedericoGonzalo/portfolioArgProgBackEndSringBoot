
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.AcercaPersona;
import com.backEndApp.PortfoliobackEnd.repository.AcercaPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaPersonaService implements IAcercaPersonaService{
@Autowired
  
public AcercaPersonaRepository acerPerRepo;
 
    @Override
    public List<AcercaPersona> verAcercapersonas() {
        return acerPerRepo.findAll();
    }

    @Override
    public void crearAcercaPersona(AcercaPersona acerPer) {
    acerPerRepo.save(acerPer);
    }

    @Override
    public void borrarAcercaPersona(Long idAcercaPersona) {
    acerPerRepo.deleteById(idAcercaPersona);
    }

    @Override
    public AcercaPersona buscarAcercaPersona(Long idAcercaPersona) {
      return acerPerRepo.findById(idAcercaPersona).orElse(null);
    }

    @Override
    public AcercaPersona editarAcercaPersona(Long idAcercaPersona, String nuevoTextoAcerca) {
     AcercaPersona acerPerso= acerPerRepo.getById(idAcercaPersona);
     acerPerso.setTextoAcerca(nuevoTextoAcerca);
     acerPerRepo.save(acerPerso);
     return acerPerso;
    }
    

}
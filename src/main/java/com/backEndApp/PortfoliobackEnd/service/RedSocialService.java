
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.RedSocial;
import com.backEndApp.PortfoliobackEnd.repository.RedSocialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedSocialService implements IRedSocialService{
     @Autowired
     private RedSocialRepository redSocRepo;
    
    @Override
    public List<RedSocial> verTiposRedesSociales() {
        return redSocRepo.findAll();
    }

    @Override
    public void agregarRedSocial(RedSocial reds) {
     redSocRepo.save(reds);
    }

    @Override
    public void borrarRedSocial(Long idRedsocial) {
        redSocRepo.deleteById(idRedsocial);
   
    }

    @Override
    public RedSocial buscarRedSocial(Long idRedSocial) {
        return redSocRepo.findById(idRedSocial).orElse(null);
        
  
    }

    @Override
    public RedSocial editarRedSocial(Long idRedSocial, String urlRedSocial) {
        RedSocial eRedSoc=redSocRepo.getById(idRedSocial);
        eRedSoc.setUrlRedSocial(urlRedSocial);
        redSocRepo.save(eRedSoc);
      return eRedSoc;
    }
    
}

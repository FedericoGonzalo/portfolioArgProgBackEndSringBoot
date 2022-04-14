
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.TipoRedSocial;
import com.backEndApp.PortfoliobackEnd.repository.TipoRedSocialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoRedSocialService implements ITipoRedSocialService{
    @Autowired
    public TipoRedSocialRepository tipoRedSocRepo;

    @Override
    public List<TipoRedSocial> verTiposRedSocial() {
       return tipoRedSocRepo.findAll();
    }

    @Override
    public void agregarTipoRedsocial(TipoRedSocial newRedSocial) {
        tipoRedSocRepo.save(newRedSocial);
        
    }

    @Override
    public void borrarTipoRedSocial(Long idTipoRedSocial) {
        tipoRedSocRepo.deleteById(idTipoRedSocial);
    }

    @Override
    public TipoRedSocial buscarTipoRedSocial(Long idTipoRedSocial) {
     return tipoRedSocRepo.findById(idTipoRedSocial).orElse(null);
    }

    @Override
    public TipoRedSocial editarTipoRedSocial(Long idTipoRedSocial, String nuevoNombreRedSocial, String nuevoUrlLogo) {
     TipoRedSocial tipoRedSoc=tipoRedSocRepo.getById(idTipoRedSocial);
     tipoRedSoc.setNombreRedSocial(nuevoNombreRedSocial);
     tipoRedSoc.setUrlLogo(nuevoUrlLogo);
     tipoRedSocRepo.save(tipoRedSoc);
     return tipoRedSoc;
    }
    
}

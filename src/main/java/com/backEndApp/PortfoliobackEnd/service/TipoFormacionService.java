
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.TipoFormacion;
import com.backEndApp.PortfoliobackEnd.repository.TipoFormacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoFormacionService implements ITipoFormacionService{
    @Autowired
    public TipoFormacionRepository tipoFormaRepo;

    @Override
    public List<TipoFormacion> verTiposFormacion() {
        return tipoFormaRepo.findAll();
    }

    @Override
    public void crearTipoFormacion(TipoFormacion tipoForm) {
        tipoFormaRepo.save(tipoForm);
    }

    @Override
    public void borrarTipoFormacion(Long idTipoFormacion) {
        tipoFormaRepo.deleteById(idTipoFormacion);
    }

    @Override
    public TipoFormacion buscarTipoFormacion(Long idTipoFormacion) {
        
       return tipoFormaRepo.findById(idTipoFormacion).orElse(null);    }

    

    @Override
    public TipoFormacion editTipoFormacion(Long idTipoFormacion, String nuevoNombreTipoFormacion){
   TipoFormacion TipoFormacion = tipoFormaRepo.getById(idTipoFormacion);
  
  TipoFormacion.setNombreTipoFormacion(nuevoNombreTipoFormacion);
   tipoFormaRepo.save(TipoFormacion );
   return TipoFormacion;
    
        
        
        
        
    }
   
    
    
}

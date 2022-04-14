
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.TipoExperiencia;
import com.backEndApp.PortfoliobackEnd.repository.TipoExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoExperienciaService implements ITipoExperienciaService{
 @Autowired
 public TipoExperienciaRepository tipoExpRepo;
    @Override
    public List<TipoExperiencia> verTipoExperiencias() {
        return  tipoExpRepo.findAll();
      
    }

    @Override
    public void agregarTipoExperiencia(TipoExperiencia tipoExp) {
        tipoExpRepo.save(tipoExp);
        
    }

    @Override
    public void borrarTipoExperiencia(Long idTipoExperiencia) {
      tipoExpRepo.deleteById(idTipoExperiencia);
    }

    @Override
    public TipoExperiencia buscarTipoExperiencia(Long idTipoExperiencia) {
       return tipoExpRepo.findById(idTipoExperiencia).orElse(null);
    }

    @Override
    public TipoExperiencia editarTipoExperiencia(Long idTipoExperiencia, String nuevoTipoExperiencia) {
       TipoExperiencia tipoExpe = tipoExpRepo.getById(idTipoExperiencia);
       tipoExpe.setTipoExperiencia(nuevoTipoExperiencia);
       tipoExpRepo.save(tipoExpe);
       return tipoExpe;
               
    }
    
}

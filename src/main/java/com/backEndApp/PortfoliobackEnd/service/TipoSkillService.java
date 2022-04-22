
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.TipoSkill;
import com.backEndApp.PortfoliobackEnd.repository.TipoSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoSkillService implements ITipoSkillService {
    @Autowired
    public TipoSkillRepository tipoSkillRepo;

    @Override
    public List<TipoSkill> verTipoSkills() {
     return tipoSkillRepo.findAll();
    }

    @Override
    public void agregarTipoSkill(TipoSkill newSkill) {
        tipoSkillRepo.save(newSkill);
        
    }

    @Override
    public void borrarTipoSkill(Long idTipoSkill) {
        tipoSkillRepo.deleteById(idTipoSkill);
    }

    @Override
    public TipoSkill buscarTipoSkill(Long idTipoSkill) {
      return tipoSkillRepo.findById(idTipoSkill).orElse(null);
    }

    @Override
    public TipoSkill editTipoSkill(Long idTipoSkill, String nuevoNombreTipoSkill) {
      TipoSkill tipSkill=tipoSkillRepo.getById(idTipoSkill);
      tipSkill.setNombreTipoSkill(nuevoNombreTipoSkill);
      tipoSkillRepo.save(tipSkill);
      return tipSkill;
      
      
    }
    
}

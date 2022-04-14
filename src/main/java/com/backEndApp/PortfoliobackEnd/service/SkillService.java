
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.Skill;
import com.backEndApp.PortfoliobackEnd.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService {
     @Autowired
     public SkillRepository skillRepo;

    @Override
    public List<Skill> verExperiencias() {
        return skillRepo.findAll();
    }

    @Override
    public void agregarSkill(Skill newSkill) {
        skillRepo.save(newSkill);
    }

    @Override
    public void borrarSkill(Long idSkill) {
       skillRepo.deleteById(idSkill);
    }

    @Override
    public Skill buscarSkill(Long idSkill) {
        return skillRepo.findById(idSkill).orElse(null);
        
    }

    @Override
    public Skill editarSkill(Long idSkill, Long nuevoPorcentajeSkill, String nuevoNombreSkill) {
        Skill eSkill=skillRepo.getById(idSkill);
        eSkill.setPorcentajeSkill(nuevoPorcentajeSkill);
        eSkill.setNombreSkill(nuevoNombreSkill);
        skillRepo.save(eSkill);
       
        return eSkill ;
    }
    
}

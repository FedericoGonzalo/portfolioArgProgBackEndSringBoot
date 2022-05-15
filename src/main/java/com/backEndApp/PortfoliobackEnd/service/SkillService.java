
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
    public List<Skill> verSkills() {
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
    public void editarSkillNombre(Long idSkill, String nuevoNombreSkill) {
    Skill eSkill=skillRepo.getById(idSkill);
        
        eSkill.setNombreSkill(nuevoNombreSkill);
        skillRepo.save(eSkill);
    
    };

}
    


package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.Skill;
import java.util.List;


public interface ISkillService {
     public List<Skill> verSkills();

    public void agregarSkill(Skill newSkill);
    public void borrarSkill(Long idSkill);
    public Skill buscarSkill(Long idSkill);
    public void editarSkill(Skill skill );
   
           
}

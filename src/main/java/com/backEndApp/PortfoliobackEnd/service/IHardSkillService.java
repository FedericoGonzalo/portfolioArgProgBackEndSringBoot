
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.HardSkill;
import java.util.List;


public interface IHardSkillService {
    
     public List<HardSkill> verHardSkills();
    public void agregarHardSkill(HardSkill hardSkill);
    public void borrarHardSkill (Long idHardSkill);
    public HardSkill buscarHardSkill(Long idHardSkill);

     public void editarHardSkill(HardSkill hardSkill
                                   );
  
    
}

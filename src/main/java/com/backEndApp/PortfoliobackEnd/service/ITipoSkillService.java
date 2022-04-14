
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.TipoSkill;
import java.util.List;


public interface ITipoSkillService {
    public List<TipoSkill> verTipoSkills();
    public void agregarTipoSkill (TipoSkill newSkill);
    public void borrarTipoSkill(Long idTipoSkill);
    public TipoSkill buscarTipoSkill(Long idTipoSkill);
    public TipoSkill editarTipoSkill(Long idTipoSkill,
                                      String nuevoNombreTipoSkill);
    
    
    
}

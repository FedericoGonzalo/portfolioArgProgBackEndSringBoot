
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.RedSocial;
import java.util.List;


public interface IRedSocialService {
    public List<RedSocial> verTiposRedesSociales();
    public void agregarRedSocial(RedSocial reds);
    public void borrarRedSocial(Long idRedsocial);
    public RedSocial buscarRedSocial(Long idRedSocial);
    public RedSocial editarRedSocial (Long idRedSocial,
                                      String urlRedSocial);
    
    
    
}

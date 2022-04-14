
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.TipoRedSocial;
import java.util.List;

public interface ITipoRedSocialService {
    public List<TipoRedSocial> verTiposRedSocial();
    public void agregarTipoRedsocial(TipoRedSocial newRedSocial);
    public void borrarTipoRedSocial(Long idTipoRedSocial);
    public TipoRedSocial buscarTipoRedSocial(Long idTipoRedSocial);
    public TipoRedSocial editarTipoRedSocial(Long idTipoRedSocial,
                                            String nuevoNombreRedSocial,
                                            String nuevoUrlLogo
                                            );
    
}

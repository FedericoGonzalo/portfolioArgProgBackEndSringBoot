
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.TipoFormacion;
import java.util.List;

public interface ITipoFormacionService {
    public List<TipoFormacion> verTiposFormacion();
    public void crearTipoFormacion(TipoFormacion tipoForm);
    public void borrarTipoFormacion(Long idTipoFormacion);
    public  TipoFormacion buscarTipoFormacion(Long idTipoFormacion);
    public TipoFormacion editTipoFormacion(Long idTipoFormacion,
                                            String nuevoNombreTipoFormacion);
    
    
    
}

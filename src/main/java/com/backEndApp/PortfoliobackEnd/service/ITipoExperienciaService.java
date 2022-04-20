
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.TipoExperiencia;
import java.util.List;


public interface ITipoExperienciaService {
    public List<TipoExperiencia> verTipoExperiencias();
    public void agregarTipoExperiencia (TipoExperiencia newTipoExp);
    public void borrarTipoExperiencia (Long idTipoExperiencia);
    public TipoExperiencia buscarTipoExperiencia(Long idTipoExperiencia);
    public TipoExperiencia editarTipoExperiencia (Long idTipoExperiencia,
                                                String nuevoNombreTipoExperiencia);
    
}


package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.AcercaPersona;
import java.util.List;

public interface IAcercaPersonaService  {
    public List<AcercaPersona> verAcercapersonas();
    public void crearAcercaPersona (AcercaPersona acerPer);
    public void borrarAcercaPersona (Long idAcercaPersona);
    public AcercaPersona buscarAcercaPersona (Long idAcercaPersona);
    public AcercaPersona editarAcercaPersona(Long idAcercaPersona,
                                           String nuevoTextoAcerca);
    
    
}

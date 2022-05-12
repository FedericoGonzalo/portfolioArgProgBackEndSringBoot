
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.Formacion;
import com.backEndApp.PortfoliobackEnd.model.TipoFormacion;
import java.util.Date;
import java.util.List;

public interface IFormacionService {
    public List<Formacion> verFormaciones();
    public void agregarFormacion(Formacion forma);
    public void borrarFormacion (Long idFormacion);
    public Formacion buscarFormacion(Long idFormacion);
    
    
     public void editarFormacionNombreTitulo(Long idFormacion,String nuevoNombreTitulo
                                   );
     public void editarFormacionNombreInstituto(Long idFormacion,String nuevoNombreInstituto
                                   );
     public void editarFormacionFechaInicio(Long idFormacion, Date nuevoFechaInicio
                                   );
     public void editarFormacionFechaFin(Long idFormacion,  Date nuevoFechaFin
                                   );
     public void editarFormacionFinalizado(Long idFormacion, Boolean nuevoFinalizado
                                   );
     public void editarFormacionTipoForm(Long idFormacion, TipoFormacion nuevoTipoFormacion
                                   );
}

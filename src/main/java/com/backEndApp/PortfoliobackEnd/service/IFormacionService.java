
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.Formacion;
import java.util.Date;
import java.util.List;

public interface IFormacionService {
    public List<Formacion> verFormaciones();
    public void agregarFormacion(Formacion forma);
    public void borrarFormacion (Long idFormacion);
    public Formacion buscarFormacion(Long idFormacion);
    public Formacion editarFormacion(Long idFormacion,
                                   String nuevoNombreTitulo,
                                   String nuevoNombreInstituto,
                                   Date nuevoFechaInicio,
                                   Date nuevoFechaFin,
                                   Boolean nuevoFinalizado);
    
    
}

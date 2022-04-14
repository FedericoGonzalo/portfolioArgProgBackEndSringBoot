
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.Proyecto;
import java.util.Date;
import java.util.List;


public interface IProyectoService {
    public List<Proyecto>verProyectos();
    public void agregarProyecto(Proyecto nProyecto);
    public void borrarProyecto(Long idProyecto);
    public Proyecto encontrarProyecto(Long idProyecto);
    public Proyecto editarProyecto(Long idProyecto,
                                    String nuevoNombre,
                                    Date nuevoFechaRealizacion,
                                    String nuevaDescripcion,
                                    String nuevaUrlProyecto,
                                    String nuevaUrlImagenProyecto);
    
}

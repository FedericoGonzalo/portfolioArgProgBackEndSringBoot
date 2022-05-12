
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.Proyecto;
import java.util.Date;
import java.util.List;


public interface IProyectoService {
   public List<Proyecto>verProyectos();
    public void agregarProyecto(Proyecto nuevoProyecto);
    public void borrarProyecto(Long idProyecto);
    public Proyecto encontrarProyecto(Long idProyecto);
    public void editarProyectoNombre(Long idProyecto,
            String nuevoNombre);
    public void editarProyectoFechaRealizacion(Long idProyecto, Date nuevoFecha);
    public void editarProyectoDescripcion(Long idProyecto,String nuevaDescripcion);
    public void editarProyectoUrlProyecto(Long idProyecto,String nuevaUrlProyecto);
    public void editarProyectoUrlImagenProyecto(Long idProyecto,String nuevaUrlImagenProyecto);
}

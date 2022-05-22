
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.Proyecto;
import java.util.Date;
import java.util.List;


public interface IProyectoService {
   public List<Proyecto>verProyectos();
    public void agregarProyecto(Proyecto nuevoProyecto);
    public void borrarProyecto(Long idProyecto);
    public Proyecto encontrarProyecto(Long idProyecto);
    public void editarProyecto(Proyecto proyecto);
   
}

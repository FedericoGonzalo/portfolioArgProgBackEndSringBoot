
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.Experiencia;
import java.util.Date;
import java.util.List;


public interface IExperienciaService  {
    public List<Experiencia> verExperiencias();
    public void agregarExperiencia (Experiencia expe);
    public void borrarExperiencia  (Long idExperiencia);
    public Experiencia buscarExperiencia(Long idExperiencia);
    public Experiencia editarBuscarExperiencia(Long idExperiencia,
            String nuevoPuesto,
            String nuevoDescripcion,
            String nuevoEmpresa,
            String nuevoLogoEmpresa,
            Date nuevoFechaInicio,
            Date nuevoFechaFin,
            Long nuevoTipoExperienciaIdExperiencia);
   
}

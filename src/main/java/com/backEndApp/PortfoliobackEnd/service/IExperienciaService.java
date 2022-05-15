
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.Experiencia;

import java.util.Date;
import java.util.List;


public interface IExperienciaService  {
    public List<Experiencia> verExperiencias();
    public void agregarExperiencia (Experiencia expe);
    public void borrarExperiencia  (Long idExperiencia);
    public Experiencia buscarExperiencia(Long idExperiencia);
 
   public void editarExperienciaPuesto(Long idExperiencia, String nuevoPuesto);
   public void editarExperienciaDescripcion(Long idExperiencia,String nuevoDescripcion);
   public void editarExperienciaEmpresa(Long idExperiencia,String nuevoEmpresa);
   public void editarExperienciaLogoEmp(Long idExperiencia,String nuevoLogoEmpresa);
   public void editarExperienciaFechaInicio(Long idExperiencia, Date nuevoFechaInicio);
   public void editarExperienciaFechaFin(Long idExperiencia, Date nuevoFechaFin);

   
   
                                              
}

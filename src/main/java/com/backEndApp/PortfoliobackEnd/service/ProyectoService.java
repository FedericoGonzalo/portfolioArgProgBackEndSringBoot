
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.Proyecto;
import com.backEndApp.PortfoliobackEnd.repository.ProyectoRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProyectoService implements IProyectoService{
    @Autowired
    public ProyectoRepository proyectRepo;

    @Override
    public List<Proyecto> verProyectos() {
     return proyectRepo.findAll();
    }

    @Override
    public void agregarProyecto(Proyecto proye) {
        proyectRepo.save(proye);
    }

    @Override
    public void borrarProyecto(Long idProyecto) {
 proyectRepo.deleteById(idProyecto);
    }

    @Override
    public Proyecto encontrarProyecto(Long idProyecto) {
      return proyectRepo.findById(idProyecto).orElse(null);

    }

    @Override
    public void editarProyectoNombre(Long idProyecto, String nuevoNombre) {
      Proyecto proye=proyectRepo.getById(idProyecto);
      proye.setNombre(nuevoNombre);
      proyectRepo.save(proye);
    }

    @Override
    public void editarProyectoFechaRealizacion(Long idProyecto, Date nuevoFecha) {
    
     Proyecto proye=proyectRepo.getById(idProyecto);
      proye.setFechaRealizacion(nuevoFecha);
      proyectRepo.save(proye);
    }

    @Override
    public void editarProyectoDescripcion(Long idProyecto, String nuevaDescripcion) {
    Proyecto proye=proyectRepo.getById(idProyecto);
      proye.setDescripcion(nuevaDescripcion);
      proyectRepo.save(proye);
    }

    @Override
    public void editarProyectoUrlProyecto(Long idProyecto, String nuevaUrlProyecto) {
  Proyecto proye=proyectRepo.getById(idProyecto);
      proye.setUrlProyecto(nuevaUrlProyecto);
      proyectRepo.save(proye);
    
    }

    @Override
    public void editarProyectoUrlImagenProyecto(Long idProyecto, String nuevaUrlImagenProyecto) {
    Proyecto proye=proyectRepo.getById(idProyecto);
      proye.setUrlImagenProyecto(nuevaUrlImagenProyecto);
      proyectRepo.save(proye);}
    
}

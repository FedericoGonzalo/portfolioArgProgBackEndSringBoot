
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
    public Proyecto editarProyecto(Long idProyecto, String nuevoNombre, Date nuevoFechaRealizacion, String nuevaDescripcion, String nuevaUrlProyecto, String nuevaUrlImagenProyecto) {
      Proyecto proye=proyectRepo.getById(idProyecto);
      proye.setNombre(nuevoNombre);
      proye.setFechaRealizacion(nuevoFechaRealizacion);
      proye.setDescripcion(nuevaDescripcion);
      proye.setUrlProyecto(nuevaUrlProyecto);
      proye.setUrlImagenProyecto(nuevaUrlImagenProyecto);
      proyectRepo.save(proye);
      return proye;
    }
    
}


package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.ImagenPersona;
import com.backEndApp.PortfoliobackEnd.repository.ImagenPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagenPersonaService implements IImagenPersonaService{
    @Autowired
    public ImagenPersonaRepository imagPerRepo;

    @Override
    public List<ImagenPersona> verImagenesPersonas() {
        return imagPerRepo.findAll();
    }

    @Override
    public void agregarImagenPersona(ImagenPersona imgPerso) {
       imagPerRepo.save(imgPerso);
    }

    @Override
    public void borrarImagenPersona(Long idImagenPersona) {
        imagPerRepo.deleteById(idImagenPersona);
        
    }

    @Override
    public ImagenPersona buscarImagenPersona(Long idImagenPersona) {
      return imagPerRepo.findById(idImagenPersona).orElse(null);
       
    }

    @Override
    public ImagenPersona editarImagenPersona(Long idImagenPersona, String nuevaFotoUrl, String nuevaHeaderUrl) {
         ImagenPersona imagPers=imagPerRepo.getById(idImagenPersona);
         imagPers.setFotoUrl(nuevaFotoUrl);
         imagPers.setHeaderUrl(nuevaHeaderUrl);
         imagPerRepo.save(imagPers);
         return imagPers;
    }
    
}

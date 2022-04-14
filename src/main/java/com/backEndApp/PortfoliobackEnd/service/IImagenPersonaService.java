
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.ImagenPersona;
import java.util.List;


public interface IImagenPersonaService {
    public List<ImagenPersona> verImagenesPersonas();
    public void agregarImagenPersona(ImagenPersona imgPerso);
    public void borrarImagenPersona (Long idImagenPersona);
    public ImagenPersona buscarImagenPersona(Long idImagenPersona);
    public ImagenPersona editarImagenPersona(Long idImagenPersona,
                                             String nuevaFotoUrl,
                                           String nuevaHeaderUrl);
}

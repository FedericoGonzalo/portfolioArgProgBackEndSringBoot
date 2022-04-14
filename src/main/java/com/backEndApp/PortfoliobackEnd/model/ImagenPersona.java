
package com.backEndApp.PortfoliobackEnd.model;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ImagenPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idImagenPersona;
    private String fotoUrl;
    private String headerUrl;
    
    
    public  ImagenPersona(){};
    public  ImagenPersona(Long idImagenPersona,
                              String fotoUrl,
                              String headerUrl){
    this.idImagenPersona=idImagenPersona;
    this.fotoUrl=fotoUrl;
    this.headerUrl=headerUrl;
    };
    
}

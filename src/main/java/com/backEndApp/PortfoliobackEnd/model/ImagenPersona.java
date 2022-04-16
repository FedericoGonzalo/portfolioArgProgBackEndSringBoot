
package com.backEndApp.PortfoliobackEnd.model;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table
public class ImagenPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idImagenPersona;
    private String fotoUrl;
    private String headerUrl;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="persona_id_persona")
    private Persona persona;
    
    public  ImagenPersona(){};
    public  ImagenPersona(Long idImagenPersona,
                              String fotoUrl,
                              String headerUrl,
                              Persona persona){
    this.idImagenPersona=idImagenPersona;
    this.fotoUrl=fotoUrl;
    this.headerUrl=headerUrl;
    this.persona=persona;
    };
    
}

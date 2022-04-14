
package com.backEndApp.PortfoliobackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AcercaPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAcercaPersona;
    private String textoAcerca;
    
    public AcercaPersona(){};
    public AcercaPersona(Long idAcercaPersona,
                          String textoAcerca){
        this.idAcercaPersona=idAcercaPersona;
        this.textoAcerca=textoAcerca;
    };
}

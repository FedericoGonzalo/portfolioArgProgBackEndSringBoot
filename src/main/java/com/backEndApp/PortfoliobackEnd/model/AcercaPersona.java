
package com.backEndApp.PortfoliobackEnd.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table
public class AcercaPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAcercaPersona;
    private String textoAcerca;
    
    @JsonIgnore
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="persona_id_persona")
    private Persona persona;
    
    public AcercaPersona(){};
    public AcercaPersona(Long idAcercaPersona,
                          String textoAcerca,
                          Persona persona){
        this.idAcercaPersona=idAcercaPersona;
        this.textoAcerca=textoAcerca;
        this.persona=persona;
    };
}

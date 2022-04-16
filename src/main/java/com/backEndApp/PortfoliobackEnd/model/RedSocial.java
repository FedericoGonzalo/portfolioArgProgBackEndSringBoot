
package com.backEndApp.PortfoliobackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table
public class RedSocial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRedSocial;
    private String urlRedSocial;
    
    @ManyToOne()
    @JoinColumn(name="tipo_red_social_id_tipo_red_social")
     private TipoRedSocial tipoRedSocial;
    @ManyToOne()
    @JoinColumn(name="persona_id_persona")
    private Persona persona;

    
    
    public RedSocial(){};
    public RedSocial(Long idRedSocial,String urlRedSocial,
                     TipoRedSocial tipoRedSocial,
                     Persona persona){
    this.idRedSocial=idRedSocial;
    this.urlRedSocial=urlRedSocial;
    this.tipoRedSocial=tipoRedSocial;
    this.persona=persona;
    };
}

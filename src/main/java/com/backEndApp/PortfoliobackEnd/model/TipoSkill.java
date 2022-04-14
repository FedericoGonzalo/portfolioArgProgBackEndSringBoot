
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

public class TipoSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long idTipoSkill;
    private String nombreTipoSkill;
    
    public TipoSkill(){};
    public TipoSkill(Long idTipoSkill,
                     String nombreTipoSkill){
      this.idTipoSkill= idTipoSkill;
      this.nombreTipoSkill=nombreTipoSkill;
    };
    
}

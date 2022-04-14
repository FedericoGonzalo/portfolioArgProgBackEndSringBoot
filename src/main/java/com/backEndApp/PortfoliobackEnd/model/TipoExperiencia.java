
package com.backEndApp.PortfoliobackEnd.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity


public class TipoExperiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idTipoExperiencia;
    private String tipoExperiencia;
    
 
  
    
    
    public TipoExperiencia(){};
    public TipoExperiencia(Long idTipoExperiencia,
                            String tipoExperiencia){
        this.idTipoExperiencia=idTipoExperiencia;
        this.tipoExperiencia=tipoExperiencia;
    };
    
}

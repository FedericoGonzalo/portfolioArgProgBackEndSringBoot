
package com.backEndApp.PortfoliobackEnd.model;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table

public class TipoExperiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idTipoExperiencia;
    private String tipoExperiencia;
    
    @OneToMany(mappedBy="tipoExperiencia")
    private List<Experiencia> experiencias;
 
  
    
    
    public TipoExperiencia(){};
    public TipoExperiencia(Long idTipoExperiencia,
                            String tipoExperiencia,
                            List<Experiencia> experiencias){
        this.idTipoExperiencia=idTipoExperiencia;
        this.tipoExperiencia=tipoExperiencia;
        this.experiencias=experiencias;
    };
    
}

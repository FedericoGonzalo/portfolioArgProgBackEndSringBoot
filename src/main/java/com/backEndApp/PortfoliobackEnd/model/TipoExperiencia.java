
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
@Entity
@Getter
@Setter

@Table

public class TipoExperiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idTipoExperiencia;
    private String nombreTipoExperiencia;
    
    @OneToMany(mappedBy="tipoExperiencia")
    private List<Experiencia> experiencias;
 
  
    
    
    public TipoExperiencia(){};
    public TipoExperiencia(Long idTipoExperiencia,
                            String nombreTipoExperiencia,
                            List<Experiencia> experiencias){
        this.idTipoExperiencia=idTipoExperiencia;
        this.nombreTipoExperiencia=nombreTipoExperiencia;
        this.experiencias=experiencias;
    };
    
}

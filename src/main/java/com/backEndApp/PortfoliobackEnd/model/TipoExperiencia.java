
package com.backEndApp.PortfoliobackEnd.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.LinkedList;
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
    @JsonIgnore
    @OneToMany(mappedBy="tipoExperiencia")
    private List<Experiencia> experiencias=new ArrayList<>();
 
  
    
    
    public TipoExperiencia(){};
    public TipoExperiencia(Long idTipoExperiencia,
                            String nombreTipoExperiencia,
                            List<Experiencia> experiencias){
        this.idTipoExperiencia=idTipoExperiencia;
        this.nombreTipoExperiencia=nombreTipoExperiencia;
        this.experiencias=experiencias;
    };
    
}

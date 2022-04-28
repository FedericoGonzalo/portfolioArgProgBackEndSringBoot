
package com.backEndApp.PortfoliobackEnd.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
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
     @JsonIgnore
    private Long idTipoExperiencia;
    @Column(unique = true)
    private String nombreTipoExperiencia;
    
    @OneToMany(mappedBy="tipoExperiencia",orphanRemoval = true,cascade={CascadeType.PERSIST,CascadeType.REMOVE})
   @JsonIgnore
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

package com.backEndApp.PortfoliobackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter

public class TipoFormacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long idTipoFormacion;
    private String nombreFormacion;
    
    public TipoFormacion(){};
    
    public TipoFormacion(Long idTipoFormacion,
                          String nombreFormacion){
    this.idTipoFormacion=idTipoFormacion;
    this.nombreFormacion=nombreFormacion;}
    
           
    
}

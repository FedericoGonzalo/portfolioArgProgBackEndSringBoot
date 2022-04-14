package com.backEndApp.PortfoliobackEnd.model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity 

public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExperiencia;
    private String puesto;
    private String descripcion;
    private String empresa;
    private String logoEmpresa;
    
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
   
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;
   

   
   
   
   
   
   public Experiencia(){   } 
   public Experiencia(Long idExperiencia,
            String puesto,
            String descripcion,
            String empresa, 
            String logoEmpresa,
            Date fechaInicio,
            Date fechaFin
           
            )
    {
    this.idExperiencia=idExperiencia;
    this.puesto=puesto;
    this.descripcion=descripcion;
    this.empresa=empresa;
    this.logoEmpresa=logoEmpresa;
    this.fechaInicio=fechaInicio;
    this.fechaFin=fechaFin;
    
  
    
    
    }
}


  

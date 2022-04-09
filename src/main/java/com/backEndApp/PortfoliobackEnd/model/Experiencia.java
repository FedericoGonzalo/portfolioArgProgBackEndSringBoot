package com.backEndApp.PortfoliobackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.EntityGraph;

@Getter
@Setter
@Entity 

public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String puesto;
    private String descripcion;
    private String empresa;
    private String logoEmpresa;
    private String fechaInicio;
    private String fechaFin;
    
    public Experiencia(){   
     }
    public Experiencia(Long id,
            String puesto,
            String descripcion,
            String empresa, 
            String logoEmpresa,
            String fechaInicio,
            String fechaFin){
    this.id=id;
    this.puesto=puesto;
    this.descripcion=descripcion;
    this.empresa=empresa;
    this.logoEmpresa=logoEmpresa;
    this.fechaInicio=fechaInicio;
    this.fechaFin=fechaFin;
    
    }
}


  

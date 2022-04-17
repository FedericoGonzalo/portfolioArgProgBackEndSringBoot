package com.backEndApp.PortfoliobackEnd.model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity 
@Table
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExperiencia;
    private String puesto;
    private String descripcion;
    private String empresa;
    private String logoEmpresa;
    private Date fechaInicio;
    private Date fechaFin;
   
    @ManyToOne()
    @JoinColumn(name="tipo_experiencia_id_experiencia")
    private TipoExperiencia tipoExperiencia;
    
   @ManyToOne()
    @JoinColumn(name="persona_id_persona")
   private Persona persona;
    

   
   public Experiencia(){   } 
   public Experiencia(Long idExperiencia,
            String puesto,
            String descripcion,
            String empresa, 
            String logoEmpresa,
            Date fechaInicio,
            Date fechaFin,
            TipoExperiencia tipoExperiencia,
            Persona persona
           
            )
    {
    this.idExperiencia=idExperiencia;
    this.puesto=puesto;
    this.descripcion=descripcion;
    this.empresa=empresa;
    this.logoEmpresa=logoEmpresa;
    this.fechaInicio=fechaInicio;
    this.fechaFin=fechaFin;
    this.tipoExperiencia=tipoExperiencia;
    this.persona=persona;
    
  
    
    
    }
}


  

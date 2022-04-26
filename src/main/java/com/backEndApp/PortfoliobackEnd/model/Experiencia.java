package com.backEndApp.PortfoliobackEnd.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter
@Setter
@Table
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExperiencia;
    private String puesto;
    private String descripcion;
    private String empresa;
    private String logoEmpresa="https://i.postimg.cc/2Shqwp02/pngwing-com.png";
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
   
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;
  
    @ManyToOne()
    @JoinColumn(name="tipo_experiencia_id_tipo_experiencia")
  
    private TipoExperiencia tipoExperiencia;
   
 
   @ManyToOne()
  @JoinColumn(name="persona_id_persona")
  @JsonIgnore
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
            Persona persona){
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


  

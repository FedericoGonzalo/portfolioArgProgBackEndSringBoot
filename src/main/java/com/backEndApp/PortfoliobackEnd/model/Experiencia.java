package com.backEndApp.PortfoliobackEnd.model;
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
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

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
    private String logoEmpresa;
    
   // @Temporal(javax.persistence.TemporalType.DATE)
  //  @DateTimeFormat(pattern="yyyy-mm-dd")
  @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy",timezone = "America/Argentina/Buenos_Aires")
     private Date fechaInicio;
   
 //  @Temporal(javax.persistence.TemporalType.DATE)
//  @DateTimeFormat(pattern="yyyy-mm-dd")
  @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy",timezone = "America/Argentina/Buenos_Aires")
     private Date fechaFin;
    
    
  
   
 
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
        
            Persona persona){
    this.idExperiencia=idExperiencia;
    this.puesto=puesto;
    this.descripcion=descripcion;
    this.empresa=empresa;
    this.logoEmpresa=logoEmpresa;
    this.fechaInicio=fechaInicio;
    this.fechaFin=fechaFin;
  
    this.persona=persona;
    
  
    
    
    }
}


  

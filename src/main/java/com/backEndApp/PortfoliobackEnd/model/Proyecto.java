
package com.backEndApp.PortfoliobackEnd.model;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Getter
@Setter
@Table
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProyecto;
    private String nombre;
   
   // @Temporal(javax.persistence.TemporalType.DATE)
  //@Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy",timezone = "America/Argentina/Buenos_Aires")
  

    private LocalDate fechaRealizacion;
    private String descripcion;
    private String urlProyecto;
    private String urlImagenProyecto;
    
    @ManyToOne
    @JoinColumn(name="persona_id_persona")
   @JsonIgnore
    private Persona persona;
    
    
    public Proyecto(){};
    public Proyecto(Long idProyecto,
                    String nombre,
                    LocalDate fechaRealizacion,
                     String descripcion,
                     String urlProyecto,
                     String urlImagenProyecto,
                     Persona persona){
    this.idProyecto=idProyecto;
    this.nombre=nombre;
    this.fechaRealizacion=fechaRealizacion;
    this.descripcion=descripcion;
    this.urlProyecto=urlProyecto;
    this.urlImagenProyecto=urlImagenProyecto;
    this.persona=persona;};
}

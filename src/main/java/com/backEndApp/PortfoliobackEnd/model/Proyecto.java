
package com.backEndApp.PortfoliobackEnd.model;

import com.fasterxml.jackson.annotation.JsonFormat;
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

@Entity
@Getter
@Setter
@Table
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProyecto;
    private String nombre;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechaRealizacion;
    private String descripcion;
    private String urlProyecto;
    private String urlImagenProyecto;
    
    @ManyToOne
    @JoinColumn(name="persona_id_persona")
    private Persona persona;
    
    
    public Proyecto(){};
    public Proyecto(Long idProyecto,
                    String nombre,
                    Date fechaRealizacion,
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

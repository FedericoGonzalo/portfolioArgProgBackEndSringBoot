
package com.backEndApp.PortfoliobackEnd.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Proyecto {
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProyecto;
    private String nombre;
    private Date fechaRealizacion;
    private String descripcion;
    private String urlProyecto;
    private String urlImagenProyecto;
    
    public Proyecto(){};
    public Proyecto(Long idProyecto,
                    String nombre,
                    Date fechaRealizacion,
                     String descripcion,
                     String urlProyecto,
                     String urlImagenProyecto){
    this.idProyecto=idProyecto;
    this.nombre=nombre;
    this.fechaRealizacion=fechaRealizacion;
    this.descripcion=descripcion;
    this.urlProyecto=urlProyecto;
    this.urlImagenProyecto=urlImagenProyecto;};
}

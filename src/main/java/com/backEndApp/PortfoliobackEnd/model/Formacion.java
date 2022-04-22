
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
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table
public class Formacion {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long idFormacion;
private String nombreTitulo;
private String nombreInstituto;

@Temporal(javax.persistence.TemporalType.DATE)
private Date fechaInicio;

@Temporal(javax.persistence.TemporalType.DATE)
private Date fechaFin;
private Boolean finalizado;//en workbench tinyint ojota

@ManyToOne()
@JoinColumn(name="tipo_formacion_id_tipo_formacion")
private TipoFormacion tipoFormacion;

@ManyToOne()
    @JoinColumn(name="persona_id_persona")
private Persona persona;


public Formacion(){};
public Formacion(Long idFormacion,
                  String nombreTitulo,
                  String nombreInstituto,
                   Date fechaInicio,
                   Date fechaFin,
                   Boolean finalizado,
                   TipoFormacion tipoFormacion,
                   Persona persona){
this.nombreTitulo=nombreInstituto;
this.nombreInstituto=nombreInstituto;
this.fechaInicio=fechaInicio;
this.fechaFin=fechaFin;
this.finalizado=finalizado;
this.tipoFormacion=tipoFormacion;
this.persona=persona;};
}

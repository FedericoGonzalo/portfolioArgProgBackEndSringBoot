
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

public class Formacion {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long idFormacion;
private String nombreTitulo;
private String nombreInstituto;
private Date fechaInicio;
private Date fechafin;
private Boolean finalizado;//en workbench tinyint ojota

public Formacion(){};
public Formacion(Long idFormacion,
                  String nombreTitulo,
                  String nombreInstituto,
                   Date fechaIniciado,
                   Date fechaFin,
                   Boolean finalizado){
this.nombreTitulo=nombreInstituto;
this.nombreInstituto=nombreInstituto;
this.fechaInicio=fechaInicio;
this.fechafin=fechafin;
this.finalizado=finalizado;};
}

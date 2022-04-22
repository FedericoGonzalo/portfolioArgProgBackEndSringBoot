package com.backEndApp.PortfoliobackEnd.model;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table
public class TipoFormacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long idTipoFormacion;
    private String nombreTipoFormacion;
    
    @OneToMany(mappedBy="tipoFormacion")
    private List<Formacion> formaciones=new LinkedList<Formacion>();
    
    public TipoFormacion(){};
    
    public TipoFormacion(Long idTipoFormacion,
                          String nombreTipoFormacion,
                          List<Formacion> formaciones){
    this.idTipoFormacion=idTipoFormacion;
    this.nombreTipoFormacion=nombreTipoFormacion;
    this.formaciones=formaciones;
    }
    
           
    
}

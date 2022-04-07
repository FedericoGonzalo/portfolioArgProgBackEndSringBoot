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
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String urlFotoPerfil;
    private String password;
    private String urlFotoBanner;
    
    private String nacimiento;
    private String acercaDe;
            
    public Persona(){
    }
    public Persona(Long id ,String nombre, 
                  String apellido, String correo,String password,
                  String urlFotoBanner,
                  String nacimiento,
                  String acercaDe){
        this.id = id;
        this.nombre= nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.password=password;
        this.urlFotoBanner=urlFotoBanner;
        this.nacimiento=nacimiento;
        this.acercaDe=acercaDe;
    }

}

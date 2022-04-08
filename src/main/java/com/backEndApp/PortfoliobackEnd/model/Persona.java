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
  
    private String password;
    
    private String nacimiento;
   
            
    public Persona(){
    }
    public Persona(Long id ,String nombre, 
                  String apellido, String correo,
                 
                  String password,
                
                  String nacimiento,
                  String acercaDe){
        this.id = id;
        this.nombre= nombre;
        this.apellido=apellido;
        this.correo=correo;
        
        this.password=password;
    
        this.nacimiento=nacimiento;
     
    }

}

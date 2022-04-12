package com.backEndApp.PortfoliobackEnd.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.EntityGraph;

@Getter 
@Setter
@Entity
@Table
public class Persona {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String password;
    private String nacimiento;
    @OneToMany
    private List<Experiencia> experienciaLista;       
    public Persona(){
    }
    public Persona(Long id ,String nombre, 
                  String apellido, String correo,
                 
                  String password,
                
                  String nacimiento,
                  String acercaDe,
                  List experienciaLista  ){
        this.id = id;
        this.nombre= nombre;
        this.apellido=apellido;
        this.correo=correo;
        
        this.password=password;
    
        this.nacimiento=nacimiento;
        this.experienciaLista=experienciaLista;
     
    }

}

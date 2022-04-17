package com.backEndApp.PortfoliobackEnd.model;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Entity
@Table
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPersona;
    private String nombre;
    private String apellido;
    private String correo;
    private String password;
    private Date nacimiento;
     
   @OneToOne(mappedBy="persona")
    private ImagenPersona imagenPersona;
  
   @OneToOne(mappedBy="persona")
    private AcercaPersona acercaPersona;
   
   @OneToMany(mappedBy="persona",orphanRemoval = true)
    private List<Proyecto> proyectos;
   
   @OneToMany(mappedBy="persona",orphanRemoval = true)
    private List<Skill> skills;
   
   @OneToMany(mappedBy="persona",orphanRemoval = true)
    private List<Experiencia> experiencias;
   
   @OneToMany(mappedBy="persona",orphanRemoval = true)
    private List<Formacion> formaciones;
   
   @OneToMany(mappedBy="persona",orphanRemoval = true)
    private List<RedSocial> redesSociales;
   
    
    
    public Persona(){
    };
    
   
    
    public Persona(Long idPersona ,
                  String nombre, 
                  String apellido,
                  String correo,
                  String password,
                  Date nacimiento,
                  String acercaDe,
                  ImagenPersona imagenPersona,
                  AcercaPersona acercaPersona,
                  List<Proyecto> proyectos,
                  List<Skill> skills,
                  List<Experiencia> experiencias,
                  List<Formacion> formaciones,
                  List<RedSocial> redesSociales
                   ){
        this.idPersona = idPersona;
        this.nombre= nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.password=password;
        this.nacimiento=nacimiento;
        this.imagenPersona=imagenPersona;
        this.acercaPersona=acercaPersona;
        this.proyectos=proyectos;
        this.skills=skills;
        this.experiencias=experiencias;
        this.formaciones=formaciones;
        this.redesSociales=redesSociales;
        
     
    }

}

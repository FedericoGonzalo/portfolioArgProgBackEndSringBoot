package com.backEndApp.PortfoliobackEnd.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter 
@Setter
@Table
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPersona;
    private String nombre;
    private String apellido;
    private String residencia="Alguna Ciudad";
    private String urlResidencia="https://www.google.com/maps/@-34.6154234,-58.5733841,11z";
   
     
   
   // @Temporal(javax.persistence.TemporalType.DATE)
   
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate nacimiento;
    private String fotoUrl="https://i.postimg.cc/QCLS4sXd/585e4beacb11b227491c3399.png";
    private String imgHeaderUrl= "https://upload.wikimedia.org/wikipedia/commons/9/94/Abstract_blue_background7.jpg";
    private String acercaTexto="TEXTO ACERCA DEL USUARIO" ;
    private String textoUsuario="TEXTO MAS EXTENSO";
  
   
    
   
   @OneToMany(mappedBy="persona",orphanRemoval = true,cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Experiencia> experiencias=new ArrayList<>();
   
   
   @OneToMany(mappedBy="persona",orphanRemoval = true,cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Proyecto> proyectos=new ArrayList<>();
   
   @OneToMany(mappedBy="persona",orphanRemoval = true,cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Skill> skills=new ArrayList<>();
   
    @OneToMany(mappedBy="persona",orphanRemoval = true,cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<HardSkill> hardSkills=new ArrayList<>();
    

  
   
   @OneToMany(mappedBy="persona",orphanRemoval = true,cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Formacion> formaciones=new ArrayList<>();
   
 
    
    
    public Persona(){
    };
    
   
    
    public Persona(Long idPersona ,
                  String nombre, 
                  String apellido,
                  
                  
                  LocalDate nacimiento,
                  String acercaDe,
                String fotoUrl,
                String imgHeaderUrl,
                  String acercaTexto,
                  String textoUsuario,
                  
                String residencia,
                String urlResidencia,
                
                  
                  
                  List<Proyecto> proyectos,
                  List<Skill> skills,
                  List<HardSkill> hardSkills,
                  List<Experiencia> experiencias,
                  List<Formacion> formaciones
               
                   ){
        this.idPersona = idPersona;
        this.nombre= nombre;
        this.apellido=apellido;
       this.residencia=residencia;
       this.urlResidencia=urlResidencia;
        this.nacimiento=nacimiento;
        this.fotoUrl=fotoUrl;
        this.imgHeaderUrl=imgHeaderUrl;
        this.acercaTexto=acercaTexto;
        this.textoUsuario=textoUsuario;
        
      
        
        this.proyectos=proyectos;
        this.skills=skills;
        this.hardSkills=hardSkills;
       this.experiencias=experiencias;
        this.formaciones=formaciones;

        
     
    }

}

package com.backEndApp.PortfoliobackEnd.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
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
   
   
    
   
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date nacimiento;
    private String fotoUrl="https://i.postimg.cc/QCLS4sXd/585e4beacb11b227491c3399.png";
    private String imgHeaderUrl= "https://upload.wikimedia.org/wikipedia/commons/9/94/Abstract_blue_background7.jpg";
    private String acercaTexto="TEXTO ACERCA DEL USUARIO" ;
  
  
   @OneToOne(mappedBy="persona",cascade=CascadeType.ALL )
   @JoinColumn()
    
    private AcercaPersona acercaPersona;
    
   
   @OneToMany(mappedBy="persona",orphanRemoval = true,cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Experiencia> experiencias=new ArrayList<>();
   
   
   @OneToMany(mappedBy="persona",orphanRemoval = true,cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Proyecto> proyectos=new ArrayList<>();
   
   @OneToMany(mappedBy="persona",orphanRemoval = true,cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Skill> skills=new ArrayList<>();
    

  
   
   @OneToMany(mappedBy="persona",orphanRemoval = true,cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Formacion> formaciones=new ArrayList<>();
   
   @OneToMany(mappedBy="persona",orphanRemoval = true,cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<RedSocial> redesSociales=new ArrayList<>();
   
    
    
    public Persona(){
    };
    
   
    
    public Persona(Long idPersona ,
                  String nombre, 
                  String apellido,
                  
                  
                  Date nacimiento,
                  String acercaDe,
                String fotoUrl,
                String imgHeaderUrl,
                  String acercaTexto,
                
                
                
                  
                  
                  List<Proyecto> proyectos,
                  List<Skill> skills,
                  List<Experiencia> experiencias,
                  List<Formacion> formaciones,
                  List<RedSocial> redesSociales
                   ){
        this.idPersona = idPersona;
        this.nombre= nombre;
        this.apellido=apellido;
       
        this.nacimiento=nacimiento;
        this.fotoUrl=fotoUrl;
        this.imgHeaderUrl=imgHeaderUrl;
        this.acercaTexto=acercaTexto;
        
        this.acercaPersona=acercaPersona;
        
        this.proyectos=proyectos;
        this.skills=skills;
        this.experiencias=experiencias;
        this.formaciones=formaciones;
        this.redesSociales=redesSociales;
        
     
    }

}

package com.backEndApp.PortfoliobackEnd.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private String correo;
    private String password;
    
   
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date nacimiento;
    private String fotoUrl="https://i.postimg.cc/QCLS4sXd/585e4beacb11b227491c3399.png";
    private String imgHeaderUrl= "https://upload.wikimedia.org/wikipedia/commons/9/94/Abstract_blue_background7.jpg";
     
  
  
   @OneToOne(mappedBy="persona")
    private AcercaPersona acercaPersona;
   
   @OneToMany(mappedBy="persona",orphanRemoval = true)
    private List<Proyecto> proyectos=new LinkedList<Proyecto>();
   
   @OneToMany(mappedBy="persona",orphanRemoval = true)
    private List<Skill> skills=new LinkedList<Skill>();
    

   @OneToMany(mappedBy="persona",orphanRemoval = true)
    private List<Experiencia> experiencias=new LinkedList<Experiencia>();
   
   @OneToMany(mappedBy="persona",orphanRemoval = true)
    private List<Formacion> formaciones=new LinkedList<Formacion>();
   
   @OneToMany(mappedBy="persona",orphanRemoval = true)
    private List<RedSocial> redesSociales=new LinkedList<RedSocial>();
   
    
    
    public Persona(){
    };
    
   
    
    public Persona(Long idPersona ,
                  String nombre, 
                  String apellido,
                  String correo,
                  String password,
                  Date nacimiento,
                  String acercaDe,
                String fotoUrl,
                String imgHeaderUrl,
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
        this.fotoUrl=fotoUrl;
        this.imgHeaderUrl=imgHeaderUrl;
        this.acercaPersona=acercaPersona;
        this.proyectos=proyectos;
        this.skills=skills;
        this.experiencias=experiencias;
        this.formaciones=formaciones;
        this.redesSociales=redesSociales;
        
     
    }

}

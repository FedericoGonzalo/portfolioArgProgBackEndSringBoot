
package com.backEndApp.PortfoliobackEnd.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
   
    private String nombreSkill;
    @ManyToOne()
    @JoinColumn(name="persona_id_persona")
  @JsonIgnore
    private Persona persona;
   
   
    
    public Skill (){};
    public Skill (Long idSkill,Long porcentajeSkill,
            String nombreSkill,
            Persona persona){
    this.idSkill=idSkill;
    
    this.nombreSkill=nombreSkill;
 
    this.persona=persona;
    };

   
            
    
}

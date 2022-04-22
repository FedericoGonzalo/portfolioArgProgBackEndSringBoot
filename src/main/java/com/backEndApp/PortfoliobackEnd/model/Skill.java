
package com.backEndApp.PortfoliobackEnd.model;

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
    private Long porcentajeSkill;
    private String nombreSkill;
    @ManyToOne()
    @JoinColumn(name="persona_id_persona")
 
    private Persona persona;
    @ManyToOne()
    @JoinColumn(name="tipo_skill_id_tipo_skill")
    private TipoSkill tipoSkill;
    
   
    
    public Skill (){};
    public Skill (Long idSkill,Long porcentajeSkill,
            String nombreSkill,TipoSkill tipoSkill,
            Persona persona){
    this.idSkill=idSkill;
    this.porcentajeSkill=porcentajeSkill;
    this.nombreSkill=nombreSkill;
    this.tipoSkill=tipoSkill;
    this.persona=persona;
    };

   
            
    
}

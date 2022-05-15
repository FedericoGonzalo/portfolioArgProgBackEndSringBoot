
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

/**
 *
 * @author BASSTARD
 */

@Entity
@Getter
@Setter
@Table
public class HardSkill {
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idHardSkill;
    private Long porcentajeHardSkill;
    private String nombreHardSkill;
    @ManyToOne()
    @JoinColumn(name="persona_id_persona")
 @JsonIgnore
    private Persona persona;
   
   
    
    public HardSkill (){};
    public HardSkill (Long idHardSkill,Long porcentajeHardSkill,
            String nombreHardSkill,
            Persona persona){
    this.idHardSkill=idHardSkill;
    this.porcentajeHardSkill=porcentajeHardSkill;
    this.nombreHardSkill=nombreHardSkill;
 
    this.persona=persona;
}

  
}
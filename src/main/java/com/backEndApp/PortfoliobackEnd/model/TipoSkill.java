
package com.backEndApp.PortfoliobackEnd.model;

import java.util.LinkedList;
import java.util.List;
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

public class TipoSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long idTipoSkill;
    private String nombreTipoSkill;
    
    @OneToMany(mappedBy="tipoSkill")
    private List<Skill> skills=new LinkedList<Skill>();
    
    public TipoSkill(){};
    public TipoSkill(Long idTipoSkill,
                     String nombreTipoSkill,
                     List<Skill> skills){
      this.idTipoSkill= idTipoSkill;
      this.nombreTipoSkill=nombreTipoSkill;
      this.skills=skills;
    };
    
}

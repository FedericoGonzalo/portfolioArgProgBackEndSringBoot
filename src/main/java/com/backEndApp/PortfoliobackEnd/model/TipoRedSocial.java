
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

public class TipoRedSocial {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long idTipoRedSocial;
     private String nombreRedSocial;
     private String urlLogo;
     
     @OneToMany(mappedBy="tipoRedSocial")
     private List<RedSocial> redesSociales=new LinkedList<RedSocial>();
     
     public TipoRedSocial(){};
       public TipoRedSocial(Long idTipoRedSocial,
                             String nombreRedSocial,
                             String urlLogo,
                             List<RedSocial> redesSociales){
       
       this.idTipoRedSocial=idTipoRedSocial;
       this.nombreRedSocial=nombreRedSocial;
       this.urlLogo=urlLogo;
       this.redesSociales=redesSociales;
       };
     
     
    
}

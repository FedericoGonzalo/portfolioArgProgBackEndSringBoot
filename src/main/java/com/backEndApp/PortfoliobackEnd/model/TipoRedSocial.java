
package com.backEndApp.PortfoliobackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class TipoRedSocial {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long idTipoRedSocial;
     private String nombreRedSocial;
     private String urlLogo;
     
     public TipoRedSocial(){};
       public TipoRedSocial(Long idTipoRedSocial,
                             String nombreRedSocial,
                             String urlLogo){
       
       this.idTipoRedSocial=idTipoRedSocial;
       this.nombreRedSocial=nombreRedSocial;
       this.urlLogo=urlLogo;
       };
     
     
    
}

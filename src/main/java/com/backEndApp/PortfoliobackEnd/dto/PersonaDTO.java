
package com.backEndApp.PortfoliobackEnd.dto;

import java.io.Serializable;
import java.util.Date;


public class PersonaDTO implements Serializable {
    private Long idPersona;
    private String nombre;
    private String apellido;
    private String residencia;
    private String urlResidencia;
    private Date naciemiento;
    
    private String fotoUrl;
    private String imgHeaderUrl;
    private String acercaTexto;
    private String textoUsuario;
    
    
}

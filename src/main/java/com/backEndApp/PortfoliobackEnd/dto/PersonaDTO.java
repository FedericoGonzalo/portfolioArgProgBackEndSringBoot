
package com.backEndApp.PortfoliobackEnd.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class PersonaDTO implements Serializable {
    private Long idPersona;
    private String nombre;
    private String apellido;
    private String residencia;
    private String urlResidencia;
   
   
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
   
    private LocalDate nacimiento;
    
    private String fotoUrl;
    private String imgHeaderUrl;
    private String acercaTexto;
    private String textoUsuario;
    
    
}

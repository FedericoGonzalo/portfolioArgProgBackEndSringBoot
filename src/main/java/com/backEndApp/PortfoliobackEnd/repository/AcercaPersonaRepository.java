
package com.backEndApp.PortfoliobackEnd.repository;

import com.backEndApp.PortfoliobackEnd.model.AcercaPersona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaPersonaRepository extends JpaRepository<AcercaPersona, Long > {
    
}

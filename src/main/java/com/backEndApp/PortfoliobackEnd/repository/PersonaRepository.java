package com.backEndApp.PortfoliobackEnd.repository;

import com.backEndApp.PortfoliobackEnd.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PersonaRepository extends JpaRepository <Persona, Long>{
    
}

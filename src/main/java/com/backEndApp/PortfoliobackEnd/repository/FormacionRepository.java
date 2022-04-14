package com.backEndApp.PortfoliobackEnd.repository;

import com.backEndApp.PortfoliobackEnd.model.Formacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormacionRepository extends JpaRepository <Formacion, Long>{
    
}

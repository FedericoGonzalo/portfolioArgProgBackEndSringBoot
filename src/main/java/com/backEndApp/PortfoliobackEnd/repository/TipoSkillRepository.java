
package com.backEndApp.PortfoliobackEnd.repository;

import com.backEndApp.PortfoliobackEnd.model.TipoSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoSkillRepository extends JpaRepository<TipoSkill, Long> {
    
}

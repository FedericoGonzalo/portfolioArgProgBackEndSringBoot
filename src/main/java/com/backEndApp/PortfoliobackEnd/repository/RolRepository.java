
package com.backEndApp.PortfoliobackEnd.repository;

import com.backEndApp.PortfoliobackEnd.model.Rol;
import com.backEndApp.PortfoliobackEnd.model.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.HardSkill;
import com.backEndApp.PortfoliobackEnd.repository.HardSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BASSTARD
 */


@Service
public class HardSkillService implements IHardSkillService{
@Autowired
public HardSkillRepository hardSkillRepo; 
    @Override 
    public List<HardSkill> verHardSkills() {
      
    return hardSkillRepo.findAll();
    }

    @Override
    public void agregarHardSkill(HardSkill hardSkill) {
     hardSkillRepo.save(hardSkill);
    }

    @Override
    public void borrarHardSkill(Long idHardSkill) {
     hardSkillRepo.deleteById(idHardSkill);
    }

    @Override
    public HardSkill buscarHardSkill(Long idHardSkill) {
     return hardSkillRepo.findById(idHardSkill).orElse(null);
    }

    @Override
    public void editarHardSkill(HardSkill hardSkill) {
     hardSkillRepo.save(hardSkill);
    }

 
    
    
}

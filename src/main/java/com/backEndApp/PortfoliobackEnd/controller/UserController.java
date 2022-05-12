/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backEndApp.PortfoliobackEnd.controller;

import com.backEndApp.PortfoliobackEnd.model.Usuario;
import com.backEndApp.PortfoliobackEnd.service.UsuarioService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BASSTARD
 */

@RestController

@RequestMapping("/api/users")
//@CrossOrigin(origins = "http://localhost:4200&quot;)
public class UserController {
     @Autowired
        UsuarioService usuarioService;
    
     
     @DeleteMapping("/delUser{id}")
     public void borrarUser(@RequestParam("id") Long id){
    
        usuarioService.borrar(id);
    
}};

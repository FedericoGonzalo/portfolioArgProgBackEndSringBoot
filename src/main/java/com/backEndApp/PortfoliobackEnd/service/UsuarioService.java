/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backEndApp.PortfoliobackEnd.service;

import com.backEndApp.PortfoliobackEnd.model.Usuario;
import com.backEndApp.PortfoliobackEnd.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;
    
    //
    
   public Optional<Usuario> getById(Long id){
   return usuarioRepository.findById(id);} ;
   
    public void borrar(Long id){
        usuarioRepository.deleteById(id);
    }
    public void cambiarNombre(Long id,String nuevoNombre){
      Usuario user=  usuarioRepository.getById(id);
      user.setNombre(nuevoNombre);
      usuarioRepository.save(user);
    }
    public void cambiarMail(Long id,String nuevoMail){
    Usuario user=    usuarioRepository.getById(id);
    user.setEmail(nuevoMail);
      usuarioRepository.save(user);
    }
    public void cambiarPassword(Long id,String nuevoPassword){
     Usuario user=   usuarioRepository.getById(id);
    user.setPassword(nuevoPassword);
      usuarioRepository.save(user);
    }
    public void cambiarApellido(Long id,String nuevoApellido){
     Usuario user=   usuarioRepository.getById(id);
    user.setNombre(nuevoApellido);
      usuarioRepository.save(user);
    }
    
    
    





//
    
    
    

    public Optional<Usuario> getByNombreUsuario(String nu){
        return usuarioRepository.findByNombreUsuario(nu);
    }

    public boolean existePorNombre(String nu){
        return usuarioRepository.existsByNombreUsuario(nu);
    }

    public  boolean existePorEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }

    public void guardar(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backEndApp.PortfoliobackEnd.security.JWT;

import com.backEndApp.PortfoliobackEnd.security.UsuarioPrincipal;

import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class JwtProvider {

    private static  final Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private int expiration;

    public String generateToken(Authentication authentication) {
        UsuarioPrincipal usuarioPrincipal = (UsuarioPrincipal) authentication.getPrincipal();
        return Jwts.builder().setSubject(usuarioPrincipal.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + expiration * 1000))
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    public String getNombreUsuarioFromToken(String token){
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            return true;
        } catch (MalformedJwtException e) {
            logger.error("token mal formado " +e.getMessage());
        } catch (UnsupportedJwtException e) {
            logger.error("token no soportado " +e.getMessage());
        } catch (ExpiredJwtException e) {
            logger.error("token expirado " +e.getMessage());
        } catch (IllegalArgumentException e) {
            logger.error("token vacío " +e.getMessage());
        } catch (SignatureException e) {
            logger.error("error en la firma " +e.getMessage());
        }
        return false;
    }

  
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.akira.repository;


import net.akira.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ice Cold
 */
public interface PerfilesRepository extends JpaRepository <Perfil , Integer>{
    
}

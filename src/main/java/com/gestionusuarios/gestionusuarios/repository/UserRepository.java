/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionusuarios.gestionusuarios.repository;

import com.gestionusuarios.gestionusuarios.models.UserEntity;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author angel
 */
public interface UserRepository extends CrudRepository<UserEntity, Long> {
     Optional<UserEntity> findByUsername(String username);

     @Query("SELECT u FROM User u WHERE u.username = ?1")
     UserEntity findByUsername2(String username);
}

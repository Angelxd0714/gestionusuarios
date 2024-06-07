/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gestionusuarios.gestionusuarios.services;

import com.gestionusuarios.gestionusuarios.models.UserEntity;

/**
 *
 * @author angel
 */
public interface UserService {
    UserEntity saveUser(UserEntity user);
    UserEntity findUser(String name);
}

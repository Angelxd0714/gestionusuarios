/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gestionusuarios.gestionusuarios.services;

import com.gestionusuarios.gestionusuarios.models.User;

/**
 *
 * @author angel
 */
public interface UserService {
    User saveUser(User user);
    User findUser(String name);
}

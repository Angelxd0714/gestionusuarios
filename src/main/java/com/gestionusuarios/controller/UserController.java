/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionusuarios.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author angel
 */
@RestController
@RequestMapping("/auth")
public class UserController {

    @GetMapping("/inicio")
    /* @PreAuthorize("hasAuthority('read')") */
    public String inicio() {
        return "hola";
    }

    @GetMapping("/index")

    public String index() {
        return "index";
    }

    @GetMapping("/security")

    public String security() {
        return "lugar seguro";
    }
}

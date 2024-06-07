package com.gestionusuarios.gestionusuarios.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.gestionusuarios.gestionusuarios.models.User;
import com.gestionusuarios.gestionusuarios.repository.UserRepository;

import org.springframework.security.core.userdetails.UserDetailsService;
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository  userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException("NOT FOUND USER"));
        
        return null;
    }
    
}

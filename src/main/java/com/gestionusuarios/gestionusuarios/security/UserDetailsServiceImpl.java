package com.gestionusuarios.gestionusuarios.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gestionusuarios.gestionusuarios.models.UserEntity;
import com.gestionusuarios.gestionusuarios.repository.UserRepository;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("NOT FOUND USER"));
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        user.getRoles()
                .forEach(role -> authorities.add(new SimpleGrantedAuthority("ROLE_".concat(role.getName().name()))));
        user.getRoles().stream().flatMap(role -> role.getPermissions().stream())
                .forEach(permission -> authorities.add(new SimpleGrantedAuthority(permission.getName())));
        return new User(user.getUsername(), user.getPassword(), user.isEnabled(), user.isAccountNoLocked(),
                user.isCredentialsNonExpired(), user.isAccountNoLocked(), authorities);
    }
    /*
     * el rol se vuelve la llave de un objeto por ejemplo {
     * "rol":["created","update"]
     * 
     * }
     * ese decir cada rol tiene su collection de permisos
     * 
     */

}

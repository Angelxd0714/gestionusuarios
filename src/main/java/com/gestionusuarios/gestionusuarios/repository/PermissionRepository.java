package com.gestionusuarios.gestionusuarios.repository;

import org.springframework.data.repository.CrudRepository;

import com.gestionusuarios.gestionusuarios.models.Permission;

public  interface PermissionRepository extends CrudRepository<Permission,Long> {


    
}

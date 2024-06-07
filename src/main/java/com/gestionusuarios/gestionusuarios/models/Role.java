package com.gestionusuarios.gestionusuarios.models;

import com.gestionusuarios.gestionusuarios.models.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="roles")
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(name = "roles_name")
  @Enumerated(EnumType.STRING)
  private Roles name;
  @ManyToMany(mappedBy = "roles")
  private Set<User> users;
  @ManyToMany(mappedBy = "roles")
  private Set<Permission> permissions = new HashSet<>();
}

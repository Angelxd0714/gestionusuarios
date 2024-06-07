package com.gestionusuarios.gestionusuarios;

import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gestionusuarios.gestionusuarios.models.Permission;
import com.gestionusuarios.gestionusuarios.models.Role;
import com.gestionusuarios.gestionusuarios.models.Roles;
import com.gestionusuarios.gestionusuarios.models.UserEntity;
import com.gestionusuarios.gestionusuarios.repository.PermissionRepository;
import com.gestionusuarios.gestionusuarios.repository.RoleRepository;
import com.gestionusuarios.gestionusuarios.repository.UserRepository;

@SpringBootApplication
public class GestionusuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionusuariosApplication.class, args);
	}
/* 
	@Bean
	CommandLineRunner init(UserRepository userRepository, RoleRepository roleRepository,
			PermissionRepository permissionRepository) {
		return args -> {
			Permission createPermission = Permission.builder().name("create").build();
			Permission readPermission = Permission.builder().name("read").build();
			Permission updatePermission = Permission.builder().name("update").build();
			Permission deletePermission = Permission.builder().name("delete").build();

			Role adminRole = Role.builder()
					.name(Roles.ADMIN)
					.permissions(Set.of(createPermission, readPermission, updatePermission, deletePermission))
					.build();

			Role userRole = Role.builder()
					.name(Roles.USER)
					.permissions(Set.of(readPermission, createPermission))
					.build();

			Role guestRole = Role.builder()
					.name(Roles.GUEST)
					.permissions(Set.of(readPermission))
					.build();

			User admin = User.builder().username("admin").password("admin").enabled(true).accountNoLocked(false)
					.accountNonExpired(false).roles(Set.of(adminRole)).build();
			User user = User.builder().username("user").password("user").enabled(true).accountNoLocked(false)
					.accountNonExpired(false).roles(Set.of(userRole)).build();
			User guest = User.builder().username("guest").password("guest").enabled(true).accountNoLocked(false)
					.accountNonExpired(false).roles(Set.of(guestRole)).build();

			permissionRepository.save(createPermission);
			permissionRepository.save(readPermission);
			permissionRepository.save(updatePermission);
			permissionRepository.save(deletePermission);
			roleRepository.save(adminRole);
			roleRepository.save(userRole);
			roleRepository.save(guestRole);
			userRepository.save(admin);
			userRepository.save(user);
			userRepository.save(guest);

		};
	}
*/
}

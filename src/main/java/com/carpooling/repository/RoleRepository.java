package com.carpooling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carpooling.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}

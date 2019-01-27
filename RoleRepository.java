package com.rafbur.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafbur.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}

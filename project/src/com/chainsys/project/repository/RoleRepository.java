package com.chainsys.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.project.model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role>findById(int id);
}
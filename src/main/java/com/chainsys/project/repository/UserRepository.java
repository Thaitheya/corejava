package main.java.com.chainsys.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.java.com.chainsys.project.model.User_d;


@Repository
public interface UserRepository  extends JpaRepository<User_d, Integer>{
     Optional<User_d> findUserByEmail(String email);
}
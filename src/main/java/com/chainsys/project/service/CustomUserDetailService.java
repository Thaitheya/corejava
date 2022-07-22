package main.java.com.chainsys.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.Data;
import main.java.com.chainsys.project.model.CustomUserDetails;
import main.java.com.chainsys.project.model.User_d;
import main.java.com.chainsys.project.repository.UserRepository;
/**
 
 */
@Data
@Service
public class CustomUserDetailService implements UserDetailsService{
     @Autowired
     UserRepository userRepository;
     @Override
     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         Optional <User_d> user = userRepository.findUserByEmail(username);
         user.orElseThrow(() -> new UsernameNotFoundException("Sorry!! UserName not found"));
         return user.map(CustomUserDetails::new).get();
            //  Lambda expression

         
     }
    
}
package com.chainsys.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.chainsys.project.model.CustomUserDetails;
import com.chainsys.project.model.User;
import com.chainsys.project.repository.UserRepository;
@Service
public class CustomUserDetailService implements UserDetailsService{
     @Autowired
     UserRepository userRepository;
     @Override
     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         Optional <User> user = userRepository.findUserByEmail(username);
         user.orElseThrow(() -> new UsernameNotFoundException("Sorry!! UserName not found"));
         return user.map(CustomUserDetails::new).get();


         
     }
    
}
package main.java.com.chainsys.project.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import main.java.com.chainsys.project.global.GlobalData;
import main.java.com.chainsys.project.model.Role;
import main.java.com.chainsys.project.model.User_d;
import main.java.com.chainsys.project.repository.RoleRepository;
import main.java.com.chainsys.project.repository.UserRepository;


@Controller
public class LoginController {
 
   private BCryptPasswordEncoder bCryptPasswordEncoder;
   @Autowired
   UserRepository userRepository;
   @Autowired
   RoleRepository roleRepository;
   
   @GetMapping("/login")
   public String login() {
     GlobalData.cart.clear();
       return "login";
   }
   @GetMapping("/register")
   public String register() {
     return "register";
   }

   @PostMapping("/register")
   public String registerPost(@PathVariable("user") User_d user, HttpServletRequest request) throws ServletException {
     
      String password = user.getPassword();
      user.setPassword(bCryptPasswordEncoder.encode(password));
      List<Role> roles = new ArrayList<>();
      roles.add(roleRepository.getById(1).get());
      ((User_d) roles).setRoles(roles);
      userRepository.save(user);
      request.login(user.getEmail(),password);
       return "redirect:/";
   }
}
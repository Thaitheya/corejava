package main.java.com.chainsys.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import main.java.com.chainsys.project.model.Product;



public interface ProductRepository extends JpaRepository<Product,Long> 

{
    List<Product> findAllByCategory_Id(int id);
     
    
}
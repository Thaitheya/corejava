package main.java.com.chainsys.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.java.com.chainsys.project.model.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}
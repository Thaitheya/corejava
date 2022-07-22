package main.java.com.chainsys.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.chainsys.project.model.Product;
import main.java.com.chainsys.project.repository.ProductRepository;

@Service
public class ProductService {
     @Autowired
     ProductRepository productRepository;
     public List<Product> getAllProducts() {return productRepository.findAll();}
     public void addproduct(Product product) {
        productRepository.save(product);
     }

     public void removeProductById(long id) {
        productRepository.deleteById(id);
     }
     public Product getProductsById(long id) {
        return productRepository.getById(id);
     }
     public List<Product>getAllProductByCategoryId(int id) {
        return productRepository.findAllByCategory_Id(id);
     }
}
package main.java.com.chainsys.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import main.java.com.chainsys.project.global.GlobalData;
import main.java.com.chainsys.project.service.CategoryService;
import main.java.com.chainsys.project.service.ProductService;



@Controller
public class HomeController {
     @Autowired
     CategoryService categoryService;
     @Autowired
     ProductService productService;

     @GetMapping({"/","/home"})
     public String home(Model model) {
          return "index";
     }
     @GetMapping({"/shop"})
     public String shop(Model model) {
          model.addAttribute("categories", categoryService.getAllCategory());
          model.addAttribute("products", productService.getAllProducts());
          return "shop";
     }
     @GetMapping("/shop/category/{id}")
     public String shopByCategory(Model model, @PathVariable int id) {
          model.addAttribute("categories", categoryService.getAllCategory());
          model.addAttribute("products", productService.getAllProductByCategoryId(id));
          return "shop";
     }
     @GetMapping("/shop/viewproduct/{id}")
     public String viewProduct( Model model, @PathVariable int id) {
          model.addAttribute("product", productService.getProductsById(id));
          return "viewproduct";
     }

     @GetMapping("/cart/removeItem/{index}")
     public String cartItemRemove(@PathVariable int index) {

          GlobalData.cart.remove(index);
          return "redirect/cart";
     }
   
}

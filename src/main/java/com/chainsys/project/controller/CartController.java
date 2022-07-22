package main.java.com.chainsys.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import main.java.com.chainsys.project.global.GlobalData;
import main.java.com.chainsys.project.model.Product;
import main.java.com.chainsys.project.service.ProductService;



@Controller
public class CartController {
    @Autowired
    ProductService productService;
    @GetMapping("/addToCart/{id}")
    public String addToCart(@PathVariable int id) {
         GlobalData.cart.add(productService.getProductsById(id).get());
         return "redirect:/shop";
    }
    @GetMapping("/cart") 
    public String cartGet(Model model ) {
         model.addAttribute("cartCount", GlobalData.cart.size());
         model.addAttribute("total", GlobalData.cart.stream().mapToDouble(Product::getPrice).sum());
         model.addAttribute("cart", GlobalData.cart);
         return "cart";
    }

    @GetMapping("/checkout")
    public String checkOut(Model model) {

         model.addAttribute("total", GlobalData.cart.stream().mapToDouble(Product:: getPrice).sum());
         return "checkout";

    }
}
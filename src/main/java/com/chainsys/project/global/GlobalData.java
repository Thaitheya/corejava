package main.java.com.chainsys.project.global;

import java.util.ArrayList;
import java.util.List;

import main.java.com.chainsys.project.model.Product;


public class GlobalData {
     public static List <Product> cart;

     static {
          cart = new ArrayList<Product>();
     }
}

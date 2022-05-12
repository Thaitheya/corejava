package com.chainsys.tomtest;
import java.util.*;
public class FizzBuzz {
	public static void fizz(){
       for(int i = 0; i < 100; i++){
           if(i % 3 == 0) {
        	   System.out.println("Fizz");
           }
           else if(i % 5 == 0){
        	   System.out.println("Buzz");
           }
           else {
        	   System.out.println(i);
           }
        }
	}
}

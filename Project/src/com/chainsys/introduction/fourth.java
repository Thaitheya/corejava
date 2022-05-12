package com.chainsys.introduction;
import java.util.*;
public class fourth {
       public static void main(String[] args) {
    	   taskA();
    	   taskB();
    	   taskD();
    	   taskE();
    	   
    	   
       }
    	   public static void taskA() {
    	   Scanner se = new Scanner(System.in);
    	   System.out.println("What is your name ?");
    	   String name = se.next();
//    	   se.close();
    	   System.out.println(name);
    	   }
    	   public static void taskB() {
    		   Scanner se1 = new Scanner(System.in);
    		   System.out.println("Enter the number");
    		   int firstNum = se1.nextInt();
    		   int result = firstNum * 100;
//    		   se1.close();
               System.out.println("Result: " + result);    		   
    		   
    	   }
    	   public static void taskC() {
    		   String s1 = "100";
    		   String s2 = "50";
    		   System.out.println(s1+s2);
    		   int n1 =Integer.parseInt(s1);
    		   int n2 = Integer.parseInt(s2);
    		   int n3 = n1 + n2;
    		   System.out.println("Result: " + n3);
    		   
           }
    	   
    	   public static void taskD() {
    		   Scanner scd = new Scanner(System.in);
    		   int age = scd.nextInt();
    		
    		   if(age < 18) {
    			   System.out.println("You are not eligible for");
    			   }
    		   
    			   else {
    				   System.out.println("You  are eligible for vote");
    			   }
//    		   scd.close();
    	   }
    	    public static void taskE() {
    	    	Scanner seed = new Scanner(System.in);
    	    	int num1 = seed.nextInt();
    	    	int num2 = seed.nextInt();
    	    	int num3 = num1 + num2;
    	    	System.out.println("Num3:" + num3);
    	    	seed.close();
    	    	
    	    }
    	   
    	        
    	  
    	   
}

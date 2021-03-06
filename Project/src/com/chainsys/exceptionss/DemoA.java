package com.chainsys.exceptionss;

import java.util.Scanner;
public class DemoA {
	public static void main(String[] args) {
		tryWithMultipleCatch();
	}
	public static void taskA() {
    	  System.out.println("Before Try");
    	  try {
    		  System.out.println("Inside Try");
    	  }catch(Exception err){
    		  System.out.println("Error");
    	  }finally {
    		  System.out.println("Inside finally");
    	  }
    	  System.out.println("After Try");
      }
      
      public static void testDivideWithTry() {
    	  Calculator calculator = null;
		  int arg1 = 100, arg2 = 0, result = 0;
		  Scanner sc = null;
		  System.out.println("Before Try- Catch-finally");
      try {
    	  int localWithinTry = 123;
    	  System.out.println("Inside Try");
    	  sc = new Scanner(System.in);
    	  System.out.println("Enter a number lessthan 100");
    	  arg2 = sc.nextInt();
    	  calculator = new Calculator();
    	  result = calculator.divide(arg1, arg2);
    	  System.out.println(result);
    	  System.out.println(localWithinTry);
      }catch(Exception e){
    	System.out.println(e.getMessage());
    	  System.out.println();
      }
      
      finally {
    	  System.out.println("Inside Finally");
    	  sc.close();
      }
      System.out.println("After Try- catch-finally");
      }
      
      public static void  tryCatch() {
    	 System.out.println("Before Try");
    	 try {
    		 System.out.println("Inside Try");
    	 }catch(Exception err){
    		 System.out.println("Inside Catch" + err.getMessage());
    		 
    	 }
    	 System.out.println("After Try Catch"); 
      }
      public static void tryFinally() {

    	  System.out.println("Before Try");
    	  try {
    		  System.out.println("Inside Try");
    	  }finally {
    		  
    		  System.out.println("Inside Finally");
    		  }
    	  System.out.println("After Try Finally");
    	  }

	  public static void multipleTry() {
    	  int x = 0;
    	  int y = 0;
    	  int z = 0;
    	  System.out.println("Before Try");
    	  Scanner sc  = null;
    	  try {
    		  sc = new Scanner(System.in);
    	  }catch(Exception err) {
    		  System.out.println("Error while creating Scanner " + err.getMessage());
    		  return;
    	  }
    	  
    	  try {
    		  System.out.println("Inside Try2");
    		  System.out.println("Enter value for x");
    		  x = sc.nextInt();
    		  
    	  }catch(Exception err){
    		  System.out.println("Inside Catch - Invalid value for X " + err.getMessage());
    		  return;
    	  }finally {
    		  System.out.println("Inside Finally");
    	  }
    	  System.out.println("After Finally");
    	  
    	  try {
    		  System.out.println("Inside Try3");
    		  System.out.println("Enter value for Y");
    		  y= sc.nextInt();
    		  
    	  }catch(Exception err){
    		  System.out.println("Inside Catch - Invalid value for Y " + err.getMessage());
    		  return;
    	  }finally {
    		  System.out.println("Inside Finally3");
    		  sc.close();
    	  }
    	  System.out.println("After Finally3");
    	  try {
    		  
    		  z = x/y;
    		  System.out.println("Z" + z);
    		 
    	  }catch(Exception e){
    		  System.out.println("Error in Block4" + e.getMessage());
    	  }
    	  System.out.println("After Finally 4");
      }
      public static void tryWithMultipleCatch() {
    	  System.out.println("Before Try");
    	  int x =0 , y = 0,z =0;
    	  String s1=null, s2 = null;
    	  java.util.Scanner sc = null;
    	  try {
    		  sc = new Scanner(System.in);
    		  System.out.println("Inside Try");
    		  System.out.println("Enter the value for X");
    	      s1 = sc.nextLine();
    	      System.out.println("Enter the value for y");
    	      s2 = sc.nextLine();
    	      x = Integer.parseInt(s1);
    	      y = Integer.parseInt(s2);
    	      z = x/ y;
    	      System.out.println("Result" + z);
    	      
//    	  }catch(Exception err) {
//    		  System.out.println("Inside catch3 " + err.getMessage());
//    		  System.out.println("ErrorType  " + err.getClass().getName());
    	  }catch(ArithematicException err) {
    		  System.out.println("Inside Catch1 " + err.getMessage());
    		  System.out.println("ErrorType " + err.getClass().getName());
    	  }catch(NumberFormatException err){
    		    System.out.println("Inside Catch2 " + err.getMessage());
    		    System.out.println("ErrorType " + err.getClass().getName());
    	  }catch(Exception err) {
    		  System.out.println("Inside Catch3" + err.getMessage());
    		  System.out.println("ErrorType " + err.getClass().getName());
    	  }finally {
    		  System.out.println("Inside Finally");
    	  }
      }
}

package com.chainsys.entrypoint;
import java.util.Scanner;

import com.chainsys.exceptionss.DemoA;
import com.chainsys.variables.Calculator;
/***
 * @author thai3141
 * @version 1.0
 * date: Mar 3 2022
 * @category Classroom lessons
 * purpose: entry point class for the entire project
 */
public class startup {
	/*** 
	 * @author thai3141
	 * @version 1.0
	 * purpose portable executable entry point for the lessons
	 */
	  public static void main(String[] args) {
//		  Calculator calculator = null;
//		  int result = 0;
//		  System.out.println("Before Try- Catch-finally");
//      try {
//    	  calculator = new Calculator();
//          result = calculator.divide(100, 20);
//          System.out.println(result);
//      }catch(Exception err){
//    	  String msg = err.getMessage();
//    	  System.out.println(msg);
//      }
//      
//      finally {
//    	  System.out.println("Inside Finally");
//      }
//      System.out.println("After Try- catch-finally");
		  DemoA.multipleTry();
//		  Calculator calculator = null;
//		  int arg1 = 100;
//		  Scanner sc = new Scanner(System.in);
//		  int arg2 = sc.nextInt();
//		  int result = 0;
//		  System.out.println("Before");
//		  calculator = new Calculator();
//		  result = Calculator.divide(arg1,arg2);
//		  System.out.println(result);
//		  sc.close();
 }
//    	   

	
       
}


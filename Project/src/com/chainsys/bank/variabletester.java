package com.chainsys.bank;

import com.chainsys.variables.demo;

/**
 * @author thai3141
 * @category To tests demo class,its fields and method
 * date: Mar 24 2022
 */
public class variabletester {
     /**
       * Test static variable
       */
	
	
	public static void testGlobalVariables() {
//    	 System.out.println("DataA : " + demo.DataA);
//    	 
//    	 System.out.println("DataC : " + demo.DataC);
//    	 
//    	 demo.DataA = 2345;
//    	 
//    	 System.out.println("DataA : " + demo.DataA);
//    	 
//    	 
//    	 demo.DataC = 2345;
//    	 
//    	 System.out.println("DataC : " + demo.DataC);
         /***
          * To test how to use Immutable variables of a class
          * Demo.DataB    
          */
     }
	   public static void testImmutableVariable() {
		   /* Cannot make a static reference to the non-static field Demo. DataB */
//		   Demo.DataB = 123;
        /**
         * First create an object or the  class
         * pass an int value as an argument to the constructor 
         * access the immutable instance field using the object reference
         */
		 demo firstObject = new demo(123);
		 System.out.println(firstObject.DataB);
		 /**
		  * Value assigned to an immutable field can be assigned only through the constructor 
		  */
//		 firstObject.DataB = 567;
		 
	   }
	   /**
	    * Calling static method using class name
	    * Without creating an object
	    * created on :25 March 2022
	    */
	   
	   public static void  testStaticMethod() {
		   demo.sayHello();
	   }
	   
	   public static void nonStaticMethod() {
//		   ERROR
//		   demo greetuser();
		  
		   demo firstObject = new demo(111);
		   firstObject.greetUser();
	   }
}

package com.chainsys.variables;
public class demo {
    public static int DataA;//Static global variable
    public final int DataB;//immutable global variable (not static)
    public static int DataC = 300;
    private int dataD = 30;
//    Constructor 
    /*
     * constructor is a special method
     * The name of the constructor and the name of the class will be same
     * constructor don't have return type
     * constructors can take parameters
     */
    public  demo(int dataB) {
    	/* Assigning value to the global read-only field (this.Data)*/
    	this.DataB = dataB;
    	
    }
    /**
     * static method can be called without an object
     */
    public static void sayHello() {
    	System.out.println("Hello Developer");
    }
    public void greetUser() {
    	System.out.println("Greeting User!!");
    }
    
    }

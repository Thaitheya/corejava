package com.chainsys.exceptionss;

public class ThrowsException {
	public static void m3() {
    	try {
    		m4();
    	}catch(Exception err) {
    		System.out.println("getMessage " + err.getMessage());
    	    Throwable t1 = err.getCause();
    	    System.out.println("Cause " + t1.getMessage());
    	}
    }
	public static void m4() throws Exception
    {
    	
//            
    	Exception e1 = new Exception("Error1");
    	Exception e2 = new Exception("Error2",e1);
        throw e2;
    }
}

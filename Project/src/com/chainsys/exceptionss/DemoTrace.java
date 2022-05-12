package com.chainsys.exceptionss;

public class DemoTrace {
	public static void main(String[] args) throws Exception {
		m4();
		
	}
    public static void m1() {
    	try {
    		m2();
    	}catch(Exception err) {
    		System.out.println("getMessage " + err.getMessage());
    		err.printStackTrace();
    	}finally {
    		System.out.println("Inside m1 Finally");
    	}
    }
    public static void m2() {
    	try {
    		m3();
    	}catch(Exception err) {
    		System.out.println("getMessage " + err.getMessage());
    		err.printStackTrace();
    	}finally {
    		System.out.println("Inside m2 Finally");
    	}
    }
    public static void m3() {
    	try {
    		m4();
    	}catch(Exception err) {
    		System.out.println("getMessage " + err.getMessage());
    		err.printStackTrace();
    	}finally {
    		System.out.println("Inside m3 Finally");
    	}
    }
    public static void m4() throws Exception
    {
//             int x = 0;
//             int y = 0;
//             int z = 0;
//             x = 100;
//             z = x/y;
//             System.out.println("Result " + z);
    	Exception e1 = new Exception("Error1");
    	Exception e2 = new Exception("Error2",e1);
    	throw e2;
    }
}

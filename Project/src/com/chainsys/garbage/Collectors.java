package com.chainsys.garbage;

public class Collectors {
        public static void main(String[] args) {
			Collectors collector = new Collectors();
			
			collector = null;
			Runtime.getRuntime().gc();
			System.gc();
			System.out.println("Main method is Done");
		}
        
		@Override
        protected void finalize() throws Throwable {
             System.out.println("Finalize is called");
        }
        	
        
}

package com.mycompany.intermediate;

public class runnable implements Runnable{

    @Override 
    public void run() {
       System.out.println("Thaitheyasudan");
        
    }

    public static void main(String[] args) {
        Thread t = new Thread(new runnable());
        t.start();
    }
    
}

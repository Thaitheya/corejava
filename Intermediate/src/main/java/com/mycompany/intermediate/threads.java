package com.mycompany.intermediate;

public class threads extends  Thread{
    public void run(){
        System.out.println("Thaitheyasudan Threads");
    }

    public static void main(String[] args) {
        threads obj  = new threads();
        obj.start();

    }
}
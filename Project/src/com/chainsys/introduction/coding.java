package com.chainsys.introduction;
import java.util.*;
public class coding {

	public static void main(String[] args) {
		
	swap();
	}
   
    public static void findEvenNumber() {
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter any 10 digits number");
    		long value = sc.nextLong();
    		sc.close();
    		long num = value;
    		long remainder = 0;
    		while(num > 0) {
    			remainder = num%10;
    			if(remainder%2 == 0) {
    				System.out.println(remainder);
    			}
    			num = num/10;
    	}
    }
    
    public static void swap() {
    	Scanner sc = new Scanner(System.in);
    	int num1 = sc.nextInt();
    	int num2 = sc.nextInt();
    	
    	num1 = num1 + num2;
    	num2 = num1 - num2;
    	num1 = num1 - num2;
    	
    	System.out.println(num1 + " " + num2 );
    }
}

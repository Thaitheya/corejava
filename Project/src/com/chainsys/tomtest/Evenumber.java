package com.chainsys.tomtest;
import java.util.*;
public class Evenumber {
   public static void Even() {
	   System.out.println("Enter the Number: ");
	  Scanner sc = new Scanner(System.in);
	  int even = sc.nextInt();
	  sc.close();
	  
	    long num = even;
		long remainder = 0;
		while(num > 0) {
			remainder = num%10;
			if(remainder%2 == 0) {
				System.out.print(remainder + " ");
			}
			num = num/10;
	    }
	
				  
    }
}


package com.chainsys.tomtest;
import java.util.*;
public class CubeTheNumber {
	public static void Cube() {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int temp = num;
		int arm = 0;
		while(num > 0) {
			int n = num % 10;
			arm += (n*n*n);
			num  /= 10;
		}
		System.out.println(arm);
		
			if(arm == temp) {
				System.out.println("Same as input");
			}
			else {
				System.out.println("Different Number");
			}
		}
		
}
   


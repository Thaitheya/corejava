package com.chainsys.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AarrysLessonOne {
       
	public static void WorkingWithArrayClass() {
		
		int numberArray[] = new int[10];
		for(int i = 0; i<10;i++) {
			numberArray[i] = -3 * i;
		System.out.println("Original Contents: ");
		 int lengthOfTheArray = numberArray.length;
		 System.out.println("ArrayLength:" + lengthOfTheArray);
		 for(int i1 = 0; i1< lengthOfTheArray; i1++) {
			 System.out.println(numberArray[i1] + " ");
		 }
		 System.out.println();
		 Arrays.sort(numberArray);
		 System.out.println("Sorted: ");
		 for(int i2 = 0; i2 < lengthOfTheArray; i++) {
			 System.out.println(numberArray[i] + " ");
			 
		 }
		 System.out.println();
		 Arrays.fill(numberArray,2, 6, -1);
		 System.out.println("After fill: ");
		 for(int i4 = 0 ; i4 < lengthOfTheArray; i4++) {
			 System.out.println(numberArray[i]);
		 }
		 System.out.println();
		 int index = Arrays.binarySearch(numberArray, -9);
		 System.out.println(index);
		 Arrays.sort(numberArray);
		 for(int i5 = 0 ;i5 < lengthOfTheArray; i5++) {
			 System.out.println(numberArray[i] + " ");
			 }
		 System.out.println();
		 index = Arrays.binarySearch(numberArray, -9);
		 System.out.println(index);
		 }
        
        }
	    public static void Arrayschars() {
	    	String s1 = "I am Thaitheyasudan";
	        char[] data = s1.toCharArray();
	        int count = data.length;
	        System.out.println(count);
	        for(int i6 = 0; i6 < count; i6++) {
	        	System.out.println(data[i6] + " " + (int) data[i6]);
	    }
	}
}

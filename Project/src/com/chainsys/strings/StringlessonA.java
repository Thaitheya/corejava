package com.chainsys.Strings;

import java.util.*;

public class StringlessonA {
public static  void lessonOne() {
	   String firstString = "Chainsys";
	   System.out.println(firstString);
	   char dataOne[] = {'c','h','a','i','n','s','y','s'};
	   String secondString = new String(dataOne);
	   System.out.println(secondString);
	   String thirdString = new String(new char[] {'c','h','a','i','n','s','y','s'});
	   System.out.println(thirdString);
   }
   public static void lessonTwo() {
	   String firstString = "Hello";
	   String secondString = "Hello";
	   String thirdString = "Hello";
	   int firstNumber = 100;
	   int secondNumber = 100;
	   int thirdNumber = 100;
	   System.out.println(firstString);
	   System.out.println(secondString);
	   firstString = "Welcome";
	   System.out.println(firstString);
	   System.out.println(secondString);
   }
   public static void createAStringInALoop() {
	 for (int count = 0; count < 10; count++) {
		String s1 = "Hello";	
		System.out.println(s1);
	 }
   }
   public static void testStringTrim()() {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the WORD: ");
	   String firstString = sc.nextLine();
	   sc.close();
	   String stringToLowerCase = firstString.toLowerCase();
	   System.out.println("Length: " + stringToLowerCase);
	   char[] data = firstString.toCharArray();
	   int dataArrayLength = data.length;
	   System.out.println("Length: " + dataArrayLength);
//	   from 3rd char to 6th char (i.e excluding 7th char)
//	   from index 2 to 5 
	   String subString = firstString.substring(2, 5);
	   System.out.println(subString);
	   String Replace = firstString.replace("a", "i");
	   System.out.println(Replace);
//	    Equals 
	   boolean flag1 = firstString.equals(stringToLowerCase);
	   System.out.println(flag1);
	   boolean flag2 = firstString.equalsIgnoreCase(stringToLowerCase);
	   System.out.println(flag2);
	   
}
   public static void testStringTrim1() {
	   String secondString = "HOPE       IT       RAIN";
//	   System.out.println("Before Trim: " + secondString.length());
	   secondString = secondString.trim();
	   System.out.println("After Trim: " + secondString.length());
   }
   public static void testSplit() {
	   String firstString = "Jan Feb Mar Apr May June July Aug Sep Oct Nov Dec";
	   String trimmedString = firstString.trim();
	   String [] data = trimmedString.split(" ");

	   int count = data.length;
	   System.out.println("Word Count: " + count);
	   for(int index = 0; index < count; index++) {
		   System.out.println(data[index]);
		
	}
   }
   public static void reverse() {
		   Scanner see = new Scanner(System.in);
		   System.out.println("Enter the sentence");
		   String sentence = "";
		   try {
			   sentence = see.nextLine();
		   } finally {
			   
			see.close();  
		   }
		   char[] c =  sentence.toCharArray();
		   System.out.println(c.length);
		   for(int count = c.length-1;count >= 0; count--) {
			    System.out.print(c[count]);
		   }   
	   }
  
public static void verifyString(String s1) {
	   if(null==s1) {
		   System.out.println("String is Null");
		   return;
	   }
	   else {
		   System.out.println("String is NOT Null" + s1);
	   }
	   if(!s1.isEmpty()) 
		   System.out.println("\t Not Empty " + s1);
	   else
		   System.out.println("\t String is Empty");
   }
	   
	   

}

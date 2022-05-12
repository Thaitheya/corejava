package com.chainsys.introduction;
import java.util.*;
public class code {
  private static int lengthOfCharArray = 0;
private static Object nameInUppercase;
public static void main(String[]args) {
	
  }
  
	  public static void checkUserName() {
		  java.util.Scanner sc =new java.util.Scanner(System.in);
		  System.out.println("Enter your name");
		  String userName = sc.nextLine();
		  sc.close();
	 		  System.out.println("Name is " + userName);
		  char[] nameAsCharacters = userName.toCharArray();
		  int lengthOfCharacterArray = nameAsCharacters.length;
		  System.out.println("Length of your name is " + lengthOfCharacterArray);
		  for(int index = 0; index < lengthOfCharacterArray;index++) {
			  System.out.println(index + " " + nameAsCharacters[index]);
		  }
          System.out.println("Length of your name is " + lengthOfCharArray);
		  if(lengthOfCharArray < 3) {
			  System.out.println("Name must have atleast 3 chars");
			  return;
			  
		  }
		  if(lengthOfCharArray > 15) {
			  System.out.println("Nmae must NOT have more than 15 chars");
		  }
		 
		String nameToUppercase = userName.toUpperCase();
		  
		
		  nameInUppercase= ((String) nameInUppercase).trim();
		  char[] uppercaseCharArray = ( (String) nameInUppercase).toCharArray();
		  lengthOfCharArray = uppercaseCharArray.length;
		  int asciiValue = 0;
		  for(int index = 0;index < lengthOfCharArray;index++) {
			  asciiValue = (int) uppercaseCharArray[index];
			  System.out.println("Ascii : " + asciiValue);
			  if(asciiValue < 67 || asciiValue > 122) {
				  if(asciiValue != 32) {
					  System.out.println(index);
					  return;
				  }
			  }
		  }
}
	  
}
	  
		 
  


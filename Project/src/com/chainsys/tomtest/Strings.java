package com.chainsys.tomtest;
import java.util.*;
 class Strings {
	 public static void main(String[] args) {
	   String name1 = new String("Thaitheyasudan");
	   String name2 = new String("Thaitheyasudan");
	   System.out.println(name1 == name2);
//	   intern
	   name1 = name1.intern();
	   name2 = name2.intern();
	   System.out.println(name1 == name2);
//	   equalsIgnoreCase
	   String str1 = "Learn Java";
	   String str2 = "Learn Java";
	   String str3 = "Learn kotlin";
	   Boolean result;
	   result = str1.equalsIgnoreCase(str2);
	   System.out.println(result);
	   result = str1.equalsIgnoreCase(str3);
	   System.out.println(result);
//	   Contains
	   String str7 = "Java is good programmming language";
	   boolean result1 = str7.contains("Java");
	   System.out.println(result1);
//	   
    }
}

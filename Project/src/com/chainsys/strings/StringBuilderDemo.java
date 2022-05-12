package com.chainsys.Strings;

public class StringBuilderDemo {
     
	 public static void testA() {
		 String firstString = "Hello How are you today. Is the weather hot or cold";
		 StringBuilder Stringbuilder = new StringBuilder();
		 Stringbuilder.ensureCapacity(250);
		 System.out.println("Length: " + Stringbuilder.length());
		 System.out.println("Capacity: " + Stringbuilder.capacity());
		 
		 Stringbuilder.append(firstString);
		 System.out.println("Buffer: " + Stringbuilder);
		 System.out.println("Length: " + Stringbuilder.length());
		 System.out.println("Capacity: " + Stringbuilder.capacity());
		 
		 firstString = "Wish it rains this week";
		 Stringbuilder.append(firstString);
		 System.out.println("Buffer: " + Stringbuilder);
		 System.out.println("Length: " + Stringbuilder.length());
		 System.out.println("Capacity: " + Stringbuilder.capacity());
		 
		 Stringbuilder.trimToSize();
		 System.out.println("Length: " + Stringbuilder.length());
		 System.out.println("Capacity: " + Stringbuilder.capacity());
		 Stringbuilder.replace(3, 8, "This is a test");
		 System.out.println("Replace: " + Stringbuilder);
		 
		 Stringbuilder.insert(10, "--This is March--" );
		 System.out.println("Insert: " + Stringbuilder);
		 System.out.println("Length: " + Stringbuilder.length());
		 System.out.println("Capacity: " + Stringbuilder.capacity());
		 
		 Stringbuilder.delete(3, 20);
		 System.out.println("Delete: " + Stringbuilder);
		 System.out.println("Length: " + Stringbuilder.length());
		 System.out.println("Capacity: " + Stringbuilder.capacity());
		 
		 System.out.println("Before reverse: " + Stringbuilder);
		 Stringbuilder.reverse();
		 System.out.println("After reverse: " + Stringbuilder);
		 
		 
//		 java.lang.StringBuffer
//
//		 append(String ) // add string to the end of SB
//		 insert(int,String ) //add string to the index position of the SB
//		 replace( ) // replace a word
//		 delete( int,int)
//
//		 ensureCapacity(int) //allocates Memory, does not reduce the size
//		 setLength(int ) // truncate data
//
//		 reverse( )
//		 deleteCharAt( )
//		 charAt(int ) // get Char from index 
//		 setCharAt( ) // replace a char 
//		 trimToSize() // set the capacity to the length
//		 substring(int)
//
//		 Use StringBuffer or StringBuilder to modify a String Multiple times 
//		 StringBuffer is  synchronized and used in MultiThreaded (multiuser) Environment
//		 J2SE 5 adds a new String class called StringBuilder.
//		 StringBuilder is not synchronized and used in SingleThreaded (singleuser) Environment
//		 StringBuilder is identical to StringBuffer
		 
	 }
	 public static void testB() {
		 StringBuilder Stringbuilder = new StringBuilder();
		   String name = "Thaitheyasudan";
		   
	 }
}

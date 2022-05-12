package com.chainsys.collections;


import java.util.*;
public class ListIteratorDemo1 {
  public static void main(String[] args) {
	ArrayList<String>stringArrayList = new ArrayList<String>();
	String s1 = "B";
	stringArrayList.add("c1");
	stringArrayList.add("s1");
	stringArrayList.add("A");
	stringArrayList.add("E");
	stringArrayList.add("s1");
	stringArrayList.add("D");
	stringArrayList.add("F");;
	stringArrayList.add("s1");
	Iterator<String> string_list_itr = stringArrayList.iterator();
	Iterator<String> string_itr = stringArrayList.iterator();
	while(string_list_itr.hasNext()) {
		String element = string_list_itr.next();
//	System.out.println(string_itr.next() + " ");
		System.out.println(element + "---");
	
	}
	while(string_itr.hasNext())
	{
		Object element = string_itr.next();
		System.out.println(element + " ");
	}
	System.out.println();
  
//  while( string_list_itr.hasPrevious) {
//	  String element =  string_list_itr.Previous();
//	  System.out.println(element + " ");
//	  
//  }
 }
}

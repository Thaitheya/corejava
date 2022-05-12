package com.chainsys.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetHashSetDemo {

	
	public static void main(String[] args) {
		demoA();
	}
	public static void demoA()
	{
		HashSet<String> string_hs = new HashSet<String>();
		string_hs.add("Bee");
		string_hs.add("Apple");
		string_hs.add("Doll");
		string_hs.add(null);
		string_hs.add("Egg");
		string_hs.add("Cinema");
		System.out.println("Size " + string_hs.size());
		string_hs.add("Fan");
		string_hs.add(null);
		System.out.println("size " + string_hs.size());
		Iterator<String> set_itr = string_hs.iterator();
		while(set_itr.hasNext()) {
			System.out.println(set_itr.next() + " ");
		}
		
		
	}
}

package com.chainsys.coll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class hashSet {
     public static void main(String[] args) {
		HashSet<ArrayList> hs = new HashSet<>();
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		   list1.add(1);
		   list1.add(2);
		   list2.add(1);
		   list2.add(2);
		   hs.add(list2);
		   hs.add(list1);
		   System.out.println(hs.size());
		   }
}

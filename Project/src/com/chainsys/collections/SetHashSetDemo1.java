package com.chainsys.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetHashSetDemo1 {
	
public static void main(String[] args) {
	demoB();
}
	public static void demoB () {
		HashSet<Emp> hs = new HashSet<Emp> ();
		Emp el=null;
		for (int i=0; i<10; i++)
		{
		el=new Emp(i);
		el.Name="Emp "+i;
		hs.add (el);
		}
		System.out.println("Count " + hs.size());
		hs.add (el);
		System.out.println("Count " + hs.size());
		Iterator<Emp> itr = hs.iterator (); 
		while (itr.hasNext()) {
			Emp e2 = itr.next();
			System.out.println(e2.getID() + " " + e2.Name);
			
		}
}
}

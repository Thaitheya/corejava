package com.chainsys.Arrays;

public class Employee {
      public final long id;
      private String name;
      public Employee(long v1) {
		this.id = v1;
    	  
      }
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
		
	}
}

package com.chainsys.unittest;
import com.chainsys.classandmethod.Employee;
public class Emptest {
     public static void testEmpName() {
    	Employee firstEmployee = new Employee(1234);
    	firstEmployee.setName("Thaitheyasudan");
    	System.out.println(firstEmployee.getName());
     }
     public static void testCity() {
    	 Employee firstCity = new Employee(1234);
     	 firstCity.setCity("Chennai");
     	 System.out.println(firstCity.getCity());
     }
     public static void testSalary() {
    	 Employee firstSalary = new Employee(1234);
     	 firstSalary.setSalary(50000);
     	 System.out.println(firstSalary.getSalary());
     }
}

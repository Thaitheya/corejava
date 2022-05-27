package com.chainsys.miniproject.Ui;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

public class EmployeeUi {
   public static void addNewEmployee() {
	 java.util.Scanner sc =new java.util.Scanner(System.in);  
	 try {
		Employee newemp=new Employee();
		 System.out.println("Enter Employee Id :");
		 String id=sc.nextLine();
		newemp.setEmployee_id(Integer.parseInt(id));
		System.out.println("Enter First_Name :");
		newemp.setFirst_name(sc.nextLine());
		System.out.println("Enter Last_Name :");
		newemp.setLast_name(sc.nextLine());
		System.out.println("Enter Email :");
		newemp.setEmail(sc.nextLine());
		Calendar c1 =Calendar.getInstance();
		java.util.Date newDate =new java.util.Date();//yes sir
		newemp.setHire_date(newDate);
		System.out.println("Enter Job_id :");
		newemp.setJob_id(sc.nextLine());
		System.out.println("Enter Salary :");
		   newemp.setSalary(sc.nextFloat());
		int result =EmployeeDao.insertEmployee(newemp);
		System.out.println(result);
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}
	 finally {
		 sc.close();
	 }
   }
   
   public static void updateEmployee() {
		 java.util.Scanner sc =new java.util.Scanner(System.in);  
		 try {
		 Employee newemp=new Employee();
		 System.out.println("Enter Employee Id :");
		 String id=sc.nextLine();
		 try {
			 Validator.checkStringForParseInt(id);
		 }catch(InvalidInputDataException err) {
			 err.printStackTrace();
			 return;
		 }
		 int empId=Integer.parseInt(id);
		 try {
			 Validator.CheckNumberForGreaterThanZero(empId);
		 }catch(InvalidInputDataException err) {
			 err.printStackTrace();
			 return;
		 }
	   	Employee emp= EmployeeDao.getEmployeeById(empId);
	   	if(emp==null) {
	   		System.out.println("Employee Doesn't Exist For Id "+empId); //
	   		return ;
	   	}
		newemp.setEmployee_id(empId);
	   	System.out.println("Enter First_Name to Modify:"); //Ok sir
	   	String fName= sc.nextLine();
	   	// TODO -Validate fName 
	   	newemp.setFirst_name(fName);
	   	System.out.println("Enter Last_Name to Modify:");
	   	newemp.setLast_name(sc.nextLine());
	   	System.out.println("Enter Email to Modify:");
	   	newemp.setEmail(sc.nextLine());
	   	Calendar c1 =Calendar.getInstance();
	   	java.util.Date newDate =new java.util.Date();
	   	newemp.setHire_date(newDate);
	   	System.out.println("Enter Job_id to Modify:");
	   	newemp.setJob_id(sc.nextLine());  
	   	System.out.println("Enter Salary to Modify:");
	       newemp.setSalary(sc.nextFloat());
	   	int result =EmployeeDao.updateEmployee(newemp);
	   	System.out.println(result);
		 }finally {
			 sc.close();
		 }
	   }
   
   public static void updateEmployeeFirstName() {
		 java.util.Scanner sc =new java.util.Scanner(System.in); 
		 try {
		 Employee newemp=new Employee();
		 System.out.println("Enter Employee Id :");
		 String id=sc.nextLine();
		 int empId=Integer.parseInt(id);
		   	Employee emp= EmployeeDao.getEmployeeById(empId);
		   	if(emp==null) {
		   		System.out.println("Employee Doesn't Exist For Id "+empId); //
		   		return ;
		   	}
	   	newemp.setEmployee_id(empId); 
	   	System.out.println("Enter Update Name :");
	   	String update_name= sc.nextLine();
	   	int result =EmployeeDao.updateEmployeeFirstName(empId,update_name);
	   	System.out.println(result);
		 }finally {
			 sc.close();
		 }
	   }
   
   public static void updateEmployeeSalary() {
		 java.util.Scanner sc =new java.util.Scanner(System.in);  
		 try {
		 Employee newemp=new Employee();
		 System.out.println("Enter Employee Id :");
		String id=sc.nextLine();
		 int empId=Integer.parseInt(id);
		   	Employee emp= EmployeeDao.getEmployeeById(empId);
		   	if(emp==null) {
		   		System.out.println("Employee Doesn't Exist For Id "+empId); //
		   		return ;
		   	}
	   	newemp.setEmployee_id(empId); 
	   	System.out.println("Enter Update salary :");
	   	float salary =sc.nextFloat();
	   	newemp.setSalary(salary);
	   	int result =EmployeeDao.updateEmployeeSalary(empId,salary);
	   	System.out.println(result);
		 }finally {
			 sc.close();
		 }
	   }
 
   public static void deleteEmployee() {
		 java.util.Scanner sc =new java.util.Scanner(System.in);  
		 try {
		 Employee newemp=new Employee();
		 System.out.println("Enter Employee Id :");
		 String id=sc.nextLine();
		 int empId=Integer.parseInt(id);
		   	Employee emp= EmployeeDao.getEmployeeById(empId);
		   	if(emp==null) {
		   		System.out.println("Employee Doesn't Exist For Id "+empId); //
		   		return ;
		   	}
	   	newemp.setEmployee_id(empId); 
	   	int result =EmployeeDao.deleteEmployee(empId);
	   	System.out.println(result);
		 }finally {
			 sc.close();
		 }
	   }
 
   public static void getEmployeeById() {
		 java.util.Scanner sc =new java.util.Scanner(System.in);  
		 try {
		 Employee newemp=new Employee();
		 System.out.println("Enter Employee Id :");
		 String id=sc.nextLine();
		 int empId=Integer.parseInt(id);
		   	Employee emp= EmployeeDao.getEmployeeById(empId);
		   	if(emp==null) {
		   		System.out.println("Employee Doesn't Exist For Id "+empId); //
		   		return ;
		   	}
	   	newemp.setEmployee_id(empId); 
	   	Employee result =EmployeeDao.getEmployeeById(empId);
	   	System.out.println(result.getEmployee_id()+" "+result.getFirst_name()+" "+result.getLast_name()+" "+result.getEmail()+" "+result.getHire_date()+" "+result.getJob_id()+" "+result.getSalary());
		 }finally {
			 sc.close();
		 }
	   }
 
    public static void getAllEmployeesDetails(){
		   List<Employee> allEmployees =EmployeeDao.getAllEmployees();
	    	 Iterator <Employee> empIterator = allEmployees.iterator();
	    	 while(empIterator.hasNext()) {
	    		 Employee emp =empIterator.next();
	    		 System.out.println(emp.getEmployee_id()+" "+emp.getFirst_name()+" "+emp.getLast_name()+" "+emp.getEmail()+" "+emp.getHire_date()+" "+emp.getJob_id()+" "+emp.getSalary());
	    	 }
	 	}
	   
}

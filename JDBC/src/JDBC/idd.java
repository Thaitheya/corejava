package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class idd {
	public static void main(String[] args) {
		
	
	try {
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
        java.sql.Statement  mystat = con.createStatement();
    ResultSet myRs =mystat.executeQuery ("create table Student2 "+ "(id number, name varchar(20),dept varchar(20),year number, mark number)");
        PreparedStatement stmt =con.prepareStatement("insert into Student2"+" values(?,?,?,?,?)"); 
       @SuppressWarnings("resource")
	Scanner sc= new  Scanner(System.in);
//     Scanner scan =new Scanner(System.in);
     System.out.println("please enter the Student2 rollno: ");
     int rollno= sc.nextInt();
     System.out.println("entern name:");
     String name= sc.next();
     System.out.println("enter dept");
     String dept=sc.next();
     System.out.println("enter year");
     int year=sc.nextInt();
     System.out.println("mark:");
     int mark=sc.nextInt();
     
     stmt.setInt(1, rollno);
     stmt.setString(2, name);
     stmt.setString(3,dept);
     stmt.setInt(4,year);
     stmt.setInt(5,mark);
     int rows=stmt.executeUpdate();
     System.out.println(rows+"updated....");
   myRs.close();
     con.close();
     mystat.close();
    
     }catch(Exception err) {
         err.printStackTrace();
         
    }
}
}

package JDBC;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Login_J {
  
	
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		
		Statement stmt = con.createStatement();
		int result=stmt.executeUpdate("update employees set First_name='Vimal',last_name= 'Payan',salary=10000 where employee_id=108");
		int result1 = stmt.executeUpdate("delete from employees where employee_id= 205");
		
		System.out.println(result + "records affected");
		System.out.println(result1 + "records affected");
		con.close();
	}
  
  
  
}

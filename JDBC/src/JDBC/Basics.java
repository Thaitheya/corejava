package JDBC;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;

public class Basics {
  public static void main(String[] args) throws  SQLException, ClassNotFoundException{
	  
	String query = "insert into login(userName,Password) values ('Sudan', 'Thaitheyasudan' )";
	
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
	Statement st = con.createStatement();
	int Count = st.executeUpdate(query);
	 System.out.println(Count + "Rows Affected");
	 st.close();
	 con.close();
}
}

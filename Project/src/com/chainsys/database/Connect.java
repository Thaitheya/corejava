package com.chainsys.database;
import java.sql.*;
public class Connect 
{

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		String oracledriver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uname = "system";
		String pass = "oracle";
		Class.forName("oracle.jdbc.oracledriver");
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		System.out.println("Connected to Oracle DataBase");
		Statement st = con.createStatement();
		String sql = "insert into customers values(3,'Thaitheyasudan',21";
		
		int name = st.executeUpdate(sql);
		System.out.println(name);
		st.close();
		con.close();
	}
	
	
}

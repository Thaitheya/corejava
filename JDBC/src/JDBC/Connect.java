package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
        protected static Connection intializeDatabase() 
        		throws SQLException, ClassNotFoundException {
         Connection myCon  = DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:xe","system","oracle");
         
          
         return myCon;
        	
        }
}

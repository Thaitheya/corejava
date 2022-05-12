package JDBC;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;


import code.Connect;
@webServlet(/InsertData);
public class Servlets extends Connect{
      private static final long serialVersionUID = 1L;
      protected void doPost(HttpRequest request, HttpResponse response) throws IOException{
    	  try {
    	Connection con = DatabaseConnection.initializeDatabase();
            PreparedStatement st = con
                   .prepareStatement("insert into demo values(?, ?)");
            st.setInt(1, Integer.valueOf(request.getParameter("id")));
  
            // Same for second parameter
            st.setString(2, request.getParameter("string"));
  
            // Execute the insert command using executeUpdate()
            // to make changes in database
            st.executeUpdate();
  
            // Close all the connections
            st.close();
            con.close();
  
            // Get a writer pointer 
            // to display the successful result
            PrintWriter out = response.getWriter();
            out.println("<html><body><b>Successfully Inserted"
                        + "</b></body></html>");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
      }
}

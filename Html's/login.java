import java.io.IOException;
import java.rmi.server.ServerCloneException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet{

    


    protected void doPost(HttpServlet request,HttpServlet response)throws ServletException,IOException{
              String username =  request.getParameter("Username");
              String Password =  request.getParameter("Password");

    }
}
package com.chainsys.app.dynamicProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class RequestParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RequestParam() {
        super();
      
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("Dopost called");
		 response.setContentType("Text/html");
		 PrintWriter out = response.getWriter();
         HttpSession ses = request.getSession(true);
         String str_name = (String)request.getParameter("Name");//Scope to request
         out.println(str_name);
         String str_Company = (String)request.getParameter("Company");
         out.println(str_Company);
         String str_Password = (String)request.getParameter("password");
       
        
//		 @SuppressWarnings("rawtypes")
//		 Enumeration enu = getInitParameterNames();
//		  while(enu.hasMoreElements())
//		    {
//		  		String init = (String)enu.nextElement();
//		  		out.println(init+" : " +getInitParameter(init)+"<br>");
//	        }
//		  out.println("Inside");
	}
}

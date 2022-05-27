package com.tts.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginPage extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String uname = request.getParameter("Uname");
		  String pass = request.getParameter("pass");
		  
		  if(uname.equals("abc") && pass.equals("def")) {
			  HttpSession session = request.getSession();
			  session.setAttribute("username", uname);
			  response.sendRedirect("Welcome.jsp");
		  }
		  else {
			  response.sendRedirect("Login.jsp");
		  }
	}

	
}

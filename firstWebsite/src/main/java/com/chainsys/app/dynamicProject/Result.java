package com.chainsys.app.dynamicProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Result
 */
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Result() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession(true);
		out.println("<html><head><title>Result</title></head><body>");
		String sesson_Salary=(String)session.getAttribute("salary");
		if(sesson_Salary ==null) {
			out.println("<h1> SESSION NOT YET SET!! <h1>");
		}
		else
		out.println("<h1>value fetched from result</h1>" + sesson_Salary); 
	
		out.println("</body></html>");
		String submit_value = request.getParameter("submit");
		if (submit_value != null) {
			System.out.println(submit_value);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DoPost Called");
	  doGet(request,response);
	}

}

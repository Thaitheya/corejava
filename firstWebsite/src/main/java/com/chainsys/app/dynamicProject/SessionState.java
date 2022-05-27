package com.chainsys.app.dynamicProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionState
 */
public class SessionState extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionState() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title><Attributes</title></head><body>");
		String submit_value = request.getParameter("submit");
		HttpSession session=request.getSession(true);
		System.out.println(session.getId());
		if (submit_value.equals("result")) {
//			response.sendRedirect("Result");
//			response.sendRedirect("http://www.google.com");
			RequestDispatcher rd = request.getRequestDispatcher("Result");
			rd.forward(request, response);
		}
		else if (submit_value.equals("set")) {
			String salary_input = request.getParameter("salary"); 
			session.setAttribute("salary", salary_input);//storing data in session scope for each user
			out.println("<h1>value set :</h1>"+salary_input);
			// session.setAttribute stores the data in a collection using key and value
			// "salary" is key
		} else if (submit_value.equals("fetch")) {
//			String sesson_Salary=session.getAttribute("salary").toString();
			String sesson_Salary=(String)session.getAttribute("salary");
			if(sesson_Salary ==null) {
				out.println("<h1> SESSION NOT YET SET!! <h1>");
			}
			else
			out.println("<h1>value fetch :</h1>" + sesson_Salary); 
		
		}
		out.println("</body><script>I am good Programmer</script></html>");
	}

}

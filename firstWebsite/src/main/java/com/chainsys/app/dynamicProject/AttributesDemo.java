package com.chainsys.app.dynamicProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AttributesDempo
 */
public class AttributesDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AttributesDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	public String salary = null;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head> <title>Attributes</title></head><body>");
		String submitValue = request.getParameter("submit");
		if (submitValue.equals("SET")) {
			String salaryInput = request.getParameter("salary");
			salary = salaryInput;
			out.println("<h1>Value Set</h1>" + salary);
		} else if (submitValue.equals("fetch")) {

			out.println("<h1>Value fetched</h1>" + salary);
		}
		out.println("</body></html>");

	}

}

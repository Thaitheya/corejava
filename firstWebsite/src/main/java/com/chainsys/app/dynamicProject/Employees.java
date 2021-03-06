package com.chainsys.app.dynamicProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.commonutil.ExceptionManager;
import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

/**
 * Servlet implementation class Employees
 */
public class Employees extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employees() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		List<Employee> emplist =EmployeeDao.getAllEmployee();
		Iterator<Employee> empItr=emplist.iterator();
		while(empItr.hasNext()) {
			Employee emp=empItr.next();
			out.println("</p>");
			out.println("emp id:"+emp.getEmp_id()+"name :"+emp.getFirst_name());
			
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("click").equals("Add_Emp")) {
	    String source="AddNewEmployee";
	    String message="<h1>Error while "+source+"</h1>";
		PrintWriter out = response.getWriter();
		Employee newemp = null;
		int result = 0;
		int empId = 0;
		String testname = null;
		try {
			newemp = new Employee();
			String id = request.getParameter("id");
			try {
				Validator.checkNumberForParseInt(id);
			} catch (InvalidInputDataException err) {
				
				
				message +=" Error in Employee Id : </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				message +=" Error in Employee Id input: </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newemp.setEmp_id(empId);
//--------------------------------
			String fname = request.getParameter("fname");
			testname = fname;
			try {
				Validator.checkStringOnly(testname);
			} catch (InvalidInputDataException err) {
				message +=" Error in Employee First name: </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			try {
				Validator.checklengthOfString(fname);
			} catch (InvalidInputDataException err) {
	
				message +=" Error in First name : </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newemp.setFirst_name(fname);
//-----------------------------------
			String lname = request.getParameter("lname");
			testname = lname;
			try {
				Validator.checkStringOnly(testname);
			} catch (InvalidInputDataException err) {
				message +=" Error in last name: </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			try {
				Validator.checklengthOfString(lname);
			} catch (InvalidInputDataException err) {
				
				message +=" Error in last name: </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newemp.setLast_name(lname);
//----------------------------------			
			String email = request.getParameter("email");
			try {
				Validator.checkEmail(email);
			} catch (InvalidInputDataException err) {
				
				message +=" Error in Employee e-mail: </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newemp.setEmail(email);
//--------------------------------------			
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String emp_HireDate = request.getParameter("hdate");
			try {
				Validator.checkDateFormat(emp_HireDate);
			} catch (InvalidInputDataException err) {
				message +=" Error in Employee Hire date : </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			Date newDate = null;
			newDate = hire_dateFormate.parse(emp_HireDate);
			newemp.setHire_date(newDate);
			
//----------------------------------------
			String jobId = request.getParameter("jobid");
			try {
				Validator.checkJobId(jobId);
			} catch (InvalidInputDataException err) {
				
				message +=" Error in Employee jon id: </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newemp.setJob_id(jobId);
//---------------------------------------			
			String sal = request.getParameter("salary");
			try {
				Validator.checkNumberForParseInt(sal);
			} catch (InvalidInputDataException err) {
				
				message +=" Error in Employee salary: </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			float salParse = Float.parseFloat(sal);
			try {
				Validator.checkStringForGreaterThanZero1(salParse);
			} catch (InvalidInputDataException err) {
				
				message +=" Error in Employee salary: </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newemp.setSalary(salParse);
//----------------------------------------------			
			result = EmployeeDao.insertEmployee(newemp);
		} catch (Exception err) {
			return;
		} 
		out.println("<div> Add New Employee: "+result+"</div>");
	    }
		else if(request.getParameter("click").equals("update_emp")) 
		{
		doPut(request, response);
		}
		else if(request.getParameter("click").equals("delete_emp"))
		{
			doDelete(request, response);
	}
	}
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String source="UpdateNewEmployee";
		 String message="<h1>Error while "+source+"</h1>";
		PrintWriter out = response.getWriter();
		Employee newemp = null;
		int result = 0;
		int empId = 0;
		String testname=null;
		try {
			newemp = new Employee();
			String id = request.getParameter("id");
			try {
				Validator.checkNumberForParseInt(id);
			} catch (InvalidInputDataException err) {
				message +=" Error in Employee Id : </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				message +=" Error in Employee Id : </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newemp.setEmp_id(empId);
//--------------------------------
			String fname = request.getParameter("fname");
			testname=fname;
			try {
				Validator.checkStringOnly(testname);
			} catch (InvalidInputDataException err) {
				message +=" Error in Employee First name: </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			try {
				Validator.checklengthOfString(fname);
			} catch (InvalidInputDataException err) {
				message +=" Error in Employee First name : </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newemp.setFirst_name(fname);
//-----------------------------------
			String lname = request.getParameter("lname");
			testname=lname;
			try {
				Validator.checkStringOnly(testname);
			} catch (InvalidInputDataException err) {
				message +=" Error in Employee Last name : </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			try {
				Validator.checklengthOfString(lname);
			} catch (InvalidInputDataException err) {
				message +=" Error in Employee Last name : </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newemp.setLast_name(lname);
//----------------------------------			
			String email = request.getParameter("email");
			try {
				Validator.checkEmail(email);
			} catch (InvalidInputDataException err) {
				message +=" Error in Employee e-mail : </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newemp.setEmail(email);
//--------------------------------------			
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String emp_HireDate = request.getParameter("hdate");
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);

			try {
				Validator.checkDateFormat(emp_HireDate);
			} catch (InvalidInputDataException err) {
				message +=" Error in Employee Hire date : </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			Date newDate = null;
			newDate = hire_dateFormate.parse(emp_HireDate);
			newemp.setHire_date(newDate);
//----------------------------------------
			String jobId = request.getParameter("jobid");
			try {
				Validator.checkJobId(jobId);
			} catch (InvalidInputDataException err) {
				message +=" Error in Employee Job id : </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newemp.setJob_id(jobId);
//---------------------------------------			
			String sal = request.getParameter("salary");
			try {
				Validator.checkNumberForParseInt(sal);
			} catch (InvalidInputDataException err) {
				message +=" Error in Employee salary: </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			float salParse = Float.parseFloat(sal);
			try {
				Validator.checkStringForGreaterThanZero1(salParse);
			} catch (InvalidInputDataException err) {
				message +=" Error in Employee salary : </p>";
				String errorPage=ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				return;
			}
			newemp.setSalary(salParse);
//----------------------------------------------			
			result = EmployeeDao.updateEmployee(newemp);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		out.println("<div> update Employee: "+result+"</div>");
	}
	
protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String source="DeleteEmployee";
	String message="<h1>Error while "+source+"</h1>";
	PrintWriter out = response.getWriter();
	Employee newemp = null;
	int result = 0;
	String empid = null;
	try {
	    empid=request.getParameter("id");
		Validator.checkNumberForParseInt(empid);
	}
	catch(InvalidInputDataException err) {
		message +=" Error in Employee Id : </p>";
		String errorPage=ExceptionManager.handleException(err, source, message);
		out.print(errorPage);
		return;
	}
	int emp_id=Integer.parseInt(empid);
	result = EmployeeDao.deleteEmployee(emp_id);
	out.println("row deleted"+result);
	
}}
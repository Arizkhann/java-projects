package com.java.state;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		PrintWriter out= response.getWriter();
		String user=request.getParameter("userName");
		String pwd=request.getParameter("passWord");
		String FirstName="",lastName="";
		if (user.equals("jitu")&& pwd.equals("jitu")) {
			FirstName="Jitendra";
			lastName="sahoo";
		}
		if (user.equals("sonali")&& pwd.equals("sonali")) {
			FirstName="sonali";
			lastName="sahu";
		
	}if (user.equals("ganu")&& pwd.equals("ganu")) {
		FirstName="ganesh";
		lastName="mirda";

	}
	out.println("<a href='WelcomeServlet?FirstName="+FirstName+"&lastName=" +lastName+"'>Welcome</a>");
	
	}}

package com.java.otp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.state.Login;
import com.java.state.LoginDAO;
import com.java.state.LoginDAOImpl;

/**
 * Servlet implementation class SignUpServlet
 */
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pwd,retype;
		pwd=request.getParameter("passCode");
		retype=request.getParameter("retypePassCode");
		PrintWriter out=response.getWriter();
		if(pwd.equals(retype)) {
			SignUp login=new SignUp();
			login.setCustomer_UserName("Customer_UserName");
			login.setCustomer_Password(request.getParameter("Customer_Password"));
			SignUpDAO dao=new SignUpDAOImpl();
			
			try {
				out.println(dao.createUser(login));
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			out.println("Password and RetypePassword must be same...");
		}
		
		
		
		
	}

}

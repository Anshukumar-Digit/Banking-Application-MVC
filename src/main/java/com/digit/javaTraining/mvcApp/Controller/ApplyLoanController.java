package com.digit.javaTraining.mvcApp.Controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.digit.javaTraining.mvcApp.model.BankApp;


@WebServlet("/Loan")
public class ApplyLoanController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int lid = Integer.parseInt(req.getParameter("lid"));
		HttpSession session=req.getSession();
		BankApp bk=new BankApp();
		//session.setAttribute(getServletName(), bk);
		ResultSet rs=bk.applyloan(lid);
		try {
			if(rs.next()==true) {
				try {
					session.setAttribute("interest", rs.getInt("interest"));
					session.setAttribute("description",rs.getString("description"));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
//				resp.sendRedirect("/Banking-Application/LoanDetails.jsp");
				
				
				resp.sendRedirect("/Banking-Application-MVC/LoanDetails.jsp");
			}
			else {
				resp.sendRedirect("/Banking-Application-MVC/LoanDetails.html");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

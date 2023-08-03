package com.digit.javaTraining.mvcApp.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.digit.javaTraining.mvcApp.model.BankApp;

@WebServlet("/Login")
public class LoginController extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		BankApp bk=new BankApp();
		
		bk.setCust_id(Integer.parseInt(req.getParameter("cust_id")));
		bk.setPin(Integer.parseInt(req.getParameter("pin")));

		boolean ok=bk.login();
		
		HttpSession session = req.getSession();
		
		
		if(ok) {
			session.setAttribute("cust_name",bk.getCust_name());
			session.setAttribute("accno", bk.getAccno());
			resp.sendRedirect("/Banking-Application-MVC/HomePage.jsp");
		}
		else {
			resp.sendRedirect("/Banking-Application-MVC/LoginFail.html");
		}
	}
}

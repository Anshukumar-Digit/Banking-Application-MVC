package com.digit.javaTraining.mvcApp.Controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.digit.javaTraining.mvcApp.model.BankApp;

@WebServlet("/CheckBalance")
public class CheckBalanceController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//bk.setBalance(Integer.parseInt(req.getParameter("balance")));
		//bk.setCust_name((req.getParameter("cust_name")));
		
		
		HttpSession session = req.getSession();
		BankApp bk=new BankApp();
		int accno=(int)session.getAttribute("accno");
		System.out.println(accno);
		
		
		bk.setAccno(accno);
		boolean ok=bk.checkBalance();
		
		if(ok)
		{
			session.setAttribute("balance", bk.getBalance());
			session.setAttribute("cust_name",bk.getCust_name());
			resp.sendRedirect("/BankingAppMVC/Balance.jsp");

		}
		else {
			resp.sendRedirect("/Banking-Application-MVC/BalanceFail.jsp");

		}
	}
}

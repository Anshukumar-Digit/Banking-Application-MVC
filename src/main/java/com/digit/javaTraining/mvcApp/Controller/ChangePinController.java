package com.digit.javaTraining.mvcApp.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.digit.javaTraining.mvcApp.model.BankApp;

@WebServlet("/ChangePin")
public class ChangePinController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int pin = Integer.parseInt(req.getParameter("pin"));
		int npin = Integer.parseInt(req.getParameter("npin"));
		int cpin= Integer.parseInt(req.getParameter("cpin"));
		
		BankApp bk=new BankApp();
		
		bk.setPin(Integer.parseInt(req.getParameter("pin")));
		//bk.setPin(Integer.parseInt(req.getParameter("pin")));
		
		HttpSession session=req.getSession();
		int accno=(int) session.getAttribute("accno");
		bk.setAccno(accno);
		Boolean ok=bk.changepin(npin);
		
		if(ok) {
			resp.sendRedirect("/Banking-Application-MVC/PasswordChangeSuccess.html");
		}
		else {
			resp.sendRedirect("/Banking-Application-MVC/PasswordChangeFail.html");

		}
	}	
}

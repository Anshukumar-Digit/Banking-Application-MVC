package com.digit.javaTraining.mvcApp.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.digit.javaTraining.mvcApp.model.BankApp;
import com.digit.javaTraining.mvcApp.model.TransferStatus;

@WebServlet("/Transfer")
public class TransferAmountController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//		// TODO Auto-generated method stub
		//		super.service(req, resp);

		int cust_id = Integer.parseInt(req.getParameter("cust_id"));
		String bank_name = (req.getParameter("bank_name"));
		String ifsc = (req.getParameter("ifsc"));
		int accno = Integer.parseInt(req.getParameter("sender_accno"));
		String receiver_ifsc = (req.getParameter("receiver_ifsc"));
		int receiver_accno = Integer.parseInt(req.getParameter("receiver_accno"));
		int amount = Integer.parseInt(req.getParameter("amount"));
		int pin = Integer.parseInt(req.getParameter("pin"));
	
		TransferStatus t=new TransferStatus();
		t.setCust_id(cust_id);
		t.setBank_name(bank_name);
		t.setIfsc(ifsc);
		t.setAccno(accno);
		t.setReceiver_ifsc(receiver_ifsc);
		t.setReceiver_accno(receiver_accno);
		t.setAmount(amount);
		t.setPin(pin);
		
		
		
		HttpSession session=req.getSession();
  boolean ok=t.transfer(session);
  if(ok) {
	  resp.sendRedirect("/Banking-Application-MVC/Transfersuccess.html");  
  }
  else {
	  resp.sendRedirect("/Banking-Application-MVC/TransferFail.jsp"); 
  }

		
	}
}

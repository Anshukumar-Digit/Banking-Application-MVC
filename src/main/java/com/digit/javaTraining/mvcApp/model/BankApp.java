package com.digit.javaTraining.mvcApp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.mysql.cj.protocol.Resultset;

public class BankApp {

	int bank_id;
	String bank_name;
	String ifsc_code;
	int accno;
	int pin;
	int cust_id;
	String cust_name;
	int balance;
	String email;
	long phone;
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private ResultSet result;
	public BankApp() {
		String url = "jdbc:mysql://localhost:3306/project1";
		String user = "root";
		String pwd = "Anshu0705@";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pwd);

		}

		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public int getBank_id() {
		return bank_id;
	}
	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public boolean register() {
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//con = DriverManager.getConnection(url, user, pwd);
			pstmt = con.prepareStatement("insert into bankapp values(?,?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, bank_id);
			pstmt.setString(2, bank_name);
			pstmt.setString(3, ifsc_code);
			pstmt.setInt(4, accno);
			pstmt.setInt(5, pin);
			pstmt.setInt(6, cust_id);
			pstmt.setString(7, cust_name);
			pstmt.setInt(8, balance);
			pstmt.setString(9, email);
			pstmt.setLong(10, phone);

			int x = pstmt.executeUpdate();

			if(x>0) {
				return true;
			}
			else {
				return false;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean login() {
		try {
			pstmt = con.prepareStatement("select *from bankapp where cust_id=? and pin=?");

			pstmt.setInt(1,cust_id );
			pstmt.setInt(2, pin);

			rs=pstmt.executeQuery();
			if(rs.next()==true) {
				setAccno(rs.getInt("accno"));
				setCust_name(rs.getString("cust_name"));

				return true;
			}
			else {
				return false;	
			}

		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;

	}

	public boolean checkBalance() {

		try {
			pstmt = con.prepareStatement("select * from bankapp where accno=?");

			pstmt.setInt(1,accno);


			rs=pstmt.executeQuery();
			if(rs.next()==true) {
				setBalance(rs.getInt("balance"));
				setCust_name(rs.getString("cust_name"));
				System.out.println(rs.getInt("balance"));
				return true;

			}
			else {
				return false;

			}

		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return false;

	}

	public boolean changepin(int npin) {
		try {
			pstmt = con.prepareStatement("update bankapp set pin=? where accno=? and pin=?");

			pstmt.setInt(1,npin);
			pstmt.setInt(2,getAccno());
			pstmt.setInt(3,pin);
			int x=pstmt.executeUpdate();
			if(x>0) {
				return true;
			
			}
			else {
				return false;
							}

		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}


		return false;

	}
	
	public ResultSet applyloan(int lid) {
		ResultSet result=null;
		try {
			pstmt = con.prepareStatement("select *from loan where lid=?");

			pstmt.setInt(1,lid);
			
			result=pstmt.executeQuery();
	        return result;

		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean checkbalance() {
		return false;
	}

}

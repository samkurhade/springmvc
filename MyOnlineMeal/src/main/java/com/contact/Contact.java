package com.contact;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		// getting all the incoming details from the request

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String msg = request.getParameter("msg");

		// connection to jdbc
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myonlinemeal", "root",
					"sam@#7841");

			// query
			String q = "insert into contact(name,email,phone_no,msg) values(?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);

			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, phone);
			pstmt.setString(4, msg);


			pstmt.executeUpdate();
			
			out.println("<h1>Done... Your Contact form has been submitted successfully...</h1>");
		} catch (Exception e) {
			e.printStackTrace();
			out.println("<h1>Error... Something went wrong</h1>");
		}

		
	}

}

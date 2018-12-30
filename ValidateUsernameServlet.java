package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateUsernameServlet
 */
/* user name */
@WebServlet("/validateserv")
public class ValidateUsernameServlet extends HttpServlet {
	
	private List<String> usernames = new ArrayList<String>();
	
	@Override
		public void init(ServletConfig config) throws ServletException {
			// TODO Auto-generated method stub
			super.init();
			usernames.add("Mahi");
			usernames.add("Raju");
			usernames.add("Kumar");
			usernames.add("Hari");
		}
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uname = request.getParameter("username");
		PrintWriter out = response.getWriter();
		
		if(usernames.contains(uname)) {
			out.println("<font color='red'>Username taken</font>");	
		}else {
			out.println("<font color='green'>Username available</font>");
		}
		
	}

}

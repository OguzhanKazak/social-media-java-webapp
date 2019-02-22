package com.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDaoImpl;
import com.model.Sex;
import com.model.User;


@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //do validation and forward to next operation
		request.setCharacterEncoding( "UTF-8" );
		
		String email = request.getParameter("mail");
		String password = request.getParameter("password");
		
		User user = new User(email,password,"","",new Date(0,0,0),Sex.NON_GIVEN);
		
		request.getSession().setAttribute("UserSigninData", user); //create session for sign up process
		
		if(new UserDaoImpl().isValid(email)){//check the user
			request.getServletContext().getRequestDispatcher("/getinfo.jsp").forward(request, response);
		}else{
			request.setAttribute("emailnotvalid",email);
			request.getServletContext().getRequestDispatcher("/signup.jsp").forward(request,response);
		}
	}

}

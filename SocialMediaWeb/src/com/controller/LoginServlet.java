package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDaoImpl;
import com.model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("mail");
		String password = request.getParameter("password");
		
		UserDaoImpl userDao = new UserDaoImpl();
		
		User user = userDao.getLoggedInUser(email, password);
		if(user.geteMail() != null || user.getPassword() != null){
			if(user.geteMail().equals(email) && user.getPassword().equals(password)){
				request.getSession().setAttribute("UserLoginData", user); //create session for logged in user. TODO will end this session when he logs out
				request.getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
			}
		}else{
			request.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);//wrong email or password
		}
		
	}

}

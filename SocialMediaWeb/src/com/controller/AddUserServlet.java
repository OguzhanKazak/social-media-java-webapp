package com.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDaoImpl;
import com.model.Sex;
import com.model.User;


@WebServlet("/adduser")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserServlet() {
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
		request.setCharacterEncoding( "UTF-8" );
		

		User user = (User) request.getSession().getAttribute("UserSigninData");
		
		
		user.setName(request.getParameter("name"));	
		System.out.println(user.getName());
		
		user.setSurname(request.getParameter("surname"));
		
		Date birthDate = Date.valueOf(request.getParameter("birthdate"));
		user.setBirthDate(birthDate);
		
		String sex = request.getParameter("sex");
		user.setSex(Sex.valueOf(sex));
		
		//add to database
		UserDaoImpl userDao = new UserDaoImpl();
		userDao.addUser(user);
		
		//User created end of session.
		request.getSession().invalidate();
		
		request.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		
	}

}

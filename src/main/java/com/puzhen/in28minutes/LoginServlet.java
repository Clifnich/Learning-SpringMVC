package com.puzhen.in28minutes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	private ValidationService service = new ValidationService();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp")
			.forward(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Hi, login successfully!");
		
		String username = request.getParameter("name");
		String password = request.getParameter("password");
		if (service.validate(username, password))
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		else {
			request.setAttribute("errorMessage", "Wrong Credentials!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
			
	}

}

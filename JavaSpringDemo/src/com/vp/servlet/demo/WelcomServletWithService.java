package com.vp.servlet.demo;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vp.service.demo.WelcomeService;

/**
 * Servlet implementation class WelcomServlet
 */
@WebServlet("/WelcomServletWithService")
public class WelcomServletWithService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomServletWithService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String welcomeMessage[] ={"Hello","Vishal","Welcome","Back"};
		WelcomeService service = new WelcomeService();
		List welcomeMessages=service.getWelcomeMessage("vishal");
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("myWelcomeMessage", welcomeMessages);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcomeWithService.jsp");
		requestDispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


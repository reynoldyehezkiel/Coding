package com.tutorial.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.telusko.web.dao.AlienDAO;
import com.tutorial.web.model.Alien;

/**
 * Servlet implementation class GetAlienController
 */
public class GetAlienController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int aid = Integer.parseInt(request.getParameter("aid"));
		AlienDAO dao = new AlienDAO();
		Alien a = dao.getAlien(aid);
		
		// RequestDispatcher
//		request.setAttribute("alien", a);
//		RequestDispatcher rd = request.getRequestDispatcher("showAlien.jsp");
//		rd.forward(request, response);
		
		// HttpSession
		HttpSession session = request.getSession();
		session.setAttribute("alien", a);
		response.sendRedirect("showAlien.jsp");
		
	}

}

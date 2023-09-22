package com.tutorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		PrintWriter out = res.getWriter();
		
		
		// ServletContext
		out.print("(ServletContext)<br>");
		out.print("Hi ");
		ServletContext ctx = getServletContext();
		String str_ctx = ctx.getInitParameter("name");
		out.println(str_ctx);
		
		out.print("<br>");
		out.print("<br>");
		
		// ServletConfig
		out.print("(ServletConfig)<br>");
		out.print("Hi ");
		ServletConfig cg = getServletConfig();
		String str_cg = cg.getInitParameter("name");
		out.println(str_cg);
		
	}
	
}

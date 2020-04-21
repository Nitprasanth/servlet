package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/searchurl")
public class Searchservlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{  PrintWriter pw=null;
	String ss=null,engine=null,url=null;
	
		//get printwriter 
		pw=response.getWriter();
		response.setContentType("text/html");
		ss=request.getParameter("ss");
		engine=request.getParameter("engine");
		if(engine.equalsIgnoreCase("google"))
			url="https://www.google.com/search?q="+ss;
		else if(engine.equalsIgnoreCase("bing"))
			url="https://www.bing.com/search?q="+ss;
		else if(engine.equalsIgnoreCase("yahoo"))
			url="https://in.search.yahoo.com/search?q="+ss;
		//perform send redirection 
		System.out.println("before res.sendredirect(-) method");
		response.sendRedirect(url);
		System.out.println("after res.sendredirect (-) method");
		
		
		
		
		
		
		
	
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

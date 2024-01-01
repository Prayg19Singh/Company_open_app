package com.jtc5.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="hello", urlPatterns="/formaction2", loadOnStartup=-1)
public class HelloServlet extends HttpServlet{
	public void init(ServletConfig sc) {
		System.out.println("init method inside HelloServlet");	
	}
	public void service(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("service method inside HelloServlet");
	}
	public void destroy() {
		System.out.println("destroy method inside HelloServlet");
	}
}

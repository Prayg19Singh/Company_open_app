package com.jtc5.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="hai", urlPatterns="/formaction1", loadOnStartup=0)
public class HaiServlet extends HttpServlet {
	public void init(ServletConfig sc) {
		System.out.println("init method in HaiServlet");
	}
	public void service(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("service method in HaiServlet");
	}
	public void destroy() {
		System.out.println("destroy method in HaiServlet");
	}
	System.out.println("  I am trying to modidy file 2 Hello ");
}

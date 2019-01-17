package testweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Début doGet");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Bonjour tout le monde</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<BIG>Bonjour tout le monde</BIG>");
		out.println("</BODY></HTML>");
	}
	
}

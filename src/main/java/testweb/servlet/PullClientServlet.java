package testweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PullClientServlet extends HttpServlet {

	private int count = 10;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		if (count > 0) {
			resp.setHeader("Refresh","1");
			count--;
			out.println(count);
		} else {
			out.println("Fin");
		}
	}
}

package testweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BugServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getParameter("echec") != null) {
			req.setAttribute("messageErreur", "Le paramètre echec est détecté");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/error.html");
			requestDispatcher.forward(req, resp);
		}
		else {
			resp.setContentType("text/html");
			resp.getWriter().println("Succes");
		}
	}
}

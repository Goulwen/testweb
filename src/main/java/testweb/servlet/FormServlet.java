package testweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain");

		PrintWriter out = resp.getWriter();
		out.println("Nom : " + req.getParameter("nom"));
		out.println("Prénom : " + req.getParameter("prenom"));
		out.println("Sexe : " + req.getParameter("sexe"));
		out.println("Commantaire : " + req.getParameter("commentaire"));
		
	}
}

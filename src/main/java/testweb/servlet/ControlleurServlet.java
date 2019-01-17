package testweb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import testweb.domaine.Personne;
import testweb.domaine.UsineFaussesPersonnes;

public class ControlleurServlet extends HttpServlet {

	private UsineFaussesPersonnes usine = new UsineFaussesPersonnes();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer nombre = new Integer(req.getParameter("nombre"));
		List<Personne> resultat = usine.genereFaussesPersonnes(nombre);
		req.setAttribute("listePersonnes", resultat);
		
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/afficheListe.jsp");
		requestDispatcher.forward(req, resp);
		
	}
}

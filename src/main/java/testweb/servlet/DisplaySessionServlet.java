package testweb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DisplaySessionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(true);
		String nom = "Inconnu";
		Object aux = session.getAttribute("login");
		if (aux != null) {
			nom = aux.toString();
		}
		resp.setContentType("text/html");
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				if (cookie.getName().equalsIgnoreCase("JSESSIONID")) {
					resp.getWriter().println("Cookie JSESSIONID trouvé : " + cookie.getValue() + "<br>");
				}
			}
		}
		resp.getWriter().println("Session : " + session.getId() + "<br>");
		resp.getWriter().println("Hello " + nom);

	}
}

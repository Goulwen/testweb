package testweb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class OpenSessionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(true);
		session.setAttribute("login", "Dieu");
		resp.setContentType("text/html");
		resp.getWriter().println("Session : " + session.getId() + "<br>");
		String url = getServletContext().getContextPath() + "/displaySession.html";
		String urlEncode = resp.encodeRedirectURL(url);
		resp.getWriter().println("<a href='" + urlEncode + "'>Voir le résultat</a>");
		//resp.sendRedirect(resp.encodeRedirectUrl("page.jsp"));
		
	}
}

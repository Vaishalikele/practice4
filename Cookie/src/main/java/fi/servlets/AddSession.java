package fi.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddSession
 */
@WebServlet("/AddSession")
public class AddSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request.getSession(false);
		HttpSession Session=request.getSession();
		Session.setAttribute("Name", "vaishali");
		Session.setAttribute("Location", "pune");
		Session.setAttribute("Email", "vaishalikele51@gmail.com");
		Session.setMaxInactiveInterval(60);
		response.getWriter().println("Session created");
	}

}

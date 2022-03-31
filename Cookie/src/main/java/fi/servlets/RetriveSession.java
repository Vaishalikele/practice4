package fi.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RetriveSession
 */
@WebServlet("/RetriveSession")
public class RetriveSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetriveSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	HttpSession Session =request.getSession(false);
	PrintWriter out=response.getWriter();
	if(Session==null) {
		out.println("you are not login in or redirect login page");
	}
	else {
		out.println("Id : "+Session.getId()+"</br>");
		out.println("Create time : "+new Date(Session.getCreationTime())+"</br>");
		out.println("Last Access : "+new Date(Session.getLastAccessedTime())+"</br>");
		out.println("Max Inactive Period : "+Session.getMaxInactiveInterval()+"</br>");
		out.println("Attr 1 : "+Session.getAttribute("name")+"</br>");
		out.println("Attr 2 : "+Session.getAttribute("name")+"</br>");
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}

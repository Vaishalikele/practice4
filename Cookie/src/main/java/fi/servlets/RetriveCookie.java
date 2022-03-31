package fi.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RetriveCookie
 */
@WebServlet("/RetriveCookie")
public class RetriveCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		Cookie [] arrCookie = request.getCookies();
		if(arrCookie!=null) {
			for(Cookie objCookie : arrCookie) {
				out.println("Name : "+objCookie.getName() + "</br>");
				out.println("Value : "+objCookie.getValue() + "</br>");
				out.println("Max Age : "+objCookie.getMaxAge() + "</br>");
			}
		}else
			out.println("No cookies available");
	}

}

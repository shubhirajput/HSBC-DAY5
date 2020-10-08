package src.com.hsbc.codefury.errorKnights;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmpLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	 		PrintWriter out = response.getWriter();

	 		String name = request.getParameter("name");
	 		String password = request.getParameter("password");
	 		if (name.equals(password)) {
				response.sendRedirect("/Register_2.jsp");
			} else
				response.sendRedirect("/Register_1.jsp");
				
				
	 			
	 		}
	

}

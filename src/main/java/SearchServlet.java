
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("name");
		PrintWriter out=response.getWriter();
		if(name.equals("HP"))
		{
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		response.sendRedirect("HPDetails");
		}
		
		if(name.equals("LENEVO"))
		{
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		response.sendRedirect("LenevoDetails");
		}
		
		if(name.equals("DELL"))
		{
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		response.sendRedirect("DellDetails");
		}
		else
		{
			out.println("<br/><a href=\"index.html\">Enter correct product name </a>");		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
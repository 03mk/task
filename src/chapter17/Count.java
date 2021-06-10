package chapter17;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tool.Page;

@WebServlet(urlPatterns={"/chapter17/count"})
public class Count extends HttpServlet {

	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Page.header(out);

		HttpSession session=request.getSession();

		Integer count=(Integer)session.getAttribute("count");
		if (count==null) count=0;
		count++;
		session.setAttribute("count", count);

		out.println("<p>"+count+"</p>");
		out.println("<p>"+session.getId()+"</p>");
		Page.footer(out);
	}
}

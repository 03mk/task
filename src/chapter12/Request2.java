package chapter12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

@WebServlet(urlPatterns={"/chapter12/request2"})
public class Request2 extends HttpServlet {

	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Page.header(out);

		out.println("<p>Method<br>"+
		    request.getMethod()+"</p>");
		out.println("<p>Request URI<br>"+
			request.getRequestURI()+"</p>");
		out.println("<p>Context Path<br>"+
		    request.getContextPath()+"</p>");
		out.println("<p>Servlet Path<br>"+
		    request.getServletPath()+"</p>");
		out.println("<p>Query String<br>"+
		    request.getQueryString()+"</p>");
		out.println("<p>Protocol<br>"+
		    request.getProtocol()+"</p>");
		out.println("<p>Request URL<br>"+
			request.getRequestURL()+"</p>");
		out.println("<p>Scheme<br>"+
			request.getScheme()+"</p>");
		out.println("<p>Server Name<br>"+
			request.getServerName()+"</p>");
		out.println("<p>Server Port<br>"+
			request.getServerPort()+"</p>");

		Page.footer(out);
	}
}

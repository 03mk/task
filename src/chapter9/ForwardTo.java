package chapter9;

	import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

	@WebServlet(urlPatterns= {"/chapter9/forward-to"})
	public class ForwardTo extends HttpServlet {

		public void doGet (
			HttpServletRequest request, HttpServletResponse response
		) throws ServletException, IOException {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out=response.getWriter();

			Page.header(out);
			out.println("フォワード先のサーブレットです");
			Page.footer(out);
		}
	}




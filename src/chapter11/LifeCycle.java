package chapter11;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/chapter11/life-cycle"})
public class LifeCycle extends HttpServlet {

	public void init() throws ServletException {
		System.out.println("init");
	}

	public void service(
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		System.out.println("service");
		super.service(request, response);
	}

	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		System.out.println("doGet");
	}

	public void destroy() {
		System.out.println("destroy");
	}
}

package chapter19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

@WebServlet(urlPatterns={"/chapter19/file"})
public class File extends HttpServlet {

	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Page.header(out);

		ServletContext context=getServletContext();
		String path=context.getRealPath("/WEB-INF/setting.txt");

		FileInputStream in=new FileInputStream(path);
		Properties p=new Properties();
		p.load(in);
		in.close();

		for (String key : p.stringPropertyNames()) {
			out.println("<p>"+key+" : "+p.getProperty(key)+"</p>");
		}

		Page.footer(out);
	}
}

package tool;
import java.io.PrintWriter;

public class Page {

	public static void header(PrintWriter out){
	   out.println("<!DOCTYPE html>");
	   out.println("<heml>");
	   out.println("<head>");
	   out.println("<meta charset='UTF-8'>");
	   out.println("<title>Servlet/JSP Sample Programs</title>");
	   out.println("</head>");
	   out.println("<body>");
	}

	public static void footer(PrintWriter out){
	   out.println("</body>");
	   out.println("<html>");
	}


}

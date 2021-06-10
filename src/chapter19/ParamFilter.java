package chapter19;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ParamFilter implements Filter {
	private String message;

	public void init(FilterConfig config) throws ServletException {
		message=config.getInitParameter("message");
	}

	public void doFilter(
		ServletRequest request, ServletResponse response,
		FilterChain chain
	) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		out.println(message);
		chain.doFilter(request, response);
	}

	public void destroy() {}
}

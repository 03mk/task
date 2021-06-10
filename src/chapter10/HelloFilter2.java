package chapter10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloFilter2 implements Filter {

	public void doFilter(
		ServletRequest request, ServletResponse response,
		FilterChain chain
	) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		out.println("[HelloFilter2(pre)]");
		chain.doFilter(request, response);
		out.println("[HelloFilter2(post)]");
	}

	public void init(FilterConfig config) {}
	public void destroy() {}
}

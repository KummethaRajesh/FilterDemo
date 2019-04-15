import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;


@WebFilter("/home")
public class MyFilter implements Filter {
	
	public void init(FilterConfig config) {}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		arg1.setContentType("text/html");
		PrintWriter out=arg1.getWriter();
		out.print(" First filter before doFilter method<br/>");
		
		arg2.doFilter(arg0, arg1);
		
		out.print("First filter after doFilter method<br/>");
	}
	
	public void destroy() {
		
	}

}

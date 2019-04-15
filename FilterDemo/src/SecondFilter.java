import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

@WebFilter("/home")
public class SecondFilter implements Filter {

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub

		arg1.setContentType("text/html");
		PrintWriter out=arg1.getWriter();
		out.print(" Second filter before doFilter method<br/>");
		
		arg2.doFilter(arg0, arg1);
		
		out.print("Second filter after doFilter method<br/>");
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}

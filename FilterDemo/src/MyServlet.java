import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebServlet("/home")
public class MyServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("I am servlet<br/>");
		
		out.write("1o times of 10");
		
		out.print("I am new update");
	}
}

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DemoServlet extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException

/*	

public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException

public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
*/
{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<html><body>");
	out.println("I redirect to demoservlet1");
	out.println("</body></html>");
	}
}
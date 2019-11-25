import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class GreetingServlet extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		Date date = new Date();
		int hours=date.getHours();
		String msg="";
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("NAME");
		out.println("<html>");
		if(hours<12)
		{
		out.println("<body background=1.jpg text=white>");
		msg="morning";
		}
		else if(hours>=12 && hours<16)
		{
		out.println("<body background=2.jpg text=blue>");
		msg="afternoon";
		}
		else if(hours>=16 && hours<=23)
		{
		out.println("<body background=3.jpg text=white>");
		msg="evening";
		}
		out.println("<center><h2><font face='Segoe Print'>Hello Mr./Miss/Mrs."+name+"<br><br>");
		out.println("Hari Priya wishes you a very good "+msg+"</h2>");
		out.println("</font></center></body></html>");
		out.close();
	}
}

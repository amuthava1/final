import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Disp1 extends HttpServlet

{

    /**
     *
     * @param req
     * @param res
     * @throws ServletException
     * @throws IOException
     */
    @Override
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException

{

res.setContentType("text/html");

PrintWriter out=res.getWriter();

out.println("welcome to day planner");

out.println("click <a href=options.html>Here</a> to proceed");
//out.print("<a href='" + getServletContext().getContextPath() + "/options1.html'>1.Add New Employee</a>");

}
}
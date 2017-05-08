import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class login1 extends HttpServlet

{

    /**
     *
     * @param req
     * @param res
     * @throws ServletException
     * @throws IOException
     */
//public void doPost(HttpServletResponse res, HttpServletRequest req) throws ServletException, IOException 
//{ 
//doGet(req,res); 
//} 
    @Override
public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException

{

res.setContentType("text/html");

PrintWriter out=res.getWriter();

String s1=req.getParameter("uname");

String s2=req.getParameter("pass");

if(s1.equals("admin") && s2.equals("admin"))

{

RequestDispatcher rd=req.getRequestDispatcher("Disp1");

out.println("this from ex page");

 rd.forward(req,res);

}else

out.println("login failed");

}
}
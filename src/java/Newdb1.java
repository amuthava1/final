import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
19
* Servlet implementation class Register
20
*/
public class Newdb1 extends HttpServlet
{

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
 
response.setContentType("text/html");
PrintWriter ou= response.getWriter();
String d = request.getParameter("dateofappointment");
String t = request.getParameter("timeslot");
String m = request.getParameter("message");
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306","root","password");
Statement ps = (Statement) con.createStatement();
ps.executeUpdate("insert into dayplanner.dayplannerr(dateofappointment,timeslot,message) values('"+d+"','"+t+"','"+m+"')");
System.out.println("Inserted");
ou.println("event created");
}
catch(ClassNotFoundException | SQLException e1)
{
System.out.println(e1);
}
}
}


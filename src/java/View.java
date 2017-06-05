/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RAHUL
 */
public class View extends HttpServlet 
{
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
{
    
    //PrintWriter out=res.getWriter();
 
  String uid=req.getParameter("n1");

  
  PrintWriter out=res.getWriter();
 try{  
     
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rahul");  
                               
PreparedStatement ps=con.prepareStatement("select * from BOOK where mail=?");  
ps.setString(1,uid);
 ResultSet rs=ps.executeQuery();
   String result="";
    if(rs.next())
      {
          
 String nm=rs.getString(1);
        String cin=rs.getString(2);
        String cout=rs.getString(3);
        String nor=rs.getString(4);
        String noa=rs.getString(5);
        String noc=rs.getString(6);
        String mob=rs.getString(7);
        String rt=rs.getString(8);
        
       // result+="<tr><td>"+nam+"</td><td>"+mail+"</td><td>"+mob+"</td><td>"+doa+"</td><td>"+sym+"</td></tr>";
        result="\n" +
"<html><!DOCTYPE html>\n" +
"<head>\n" +
                
                
                
                
"	<!-- templatemo 419 black white -->\n" +
"    <!-- \n" +
"    Black White\n" +
"    http://www.templatemo.com/preview/templatemo_419_black_white\n" +
"    -->\n" +
"	<title>THE LEELA PALACE HOTEL</title>\n" +
"	<meta name=\"keywords\" content=\"\" />\n" +
"	<meta name=\"description\" content=\"\" />\n" +
"	<meta charset=\"UTF-8\">\n" +
"	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"	<link href=\"http://fonts.googleapis.com/css?family=Open+Sans:300,400,700\" rel=\"stylesheet\" type=\"text/css\">\n" +
"	<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
"	<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
"	<link href=\"css/templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\">	\n" +
"</head>\n" +
"<body>\n" +
"	<div class=\"templatemo-logo visible-xs-block\">\n" +
"		<div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12 black-bg logo-left-container\">\n" +
"			<h1 class=\"logo-left\">THE LEELA</h1>\n" +
"		</div>\n" +
"		<div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12 white-bg logo-right-container\">\n" +
"			<h1 class=\"logo-right\">PALACE</h1>\n" +
"		</div>			\n" +
"	</div>\n" +
"	<div class=\"templatemo-container\">\n" +
"		<div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12 black-bg left-container\">\n" +
"			<h1 class=\"logo-left hidden-xs margin-bottom-60\">THE LEELA</h1>	\n" +
"			<div class=\"tm-left-inner-container\">\n" +
"				<ul class=\"nav nav-stacked templatemo-nav\">\n" +
"				  <li><a href=\"index.html\"><i class=\"fa fa-home fa-medium\"></i>Homepage</a></li>\n" +
"				  <li><a href=\"products.html\"><i class=\"fa fa-shopping-cart fa-medium\"></i>Room Types</a></li>\n" +
"				  <li><a href=\"services.html\"><i class=\"fa fa-send-o fa-medium\"></i>Services</a></li>\n" +
"				  <li><a href=\"testimonials.html\" class=\"active\"><i class=\"fa fa-comments-o fa-medium\"></i>View and Modify</a></li>\n" +
"                     <li><a href=\"booking.html\"><i class=\"fa fa-shopping-cart fa-medium\"></i>Check booking</a></li>\n" +
"				  <li><a href=\"about.html\"><i class=\"fa fa-gears fa-medium\"></i>About Us</a></li>\n" +
"				  <li><a href=\"contact.html\"><i class=\"fa fa-envelope-o fa-medium\"></i>Contact</a></li>\n" +
"				</ul>\n" +
"			</div>\n" +
"		</div> <!-- left section -->\n" +
"		<div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12 white-bg right-container\">\n" +
"			<h1 class=\"logo-right hidden-xs margin-bottom-60\">PALACE</h1>\n" +
"			<div class=\"tm-right-inner-container\">\n" +
"				<h1 class=\"templatemo-header\"></h1>\n" +
"				<div class=\"templatemo-item templatemo-testimonial\">\n" +
"				\n" +
"                    \n" +
"                            \n" +
"                            <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12 white-bg right-container\">\n" +
"			<h1 class=\"logo-right hidden-xs margin-bottom-60\">Your   Booking Details</h1>\n" +
"                            \n" +
"                    </div>					    	<br>\n" +
"                            \n" +
"                            <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12 white-bg right-container\">\n" +
"			<h1 class=\"logo-right hidden-xs margin-bottom-60\">Update Details</h1>\n" +
"                            \n" +
"                    </div>					    	\n" +
"                    <div class=\"templatemo-border-left\">           \n" +
"                        \n" +
"						<form name=\"booking\" method=\"post\" action=\"Update\" >\n" +
"                            Name &nbsp; &nbsp;  &nbsp;  &nbsp; &nbsp;  &nbsp;  &nbsp;   <input type=\"text\" name=\"n1\" value="+nm+" placeholder=\"Name\" required><input type=\"text\" name=\"uid\" value="+uid+" hidden>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;   mobile number  &nbsp;  &nbsp;  &nbsp;<input type=\"text\" name=\"n7\" value="+mob+" placeholder=\"mobile number\" required> <br> <br>  \n" +
"                           Check In Date <input type=\"date\" name=\"n2\" value="+cin+" required> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;    \n" +
"                           Check Out Date &nbsp; &nbsp;  <input type=\"date\" name=\"n3\" value="+cout+" required><br> <br> \n" +
"                            No. of Rooms &nbsp;<input type=\"number\" name=\"n4\" value="+nor+" placeholder=\"number of rooms\" required> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;     \n" +
"                              Adult Rooms&nbsp; &nbsp;  &nbsp; &nbsp; <input type=\"number\" name=\"n5\" value="+noa+" placeholder=\"Adult rooms\" required><br> <br> <br>\n" +
"                              Child Rooms &nbsp; &nbsp;<input type=\"number\" name=\"n6\" value="+noc+" placeholder=\"Children rooms\" required>\n" +
"                             &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  Room Type:&nbsp; &nbsp;<select name=\"select\" value="+rt+">\n" +
"  <option value=\"honeymoon room\">Honeymoon Room</option> \n" +
"  <option value=\"sea facing room\">Sea Facing Room </option>\n" +
"  <option value=\"Fully Furnished Room\">Fully Furnished Room</option>\n" +
"<option value=\"children Room\">Children Room Room</option>\n" +
"</select>\n" +
"      \n" +
"                            <br> <br> <br>\n" +
"                            \n" +
"                            \n" +
"                                         <button type=\"submit\" class=\"btn btn-warning\">Update Details</button>\n" +
"                            </form>					\n" +
"				</div>\n" +
"			<footer>\n" +
"					<p class=\"col-lg-6 col-md-6 col-sm-12 col-xs-12 templatemo-copyright\">Designed and developed by <i><u>Anish Chittora</u></i>  </p>\n" +
"					<p class=\"col-lg-6 col-md-6 col-sm-12 col-xs-12 templatemo-social\">\n" +
"						<a href=\"#\"><i class=\"fa fa-facebook fa-medium\"></i></a>\n" +
"						<a href=\"#\"><i class=\"fa fa-twitter fa-medium\"></i></a>\n" +
"						<a href=\"#\"><i class=\"fa fa-google-plus fa-medium\"></i></a>\n" +
"						<a href=\"#\"><i class=\"fa fa-youtube fa-medium\"></i></a>\n" +
"						<a href=\"#\"><i class=\"fa fa-linkedin fa-medium\"></i></a>\n" +
"					</p>\n" +
"				</footer>\n" +
"			</div>	\n" +
"		</div> <!-- right section -->\n" +
"	</div>	\n" +
"</body>\n" +
"</html>";
         result+="</table></body></html>";
   out.println(result);

    }
    else
    {
      res.setStatus(res.SC_MOVED_TEMPORARILY);  
    res.setHeader("location", "testimonials.html");   
    }
   // JOptionPane.showMessageDialog(null,"You are  registered now !");

    }catch(Exception e){} 
 
}}




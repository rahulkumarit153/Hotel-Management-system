/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RAHUL
 */
public class Update extends HttpServlet 
{
 public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
{
  String name=req.getParameter("n1");
  String cin=req.getParameter("n2");
  String cout=req.getParameter("n3");
  String nor=req.getParameter("n4");
  String noa=req.getParameter("n5");
  String noc=req.getParameter("n6");
  String rt=req.getParameter("select");
  String mob=req.getParameter("n7");
  String mail=req.getParameter("uid");
  
 
  
  PrintWriter out=res.getWriter();
 // out.println(name+uid+pwd+mob+gen+dob);
 try{  
     
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rahul");  
                                
PreparedStatement ps=con.prepareStatement("Update BOOK SET name=?,cin=?,cout=?,nor=?,noa=? ,noc=? ,mob=? ,rt=? where mail=? ");  
  
ps.setString(1,name);  
ps.setString(2,cin);  
ps.setString(3,cout);
ps.setString(4,nor);
ps.setString(5,noa);
ps.setString(6,noc);
ps.setString(7,mob);  
ps.setString(8,rt);  
ps.setString(9,mail);    


          
int i=ps.executeUpdate();  
if(i>0)
{
    
     res.setStatus(res.SC_MOVED_TEMPORARILY);  
    res.setHeader("location", "testimonials.html");
   // JOptionPane.showMessageDialog(null,"You are  registered now !");
}

 else
{
out.println("no");
}  
          
}catch (Exception e2) {System.out.println(e2);}  
  
}
   
}
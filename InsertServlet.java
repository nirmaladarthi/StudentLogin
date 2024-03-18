

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import c.StudentBean;

/**
 * Servlet implementation class for Servlet: InsertServlet
 *
 */
 public class InsertServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public InsertServlet() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Name=request.getParameter("Name");
		String Age=request.getParameter("Age");
		String Email=request.getParameter("Email");
		String Phonenumber=request.getParameter("Phonenumber");
		String Dateofjoin=request.getParameter("Dateofjoin");
		
		StudentBean sb=new StudentBean();
		sb.setName(Name);
		sb.setAge(Age);
		sb.setEmail(Email);
		sb.setPhonenumber(Phonenumber);
		sb.setDateofjoin(Dateofjoin);
		
		InsertAction a=new InsertAction();
		boolean status=a.InsertDetails(sb);
		if(status){
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/Studentaddedsuccess.jsp");
		    rd.forward(request,response);
		}else{
			response.sendRedirect("InsertNewStudent.jsp");
		}
	}  	  	  	    
}
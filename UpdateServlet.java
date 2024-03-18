

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import c.StudentBean;

/**
 * Servlet implementation class for Servlet: UpdateServlet
 *
 */
 public class UpdateServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public UpdateServlet() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("username");
		String age = request.getParameter("userage");
		String email = request.getParameter("useremail");
		String phonenumber = request.getParameter("userno");
		String dateofjoin = request.getParameter("userdoj");
		
		StudentBean rb=new StudentBean();
		rb.setName(name);
		rb.setAge(age);
		rb.setEmail(email);
		rb.setPhonenumber(phonenumber);
		rb.setDateofjoin(dateofjoin);
		
		UpdateAction ra=new UpdateAction();
		boolean status = ra.StudenttDetail(rb);
		
		if(status){
			//forward()
			RequestDispatcher r=getServletContext().getRequestDispatcher("/Fetchallstudent.jsp");
			r.forward(request,response);
		}
		else{
			//sendRedirect()
			response.sendRedirect("updateform.jsp");
		}
	}  	  	  	    
}
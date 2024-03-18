

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import c.StudentBean;

/**
 * Servlet implementation class for Servlet: FetchServlet
 *
 */
 public class FetchServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public FetchServlet() {
    super();
	}   	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name =request.getParameter("name");
		FetchAction fa=new FetchAction();
		boolean status=fa.FetchAction(name);
		String a1=fa.a;
		String a2=fa.b;
		String a3=fa.c;
		String a4=fa.d;
		String a5=fa.e;
		request.setAttribute("at1", a1);
		request.setAttribute("at2", a2);
		request.setAttribute("at3", a3);
		request.setAttribute("at4", a4);
		request.setAttribute("at5", a5);
		if(status){
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/Fetchstudentsuccess.jsp");
			rd.forward(request,response);
		}else{
			response.sendRedirect("Fetchstudentunsuccess.jsp");
		}
	}  	  	  	    
}
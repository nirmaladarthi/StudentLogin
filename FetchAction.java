import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import c.StudentBean;


public class FetchAction {
	String a;
	String b;
	String c;
	String d;
	String e;
	public boolean FetchAction(String username){
		boolean status=false;
		Connection con=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Mini","Mini123");
		    Statement s=con.createStatement();
			ResultSet r=s.executeQuery("select *from details1 where name='"+username+"'");
		while(r.next()){
			status=true;
			a=r.getString("name");
			b=r.getString("age");
			c=r.getString("email");
			d=r.getString("phonenumber");
			e=r.getString("doj");
		}
		  }
		catch(Exception e){
			e.printStackTrace();
	}
	return status;
	}
}

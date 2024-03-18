import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import c.StudentBean;


public class UpdateAction {
	public boolean StudenttDetail(StudentBean b){
		boolean status=false;
		String name = b.getName();
		String age = b.getAge();
		String email = b.getEmail();
		String phonenumber = b.getPhonenumber();
		String dateofjoin = b.getDateofjoin();
		Connection con=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Mini","Mini123");
		Statement s=con.createStatement();
			int i=s.executeUpdate("update details1 SET name='"+name+"',age='"+age+"',email='"+email+"',phonenumber='"+phonenumber+"',doj='"+dateofjoin+"' where name='"+name+"'");
			if(i>0){
				status=true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return status;
	}
}

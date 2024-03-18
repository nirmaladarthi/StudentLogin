import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import c.StudentBean;


public class InsertAction {
 public boolean InsertDetails(StudentBean b){
	boolean status=false;
	String Name=b.getName();
	String Age=b.getAge();
	String Email=b.getEmail();
	String Phonenumber=b.getPhonenumber();
	String Dateofjoin=b.getDateofjoin();
	Connection con=null;
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}catch(Exception e){
		e.printStackTrace();
	}
	try{
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Mini","Mini123");
	    Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from details1 where name='"+Name+"' and age='"+Age+"'");
	if(rs.next()){
		status=false;
	}else{
		int i=st.executeUpdate("insert into details1(name,age,email,phonenumber,doj) values('"+Name+"','"+Age+"','"+Email+"','"+Phonenumber+"','"+Dateofjoin+"')");
	  if(i>0){
		status=true;
	  }
	 }
	}catch(Exception e){
		e.printStackTrace();
}
return status;
}


}

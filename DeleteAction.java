import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DeleteAction {
	public boolean DeleteData(String name) {
		// TODO Auto-generated method stub
		boolean status= false;
		Connection con=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Mini","Mini123");
			Statement st=con.createStatement();
			int i=st.executeUpdate ("delete  from details1 where name='"+name+"'");
			if(i>0){
				status=true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return status;
	}
		
	}


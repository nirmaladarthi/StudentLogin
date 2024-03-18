<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table cellpadding=20px cellspacing=0 border=5 align="center"><tr>
<th><b>Name</b></th>
<th><b>Age</b></th>
<th><b>E-mail</b></th>
<th><b>Phone Number</b></th>
<th><b>Date Of Join</b></th>
<th colspan=2><b>Action</b></th>
</tr>
<%
Connection con=null;
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Mini","Mini123");
Statement s=con.createStatement();
ResultSet rt=s.executeQuery("select *from details1");
while(rt.next()){
%>
<tr>
<td><%=rt.getString("name") %></td>
<td><%=rt.getString("age") %></td>
<td><%=rt.getString("email") %></td>
<td><%=rt.getString("phonenumber") %></td>
<td><%=rt.getString("doj") %></td>
<td><a href="updateform.jsp?ssname=<%=rt.getString("name")%>&sage=<%=rt.getString("age") %>&semail=<%=rt.getString("email")%>&sphonenumber=<%=rt.getString("phonenumber") %>&sdoj=<%=rt.getString("doj")%>">update</a></td>
<td><a href="DeleteServlet?dname=<%=rt.getString("name") %> ">delete</a></td>
</tr>
<% }
}catch(Exception e){
}
%>
</table><br>
<b>Go to main page</b><a href="index.jsp">click here</a><br><br>
<b>Do you want to insert a new record </b><a href="InsertNewStudent.jsp">Insert here</a>
</body>
</html>
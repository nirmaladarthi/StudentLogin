<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UpdateServlet" method="get">
<h1>Update student</h1><br>
<h2>student Form</h2>

Name:<input type="text" name="username" value="<%=request.getParameter("ssname") %>"/><br>
Age:<input type="text" name="userage" value="<%=request.getParameter("sage")%>"/><br>
E-mail:<input type="text"name="useremail" value="<%=request.getParameter("semail")%>" /><br>
phone number:<input type="text" name="userno" value="<%=request.getParameter("sphonenumber")%>"/><br>
Date of Join:<input type="text" name="userdoj" value="<%=request.getParameter("sdoj")%>"/><br>

<input type="submit" value="Update student">
</form> 

</body>
</html>
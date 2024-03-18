<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
function AddStudent(){
window.location.href="InsertNewStudent.jsp";
}
function UpdateDetails(){
window.location.href="updateform.jsp";
}
function FetchStudent(){
window.location.href="FetchStudent.jsp";
}
function FetchAllStudent(){
window.location.href="Fetchallstudent.jsp";
}
</script>
<body>
<center>
<table bordercolor="black" border="5" cellspacing="0px" cellpadding="10px" style="width:150px;padding:3px">
<tr><td><input type="submit" value="Add Student" Onclick="AddStudent()"/><br></td></tr>
<tr><td><input type="submit" value="Update Details" Onclick="UpdateDetails()"/><br></td></tr>
<tr><td><input type="submit" value="Fetch Student" Onclick="FetchStudent()"/><br></td></tr>
<tr><td><input type="submit" value="Fetch All Students" Onclick="FetchAllStudent()"/><br></td></tr>
</table>
</center>
</body>
</html>
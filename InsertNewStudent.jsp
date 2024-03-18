<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
function nullcheck(){
var Name=document.InsertNewStudent.Name.value;
var Email=document.InsertNewStudent.Email.value;
var Age=document.InsertNewStudent.Age.value;
var Phonenumber=document.InsertNewStudent.Phonenumber.value;
var Dateofjoin=document.InsertNewStudent.Dateofjoin.value;
	if(Name==null||Name==""){
	alert("Name can't be blank");
	return false;
	}
		else if(Email==null||Email==""){
		alert("Email can't be blank");
		return false;
		}
else if(Age==null||Age==""){
		alert("Age can't be blank");
		return false;
		}
		else if(Phonenumber==null||Phonenumber==""){
		alert("Phonenumber can't be blank");
		return false;
		}
		else if(Phonenumber.length!=10){
		alert("Phonenumber number must in 10 digit");
		return false;
		}
else if(Dateofjoin==null||Dateofjoin==""){
		alert("Dateofjoin can't be blank");
		return false;
		}	
}
function validate(obj,event){
var inp=obj.name;
if(inp=="Name"){
var k=event.keyCode;
if((k>33&&k<=64)||(k>=91&&k<=96)){
	alert("Numbers and special charecter not allow");
	return false;
}
}
	else if(inp=="Phonenumber"){
	var k=event.keyCode;
	if(k>31&&(k<48||k>57)){
	alert("alpha and special charecter not allow");
	return false;
}
}
else if(inp=="Age"){
var k=event.keyCode;
	if(k>31&&(k<48||k>57)){
	alert("alpha and special charecter not allow");
	return false;
	}
}
}
function validateEmail(){
var x=document.InsertNewStudent.Email.value;
var atposition=x.indexOf("@");
var dotposition=x.lastIndexOf(".");
if(atposition<3||dotposition<atposition+2||dotposition+2>=x.length){
alert("Please enter valid email");
return false;
}
}      
function date(){
var date=document.InsertNewStudent.Dateofjoin.value;
var dateformat= /^(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])-(\d{4})$/;
if (!date.match(dateformat)){
alert("Enter valid date");
return false;
}
}
function validatesubmit(){
var retvalue;
retvalue=nullcheck();
if(retvalue==false){return retvalue;}
retvalue=validateEmail();
if(retvalue==false){return retvalue;}
retvalue=date();
if(retvalue==false){return retvalue;}
}
</script>
</head>
<body>
<table align="center">
<form action="InsertServlet" name="InsertNewStudent">
Name:<input type="text" name="Name" onkeypress="return validate(this,event)"/><br>
Age:<input type="text" name="Age" maxlength="2" onkeypress="return validate(this,event)"/><br>
Email:<input type="text" name="Email" onkeypress="return validate(this,event)"/><br>
Phonenumber:<input type="text" name="Phonenumber" maxlength="10" onkeypress="return validate(this,event)"/><br>
Dateofjoin:<input type="text" value="MM-DD-YYYY" name="Dateofjoin" onkeypress="return validate(this,event)"/><br>
<input type="submit" value="Addstudent" onclick="return validatesubmit()"/><br>
</form>
</table>
</body>
</html>
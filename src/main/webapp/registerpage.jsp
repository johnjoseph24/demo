<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2 style="color: red">Registration Form</h2>
   <form:form action="submitform" modelAttribute="ass">
				<table>
				
				<tr>
					<td>Associate Name :</td>
					<td><form:input path="associatename"/></td>
				</tr>
				<tr>
					<td>Associate ID :</td>
					<td><form:input path="associateid"/></td>
				</tr>

			
				<tr>
					<td>Associate Email :</td>
					<td><form:input path="associateemail"/></td>
				</tr>
			
					<td>Associate Address :</td>
					<td><form:input path="associateaddress"/></td>
				</tr>
				</tr>
			
					<td>Associate Age :</td>
					<td><form:input path="associateage"/></td>
				</tr>
				</tr>
			
					<td>Associate phone :</td>
					<td><form:input path="associatephone"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="Register"></td>
					<td><input type="reset" value="Clear"></td>
				</tr>
			</table>
		</form:form>
</body>
</html>
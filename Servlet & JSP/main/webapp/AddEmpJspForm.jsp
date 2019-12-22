<%@page import="com.capgemini.mywebapp.bean.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session ="false" %>
     <% EmployeeInfoBean  employeeInfoBean = (EmployeeInfoBean)request.getAttribute("employeeInfoBean"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend> Add Employee</legend>
		<form action="./addEmployee1" method="post">
			<table>
				<tr>
					<td>Employee Id</td>
					<td>:</td>
					<td><input type="number" name="empId" required></td>
				</tr>
				<tr>
					<td>Employee Name</td>
					<td>:</td>
					<td><input type="text" name="name" required></td>
				</tr>
				<tr>
					<td>Age</td>
					<td>:</td>
					<td><input type="number" name="age" required></td>
				</tr>
				<tr>
					<td>Salary</td>
					<td>:</td>
					<td><input type="number" name="salary" required></td>
				</tr>
				<tr>
					<td>Designation</td>
					<td>:</td>
					<td><input type="text" name="designation" required></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="password" required></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><br> 
					<input type="submit" value="add">
					</td>
				</tr>
			</table>
		</form>
	</fieldset>
	
	<br><br>
	<% if(employeeInfoBean==null){ %>
	<h3 style ="color:red;">Unable to add employee</h3>
	<%} else{%>
	<h3 style ="color:green;">Employee added successfully </h3>
	<%} %>
</body>
</html>
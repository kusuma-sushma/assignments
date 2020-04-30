<%@page import="com.capg.springassign.bean.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) request.getAttribute("employeeInfo");
    String errMsg=(String) request.getAttribute("errMsg");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Employee Form</title>
</head>
<body>
	<fieldset>
	<legend>Search Employee By Id</legend>
	<form action="" method="get">
	<label>Employee ID: </label>
	<input type="number" name="empId" required> <br>
	<br>
	<input type="submit" value="Search">
	
	</form>
	</fieldset>
	
	<% if (errMsg != null && !errMsg.isEmpty()) { %>
	<h3 style="color :red;"><%=errMsg %></h3>
	<%} %>
	<% if (employeeInfoBean!=null) { %>
	<div align="center">
	<table>
	<tr>
	<th>Emp Id</th>
	<th>Name</th>
	<th>Age</th>
	<th>Salary</th>
	</tr>
	<tr>
	<td><%=employeeInfoBean.getEmpId() %></td>
	<td><%=employeeInfoBean.getName() %></td>
	<td><%=employeeInfoBean.getAge() %></td>
	<td><%=employeeInfoBean.getSalary() %></td>
	
	</tr>
	</table>
	</div>
	<%} %>
	
</body>
</html>
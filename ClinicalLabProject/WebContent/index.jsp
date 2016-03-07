<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>

<body>

<%@ include file="header.jsp" %>
<hr>
<%@ include file="header1.jsp" %>

<form method="post" action="ValidateUser.jsp">
	<table border="1" >
		<tr>
			<td><label>Role</label></td>
			<td>
				<select name="role">
					<option value="Administrator">Administrator</option>
					<option value="Manager">Manager</option>
					<option value="Lab Technician">Lab Technician</option>
					<option value="Operator">Operator</option>
				</select>
			</td>
		</tr>
		
		<tr>
			<td><label>Lab Code</label>
			<td>
				<datalist id="json-datalist"></datalist>
				<input type="text" id="ajaxList" list="json-datalist" name="labcode">
			</td>
		</tr>
		
		<tr>
		<td><label>Username</label></td>
		<td><input type="text" id="uname"></td>
		</tr>
		
		<tr>
		<td><label>Password</label></td>
		<td><input type="text" id="password"></td>
		</tr>
		
		<tr>
		<td colspan="2"><input type="submit" value="login">
		</tr>
		
	
	
	
	</table>


</form>

<hr>
<%@ include file="footer.jsp" %>




</body>
<script type="text/javascript" src="Scripts/labjs.js"></script>
</html>
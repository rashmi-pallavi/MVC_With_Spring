<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="css/text" href="css/Style.css" rel="Stylesheet">
<title>Validate User</title>
</head>
<body>

<%@ include file="header.jsp" %>
<hr>
<%@ include file="header2.jsp" %>

<div id="lcode">
<%
	String labcode=request.getParameter("labcode");
	out.print("Lab Code:" + labcode);
%>

</div>

<form>

	<table border="1" id="tab2">
		<tr>
			<td><label>Order Number</label></td>
			<td><input type="text" name="orderNo">
			
			<td><label>Collection Date</label></td>
			<td><input type="date" name="cdate">
			
			<td><label>Collection Type</label></td>
			<td>
				<input type="radio" name="ctype" value="lab"><label>Lab</label>
				<input type="radio" name="ctype" value="home"><label>Home</label>
			</td>
			
		</tr>	
		
		<tr>
			<td><label>Patient Code</label></td>
			<td>
			<input type="text" id="pcode"  name="pcode" onkeyup="showValues()">
		
			<td><label>Patient Name</label></td>
			<td><input type="text" id="pname">
			
			<td><label>Age</label></td>
			<td><input type="text" id="age">
			</tr>
		
		<tr>
			<td><label>HandPhone</label></td>
			<td><input type="text" id="hphone">
			
			<td><label>Email</label></td>
			<td><input type="text" id="email">
			
			<td><label>Gender</label></td>
			<td>
				<input type="radio" name="ctype" value="male"><label>Male</label>
				<input type="radio" name="ctype" value="female"><label>Female</label>
			</td>
			
		</tr>
		
		<tr>
		
			<td><label>Doctor Code</label></td>
			<td><input type="text" id="dcode" onkeyup="dshowValues()">
		
			<td colspan="2"><label>Doctor Name</label></td>
			<td colspan="2"><input type="text" id="dname">
			
		</tr>	


	</table>
	
	
	<table>
	<tr>
		<td id="tcode"><th>Test Code</th>
		<td id="tname"><th>Test Name</th>
		<td id="amt"><th>Amount</th>
	</tr>
	
	<tr>
		<td>
		<datalist id="json-datalist"></datalist>
		<input type="text"> 
	</tr>
		
	</table>

</form>

</body>

<script type="text/javascript" src="Scripts/patient.js"></script>
<script type="text/javascript" src="Scripts/doctor.js"></script>
</html>
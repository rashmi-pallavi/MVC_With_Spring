<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<b>One Car with following details added</b>

<ol>
	<li>${carObj.name}</li>
	<li>${carObj.mobileNumber}</li>
	<li>${carObj.email}</li>
	<li>${carObj.type}</li>
</ol>

<section>
<form action="cust/check">

Please enter your name again

<input type="text" name="userName">

<input type="submit" value="search">

</form>

<p>Previous Bookings</p>

${prevBooking}
</section>

</body>
</html>
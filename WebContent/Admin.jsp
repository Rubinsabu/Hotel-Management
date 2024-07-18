<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel='stylesheet' type='text/css' media='screen'
	href='css/adminstyle.css'>
<style type="text/css">
.a {
	background-image: url(images/customer1.jpg);
	background-size: cover;
}

.b {
	background-image: url(images/staff1.jpg);
	background-size: cover;
}
</style>
</head>
<body>
	<div>
		<a href="Index.jsp"> <input type="button" value="Home"
			style="background: #8e44ad; width: 150px; border-radius: 10px; padding: 10px;">
		</a> <a href="login.jsp"> <input type="button" value="log out"
			style="background: #8e44ad; width: 150px; border-radius: 10px; padding: 10px;">
		</a>
	</div>
	<div class="a">
		<br><br><br><br><br><br><br><br><br><br><br>
		<div class="buttons">
			<form action="CustomerDetailsDisplay" method="get">
				<input type="submit" value="Customer" class="cust-btn">

			</form>
		</div>
	</div>
	<div class="b">
		<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
		<div class="buttons">
			<form action="StaffdetailsDisplay" method="get">

				<input type="submit" value="Staff" class="staff-btn">

			</form>
		</div>
	</div>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/loginstyle.css">

</head>
<body>

<div >
		<a href="Index.jsp">
    	<input  type ="button" value="Back" style="margin-left:10px;margin-top:10px ;background: #8e44ad ;width: 150px;border-radius: 10px;padding:10px;">
    	</a>
</div>
	<div class="center">
      <h1>Login</h1>
      <form action="EmployeeValidationServlet" method="get">
        <div class="txt_field">
          <input name="EmployeeName" type="text" required>
          <span></span>
          <label>Username</label>
        </div>
        <div class="txt_field">
          <input name="EmployeePass" type="password" required>
          <span></span>
          <label>Password</label>
        </div>
        <a href="signup.jsp">
        <input class="login" type="submit" value="Login" >
        </a>
      </form>
    </div>
</body>
</html>
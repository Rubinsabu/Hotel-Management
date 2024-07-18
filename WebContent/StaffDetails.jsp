<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee Details</title>

<link rel="stylesheet" href="css/signupstyle.css">
<style type="text/css">

</style>
</head>
<body>
<div  class="back">
		<a href="Index.jsp">
    	<input  type ="button" value="Home" style="background: #8e44ad ;width: 150px;border-radius: 10px;padding:10px;">
    	</a>
		<a href="StaffdetailsDisplay">
    	<input  type ="button" value="Back" style="background: #8e44ad ;width: 150px;border-radius: 10px;padding:10px;">
    	</a>
</div>


	<!-- Body of Form starts -->
  	<div class="container">
      <form action="AddStaffDetails" method="get" autocomplete="on">
        <!--First name-->
    		<div class="box">
          <label for="firstName" class="fl fontLabel"> Employee Id: </label>
    		
    			<div class="fr">
    					<input type="text" name="employeeid" placeholder="Employee Id"
              class="textBox" autofocus="on" required>
    			</div>
    			<div class="clr"></div>
    		</div>
    		<!--First name-->


        <!--Second name-->
    		<div class="box">
          <label for="secondName" class="fl fontLabel"> Employee Name: </label>
    			<div class="fr">
    					<input type="text" required name="employeename" placeholder="Employee Name" class="textBox">
    			</div>
    			<div class="clr"></div>
    		</div>
    		<!--Second name-->


    		<!---Phone No.------>
    		<div class="box">
          <label for="phone" class="fl fontLabel"> Password: </label>
    			<div class="fr">
    					<input type="Password" required name="password" maxlength="10" placeholder="Password" class="textBox">
    			</div>
    			<div class="clr"></div>
    		</div>
    		<!---Phone No.---->


    		<!---Email ID---->
    		<div class="box">
          <label for="email" class="fl fontLabel"> Designation: </label>
    			<div class="fr">
    					<input type="txt" required name="emptype" placeholder="Designation" class="textBox">
    			</div>
    			<div class="clr"></div>
    		</div>
    		<!--Email ID----->


    		<!---Password------>
    		<div class="box">
          <label for="password" class="fl fontLabel"> Salary </label>
    			<div class="fr">
    					<input type="text" required name="salary" placeholder="Salary" class="textBox">
    			</div>
    			<div class="clr"></div>
    		</div>
    		<!---Password---->

    		<!---Submit Button------>
    		<div class="box" style="background: #2d3e3f">
    				<input type="Submit" name="Submit" class="submit" value="SUBMIT">
    		</div>
    		<!---Submit Button----->
      </form>
  </div>
  <!--Body of Form ends--->
</body>
</html>
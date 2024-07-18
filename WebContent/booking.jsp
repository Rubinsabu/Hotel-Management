<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Room Booking</title>
<link href="css/bookingstyle.css" rel="stylesheet" type="text/css"
	media="all" />


</head>
<body>
	<div>
		<a href="Index.jsp"> <input type="button" value="Back"
			style="margin-left: 10px; margin-top: 10px; background: #8e44ad; width: 150px; border-radius: 10px; padding: 10px;">
		</a>
	</div>


	<!-- main -->
	<div class="main">
		<h1>Room booking enquiry form</h1>
		<div class="main-agileinfo w3layouts-agileits">
			<div id="wrapper">
				<form action="BookingServlet" method="post">
					<div id="login" class="animate w3layouts agileits form">
						<div class="agileinfo-row">
							<div class="ferry ferry-from">
								<label>Your Name</label> <input type="text" name="name"
									placeholder="Name" required=" ">
							</div>
							<div class="ferry ferry-from">
								<label>Your Email</label> <input type="text" name="email"
									placeholder="Email" required=" ">
							</div>
							<div class="ferry ferry-from">
								<label>Phone Number</label> <input type="text" name="phone"
									placeholder="PhoneNo" required=" ">
							</div>
							<div class="ferry ferry-to">
								<label>Accommodation Enquiry</label> <select name="type">
									<option value="Air Conditioned Capsule">Air
										Conditioned Capsule</option>
									<option value="Double Room">Double Room</option>
									<option value="Suite Room">Suite Room</option>
									<option value="Deluxe Room">Deluxe Room</option>

								</select>

							</div>
							<div>
								<label>Date</label> <input type="date" name="arrivaldate"
									id="datepicker2" placeholder="date..." required=" ">
							</div>

						</div>


						<div class="agileinfo-row w3ls-row2">
							<div class="tickets">
								<div class="persons">
									<label>Number Of Persons</label> <input type="number"
										name="persons" min="1" required="">
								</div>
								<div class="persons">
									<label>Number Of Days</label> <input type="number" name="days"
										min="1" required="">
								</div>
								<div class="clear"></div>
							</div>
							<div class="ferry ferry-from">
								<label>Address</label>
								<textarea id="message" name="address"
									placeholder="Please enter Your Address"
									title="Please enter Your Address"></textarea>
							</div>
							<div class="wthreesubmitaits">
								<input type="submit" name="submit" value="Submit">
							</div>

						</div>
						<div class="clear"></div>
					</div>
				</form>
			</div>
		</div>
	</div>

	<!-- //main -->




</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REQUEST AN APPOINTMENT</title>
<link rel = "stylesheet" href="AppointmentFormStyle.css">
<script type="text/javascript" src="Validation.js"></script>
</head>
<body>
	<form method="post" action="SLAppointment" name="appointmentForm" onSubmit="return validateForm(event);">
		<h1>Request an Appointment</h1>
		<div>
			<label for="first_name">First Name:</label><br>
			<input type="text" name="first_name" size="50" maxlength=30 required>
		</div>
		<div>
			<label for="last_name">Last Name:</label><br>
			<input type="text" name="last_name" size="50" maxlength=30 required>
		</div>
		<div>
			<label for="email">Email:</label><br>
			<input type="email" name="email" size="50" maxlength=30 required>
		</div>
		<div>
			<label for="email">Phone:</label><br>
			<input type="text" name="phone" size="20" maxlength=20 required>
		</div>
		<div>
			<label for="apptdate">Appointment Date:</label><br>
			<input type="date" name="apptdate" required>
		</div>
		<div>
			<label for="appttime">Appointment time:</label><br>
			<input type="time" name="appttime" required>
		</div>
		<div>
			<label for="notes">Description:</label><br>
			<textarea name="notes" rows="5" cols="50"></textarea>
		</div>
				
		<br>
		<input type="submit" value="submit" >	
		
	</form>

</body>
</html>
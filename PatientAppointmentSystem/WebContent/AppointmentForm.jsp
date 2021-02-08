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
		<table>
			<tr>
				<td>
					<div>
						<h1>Request an Appointment</h1>	
						<div style="padding:5px;">
							<label for="first_name">First Name:</label><br>
							<input type="text" name="first_name" size="50" maxlength=30 required>
						</div>
						<div style="padding:5px;">
							<label for="last_name">Last Name:</label><br>
							<input type="text" name="last_name" size="50" maxlength=30 required>
						</div>
						<div style="padding:5px;">
							<label for="email">Email:</label><br>
							<input type="email" name="email" size="50" maxlength=30 required>
						</div>
						<div style="padding:5px;">
							<label for="email">Phone:</label><br>
							<input type="text" name="phone" size="20" maxlength=20 required>
						</div>
						<div style="padding:5px;">
							<label for="apptdate">Appointment Date:</label><br>
							<input type="date" name="apptdate" required>
						</div>
						<div style="padding:5px;">
							<label for="appttime">Appointment time:</label><br>
							<input type="time" name="appttime" required>
						</div>
						<br>
						<div style="padding:5px;">
							<label for="notes">Description:</label><br>
							<textarea name="notes" rows="5" cols="50"></textarea>
						</div>
						<br>		
						<br>
						<input style="font-size:15px" type="submit" value="submit" >	
					</div>
				</td>
				<td width="350px"></td>
				<td valign="top">
					<div>
						<h1>Hours</h1>
						<table class="hoursStyle">
							<tr>
								<td style="padding:10px;">Monday: 8AM-5PM</td>
							</tr>
							<tr>
								<td style="padding:10px;">Tuesday: 8AM-5PM</td>
							</tr>
							<tr>
								<td style="padding:10px;">Wednesday: 8AM-5PM</td>
							</tr>
							<tr>
								<td style="padding:10px;">Thursday: 8AM-5PM</td>
							</tr>
							<tr>
								<td style="padding:10px;">Friday: 8AM-5PM</td>
							</tr>
							<tr>
								<td style="padding:10px;">Saturday: Closed</td>
							</tr>
							<tr>
								<td style="padding:10px;">Sunday: Closed</td>
							</tr>
							
						
						</table>
					</div>
				</td>
			</tr>
		</table>
	</form>
	

</body>
</html>
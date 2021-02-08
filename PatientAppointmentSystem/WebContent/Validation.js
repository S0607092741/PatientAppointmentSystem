/**
 *validation  
 * 
 */

function validateForm(event) {	
	
	//prevent submit event
	event.preventDefault();
	
	//set background color for input required controls
	setBackgroundColor();	
	
	var retMsg = checkweekends();	
	if(retMsg != ''){
		alert(retMsg);
		return false;
	}
	else {
		retMsg = checktimes();
		if(retMsg != ''){
			alert(retMsg);
			return false
		}
		else {
			document.appointmentForm.submit();
		}
	}	
}
function checkweekends(){
	var retVal = '';
	var apptdate = document.getElementsByName("apptdate")[0].value.trim();
	if(apptdate != null){
		var apptdate = new Date(apptdate);	
		if(apptdate.getUTCDay() == 0 || apptdate.getUTCDay() == 6) {			
			retVal = "Appointment date must be between Monday to Friday";
		}
	}
	return retVal;
}

function checktimes() {
	var retVal = '';
	var appttime = document.getElementsByName("appttime")[0].value.trim();
	if(appttime != null){		
		
		//create date object using user selected time with default date
		var appttime = new Date('1970-01-01T' + appttime + ':00');
		if(appttime.getHours() < 8 || appttime.getHours() > 17){
			retVal = "Appointment time must be between 8 AM and 5 PM";
		}
	}
	return retVal;
}

function setBackgroundColor() {
	var required = document.querySelectorAll("input[required]");
	required.forEach(function(element) {
		if(element.value.trim() == "") {
			element.style.borderColor = "red";
		} else {
			element.style.borderColor = "white";
		}
	 });
}
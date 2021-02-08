

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SLAppointment
 */
@WebServlet("/SLAppointment")
public class SLAppointment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SLAppointment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String htmlResponse = "<html>";
		try {
			
			CLPatientData patient = new CLPatientData();
			patient.setfirstName(request.getParameter("first_name"));
			patient.setlastName(request.getParameter("last_name"));
			patient.setEmail(request.getParameter("email"));
			patient.setPhone(request.getParameter("phone"));
			LocalDate appDate = LocalDate.parse(request.getParameter("apptdate"));
			patient.setDate(appDate);
			LocalTime appTime = LocalTime.parse(request.getParameter("appttime"));
			patient.setTime(appTime);
			patient.setNotes(request.getParameter("notes"));
			
			boolean regStatus = false;
			regStatus = patient.registerPatient();
			
			if(regStatus) {
		        // build HTML code
		        htmlResponse += "<h2>Your appointment has been confirmed " + patient.getfirstName() + " " + patient.getlastName() + "." + "<br/>";      
		        htmlResponse += "</html>";
				
			} else {
		        // build HTML code
		        htmlResponse += "<h2>We are unable to process your appointment request. Please try again later. <br/>";         
		        htmlResponse += "</html>";
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		response.getWriter().print(htmlResponse);
		
		
	}

}

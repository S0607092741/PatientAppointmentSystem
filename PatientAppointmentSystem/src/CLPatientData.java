import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.*;

public class CLPatientData {
	private String firstName = "";
	private String lastName = "";
	private String email = "";
	private String phone = "";
	private LocalDate date = null;
	private LocalTime time;
	private String notes = "";
	
	public CLPatientData() {
		
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getNumber() {
		return phone;
	}
	public LocalDate getDate() {
		return date;
	}
	public LocalTime getTime() {
		return time;
	}
	public String getNotes() {
		return notes;
	}
	public void setfirstName(String fname) {
		this.firstName = fname;
	}
	public void setlastName(String lname) {
		this.lastName = lname;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String number) {
		this.phone = number;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}

	public boolean registerPatient() throws ClassNotFoundException{
		
		//JDBC driver name and database URL
		final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

		String connectionUrl =
                "jdbc:sqlserver://DESKTOP-LH9UA50\\SQLEXPRESS.database.windows.net:1433;"
                        + "database=Projects2020;"
                        + "loginTimeout=30;"	
                        + "integratedSecurity=true";
                
        boolean returnVal = false;        
        
        try {        	
        	
        	//Register JDBC driver        	
    		Class.forName(JDBC_DRIVER);
    		Connection connection = DriverManager.getConnection(connectionUrl); 
    		Statement statement = connection.createStatement();
            
        	String sql = "INSERT INTO Patients_Appointments (first_name, last_name, email, phone, apptdate, appttime, notes) "
        			+ "Values('" + getfirstName() + "', '"+ getlastName() + "', '" + getEmail() + "', '" + getNumber() + "', '" + getDate().toString() + "', '" + getTime() + "', '" + getNotes() + "')";
          
        	statement.executeUpdate(sql);
        	returnVal = true;
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
        return returnVal;
        
    }

}

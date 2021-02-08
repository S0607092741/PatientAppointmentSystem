import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testConnect {

	public static void main(String[] args) throws ClassNotFoundException {
		 String connectionUrl =
	                "jdbc:sqlserver://DESKTOP-LH9UA50\\SQLEXPRESS.database.windows.net:1433;"
	                        + "database=Projects2020;"
	                        + "loginTimeout=30;"	
	                        + "integratedSecurity=true";
	        
	        ResultSet resultSet = null;
	        String returnVal = "";
	        try  {
	        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	        	Connection connection = DriverManager.getConnection(connectionUrl); Statement statement = connection.createStatement();
	        	String sql = "INSERT INTO Patients_Appointments (first_name, last_name, email, phone, apptdate, appttime, notes) "
	        			+ "Values('Steve', 'Padmanaban', ' steve@gmail.com', ' 1234567890', '2021-02-03', '10:30 AM', 'hello')";
	        	statement.executeUpdate(sql);
	        }
	        // Handle any errors that may have occurred.
	        catch (SQLException e) {
	            e.printStackTrace();
	        }

	}

}

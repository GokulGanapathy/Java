package Learn;

import java.sql.*;

public class DBConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("org.postgresql.Driver");   // Setting the Driver for the DB we are using
		
		String url = "jdbc:postgresql://localhost:5432/postgres";   // Getting URL,Username and Password for the DB
		String username = "postgres";
		String password = "Ganapathy95";
		
		Connection connection = DriverManager.getConnection(url, username, password);   // Making connection using the Connection and DriverManager.getConnection() methods
		
		Statement statement=connection.createStatement();   //Creating Statement for Executing Queries
		
		ResultSet rs = statement.executeQuery("Select * from Library");  // Getting the Data from DB
		
		System.out.println("The Result Set is : "+rs);
		
		while(rs.next())
		{
			System.out.println("Name :"+rs.getString("BookId")+"||"+"Author : "+rs.getString("Author")+"||"+"Availablity : "+rs.getString("Availability"));
		}
		rs.close();     	// Closing all the Connections established
		statement.close();
		connection.close();
	}
	

}

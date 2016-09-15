package Logic;
import java.beans.Statement;
import java.sql.*;
import static java.lang.System.out;


/**
 * This class will create a connection to the database and pass the connection back to the calling object.
 * @author Administrator
 *
 */
public class DbConnection {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/nbgardens?autoReconnect=true&useSSL=false";
	static final String USER = "root";
	static final String PASS = "password";
	static Connection conn = null;
		
	/**
	 * This method will return a connection to the calling method.
	 * @return conn
	 */
	static Connection connectToDatabase() throws SQLException
	{
		  //Try and make the connection to the database.
		  try {
		    Class.forName("com.mysql.jdbc.Driver");
		    
		    	//For debug info.
		    		System.out.println("Connecting to database...");
		    		
		    //Actually get the connection.		
		    conn = DriverManager.getConnection(DB_URL, USER, PASS);
		    
		    	//For debug info.
		    		out.println("Connected to the database successfully");
		  }
		  catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			out.println("ClassNotFoundException: " + e.getMessage());
		}
		
		return conn;
	}
	
	
	/**
	 * This method will close the open connection.
	 */
	static boolean closeConnection()
	{
		//Used for the switch statement.
		int connClosed = 0;
		
		try {
			//Close the connection.
			conn.close();
			conn = null;
			
				//For debugging.
					out.println("Connection was closed");
			//Set to trye (0).
			connClosed = 0;
		} catch (SQLException e) {
				//For debugging.
					e.printStackTrace();
					out.println("Connection not closed: " + e.getMessage());
			//Set to false (1).
			connClosed = 1;
		}
		
		//Return the respective value.
		switch(connClosed)
		{
			case 1: out.println("false");
					return false;					
			case 0: out.println("true");
					return true;					
			default: return false;					
		}
		
	}
	
	
	
	
	
}

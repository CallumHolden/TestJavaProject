import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import Logic.DbConnection;


public class DbConnectionTest {

	/**
	 * Test for a connection to the database.
	 * @throws SQLException
	 */
	@Test
	public void testConnectToDatabase() throws SQLException {
		
		//Create an instance of DbConnection.
		DbConnection dbConn = new DbConnection();		
		//Check the return on 'isClosed' method on connectToDatabase.
		//If it is false then a connection has been made, if true then no connection has been made.
		assertEquals("Connection should be made", false, dbConn.connectToDatabase().isClosed());
		
	}
		
	/**
	 * Test for any SQLExceptions thrown.
	 * @throws SQLException
	 */
	@Test(expected = SQLException.class)

	public void testExceptionIsThrown() throws SQLException{
		//Test the 'connectToDatabase' method.
		DbConnection dbConn = new DbConnection();		
		dbConn.connectToDatabase();
	}
	
	/**
	 * Test to see if the connection is closed.
	 * @throws SQLException
	 */
	@Test
	public void testCloseConnection() throws SQLException {		
		//It should throw true if closed and false if not.
		DbConnection dbConn = new DbConnection();		
		assertEquals("Connection should be closed", true, dbConn.closeConnection());		
	}

}

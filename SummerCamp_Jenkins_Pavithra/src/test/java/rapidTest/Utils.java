package rapidTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Utils {
	
	static final String Database_URL = "jdbc:mysql://http://elastic.rapidtestpro.com:8082/sql.php?server=1&db=RapidTest";	
	static final String UserName = "labuser";
	static final String Password = "labuser@01";
	
	public static ResultSet mySQL() throws Exception
	{
		Connection connection = null;
		Statement statement = null;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		connection = DriverManager.getConnection(Database_URL,UserName,Password);
		statement = connection.createStatement();
		
		String query = "SELECT * FROM rapidTest_Picnic;";
		ResultSet results = statement.executeQuery(query);
		System.out.println(results);
		
		return results;

}
	
	public static void main(String[] args) throws Exception {
		mySQL();
	}
	
}
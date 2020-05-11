package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database 
{
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://http://elastic.rapidtestpro.com:8082/sql.php?server=1&db=RapidTest";
	
	static final String User = "labuser";
	static final String Pass = "labuser@01";
	
	public static void main(String[] args) throws Exception
	{
		Connection connection = null;
		Statement statement = null;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		connection = DriverManager.getConnection(DB_URL,User,Pass);
		statement = connection.createStatement();
		
		String query = "SELECT * FROM Rapid;";
		ResultSet results = statement.executeQuery(query);
		System.out.println(results);
		 
		
		
		
		
		
		
	}
	
}

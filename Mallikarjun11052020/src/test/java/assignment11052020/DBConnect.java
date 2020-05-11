package assignment11052020;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "http://elastic.rapidtestpro.com:8082/";
	static final String USER = "camyclat";
	static final String PASSWORD = "uKv2NeMNhyfx";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Connection.connection = null;
		Connection connection = null;
		Statement statement = null;
		
		Class.forName(JDBC_DRIVER);
		connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		/*statement = connection.createStatement();
		String query = "SELECT* FROM details";
		ResultSet results = statement.executeQuery(query);
		connection.close();
		statement.close();*/
		
	}

}

package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class DbConnect {
	  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	    static final String DB_URL = "http://elastic.rapidtestpro.com:8082/";
	    static final String USER = "camyclat";
	    static final String PASSWORD = "uKv2NeMNhyfx";
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		   //Connection.connection = null;
        Connection connection = null;
        Statement statement = null;
        
        Class.forName(JDBC_DRIVER);
        connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        statement = (Statement) connection.createStatement();
        String query = "SELECT* FROM details";
        ResultSet results = statement.executeQuery(query);
        connection.close();
        statement.close();
	}

}

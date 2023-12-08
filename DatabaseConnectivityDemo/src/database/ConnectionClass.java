package database;

import java.sql.*;

public class ConnectionClass implements DatabaseConnectivity {
	
	public Connection getConnection(String url, String uname, String pwd) throws Exception {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pwd);
	    System.out.println("Connected");
	    return con;
	}

}


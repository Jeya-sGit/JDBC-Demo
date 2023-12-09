package javaJDBCDemo1;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
	
	private Connection con;
	
	public Connection connection(String url,String uname,String pwd) {
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, uname, pwd);
	    return con;
	}catch(Exception e) {
		System.out.println("oops error occured"+e);
		return null;
	}

}
}

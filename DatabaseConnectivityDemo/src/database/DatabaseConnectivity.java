package database;

import java.sql.Connection;

public interface DatabaseConnectivity {
	
	Connection getConnection(String url,String uname,String pwd) throws Exception;

}

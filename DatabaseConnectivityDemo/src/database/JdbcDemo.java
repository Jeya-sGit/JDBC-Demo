package database;

import java.sql.Connection;

public class JdbcDemo {
	
	public JdbcDemo() {
			String url="jdbc:mysql://localhost:3306/MVC";
			String uname="root";
			String password="Root@980";
			
			DatabaseConnectivity dc=new ConnectionClass();
			try {
				Connection result=dc.getConnection(url, uname, password);
				System.out.println(result);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	public static void main(String[] args) {
		
	      JdbcDemo obj=new JdbcDemo();
			}

}

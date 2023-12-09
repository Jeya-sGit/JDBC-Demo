package javaJDBCDemo1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class StaffDAO extends JDBCConnection{
	
	static String url="jdbc:mysql://localhost:3306/SCAD";
	static String uname="root";
	static String password="Root@980";
	
	
	
	public void getStaff() {
		
		String query="SELECT * FROM STAFF ORDER BY STAFF_ID";
		
	   try (Connection result=connection(url, uname, password)){
		
		
		Statement st=result.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
			String name=rs.getString(1);
			String id=rs.getString(2);
			String designation=rs.getString(3);
			String department=rs.getString(4);
			String location=rs.getString(5);		
			
			System.out.println(name+"|"+id+"|"+designation+"|"+department+"|"+location);
		}
	   }catch(Exception e) {
			e.printStackTrace();
		}
		
	}
public static void main(String args[])  {
		
		StaffDAO obj=new StaffDAO();
		
		try {
			obj.connection(url, uname, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		obj.getStaff();
		
		
	}

}

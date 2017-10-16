package com.org.ishir.util;
import java.sql.*;

public class DatabaseConn {
	
	public static void main (String[] args) throws Exception{
		
		 Connection conn = null;
		try{
		Class.forName("com.mysql.jdbc.Driver");{
			System.out.println("Driver Loaded");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/");
			Statement smt = conn.createStatement();
			ResultSet rs = smt.executeQuery("Select * from Table Name");
			while(rs.next()){
				String Firstname= rs.getString("Firstname");
				String Email = rs.getString("Email");}			
			}
		}
		catch(Exception e){
		System.out.println("e");}
		finally{
			if(conn !=null){
				conn = null;}
				}
		}
}


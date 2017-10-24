package com.admin.con;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.ResultSetImpl;

public class ConnectionDB {
	public com.mysql.jdbc.Connection con=null;
	public Statement stmt;
	public ResultSet rs;
	
	public ConnectionDB(){
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			con= (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","lhouch2mohamed");  
			
			stmt=con.createStatement();  
//			rs= (ResultSetImpl) stmt.executeQuery("select * from demandeur");
//			while(rs.next())  
//			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
//			con.close();  
			}catch(Exception e){ System.out.println(e);}  
		
	}
	
		
}  
	


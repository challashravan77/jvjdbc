package com.ja.model;

import java.sql.*;

public class Retrive_DB {
	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/1111","root","root");
			java.sql.Statement statement=con.createStatement();
			ResultSet rs=statement.executeQuery("select * from std222");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
			
		}
	}

}

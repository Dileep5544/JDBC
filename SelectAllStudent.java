package com.alpha.excuteQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllStudent {
	public static void main(String[] args) {
		try {
//			step1 load or register
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/demojdbc";
			String username = "postgres";
			String pass = "root";
//			step 2 connection establishment
			
			Connection con = DriverManager.getConnection(url, username,pass);
			System.out.println(con);
			System.out.println("con established");
			
//			step 3 create a statement 
			Statement stmt = con.createStatement();
			
			
			System.out.println(stmt);
			System.out.println("STMT CREATED");
			
		String q = 	"select * from student";
		ResultSet rs =stmt.executeQuery(q);
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getDouble(3));
			System.out.println(rs.getInt(4));
			System.out.println("----------");
		}
			
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException g) {
			g.printStackTrace();
			
		}
		// TODO Auto-generated method stub

	}

}

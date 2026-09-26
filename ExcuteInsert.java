package com.alpha.excuteQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExcuteInsert {
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
			
		String query = 	"insert into student values (204,'karan',90.5,23)";
		int res =stmt.executeUpdate(query);
		System.out.println(res);
			
			
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

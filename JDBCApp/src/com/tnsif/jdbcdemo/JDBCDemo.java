package com.tnsif.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");

		Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
				"Nayna@123");
		Statement st = cn.createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM students");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
		}
		cn.close();
	}

}

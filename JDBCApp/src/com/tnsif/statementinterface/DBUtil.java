package com.tnsif.statementinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Load & register Driver

public class DBUtil {
	
	private static Connection cn;
	private static final String DRIVER_Class="org.postgresql.Driver";
	private static final String DB_Link="jdbc:postgresql://localhost:5432/postgres";
	private static final String DB_UserName="postgres";
	private static final String DB_Password="Nayna@123";
	
	public static Connection getConnection()
	{
		try {
			Class.forName(DRIVER_Class);
			System.out.println("Driver is successfully registered");
			cn =DriverManager.getConnection(DB_Link, DB_UserName, DB_Password);
			System.out.println("Connection is Established");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cn;
	}

}

package com.tnsif.jdbcdemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");

		Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
				"Nayna@123");
		CallableStatement cst=cn.prepareCall("{?=call getName(?)}");
		cst.setInt(2, 4);
		cst.registerOutParameter(1, Types.VARCHAR);
		cst.execute();
		System.out.println(cst.getString(1));
		cn.close();
	}

}

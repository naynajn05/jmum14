package com.tnsif.statementinterface;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.tnsif.jdbc.DBUtil;

public class CRUDStatementInterface {
	
	static Connection cn;

	static Statement st;
	static {
		cn = DBUtil.getConnetion();
		try {
			st = cn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//insert method
	public static int addStudent(int stuId, String stuName, int stuPer) {

		int n = 0;
		try {

			String query = "INSERT INTO studentdetails VALUES(" + stuId + ",'" + stuName + "'," + stuPer + ")";
			n = st.executeUpdate(query);
			System.out.println("One student is added");
		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
			n = 0;
		}
		return n;

	}

}

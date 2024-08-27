//Program to demonstrate Statement Interface
package com.tnsif.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class StatementInterfaceDemo {
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

	public static int addStudent(int stuId, String stuName, int stuPer) {

		int n = 0;
		try {

			String query = "INSERT INTO emp VALUES(" + stuId + ",'" + stuName + "'," + stuPer + ")";
			n = st.executeUpdate(query);
		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
			n = 0;
		}
		return n;

	}

	public static int validateStu(int stuId) {
		int n = 0;
		try {
			String query = "SELECT count(*) FROM student where id=" + stuId;
			ResultSet rs = st.executeQuery(query);
			if (rs.next()) {
				if (rs.getInt(1) != 0)
					n = 1;
			}

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return n;
	}

	public static boolean deleteStu(int stuId) {
		boolean status = false;

		try {

			int n = validateStu(stuId);
			if (n == 1) {
				String query = "DELETE FROM student WHERE id=" + stuId;
				st.executeUpdate(query);
				status = true;
			}

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return status;
	}

	public static boolean updateStuName(int stuId, String stuName) {
		boolean status = false;
		try {

			if (validateStu(stuId) == 1) {
				String query = "UPDATE emp set name='" + stuName + "' WHERE id=" + stuId;
				st.executeUpdate(query);
				status = true;
			} else

				System.out.println("No such Student Record.....");

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return status;
	}

	public static boolean updateStuPer(int stuId, int per) {
		boolean status = false;
		try {

			if (validateStu(stuId) == 1) {
				String query = "UPDATE emp SET salary=" + per + " WHERE id=" + stuId;
				st.executeUpdate(query);
				status = true;
			} else
				System.out.println("No such Student Record.....");

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return status;
	}

	public static void showStu() {
		try {

			String query = "SELECT * FROM student";
			ResultSet rs = st.executeQuery(query);

			/*
			 * System.out.println(rs.next());
			 * System.out.println("----------------------------");
			 * System.out.println("::::"+rs.getInt(1));
			 */

			if (rs.next()) {
				while (rs.next()) {

					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
				}
			} else
				System.out.println("No Student Records.....");
			rs.close();

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
	}

	public void closeConnection() {
		try {
			st.close();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

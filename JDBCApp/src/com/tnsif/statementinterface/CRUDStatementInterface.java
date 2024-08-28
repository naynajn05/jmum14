package com.tnsif.statementinterface;

import java.sql.Connection;
import java.sql.ResultSet;
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
	
	//validate
	public static int validateStudent(int stuId) {
		int n = 0;
		try {
			String query = "SELECT count(*) FROM studentdetails where if=" + stuId;
			ResultSet rs = st.executeQuery(query);
			if (rs.next()) {
				if (rs.getInt(1) != 0)
					n = 1;
			}

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		System.out.println("No such student found");

		return n;
	}

	
	//delete
	public static boolean deleteStudent(int stuId) {
		boolean status = false;

		try {

			int n = validateStudent(stuId);
			if (n == 1) {
				String query = "DELETE FROM studentdetails WHERE if=" + stuId;
				st.executeUpdate(query);
				status = true;
			}

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return status;
	}

	//update
	public static boolean updateStuName(int stuId, String stuName) {
		boolean status = false;
		try {

			if (validateStudent(stuId) == 1) {
				String query = "UPDATE studentdetails set name='" + stuName + "' WHERE if=" + stuId;
				st.executeUpdate(query);
				status = true;
			} else

				System.out.println("No such Student Record.....");

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return status;
	}

	//update percentage
	public static boolean updateStuPercentage(int stuId, int per) {
		boolean status = false;
		try {

			if (validateStudent(stuId) == 1) {
				String query = "UPDATE studentdetails SET per=" + per + " WHERE if=" + stuId;
				st.executeUpdate(query);
				status = true;
			} else
				System.out.println("No such Student Record.....");

		} catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
		}
		return status;
	}

	//retrieve all
	public static void showStudents() {
		try {

			String query = "SELECT * FROM studentdetails";
			ResultSet rs = st.executeQuery(query);

			
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

package com.tnsif.statementinterface;

public class Executor {

	public static void main(String[] args) {
		DBUtil.getConnection();
		CRUDStatementInterface.addStudent(3, "Udhay", 90);
	}

}

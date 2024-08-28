package com.tnsif.statementinterface;

public class Executor {

	public static void main(String[] args) {
		DBUtil.getConnection();
		/*
		 * CRUDStatementInterface.addStudent(5, "Pallavi", 92);
		 * CRUDStatementInterface.showStudents();
		 * CRUDStatementInterface.updateStuName(3, "Mayuresh");
		 * CRUDStatementInterface.showStudents();
		 * CRUDStatementInterface.updateStuPercentage(3, 95);
		 * CRUDStatementInterface.showStudents();
		 * CRUDStatementInterface.deleteStudent(2);
		 * CRUDStatementInterface.showStudents();
		 */
		CRUDStatementInterface.deleteStudent(6);
		CRUDStatementInterface.showStudents();
		
	}

}

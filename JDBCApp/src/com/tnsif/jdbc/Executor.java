//Program to demonstrate Statement Interface
package com.tnsif.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.*;

public class Executor {

	public static void main(String[] args) {
		StatementInterfaceDemo.showStu();
		System.out.println("----------------------------------------------");
		System.out.println(StatementInterfaceDemo.updateStuName(3, "Neha"));
		StatementInterfaceDemo.updateStuPer(3, 78);
		System.out.println("-------------After Updating Name and Percentage------------");
		StatementInterfaceDemo.showStu();
		StatementInterfaceDemo.deleteStu(5);
		StatementInterfaceDemo.deleteStu(1);
		StatementInterfaceDemo.deleteStu(2);
		System.out.println("-----------After Deleting --------------------");
		StatementInterfaceDemo.showStu();

	}

}

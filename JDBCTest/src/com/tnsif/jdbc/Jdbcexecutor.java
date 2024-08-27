package com.tnsif.jdbc;

public class Jdbcexecutor {

	public static void main(String[] args) {
		//step 1
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//register driver
			System.out.println("Driver is successfully loaded");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

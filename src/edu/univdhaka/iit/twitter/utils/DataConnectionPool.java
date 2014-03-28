package edu.univdhaka.iit.twitter.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnectionPool {

	private static String DATABASE_NAME = "twitter";
	private static String USER_NAME = "root";
	private static String PASSWORD = "";
	private static String URL = "jdbc:mysql://localhost:3306/";
	private static String DRIVER_NAME = "com.mysql.jdbc.Driver";

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(DRIVER_NAME);

		} catch (ClassNotFoundException e)
		{

			e.printStackTrace();

		}

		try {

			con = DriverManager.getConnection(URL + DATABASE_NAME, USER_NAME,
					PASSWORD);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;

	}

}

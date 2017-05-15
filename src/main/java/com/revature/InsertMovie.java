package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMovie {

	public static void insert() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/training_db";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);

		String sql = "INSERT INTO movies (movie_name, LANGUAGE, description, director, type_of_movie, casting, release_date) VALUES('KABALI','Tamizh','GANGSTER','RANJITH','XYZ','RAJINI','2017-01-01')";
		PreparedStatement pst = con.prepareStatement(sql);
		int rows = pst.executeUpdate();
		System.out.println("No of rows inserted:" + rows);
}
	
}

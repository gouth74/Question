package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestInsertMovie {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		InsertMovie.insert();
	}
}

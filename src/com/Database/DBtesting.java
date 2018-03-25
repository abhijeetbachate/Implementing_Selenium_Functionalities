package com.Database;

import java.sql.Connection;
import java.sql.DriverManager;

import org.testng.annotations.Test;

public class DBtesting {

	@Test
	public void testDB() throws Throwable 
	{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		System.out.println("Driver Loaded");
		Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-RTOV87Q\\ABHIJEETSQL (sa):1433/AbhijeetDB","sa","AbhiBachate@75");
		System.out.println("Connected to SQL Server DB");
	}
	
}

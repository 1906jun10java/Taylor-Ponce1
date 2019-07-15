package com.revature.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnFactory {
	// Singleton Factory 
		private static ConnFactory cf = new ConnFactory();

		private ConnFactory() {
			super();
		}

		public static synchronized ConnFactory getInstance() {
			if (cf == null) {
				cf = new ConnFactory();
			}
			return cf;
		}

		public Connection getConnection() {
			Connection conn = null;
			Properties prop = new Properties();

			try {
				prop.load(new FileReader("database.properties"));
				conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"),
					prop.getProperty("password"));
			Class.forName(prop.getProperty("driver"));

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;

			
		}

	}


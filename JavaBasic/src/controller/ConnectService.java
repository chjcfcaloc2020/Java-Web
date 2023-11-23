package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectService {
	
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/employee";
			String user = "root";
			String password = "";
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("Kết nối không thành công");
			e.getStackTrace();
		}
		
		return con;
	}
}

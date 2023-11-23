package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO {

	public int declare(Student s) throws ClassNotFoundException {
		String insert_query = "";
		int rs = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sinhvien_tn", "root", "");
			PreparedStatement preparedStatement = connection.prepareStatement(insert_query)) {
			
			preparedStatement.setInt(1, s.getCmnd());
			preparedStatement.setString(2, s.getMaTruong());
			preparedStatement.setString(3, s.getMaNganh());
			preparedStatement.setString(4, s.getHoTen());
			preparedStatement.setString(5, s.getEmail());
			preparedStatement.setString(6, s.getSoDT());
			preparedStatement.setString(7, s.getDiaChi());
			preparedStatement.setString(8, s.getHeTN());
			preparedStatement.setString(9, s.getNgayTN());
			preparedStatement.setString(10, s.getLoaiTN());
			
			rs = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return rs;
	}
	
}

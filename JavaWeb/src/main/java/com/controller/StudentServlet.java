package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.model.Student;
import com.model.StudentDAO;

@WebServlet("/register")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDAO sDao;

	@Override
	public void init() {
		sDao = new StudentDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cmnd = request.getParameter("cmnd");
		String ma_truong = request.getParameter("ma_truong");
		String ma_nganh = request.getParameter("ma_nganh");
		String ten = request.getParameter("ten");
		String email = request.getParameter("email");
		String so_dt = request.getParameter("so_dt");
		String dia_chi = request.getParameter("dia_chi");
		String he_tn = request.getParameter("he_tn");
		String ngay_tn = request.getParameter("ngay_tn");
		String loai_tn = request.getParameter("loai_tn");
		
		Student s = new Student();
		s.setCmnd(Integer.parseInt(cmnd));
		s.setMaTruong(ma_truong);
		s.setMaNganh(ma_nganh);
		s.setHoTen(ten);
		s.setEmail(email);
		s.setSoDT(so_dt);
		s.setDiaChi(dia_chi);
		s.setHeTN(he_tn);
		s.setNgayTN(ngay_tn);
		s.setLoaiTN(loai_tn);
		
		try {
			sDao.declare(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

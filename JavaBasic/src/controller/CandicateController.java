package controller;

import java.sql.Connection;

public class CandicateController {

	public void test() {
		Connection con = ConnectService.getConnection();
		if (con != null) {
			System.out.println("ok");
		}
	}
}

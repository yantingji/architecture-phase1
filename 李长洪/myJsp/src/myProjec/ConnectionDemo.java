package myProjec;

import java.sql.Connection;

public class ConnectionDemo {

	public static void main(String[] args) {
		Connection conn=DBHelper.getConnection();
		System.out.println(conn);
	}

}

package myProjec;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import myProjec.DBHelper;

public class PreparedStatementDemo {
	public boolean userCheck(String user) throws SQLException {
		boolean ble = false;
		Connection conn = DBHelper.getConnection();
		PreparedStatement stmt = conn.prepareStatement("select password from t_user where trim(username)=?");
		stmt.setString(1, user);
		ResultSet rs = stmt.executeQuery();	
		while (rs.next()) {
			ble=true;
		}
		return ble;
	}
	public void register(String user,String password,String emil,Integer age) throws SQLException {
		Connection conn = DBHelper.getConnection();
		PreparedStatement stmt = conn.prepareStatement("insert into t_user values(?,?,?,?)");
		stmt.setString(1, user);
		stmt.setString(2, password);
		stmt.setString(2, emil);
		stmt.setInt(4, age);
	}
	public static void main(String[] args) throws SQLException {
		PreparedStatementDemo pr = new PreparedStatementDemo();
		boolean ble = pr.userCheck("lichang");
		System.out.println(ble);
	}

}

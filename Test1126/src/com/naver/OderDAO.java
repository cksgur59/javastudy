package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class OderDAO {

	private final String DRIVER ="oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String PASSWORD = "ezen";
	
	public OderDAO() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insert(OderDTO m) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO oder VALUES (?,?,?,?)";
		
		try {
			con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			ps = con.prepareStatement(sql);
			
			ps.setString(1, m.getMid());
			ps.setString(2, m.getMenu());
			ps.setInt(3, m.getPrice());
			ps.setInt(4, m.getPoint());
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (ps !=null) ps.close();
				if (con != null)con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	


}

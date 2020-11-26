package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {

	private final String DRIVER = "oracle.jdbc.OracleDriver";
	private final String URL="jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String PASSWORD = "ezen";
	
	public AccountDAO() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void transter(String frimid, String  told , int howmuch) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		String sql = "UPDATE account SET balance = balance + ? WHERE id =?";
		String sql2 = "UPDATE account SET balance = balance - ? WHERE id =?";
		ResultSet rs = null;
		boolean isok = false;
		
		try {
			conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, howmuch);
			pstmt.setString(2, told);
			pstmt.executeUpdate();
			
			if (pstmt != null) pstmt.close();
			
			System.out.println("Àü¿ø off");
			System.out.println(4/0);
			
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, howmuch);
			pstmt.setString(2, frimid);
			pstmt.executeUpdate();
			
			isok = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if (isok) conn.commit();
				else conn.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
	}
	
	
}

package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class test2 {

	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String PASSWORD = "ezen";
	
	public test2() {
		
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("드라이브 연동 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브 연동 실패");
			e.printStackTrace();
		}
		
	}
	
	public void insert(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pre = null;
		String sql = "INSERT INTO member VALUES (?,?,?,?)";
		
		try {
			conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			System.out.println("커넥션 완료");
			pre = conn.prepareStatement(sql);
			System.out.println("pre완료");
			
			pre.setString(1, dto.getName());
			pre.setString(2, dto.getMid());
			pre.setString(3, dto.getJob());
			pre.setDate(4, dto.getBirth());
			pre.executeUpdate();
		} catch (SQLException e) {
			System.out.println("커넥션 실패");
			System.out.println("pre 실패");
			e.printStackTrace();
		} finally {
			try {
				if (pre != null) pre.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void delete(MemberDTO dto) {
		Connection con = null;
		PreparedStatement pre = null;
		String sql = "DELETE FROM member WHERE name = ?";
		
		try {
			con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			System.out.println("커넥션 성공");
			pre = con.prepareStatement(sql);
			System.out.println("pre 성공");
			
			pre.setString(1, dto.getName());
			pre.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("커넥션 실패");
			System.out.println("pre 실패");
			e.printStackTrace();
		} finally {
			try {
				if (pre != null) pre.close();
				if (con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

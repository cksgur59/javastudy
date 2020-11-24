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
			System.out.println("����̺� ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̺� ���� ����");
			e.printStackTrace();
		}
		
	}
	
	public void insert(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pre = null;
		String sql = "INSERT INTO member VALUES (?,?,?,?)";
		
		try {
			conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			System.out.println("Ŀ�ؼ� �Ϸ�");
			pre = conn.prepareStatement(sql);
			System.out.println("pre�Ϸ�");
			
			pre.setString(1, dto.getName());
			pre.setString(2, dto.getMid());
			pre.setString(3, dto.getJob());
			pre.setDate(4, dto.getBirth());
			pre.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Ŀ�ؼ� ����");
			System.out.println("pre ����");
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
			System.out.println("Ŀ�ؼ� ����");
			pre = con.prepareStatement(sql);
			System.out.println("pre ����");
			
			pre.setString(1, dto.getName());
			pre.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Ŀ�ؼ� ����");
			System.out.println("pre ����");
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

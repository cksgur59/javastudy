package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MemberDAO {

	private final String Driver_NAME ="oracle.jdbc.OracleDriver";
	private final String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String PASSWORD = "ezen";
	
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("����� ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} 
	}
	

	public void insert(MemberDTO dto) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO member (name,mid,job,birth) VALUES(?,?,?,?)";
		
		try {
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",USER_NAME,PASSWORD);
			System.out.println("Ŀ�ؼ� ����");
			pstmt = conn.prepareStatement("INSERT INTO member (name,mid,job,birth) VALUES(?,?,?,?)");
			System.out.println("prepareStatement ���� ����");
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getMid());
			pstmt.setString(3, dto.getJob());
			pstmt.setDate(4, dto.getBirth());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("Ŀ�ؼ� ����");
			System.out.println("prepareStatement ���� ����");
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	public List<MemberDTO> select(){
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		return list;
	}
	
	public void update(MemberDTO dto) {
		
	}
	
	public void delete(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM member WHERE name = ?";
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",USER_NAME,PASSWORD);
			System.out.println("Ŀ�ؼ� ����");
			pstmt = conn.prepareStatement(sql);
			System.out.println("����������Ʈ��Ʈ ����");
			
			pstmt.setString(1, dto.getName());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Ŀ�ؼ� ����");
			System.out.println("���� ����");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

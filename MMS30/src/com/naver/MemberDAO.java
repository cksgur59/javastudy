package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String PASSWORD = "ezen";
	
	public MemberDAO() {
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("SQL 연동 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("SQL 연동 실패");
		}
	}
	
	public void insert(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO mms30 VALUES (?,?,?)";
		
		try {
			conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setInt(3, dto.getAge());
			
			ps.executeUpdate();
			System.out.println("가입 성공");
			
		} catch (Exception e) {
			System.out.println("입력 실패");
		} finally {
			try {
				if (ps != null) ps.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
	}
	
	public List<MemberDTO> select() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "SELECT * FROM mms30";
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				MemberDTO dto = new MemberDTO(id, name, age);
				list.add(dto);
			}
			
		} catch (Exception e) {
			System.out.println("조회 성공");
		} finally {
			try {
				if (rs != null) rs.close();
				if (ps != null) ps.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return list;
		
	}
	
	public MemberDTO selectm(String asd) {
		MemberDTO dto = null;
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "SELECT * FROM mms30 WHERE id=?";
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, asd);
			
			rs = ps.executeQuery();
			
			if (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				dto = new MemberDTO(id, name, age);
				
			}
		} catch (Exception e) {
			System.out.println("존재하지 않는 id");
		} finally {
			try {
				if (rs != null) rs.close();
				if (ps != null) ps.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return dto;

	}
	
	public void update(MemberDTO dto) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "UPDATE mms30 SET name = ?,age = ? WHERE id = ?";
		
		try {
			conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, dto.getName());
			ps.setInt(2, dto.getAge());
			ps.setString(3, dto.getId());
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println();
		} finally {
			try {
				if (ps != null) ps.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
